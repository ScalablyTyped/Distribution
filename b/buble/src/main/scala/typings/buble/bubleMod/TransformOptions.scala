package typings.buble.bubleMod

import typings.buble.Anon_010
import typings.buble.Anon_Arrow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformOptions extends js.Object {
   // input
  var file: js.UndefOr[String] = js.undefined
     // output
  var includeContent: js.UndefOr[Boolean] = js.undefined
  // custom JSX pragma (https://buble.surge.sh/guide/#jsx)
  var jsx: js.UndefOr[String] = js.undefined
  // others
  var namedFunctionExpressions: js.UndefOr[Boolean] = js.undefined
   // default: 'React.createElement'
  // custom `Object.assign` (https://buble.surge.sh/guide/#object-spread-and-rest)
  var objectAssign: js.UndefOr[String | Boolean] = js.undefined
  // used for sourcemaps
  var source: js.UndefOr[String] = js.undefined
  // source: https://github.com/Rich-Harris/buble/blob/master/src/support.js
  var target: js.UndefOr[Anon_010] = js.undefined
  // transforms
  var transforms: js.UndefOr[Anon_Arrow] = js.undefined
}

object TransformOptions {
  @scala.inline
  def apply(
    file: String = null,
    includeContent: js.UndefOr[Boolean] = js.undefined,
    jsx: String = null,
    namedFunctionExpressions: js.UndefOr[Boolean] = js.undefined,
    objectAssign: String | Boolean = null,
    source: String = null,
    target: Anon_010 = null,
    transforms: Anon_Arrow = null
  ): TransformOptions = {
    val __obj = js.Dynamic.literal()
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (!js.isUndefined(includeContent)) __obj.updateDynamic("includeContent")(includeContent.asInstanceOf[js.Any])
    if (jsx != null) __obj.updateDynamic("jsx")(jsx.asInstanceOf[js.Any])
    if (!js.isUndefined(namedFunctionExpressions)) __obj.updateDynamic("namedFunctionExpressions")(namedFunctionExpressions.asInstanceOf[js.Any])
    if (objectAssign != null) __obj.updateDynamic("objectAssign")(objectAssign.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (transforms != null) __obj.updateDynamic("transforms")(transforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformOptions]
  }
}

