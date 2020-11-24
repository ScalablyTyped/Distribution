package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SAPBroadphase extends BroadPhase {
  
  def aabbQuery(world: World, aabb: AABB): js.Array[Body] = js.native
  
  def autoDetectAxis(): Unit = js.native
  
  var axisIndex: Double = js.native
  
  var axisList: js.Array[_] = js.native
}
