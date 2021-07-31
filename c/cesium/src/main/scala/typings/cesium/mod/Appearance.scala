package typings.cesium.mod

import typings.cesium.anon.Closed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Appearance")
@js.native
class Appearance () extends StObject {
  def this(options: Closed) = this()
  
  val closed: Boolean = js.native
  
  val fragmentShaderSource: String = js.native
  
  def getFragmentShaderSource(): String = js.native
  
  def getRenderState(): js.Any = js.native
  
  def isTranslucent(): Boolean = js.native
  
  var material: Material = js.native
  
  val renderState: js.Any = js.native
  
  var translucent: Boolean = js.native
  
  val vertexShaderSource: String = js.native
}
