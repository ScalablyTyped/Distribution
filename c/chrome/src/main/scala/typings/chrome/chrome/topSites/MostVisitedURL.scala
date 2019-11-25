package typings.chrome.chrome.topSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MostVisitedURL extends js.Object {
  /** The title of the page */
  var title: String
  /** The most visited URL. */
  var url: String
}

object MostVisitedURL {
  @scala.inline
  def apply(title: String, url: String): MostVisitedURL = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MostVisitedURL]
  }
}

