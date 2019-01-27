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

