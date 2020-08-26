package typings.catalog.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigPage extends ConfigPageOrGroup {
  var content: js.UndefOr[ComponentType[js.Object]] = js.native
  var hideFromMenu: js.UndefOr[Boolean] = js.native
  var imports: js.UndefOr[StringDictionary[js.Any]] = js.native
  var path: String = js.native
  var scripts: js.UndefOr[js.Array[String]] = js.native
  var styles: js.UndefOr[js.Array[String]] = js.native
  var title: String = js.native
}

object ConfigPage {
  @scala.inline
  def apply(path: String, title: String): ConfigPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigPage]
  }
  @scala.inline
  implicit class ConfigPageOps[Self <: ConfigPage] (val x: Self) extends AnyVal {
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: ComponentType[js.Object]): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setHideFromMenu(value: Boolean): Self = this.set("hideFromMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideFromMenu: Self = this.set("hideFromMenu", js.undefined)
    @scala.inline
    def setImports(value: StringDictionary[js.Any]): Self = this.set("imports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImports: Self = this.set("imports", js.undefined)
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
  }
  
}

