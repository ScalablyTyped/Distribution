package typings.dependencyDashTree.dependencyDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var detective: js.UndefOr[js.Any] = js.undefined
  var directory: js.UndefOr[String] = js.undefined
  var filename: String
  var filter: js.UndefOr[js.Function1[/* path */ String, Boolean]] = js.undefined
  var isListForm: js.UndefOr[Boolean] = js.undefined
  var nodeModulesConfig: js.UndefOr[js.Any] = js.undefined
  var nonExistent: js.UndefOr[js.Array[String]] = js.undefined
  var requireConfig: js.UndefOr[String] = js.undefined
  var visited: js.UndefOr[DependencyObj] = js.undefined
  var webpackConfig: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    filename: String,
    detective: js.Any = null,
    directory: String = null,
    filter: /* path */ String => Boolean = null,
    isListForm: js.UndefOr[Boolean] = js.undefined,
    nodeModulesConfig: js.Any = null,
    nonExistent: js.Array[String] = null,
    requireConfig: String = null,
    visited: DependencyObj = null,
    webpackConfig: String = null
  ): Options = {
    val __obj = js.Dynamic.literal(filename = filename)
    if (detective != null) __obj.updateDynamic("detective")(detective)
    if (directory != null) __obj.updateDynamic("directory")(directory)
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (!js.isUndefined(isListForm)) __obj.updateDynamic("isListForm")(isListForm)
    if (nodeModulesConfig != null) __obj.updateDynamic("nodeModulesConfig")(nodeModulesConfig)
    if (nonExistent != null) __obj.updateDynamic("nonExistent")(nonExistent)
    if (requireConfig != null) __obj.updateDynamic("requireConfig")(requireConfig)
    if (visited != null) __obj.updateDynamic("visited")(visited)
    if (webpackConfig != null) __obj.updateDynamic("webpackConfig")(webpackConfig)
    __obj.asInstanceOf[Options]
  }
}

