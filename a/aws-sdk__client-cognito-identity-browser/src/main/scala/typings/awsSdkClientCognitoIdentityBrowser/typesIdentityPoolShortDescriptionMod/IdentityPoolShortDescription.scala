package typings.awsSdkClientCognitoIdentityBrowser.typesIdentityPoolShortDescriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityPoolShortDescription extends js.Object {
  /**
    * <p>An identity pool ID in the format REGION:GUID.</p>
    */
  var IdentityPoolId: js.UndefOr[String] = js.native
  /**
    * <p>A string that you provide.</p>
    */
  var IdentityPoolName: js.UndefOr[String] = js.native
}

object IdentityPoolShortDescription {
  @scala.inline
  def apply(): IdentityPoolShortDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityPoolShortDescription]
  }
  @scala.inline
  implicit class IdentityPoolShortDescriptionOps[Self <: IdentityPoolShortDescription] (val x: Self) extends AnyVal {
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
    def setIdentityPoolId(value: String): Self = this.set("IdentityPoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentityPoolId: Self = this.set("IdentityPoolId", js.undefined)
    @scala.inline
    def setIdentityPoolName(value: String): Self = this.set("IdentityPoolName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentityPoolName: Self = this.set("IdentityPoolName", js.undefined)
  }
  
}

