package typings.cloudmersiveVirusApiClient.mod

import typings.cloudmersiveVirusApiClient.cloudmersiveVirusApiClientStrings.Apikey
import typings.cloudmersiveVirusApiClient.cloudmersiveVirusApiClientStrings.apiKey_
import typings.cloudmersiveVirusApiClient.cloudmersiveVirusApiClientStrings.header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiInstanceAuthentications extends js.Object {
  var apiKey: String
  var in: header
  var name: Apikey
  var `type`: apiKey_
}

object ApiInstanceAuthentications {
  @scala.inline
  def apply(apiKey: String, in: header, name: Apikey, `type`: apiKey_): ApiInstanceAuthentications = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiInstanceAuthentications]
  }
}

