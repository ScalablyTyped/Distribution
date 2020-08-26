package typings.bell.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomProviderOptions
  extends RequiredProviderOptions
     with OptionalOptions
     with BellOptions {
  var provider: CustomProtocol1 | CustomProtocol2 = js.native
}

object CustomProviderOptions {
  @scala.inline
  def apply(
    clientId: String,
    clientSecret: String,
    password: String,
    provider: CustomProtocol1 | CustomProtocol2
  ): CustomProviderOptions = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProviderOptions]
  }
  @scala.inline
  implicit class CustomProviderOptionsOps[Self <: CustomProviderOptions] (val x: Self) extends AnyVal {
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
    def setProvider(value: CustomProtocol1 | CustomProtocol2): Self = this.set("provider", value.asInstanceOf[js.Any])
  }
  
}

