package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeoftopSites extends js.Object {
  def get(
    callback: js.Function1[/* data */ js.Array[chromeLib.chromeNs.topSitesNs.MostVisitedURL], scala.Unit]
  ): scala.Unit
}

object TypeoftopSites {
  @scala.inline
  def apply(
    get: js.Function1[/* data */ js.Array[chromeLib.chromeNs.topSitesNs.MostVisitedURL], scala.Unit] => scala.Unit
  ): TypeoftopSites = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[TypeoftopSites]
  }
}

