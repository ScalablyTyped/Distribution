package typings.cannon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cannon", "Transform")
@js.native
class Transform ()
  extends typings.cannon.CANNON.Transform
/* static members */
object Transform {
  
  @JSImport("cannon", "Transform.pointToLocalFrame")
  @js.native
  def pointToLocalFrame(
    position: typings.cannon.CANNON.Vec3,
    quaternion: typings.cannon.CANNON.Quaternion,
    worldPoint: typings.cannon.CANNON.Vec3
  ): typings.cannon.CANNON.Vec3 = js.native
  @JSImport("cannon", "Transform.pointToLocalFrame")
  @js.native
  def pointToLocalFrame(
    position: typings.cannon.CANNON.Vec3,
    quaternion: typings.cannon.CANNON.Quaternion,
    worldPoint: typings.cannon.CANNON.Vec3,
    result: typings.cannon.CANNON.Vec3
  ): typings.cannon.CANNON.Vec3 = js.native
  
  @JSImport("cannon", "Transform.pointToWorldFrame")
  @js.native
  def pointToWorldFrame(
    position: typings.cannon.CANNON.Vec3,
    quaternion: typings.cannon.CANNON.Quaternion,
    localPoint: typings.cannon.CANNON.Vec3
  ): typings.cannon.CANNON.Vec3 = js.native
  @JSImport("cannon", "Transform.pointToWorldFrame")
  @js.native
  def pointToWorldFrame(
    position: typings.cannon.CANNON.Vec3,
    quaternion: typings.cannon.CANNON.Quaternion,
    localPoint: typings.cannon.CANNON.Vec3,
    result: typings.cannon.CANNON.Vec3
  ): typings.cannon.CANNON.Vec3 = js.native
}
