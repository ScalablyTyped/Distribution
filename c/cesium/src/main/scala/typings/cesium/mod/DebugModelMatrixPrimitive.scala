package typings.cesium.mod

import typings.cesium.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "DebugModelMatrixPrimitive")
@js.native
class DebugModelMatrixPrimitive () extends js.Object {
  def this(options: Id) = this()
  
  def destroy(): Unit = js.native
  
  var id: js.Any = js.native
  
  def isDestroyed(): Boolean = js.native
  
  var length: Double = js.native
  
  var modelMatrix: Matrix4 = js.native
  
  var show: Boolean = js.native
  
  var width: Double = js.native
}
