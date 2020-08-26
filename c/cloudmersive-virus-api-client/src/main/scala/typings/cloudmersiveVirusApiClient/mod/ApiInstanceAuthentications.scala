package typings.cloudmersiveVirusApiClient.mod

import typings.cloudmersiveVirusApiClient.cloudmersiveVirusApiClientStrings.Apikey
import typings.cloudmersiveVirusApiClient.cloudmersiveVirusApiClientStrings.apiKey_
import typings.cloudmersiveVirusApiClient.cloudmersiveVirusApiClientStrings.header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiInstanceAuthentications extends js.Object {
  var apiKey: String = js.native
  var in: header = js.native
  var name: Apikey = js.native
  var `type`: apiKey_ = js.native
}

object ApiInstanceAuthentications {
  @scala.inline
  def apply(apiKey: String, in: header, name: Apikey, `type`: apiKey_): ApiInstanceAuthentications = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiInstanceAuthentications]
  }
  @scala.inline
  implicit class ApiInstanceAuthenticationsOps[Self <: ApiInstanceAuthentications] (val x: Self) extends AnyVal {
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
    def setApiKey(value: String): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setIn(value: header): Self = this.set("in", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Apikey): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: apiKey_): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

