package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.WebGL2ShaderProcessor")
@js.native
class WebGL2ShaderProcessor ()
  extends typings.babylonjs.BABYLON.WebGL2ShaderProcessor {
  /* CompleteClass */
  @JSName("attributeProcessor")
  override def attributeProcessor_MWebGL2ShaderProcessor(attribute: String): String = js.native
  /* CompleteClass */
  @JSName("postProcessor")
  override def postProcessor_MWebGL2ShaderProcessor(code: String, defines: js.Array[String], isFragment: Boolean): String = js.native
  /* CompleteClass */
  @JSName("varyingProcessor")
  override def varyingProcessor_MWebGL2ShaderProcessor(varying: String, isFragment: Boolean): String = js.native
}

