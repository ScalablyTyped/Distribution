package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.NativeShaderProcessor")
@js.native
class NativeShaderProcessor ()
  extends typings.babylonjs.BABYLON.NativeShaderProcessor {
  /* CompleteClass */
  override var _genericAttributeLocation: js.Any = js.native
  /* CompleteClass */
  override var _replacements: js.Any = js.native
  /* CompleteClass */
  override var _textureCount: js.Any = js.native
  /* CompleteClass */
  override var _uniforms: js.Any = js.native
  /* CompleteClass */
  override var _varyingLocationCount: js.Any = js.native
  /* CompleteClass */
  override var _varyingLocationMap: js.Any = js.native
  /* CompleteClass */
  @JSName("attributeProcessor")
  override def attributeProcessor_MNativeShaderProcessor(attribute: String): String = js.native
  /* CompleteClass */
  @JSName("attributeProcessor")
  override def attributeProcessor_MWebGL2ShaderProcessor(attribute: String): String = js.native
  /* CompleteClass */
  @JSName("lineProcessor")
  override def lineProcessor_MNativeShaderProcessor(line: String): String = js.native
  /* CompleteClass */
  @JSName("postProcessor")
  override def postProcessor_MNativeShaderProcessor(code: String, defines: js.Array[String], isFragment: Boolean): String = js.native
  /* CompleteClass */
  @JSName("postProcessor")
  override def postProcessor_MWebGL2ShaderProcessor(code: String, defines: js.Array[String], isFragment: Boolean): String = js.native
  /* CompleteClass */
  @JSName("preProcessor")
  override def preProcessor_MNativeShaderProcessor(code: String, defines: js.Array[String], isFragment: Boolean): String = js.native
  /* CompleteClass */
  @JSName("uniformProcessor")
  override def uniformProcessor_MNativeShaderProcessor(uniform: String): String = js.native
  /* CompleteClass */
  @JSName("varyingProcessor")
  override def varyingProcessor_MNativeShaderProcessor(varying: String, isFragment: Boolean): String = js.native
  /* CompleteClass */
  @JSName("varyingProcessor")
  override def varyingProcessor_MWebGL2ShaderProcessor(varying: String, isFragment: Boolean): String = js.native
}

