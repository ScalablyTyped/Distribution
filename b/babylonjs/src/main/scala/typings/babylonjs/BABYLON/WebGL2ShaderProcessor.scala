package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.WebGL2ShaderProcessor")
@js.native
class WebGL2ShaderProcessor () extends IShaderProcessor {
  @JSName("attributeProcessor")
  def attributeProcessor_MWebGL2ShaderProcessor(attribute: String): String = js.native
  @JSName("postProcessor")
  def postProcessor_MWebGL2ShaderProcessor(code: String, defines: js.Array[String], isFragment: Boolean): String = js.native
  @JSName("varyingProcessor")
  def varyingProcessor_MWebGL2ShaderProcessor(varying: String, isFragment: Boolean): String = js.native
}

