package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Proxy extends js.Object {
  def getURL(resource: java.lang.String): java.lang.String
}

object Proxy {
  @scala.inline
  def apply(getURL: java.lang.String => java.lang.String): Proxy = {
    val __obj = js.Dynamic.literal(getURL = js.Any.fromFunction1(getURL))
  
    __obj.asInstanceOf[Proxy]
  }
}

