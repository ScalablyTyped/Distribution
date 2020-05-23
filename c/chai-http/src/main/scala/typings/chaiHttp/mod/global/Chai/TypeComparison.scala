package typings.chaiHttp.mod.global.Chai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeComparison extends js.Object {
  var ip: Assertion
}

object TypeComparison {
  @scala.inline
  def apply(ip: Assertion): TypeComparison = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeComparison]
  }
}

