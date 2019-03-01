package typings
package catalogLib.catalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigPage extends ConfigPageOrGroup {
  var content: js.UndefOr[reactLib.reactMod.ReactNs.ComponentType[js.Object]] = js.undefined
  var hideFromMenu: js.UndefOr[scala.Boolean] = js.undefined
  var imports: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var path: java.lang.String
  var scripts: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var styles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var title: java.lang.String
}

object ConfigPage {
  @scala.inline
  def apply(
    path: java.lang.String,
    title: java.lang.String,
    content: reactLib.reactMod.ReactNs.ComponentType[js.Object] = null,
    hideFromMenu: js.UndefOr[scala.Boolean] = js.undefined,
    imports: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    scripts: js.Array[java.lang.String] = null,
    styles: js.Array[java.lang.String] = null
  ): ConfigPage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("title")(title)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(hideFromMenu)) __obj.updateDynamic("hideFromMenu")(hideFromMenu)
    if (imports != null) __obj.updateDynamic("imports")(imports)
    if (scripts != null) __obj.updateDynamic("scripts")(scripts)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[ConfigPage]
  }
}

