package typings
package coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var body: java.lang.String
  var headers: coinbaseDashCommerceDashNodeLib.Anon_Accept
  var method: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.GET | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.POST | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.DELETE | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.PUT
  var timeout: scala.Double
  var url: java.lang.String
}

object Options {
  @scala.inline
  def apply(
    body: java.lang.String,
    headers: coinbaseDashCommerceDashNodeLib.Anon_Accept,
    method: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.GET | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.POST | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.DELETE | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.PUT,
    timeout: scala.Double,
    url: java.lang.String
  ): Options = {
    val __obj = js.Dynamic.literal(body = body, headers = headers, method = method.asInstanceOf[js.Any], timeout = timeout, url = url)
  
    __obj.asInstanceOf[Options]
  }
}

