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
  def apply(getURL: js.Function1[java.lang.String, java.lang.String]): DefaultProxy = {
    val __obj = js.Dynamic.literal(getURL = getURL)
  
    __obj.asInstanceOf[DefaultProxy]
  }
}

