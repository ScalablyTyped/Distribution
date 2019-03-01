package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackDataGet extends js.Object {
  def get(
    callback: js.Function1[/* data */ js.Array[chromeLib.chromeNs.topSitesNs.MostVisitedURL], scala.Unit]
  ): scala.Unit
}

object Anon_CallbackDataGet {
  @scala.inline
  def apply(
    get: js.Function1[
      js.Function1[/* data */ js.Array[chromeLib.chromeNs.topSitesNs.MostVisitedURL], scala.Unit], 
      scala.Unit
    ]
  ): Anon_CallbackDataGet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.asInstanceOf[Anon_CallbackDataGet]
  }
}

