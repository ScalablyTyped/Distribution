package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeGameSessionPlacementOutput extends StObject {
  
  /**
    * Object that describes the requested game session placement.
    */
  var GameSessionPlacement: js.UndefOr[typings.awsSdk.gameliftMod.GameSessionPlacement] = js.native
}
object DescribeGameSessionPlacementOutput {
  
  @scala.inline
  def apply(): DescribeGameSessionPlacementOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGameSessionPlacementOutput]
  }
  
  @scala.inline
  implicit class DescribeGameSessionPlacementOutputMutableBuilder[Self <: DescribeGameSessionPlacementOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGameSessionPlacement(value: GameSessionPlacement): Self = StObject.set(x, "GameSessionPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameSessionPlacementUndefined: Self = StObject.set(x, "GameSessionPlacement", js.undefined)
  }
}
