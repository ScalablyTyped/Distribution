package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PositionVector3 extends StObject {
  
  var position: Vector3 = js.native
}
object PositionVector3 {
  
  @scala.inline
  def apply(position: Vector3): PositionVector3 = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionVector3]
  }
  
  @scala.inline
  implicit class PositionVector3MutableBuilder[Self <: PositionVector3] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: Vector3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
