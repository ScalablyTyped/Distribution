package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAliasOutput extends StObject {
  
  /**
    * The updated alias resource.
    */
  var Alias: js.UndefOr[typings.awsSdk.gameliftMod.Alias] = js.undefined
}
object UpdateAliasOutput {
  
  inline def apply(): UpdateAliasOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAliasOutput]
  }
  
  extension [Self <: UpdateAliasOutput](x: Self) {
    
    inline def setAlias(value: Alias): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "Alias", js.undefined)
  }
}
