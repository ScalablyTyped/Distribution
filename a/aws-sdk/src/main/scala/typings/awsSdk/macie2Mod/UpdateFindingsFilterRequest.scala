package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFindingsFilterRequest extends js.Object {
  /**
    * The action to perform on findings that meet the filter criteria (findingCriteria). Valid values are: ARCHIVE, suppress (automatically archive) the findings; and, NOOP, don't perform any action on the findings.
    */
  var action: js.UndefOr[FindingsFilterAction] = js.native
  /**
    * A custom description of the filter. The description can contain as many as 512 characters. We strongly recommend that you avoid including any sensitive data in the description of a filter. Other users might be able to see the filter's description, depending on the actions that they're allowed to perform in Amazon Macie.
    */
  var description: js.UndefOr[string] = js.native
  /**
    * The criteria to use to filter findings.
    */
  var findingCriteria: js.UndefOr[FindingCriteria] = js.native
  /**
    * The unique identifier for the Amazon Macie resource or account that the request applies to.
    */
  var id: string = js.native
  /**
    * A custom name for the filter. The name must contain at least 3 characters and can contain as many as 64 characters. We strongly recommend that you avoid including any sensitive data in the name of a filter. Other users might be able to see the filter's name, depending on the actions that they're allowed to perform in Amazon Macie.
    */
  var name: js.UndefOr[string] = js.native
  /**
    * The position of the filter in the list of saved filters on the Amazon Macie console. This value also determines the order in which the filter is applied to findings, relative to other filters that are also applied to the findings.
    */
  var position: js.UndefOr[integer] = js.native
}

object UpdateFindingsFilterRequest {
  @scala.inline
  def apply(id: string): UpdateFindingsFilterRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFindingsFilterRequest]
  }
  @scala.inline
  implicit class UpdateFindingsFilterRequestOps[Self <: UpdateFindingsFilterRequest] (val x: Self) extends AnyVal {
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
    def setId(value: string): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setAction(value: FindingsFilterAction): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setDescription(value: string): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setFindingCriteria(value: FindingCriteria): Self = this.set("findingCriteria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFindingCriteria: Self = this.set("findingCriteria", js.undefined)
    @scala.inline
    def setName(value: string): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPosition(value: integer): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
  
}

