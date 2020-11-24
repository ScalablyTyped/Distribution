package typings.cesium.mod

import typings.cesium.anon.Sources
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "SkyBox")
@js.native
class SkyBox protected () extends js.Object {
  def this(options: Sources) = this()
  
  def destroy(): Unit = js.native
  
  def isDestroyed(): Boolean = js.native
  
  var show: Boolean = js.native
  
  var sources: js.Any = js.native
  
  def update(): Unit = js.native
}
