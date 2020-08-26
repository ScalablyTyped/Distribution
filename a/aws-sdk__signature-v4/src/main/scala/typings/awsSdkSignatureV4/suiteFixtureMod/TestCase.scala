package typings.awsSdkSignatureV4.suiteFixtureMod

import typings.awsSdkTypes.httpMod.HttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestCase extends js.Object {
  var authorization: String = js.native
  var name: String = js.native
  var request: HttpRequest[String] = js.native
}

object TestCase {
  @scala.inline
  def apply(authorization: String, name: String, request: HttpRequest[String]): TestCase = {
    val __obj = js.Dynamic.literal(authorization = authorization.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestCase]
  }
  @scala.inline
  implicit class TestCaseOps[Self <: TestCase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuthorization(value: String): Self = this.set("authorization", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: HttpRequest[String]): Self = this.set("request", value.asInstanceOf[js.Any])
  }
  
}

