package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Proxy extends js.Object {
  def getURL(resource: java.lang.String): java.lang.String
}

object Proxy {
  @scala.inline
  def apply(getURL: js.Function1[java.lang.String, java.lang.String]): Proxy = {
    val __obj = js.Dynamic.literal(getURL = getURL)
  
    __obj.asInstanceOf[Proxy]
  }
}

