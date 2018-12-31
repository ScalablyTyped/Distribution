package typings
package dependencyDashTreeLib.dependencyDashTreeMod.dependencyTreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var detective: js.UndefOr[js.Any] = js.undefined
  var directory: js.UndefOr[java.lang.String] = js.undefined
  var filename: java.lang.String
  var filter: js.UndefOr[js.Function1[/* path */ java.lang.String, scala.Boolean]] = js.undefined
  var isListForm: js.UndefOr[scala.Boolean] = js.undefined
  var nodeModulesConfig: js.UndefOr[js.Any] = js.undefined
  var nonExistent: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var requireConfig: js.UndefOr[java.lang.String] = js.undefined
  var visited: js.UndefOr[DependencyObj] = js.undefined
  var webpackConfig: js.UndefOr[java.lang.String] = js.undefined
}

