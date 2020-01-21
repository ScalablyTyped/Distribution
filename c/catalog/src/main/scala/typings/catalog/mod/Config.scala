package typings.catalog.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var basePath: js.UndefOr[String] = js.undefined
  var imports: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var logoSrc: js.UndefOr[String] = js.undefined
  var pages: js.Array[ConfigPageOrGroup]
  var responsiveSizes: js.UndefOr[js.Array[ConfigResponsiveSize]] = js.undefined
  var scripts: js.UndefOr[js.Array[String]] = js.undefined
  var styles: js.UndefOr[js.Array[String]] = js.undefined
  var theme: js.UndefOr[Partial[Theme]] = js.undefined
  var title: String
  var useBrowserHistory: js.UndefOr[Boolean] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    pages: js.Array[ConfigPageOrGroup],
    title: String,
    basePath: String = null,
    imports: StringDictionary[js.Any] = null,
    logoSrc: String = null,
    responsiveSizes: js.Array[ConfigResponsiveSize] = null,
    scripts: js.Array[String] = null,
    styles: js.Array[String] = null,
    theme: Partial[Theme] = null,
    useBrowserHistory: js.UndefOr[Boolean] = js.undefined
  ): Config = {
    val __obj = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (basePath != null) __obj.updateDynamic("basePath")(basePath.asInstanceOf[js.Any])
    if (imports != null) __obj.updateDynamic("imports")(imports.asInstanceOf[js.Any])
    if (logoSrc != null) __obj.updateDynamic("logoSrc")(logoSrc.asInstanceOf[js.Any])
    if (responsiveSizes != null) __obj.updateDynamic("responsiveSizes")(responsiveSizes.asInstanceOf[js.Any])
    if (scripts != null) __obj.updateDynamic("scripts")(scripts.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(useBrowserHistory)) __obj.updateDynamic("useBrowserHistory")(useBrowserHistory.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

