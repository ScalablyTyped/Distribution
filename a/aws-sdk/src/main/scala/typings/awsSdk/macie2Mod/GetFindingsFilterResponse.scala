package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFindingsFilterResponse extends js.Object {
  /**
    * The action that's performed on findings that meet the filter criteria (findingCriteria). Possible values are: ARCHIVE, suppress (automatically archive) the findings; and, NOOP, don't perform any action on the findings.
    */
  var action: js.UndefOr[FindingsFilterAction] = js.native
  /**
    * The Amazon Resource Name (ARN) of the filter.
    */
  var arn: js.UndefOr[string] = js.native
  /**
    * The custom description of the filter.
    */
  var description: js.UndefOr[string] = js.native
  /**
    * The criteria that's used to filter findings.
    */
  var findingCriteria: js.UndefOr[FindingCriteria] = js.native
  /**
    * The unique identifier for the filter.
    */
  var id: js.UndefOr[string] = js.native
  /**
    * The custom name of the filter.
    */
  var name: js.UndefOr[string] = js.native
  /**
    * The position of the filter in the list of saved filters on the Amazon Macie console. This value also determines the order in which the filter is applied to findings, relative to other filters that are also applied to the findings.
    */
  var position: js.UndefOr[integer] = js.native
  /**
    * A map of key-value pairs that identifies the tags (keys and values) that are associated with the filter.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object GetFindingsFilterResponse {
  @scala.inline
  def apply(): GetFindingsFilterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFindingsFilterResponse]
  }
  @scala.inline
  implicit class GetFindingsFilterResponseOps[Self <: GetFindingsFilterResponse] (val x: Self) extends AnyVal {
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
    def setAction(value: FindingsFilterAction): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setArn(value: string): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setDescription(value: string): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setFindingCriteria(value: FindingCriteria): Self = this.set("findingCriteria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFindingCriteria: Self = this.set("findingCriteria", js.undefined)
    @scala.inline
    def setId(value: string): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setName(value: string): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPosition(value: integer): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

