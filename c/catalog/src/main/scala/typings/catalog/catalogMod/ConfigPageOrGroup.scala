package typings.catalog.catalogMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.catalog.catalogMod.ConfigPage
  - typings.catalog.catalogMod.ConfigPageGroup
*/
trait ConfigPageOrGroup extends js.Object

object ConfigPageOrGroup {
  @scala.inline
  def ConfigPage(
    path: String,
    title: String,
    content: ComponentType[js.Object] = null,
    hideFromMenu: js.UndefOr[Boolean] = js.undefined,
    imports: StringDictionary[js.Any] = null,
    scripts: js.Array[String] = null,
    styles: js.Array[String] = null
  ): ConfigPageOrGroup = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(hideFromMenu)) __obj.updateDynamic("hideFromMenu")(hideFromMenu.asInstanceOf[js.Any])
    if (imports != null) __obj.updateDynamic("imports")(imports.asInstanceOf[js.Any])
    if (scripts != null) __obj.updateDynamic("scripts")(scripts.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigPageOrGroup]
  }
  @scala.inline
  def ConfigPageGroup(pages: js.Array[ConfigPage], title: String): ConfigPageOrGroup = {
    val __obj = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConfigPageOrGroup]
  }
}

