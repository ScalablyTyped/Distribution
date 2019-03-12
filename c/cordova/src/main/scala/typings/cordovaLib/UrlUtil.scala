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
  def apply(makeAbsolute: java.lang.String => java.lang.String): UrlUtil = {
    val __obj = js.Dynamic.literal(makeAbsolute = js.Any.fromFunction1(makeAbsolute))
  
    __obj.asInstanceOf[UrlUtil]
  }
}

