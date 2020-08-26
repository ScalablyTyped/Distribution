package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetContactMethodsResult extends js.Object {
  /**
    * An array of objects that describe the contact methods.
    */
  var contactMethods: js.UndefOr[ContactMethodsList] = js.native
}

object GetContactMethodsResult {
  @scala.inline
  def apply(): GetContactMethodsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContactMethodsResult]
  }
  @scala.inline
  implicit class GetContactMethodsResultOps[Self <: GetContactMethodsResult] (val x: Self) extends AnyVal {
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
    def setContactMethodsVarargs(value: ContactMethod*): Self = this.set("contactMethods", js.Array(value :_*))
    @scala.inline
    def setContactMethods(value: ContactMethodsList): Self = this.set("contactMethods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContactMethods: Self = this.set("contactMethods", js.undefined)
  }
  
}

