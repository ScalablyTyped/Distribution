package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGameSessionPlacementOutput extends StObject {
  
  /**
    * Object that describes the requested game session placement.
    */
  var GameSessionPlacement: js.UndefOr[typings.awsSdk.gameliftMod.GameSessionPlacement] = js.undefined
}
object DescribeGameSessionPlacementOutput {
  
  inline def apply(): DescribeGameSessionPlacementOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGameSessionPlacementOutput]
  }
  
  extension [Self <: DescribeGameSessionPlacementOutput](x: Self) {
    
    inline def setGameSessionPlacement(value: GameSessionPlacement): Self = StObject.set(x, "GameSessionPlacement", value.asInstanceOf[js.Any])
    
    inline def setGameSessionPlacementUndefined: Self = StObject.set(x, "GameSessionPlacement", js.undefined)
  }
}
