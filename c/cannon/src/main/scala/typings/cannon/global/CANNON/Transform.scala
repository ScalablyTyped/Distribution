package typings.cannon.global.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CANNON.Transform")
@js.native
class Transform ()
  extends typings.cannon.CANNON.Transform
/* static members */
object Transform {
  
  @JSGlobal("CANNON.Transform.pointToLocalFrame")
  @js.native
  def pointToLocalFrame(
    position: typings.cannon.CANNON.Vec3,
    quaternion: typings.cannon.CANNON.Quaternion,
    worldPoint: typings.cannon.CANNON.Vec3
  ): typings.cannon.CANNON.Vec3 = js.native
  @JSGlobal("CANNON.Transform.pointToLocalFrame")
  @js.native
  def pointToLocalFrame(
    position: typings.cannon.CANNON.Vec3,
    quaternion: typings.cannon.CANNON.Quaternion,
    worldPoint: typings.cannon.CANNON.Vec3,
    result: typings.cannon.CANNON.Vec3
  ): typings.cannon.CANNON.Vec3 = js.native
  
  @JSGlobal("CANNON.Transform.pointToWorldFrame")
  @js.native
  def pointToWorldFrame(
    position: typings.cannon.CANNON.Vec3,
    quaternion: typings.cannon.CANNON.Quaternion,
    localPoint: typings.cannon.CANNON.Vec3
  ): typings.cannon.CANNON.Vec3 = js.native
  @JSGlobal("CANNON.Transform.pointToWorldFrame")
  @js.native
  def pointToWorldFrame(
    position: typings.cannon.CANNON.Vec3,
    quaternion: typings.cannon.CANNON.Quaternion,
    localPoint: typings.cannon.CANNON.Vec3,
    result: typings.cannon.CANNON.Vec3
  ): typings.cannon.CANNON.Vec3 = js.native
}
