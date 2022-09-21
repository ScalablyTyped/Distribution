package typings.awsSdk.gamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGameConfigurationResult extends StObject {
  
  /**
    * Details about the game configuration.
    */
  var GameConfiguration: js.UndefOr[GameConfigurationDetails] = js.undefined
}
object GetGameConfigurationResult {
  
  inline def apply(): GetGameConfigurationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGameConfigurationResult]
  }
  
  extension [Self <: GetGameConfigurationResult](x: Self) {
    
    inline def setGameConfiguration(value: GameConfigurationDetails): Self = StObject.set(x, "GameConfiguration", value.asInstanceOf[js.Any])
    
    inline def setGameConfigurationUndefined: Self = StObject.set(x, "GameConfiguration", js.undefined)
  }
}
