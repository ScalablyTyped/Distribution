package typings
package catalogLib.catalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var basePath: js.UndefOr[java.lang.String] = js.undefined
  var imports: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var logoSrc: js.UndefOr[java.lang.String] = js.undefined
  var pages: js.Array[ConfigPageOrGroup]
  var responsiveSizes: js.UndefOr[js.Array[ConfigResponsiveSize]] = js.undefined
  var scripts: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var styles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var theme: js.UndefOr[stdLib.Partial[Theme]] = js.undefined
  var title: java.lang.String
  var useBrowserHistory: js.UndefOr[scala.Boolean] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    pages: js.Array[ConfigPageOrGroup],
    title: java.lang.String,
    basePath: java.lang.String = null,
    imports: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    logoSrc: java.lang.String = null,
    responsiveSizes: js.Array[ConfigResponsiveSize] = null,
    scripts: js.Array[java.lang.String] = null,
    styles: js.Array[java.lang.String] = null,
    theme: stdLib.Partial[Theme] = null,
    useBrowserHistory: js.UndefOr[scala.Boolean] = js.undefined
  ): Config = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pages")(pages)
    __obj.updateDynamic("title")(title)
    if (basePath != null) __obj.updateDynamic("basePath")(basePath)
    if (imports != null) __obj.updateDynamic("imports")(imports)
    if (logoSrc != null) __obj.updateDynamic("logoSrc")(logoSrc)
    if (responsiveSizes != null) __obj.updateDynamic("responsiveSizes")(responsiveSizes)
    if (scripts != null) __obj.updateDynamic("scripts")(scripts)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (!js.isUndefined(useBrowserHistory)) __obj.updateDynamic("useBrowserHistory")(useBrowserHistory)
    __obj.asInstanceOf[Config]
  }
}

