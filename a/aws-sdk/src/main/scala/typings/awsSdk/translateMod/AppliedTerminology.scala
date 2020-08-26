package typings.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppliedTerminology extends js.Object {
  /**
    * The name of the custom terminology applied to the input text by Amazon Translate for the translated text response.
    */
  var Name: js.UndefOr[ResourceName] = js.native
  /**
    * The specific terms of the custom terminology applied to the input text by Amazon Translate for the translated text response. A maximum of 250 terms will be returned, and the specific terms applied will be the first 250 terms in the source text. 
    */
  var Terms: js.UndefOr[TermList] = js.native
}

object AppliedTerminology {
  @scala.inline
  def apply(): AppliedTerminology = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppliedTerminology]
  }
  @scala.inline
  implicit class AppliedTerminologyOps[Self <: AppliedTerminology] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: ResourceName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setTermsVarargs(value: Term*): Self = this.set("Terms", js.Array(value :_*))
    @scala.inline
    def setTerms(value: TermList): Self = this.set("Terms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerms: Self = this.set("Terms", js.undefined)
  }
  
}

