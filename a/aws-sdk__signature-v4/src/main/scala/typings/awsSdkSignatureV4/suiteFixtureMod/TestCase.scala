package typings.awsSdkSignatureV4.suiteFixtureMod

import typings.awsSdkTypes.httpMod.HttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestCase extends js.Object {
  var authorization: String
  var name: String
  var request: HttpRequest[String]
}

object TestCase {
  @scala.inline
  def apply(authorization: String, name: String, request: HttpRequest[String]): TestCase = {
    val __obj = js.Dynamic.literal(authorization = authorization.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestCase]
  }
}

