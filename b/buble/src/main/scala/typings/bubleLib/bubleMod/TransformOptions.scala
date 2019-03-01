package typings
package bubleLib.bubleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformOptions extends js.Object {
   // input
  var file: js.UndefOr[java.lang.String] = js.undefined
     // output
  var includeContent: js.UndefOr[scala.Boolean] = js.undefined
  // custom JSX pragma (https://buble.surge.sh/guide/#jsx)
  var jsx: js.UndefOr[java.lang.String] = js.undefined
  // others
  var namedFunctionExpressions: js.UndefOr[scala.Boolean] = js.undefined
   // default: 'React.createElement'
  // custom `Object.assign` (https://buble.surge.sh/guide/#object-spread-and-rest)
  var objectAssign: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  // used for sourcemaps
  var source: js.UndefOr[java.lang.String] = js.undefined
  // source: https://github.com/Rich-Harris/buble/blob/master/src/support.js
  var target: js.UndefOr[bubleLib.Anon_010] = js.undefined
  // transforms
  var transforms: js.UndefOr[bubleLib.Anon_Arrow] = js.undefined
}

object TransformOptions {
  @scala.inline
  def apply(
    file: java.lang.String = null,
    includeContent: js.UndefOr[scala.Boolean] = js.undefined,
    jsx: java.lang.String = null,
    namedFunctionExpressions: js.UndefOr[scala.Boolean] = js.undefined,
    objectAssign: java.lang.String | scala.Boolean = null,
    source: java.lang.String = null,
    target: bubleLib.Anon_010 = null,
    transforms: bubleLib.Anon_Arrow = null
  ): TransformOptions = {
    val __obj = js.Dynamic.literal()
    if (file != null) __obj.updateDynamic("file")(file)
    if (!js.isUndefined(includeContent)) __obj.updateDynamic("includeContent")(includeContent)
    if (jsx != null) __obj.updateDynamic("jsx")(jsx)
    if (!js.isUndefined(namedFunctionExpressions)) __obj.updateDynamic("namedFunctionExpressions")(namedFunctionExpressions)
    if (objectAssign != null) __obj.updateDynamic("objectAssign")(objectAssign.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    if (target != null) __obj.updateDynamic("target")(target)
    if (transforms != null) __obj.updateDynamic("transforms")(transforms)
    __obj.asInstanceOf[TransformOptions]
  }
}

