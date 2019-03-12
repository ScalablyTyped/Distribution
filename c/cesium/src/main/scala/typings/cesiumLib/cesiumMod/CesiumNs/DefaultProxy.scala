package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultProxy extends js.Object {
  def getURL(resource: java.lang.String): java.lang.String
}

object DefaultProxy {
  @scala.inline
  def apply(getURL: java.lang.String => java.lang.String): DefaultProxy = {
    val __obj = js.Dynamic.literal(getURL = js.Any.fromFunction1(getURL))
  
    __obj.asInstanceOf[DefaultProxy]
  }
}

