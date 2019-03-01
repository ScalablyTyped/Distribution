package typings
package cordovaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// cordova/urlutil module
trait UrlUtil extends js.Object {
  def makeAbsolute(url: java.lang.String): java.lang.String
}

object UrlUtil {
  @scala.inline
  def apply(makeAbsolute: js.Function1[java.lang.String, java.lang.String]): UrlUtil = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("makeAbsolute")(makeAbsolute)
    __obj.asInstanceOf[UrlUtil]
  }
}

