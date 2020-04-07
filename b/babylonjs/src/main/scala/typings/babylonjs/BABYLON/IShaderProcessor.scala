package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShaderProcessor extends js.Object {
  var attributeProcessor: js.UndefOr[js.Function1[/* attribute */ String, String]] = js.undefined
  var endOfUniformBufferProcessor: js.UndefOr[js.Function2[/* closingBracketLine */ String, /* isFragment */ Boolean, String]] = js.undefined
  var lineProcessor: js.UndefOr[js.Function2[/* line */ String, /* isFragment */ Boolean, String]] = js.undefined
  var postProcessor: js.UndefOr[
    js.Function3[/* code */ String, /* defines */ js.Array[String], /* isFragment */ Boolean, String]
  ] = js.undefined
  var preProcessor: js.UndefOr[
    js.Function3[/* code */ String, /* defines */ js.Array[String], /* isFragment */ Boolean, String]
  ] = js.undefined
  var uniformBufferProcessor: js.UndefOr[js.Function2[/* uniformBuffer */ String, /* isFragment */ Boolean, String]] = js.undefined
  var uniformProcessor: js.UndefOr[js.Function2[/* uniform */ String, /* isFragment */ Boolean, String]] = js.undefined
  var varyingProcessor: js.UndefOr[js.Function2[/* varying */ String, /* isFragment */ Boolean, String]] = js.undefined
}

object IShaderProcessor {
  @scala.inline
  def apply(
    attributeProcessor: /* attribute */ String => String = null,
    endOfUniformBufferProcessor: (/* closingBracketLine */ String, /* isFragment */ Boolean) => String = null,
    lineProcessor: (/* line */ String, /* isFragment */ Boolean) => String = null,
    postProcessor: (/* code */ String, /* defines */ js.Array[String], /* isFragment */ Boolean) => String = null,
    preProcessor: (/* code */ String, /* defines */ js.Array[String], /* isFragment */ Boolean) => String = null,
    uniformBufferProcessor: (/* uniformBuffer */ String, /* isFragment */ Boolean) => String = null,
    uniformProcessor: (/* uniform */ String, /* isFragment */ Boolean) => String = null,
    varyingProcessor: (/* varying */ String, /* isFragment */ Boolean) => String = null
  ): IShaderProcessor = {
    val __obj = js.Dynamic.literal()
    if (attributeProcessor != null) __obj.updateDynamic("attributeProcessor")(js.Any.fromFunction1(attributeProcessor))
    if (endOfUniformBufferProcessor != null) __obj.updateDynamic("endOfUniformBufferProcessor")(js.Any.fromFunction2(endOfUniformBufferProcessor))
    if (lineProcessor != null) __obj.updateDynamic("lineProcessor")(js.Any.fromFunction2(lineProcessor))
    if (postProcessor != null) __obj.updateDynamic("postProcessor")(js.Any.fromFunction3(postProcessor))
    if (preProcessor != null) __obj.updateDynamic("preProcessor")(js.Any.fromFunction3(preProcessor))
    if (uniformBufferProcessor != null) __obj.updateDynamic("uniformBufferProcessor")(js.Any.fromFunction2(uniformBufferProcessor))
    if (uniformProcessor != null) __obj.updateDynamic("uniformProcessor")(js.Any.fromFunction2(uniformProcessor))
    if (varyingProcessor != null) __obj.updateDynamic("varyingProcessor")(js.Any.fromFunction2(varyingProcessor))
    __obj.asInstanceOf[IShaderProcessor]
  }
}

