package typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeMod

import typings.coinbaseDashCommerceDashNode.Anon_Accept
import typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.DELETE
import typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.GET
import typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.POST
import typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.PUT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var body: String
  var headers: Anon_Accept
  var method: GET | POST | DELETE | PUT
  var timeout: Double
  var url: String
}

object Options {
  @scala.inline
  def apply(
    body: String,
    headers: Anon_Accept,
    method: GET | POST | DELETE | PUT,
    timeout: Double,
    url: String
  ): Options = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

