package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Cesium3DTileStyle")
@js.native
class Cesium3DTileStyle () extends StObject {
  def this(style: String) = this()
  def this(style: js.Object) = this()
  def this(style: Resource) = this()
  
  var color: StyleExpression = js.native
  
  var meta: StyleExpression = js.native
  
  var pointSize: StyleExpression = js.native
  
  val readonlyreadyPromise: js.Promise[Cesium3DTileStyle] = js.native
  
  val ready: Boolean = js.native
  
  val style: js.Any = js.native
}
