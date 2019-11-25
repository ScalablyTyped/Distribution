package typings.dav.davMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  /**
    * root url to resolve relative request urls with.
    */
  var baseUrl: String
}

object ClientOptions {
  @scala.inline
  def apply(baseUrl: String): ClientOptions = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClientOptions]
  }
}

