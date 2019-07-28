package typings.chrome

import typings.chrome.chromeNs.topSitesNs.MostVisitedURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeoftopSites extends js.Object {
  def get(callback: js.Function1[/* data */ js.Array[MostVisitedURL], Unit]): Unit
}

object TypeoftopSites {
  @scala.inline
  def apply(get: js.Function1[/* data */ js.Array[MostVisitedURL], Unit] => Unit): TypeoftopSites = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[TypeoftopSites]
  }
}

