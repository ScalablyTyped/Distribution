package typings.catalog.catalogMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigPage extends ConfigPageOrGroup {
  var content: js.UndefOr[ComponentType[js.Object]] = js.undefined
  var hideFromMenu: js.UndefOr[Boolean] = js.undefined
  var imports: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var path: String
  var scripts: js.UndefOr[js.Array[String]] = js.undefined
  var styles: js.UndefOr[js.Array[String]] = js.undefined
  var title: String
}

object ConfigPage {
  @scala.inline
  def apply(
    path: String,
    title: String,
    content: ComponentType[js.Object] = null,
    hideFromMenu: js.UndefOr[Boolean] = js.undefined,
    imports: StringDictionary[js.Any] = null,
    scripts: js.Array[String] = null,
    styles: js.Array[String] = null
  ): ConfigPage = {
    val __obj = js.Dynamic.literal(path = path, title = title)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(hideFromMenu)) __obj.updateDynamic("hideFromMenu")(hideFromMenu)
    if (imports != null) __obj.updateDynamic("imports")(imports)
    if (scripts != null) __obj.updateDynamic("scripts")(scripts)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[ConfigPage]
  }
}

