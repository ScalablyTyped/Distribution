package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeShaderProcessor extends WebGL2ShaderProcessor {
  var _genericAttributeLocation: js.Any
  var _replacements: js.Any
  var _textureCount: js.Any
  var _uniforms: js.Any
  var _varyingLocationCount: js.Any
  var _varyingLocationMap: js.Any
  @JSName("attributeProcessor")
  def attributeProcessor_MNativeShaderProcessor(attribute: String): String
  @JSName("lineProcessor")
  def lineProcessor_MNativeShaderProcessor(line: String): String
  @JSName("postProcessor")
  def postProcessor_MNativeShaderProcessor(code: String, defines: js.Array[String], isFragment: Boolean): String
  @JSName("preProcessor")
  def preProcessor_MNativeShaderProcessor(code: String, defines: js.Array[String], isFragment: Boolean): String
  @JSName("uniformProcessor")
  def uniformProcessor_MNativeShaderProcessor(uniform: String): String
  @JSName("varyingProcessor")
  def varyingProcessor_MNativeShaderProcessor(varying: String, isFragment: Boolean): String
}

object NativeShaderProcessor {
  @scala.inline
  def apply(
    _genericAttributeLocation: js.Any,
    _replacements: js.Any,
    _textureCount: js.Any,
    _uniforms: js.Any,
    _varyingLocationCount: js.Any,
    _varyingLocationMap: js.Any,
    attributeProcessor: String => String,
    lineProcessor: String => String,
    postProcessor: (String, js.Array[String], Boolean) => String,
    preProcessor: (String, js.Array[String], Boolean) => String,
    uniformProcessor: String => String,
    varyingProcessor: (String, Boolean) => String,
    endOfUniformBufferProcessor: (/* closingBracketLine */ String, /* isFragment */ Boolean) => String = null,
    uniformBufferProcessor: (/* uniformBuffer */ String, /* isFragment */ Boolean) => String = null
  ): NativeShaderProcessor = {
    val __obj = js.Dynamic.literal(_genericAttributeLocation = _genericAttributeLocation.asInstanceOf[js.Any], _replacements = _replacements.asInstanceOf[js.Any], _textureCount = _textureCount.asInstanceOf[js.Any], _uniforms = _uniforms.asInstanceOf[js.Any], _varyingLocationCount = _varyingLocationCount.asInstanceOf[js.Any], _varyingLocationMap = _varyingLocationMap.asInstanceOf[js.Any], attributeProcessor = js.Any.fromFunction1(attributeProcessor), lineProcessor = js.Any.fromFunction1(lineProcessor), postProcessor = js.Any.fromFunction3(postProcessor), preProcessor = js.Any.fromFunction3(preProcessor), uniformProcessor = js.Any.fromFunction1(uniformProcessor), varyingProcessor = js.Any.fromFunction2(varyingProcessor))
    if (endOfUniformBufferProcessor != null) __obj.updateDynamic("endOfUniformBufferProcessor")(js.Any.fromFunction2(endOfUniformBufferProcessor))
    if (uniformBufferProcessor != null) __obj.updateDynamic("uniformBufferProcessor")(js.Any.fromFunction2(uniformBufferProcessor))
    __obj.asInstanceOf[NativeShaderProcessor]
  }
}

