package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Proxy extends js.Object {
  def getURL(resource: String): String
}

object Proxy {
  @scala.inline
  def apply(getURL: String => String): Proxy = {
    val __obj = js.Dynamic.literal(getURL = js.Any.fromFunction1(getURL))
  
    __obj.asInstanceOf[Proxy]
  }
}

