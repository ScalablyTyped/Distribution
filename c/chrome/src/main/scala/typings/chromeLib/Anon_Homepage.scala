package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Homepage extends js.Object {
  var homepage: js.UndefOr[java.lang.String] = js.undefined
  var search_provider: js.UndefOr[chromeLib.chromeNs.runtimeNs.SearchProvider] = js.undefined
  var startup_pages: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_Homepage {
  @scala.inline
  def apply(
    homepage: java.lang.String = null,
    search_provider: chromeLib.chromeNs.runtimeNs.SearchProvider = null,
    startup_pages: js.Array[java.lang.String] = null
  ): Anon_Homepage = {
    val __obj = js.Dynamic.literal()
    if (homepage != null) __obj.updateDynamic("homepage")(homepage)
    if (search_provider != null) __obj.updateDynamic("search_provider")(search_provider)
    if (startup_pages != null) __obj.updateDynamic("startup_pages")(startup_pages)
    __obj.asInstanceOf[Anon_Homepage]
  }
}

