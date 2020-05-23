package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGL2ShaderProcessor extends IShaderProcessor {
  @JSName("attributeProcessor")
  def attributeProcessor_MWebGL2ShaderProcessor(attribute: String): String
  @JSName("postProcessor")
  def postProcessor_MWebGL2ShaderProcessor(code: String, defines: js.Array[String], isFragment: Boolean): String
  @JSName("varyingProcessor")
  def varyingProcessor_MWebGL2ShaderProcessor(varying: String, isFragment: Boolean): String
}

object WebGL2ShaderProcessor {
  @scala.inline
  def apply(
    attributeProcessor: String => String,
    postProcessor: (String, js.Array[String], Boolean) => String,
    varyingProcessor: (String, Boolean) => String,
    endOfUniformBufferProcessor: (/* closingBracketLine */ String, /* isFragment */ Boolean) => String = null,
    lineProcessor: (/* line */ String, /* isFragment */ Boolean) => String = null,
    preProcessor: (/* code */ String, /* defines */ js.Array[String], /* isFragment */ Boolean) => String = null,
    uniformBufferProcessor: (/* uniformBuffer */ String, /* isFragment */ Boolean) => String = null,
    uniformProcessor: (/* uniform */ String, /* isFragment */ Boolean) => String = null
  ): WebGL2ShaderProcessor = {
    val __obj = js.Dynamic.literal(attributeProcessor = js.Any.fromFunction1(attributeProcessor), postProcessor = js.Any.fromFunction3(postProcessor), varyingProcessor = js.Any.fromFunction2(varyingProcessor))
    if (endOfUniformBufferProcessor != null) __obj.updateDynamic("endOfUniformBufferProcessor")(js.Any.fromFunction2(endOfUniformBufferProcessor))
    if (lineProcessor != null) __obj.updateDynamic("lineProcessor")(js.Any.fromFunction2(lineProcessor))
    if (preProcessor != null) __obj.updateDynamic("preProcessor")(js.Any.fromFunction3(preProcessor))
    if (uniformBufferProcessor != null) __obj.updateDynamic("uniformBufferProcessor")(js.Any.fromFunction2(uniformBufferProcessor))
    if (uniformProcessor != null) __obj.updateDynamic("uniformProcessor")(js.Any.fromFunction2(uniformProcessor))
    __obj.asInstanceOf[WebGL2ShaderProcessor]
  }
}

