package typings
package chromeLib.chromeNs.topSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MostVisitedURL extends js.Object {
  /** The title of the page */
  var title: java.lang.String
  /** The most visited URL. */
  var url: java.lang.String
}

object MostVisitedURL {
  @scala.inline
  def apply(title: java.lang.String, url: java.lang.String): MostVisitedURL = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[MostVisitedURL]
  }
}

