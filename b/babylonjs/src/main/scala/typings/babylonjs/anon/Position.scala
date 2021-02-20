package typings.babylonjs.anon

import typings.babylonjs.mathVectorMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Position extends StObject {
  
  var position: Vector3 = js.native
}
object Position {
  
  @scala.inline
  def apply(position: Vector3): Position = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
  
  @scala.inline
  implicit class PositionMutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: Vector3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
