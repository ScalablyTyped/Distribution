package typings.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrustedAdvisorCheckDescription extends js.Object {
  /**
    * The category of the Trusted Advisor check.
    */
  var category: String = js.native
  /**
    * The description of the Trusted Advisor check, which includes the alert criteria and recommended operations (contains HTML markup).
    */
  var description: String = js.native
  /**
    * The unique identifier for the Trusted Advisor check.
    */
  var id: String = js.native
  /**
    * The column headings for the data returned by the Trusted Advisor check. The order of the headings corresponds to the order of the data in the Metadata element of the TrustedAdvisorResourceDetail for the check. Metadata contains all the data that is shown in the Excel download, even in those cases where the UI shows just summary data. 
    */
  var metadata: StringList = js.native
  /**
    * The display name for the Trusted Advisor check.
    */
  var name: String = js.native
}

object TrustedAdvisorCheckDescription {
  @scala.inline
  def apply(category: String, description: String, id: String, metadata: StringList, name: String): TrustedAdvisorCheckDescription = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrustedAdvisorCheckDescription]
  }
  @scala.inline
  implicit class TrustedAdvisorCheckDescriptionOps[Self <: TrustedAdvisorCheckDescription] (val x: Self) extends AnyVal {
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
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadataVarargs(value: String*): Self = this.set("metadata", js.Array(value :_*))
    @scala.inline
    def setMetadata(value: StringList): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

