package typings.awsSdkTypes.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpTrait extends js.Object {
  var method: java.lang.String
  var requestUri: java.lang.String
}

object HttpTrait {
  @scala.inline
  def apply(method: java.lang.String, requestUri: java.lang.String): HttpTrait = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], requestUri = requestUri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HttpTrait]
  }
}

