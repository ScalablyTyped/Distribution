package typings.chrome

import typings.chrome.chrome.runtime.SearchProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHomepage extends js.Object {
  var homepage: js.UndefOr[String] = js.undefined
  var search_provider: js.UndefOr[SearchProvider] = js.undefined
  var startup_pages: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonHomepage {
  @scala.inline
  def apply(
    homepage: String = null,
    search_provider: SearchProvider = null,
    startup_pages: js.Array[String] = null
  ): AnonHomepage = {
    val __obj = js.Dynamic.literal()
    if (homepage != null) __obj.updateDynamic("homepage")(homepage.asInstanceOf[js.Any])
    if (search_provider != null) __obj.updateDynamic("search_provider")(search_provider.asInstanceOf[js.Any])
    if (startup_pages != null) __obj.updateDynamic("startup_pages")(startup_pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHomepage]
  }
}

