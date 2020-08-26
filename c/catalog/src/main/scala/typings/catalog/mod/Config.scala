package typings.catalog.mod

import org.scalablytyped.runtime.StringDictionary
import typings.catalog.anon.PartialTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var basePath: js.UndefOr[String] = js.native
  var imports: js.UndefOr[StringDictionary[js.Any]] = js.native
  var logoSrc: js.UndefOr[String] = js.native
  var pages: js.Array[ConfigPageOrGroup] = js.native
  var responsiveSizes: js.UndefOr[js.Array[ConfigResponsiveSize]] = js.native
  var scripts: js.UndefOr[js.Array[String]] = js.native
  var styles: js.UndefOr[js.Array[String]] = js.native
  var theme: js.UndefOr[PartialTheme] = js.native
  var title: String = js.native
  var useBrowserHistory: js.UndefOr[Boolean] = js.native
}

object Config {
  @scala.inline
  def apply(pages: js.Array[ConfigPageOrGroup], title: String): Config = {
    val __obj = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPagesVarargs(value: ConfigPageOrGroup*): Self = this.set("pages", js.Array(value :_*))
    @scala.inline
    def setPages(value: js.Array[ConfigPageOrGroup]): Self = this.set("pages", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setBasePath(value: String): Self = this.set("basePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasePath: Self = this.set("basePath", js.undefined)
    @scala.inline
    def setImports(value: StringDictionary[js.Any]): Self = this.set("imports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImports: Self = this.set("imports", js.undefined)
    @scala.inline
    def setLogoSrc(value: String): Self = this.set("logoSrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogoSrc: Self = this.set("logoSrc", js.undefined)
    @scala.inline
    def setResponsiveSizesVarargs(value: ConfigResponsiveSize*): Self = this.set("responsiveSizes", js.Array(value :_*))
    @scala.inline
    def setResponsiveSizes(value: js.Array[ConfigResponsiveSize]): Self = this.set("responsiveSizes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsiveSizes: Self = this.set("responsiveSizes", js.undefined)
    @scala.inline
    def setScriptsVarargs(value: String*): Self = this.set("scripts", js.Array(value :_*))
    @scala.inline
    def setScripts(value: js.Array[String]): Self = this.set("scripts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScripts: Self = this.set("scripts", js.undefined)
    @scala.inline
    def setStylesVarargs(value: String*): Self = this.set("styles", js.Array(value :_*))
    @scala.inline
    def setStyles(value: js.Array[String]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTheme(value: PartialTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setUseBrowserHistory(value: Boolean): Self = this.set("useBrowserHistory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseBrowserHistory: Self = this.set("useBrowserHistory", js.undefined)
  }
  
}

