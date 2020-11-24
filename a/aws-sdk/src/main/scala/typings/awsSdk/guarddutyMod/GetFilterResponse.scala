package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFilterResponse extends js.Object {
  
  /**
    * Specifies the action that is to be applied to the findings that match the filter.
    */
  var Action: FilterAction = js.native
  
  /**
    * The description of the filter.
    */
  var Description: js.UndefOr[FilterDescription] = js.native
  
  /**
    * Represents the criteria to be used in the filter for querying findings.
    */
  var FindingCriteria: typings.awsSdk.guarddutyMod.FindingCriteria = js.native
  
  /**
    * The name of the filter.
    */
  var Name: FilterName = js.native
  
  /**
    * Specifies the position of the filter in the list of current filters. Also specifies the order in which this filter is applied to the findings.
    */
  var Rank: js.UndefOr[FilterRank] = js.native
  
  /**
    * The tags of the filter resource.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}
object GetFilterResponse {
  
  @scala.inline
  def apply(Action: FilterAction, FindingCriteria: FindingCriteria, Name: FilterName): GetFilterResponse = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], FindingCriteria = FindingCriteria.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFilterResponse]
  }
  
  @scala.inline
  implicit class GetFilterResponseOps[Self <: GetFilterResponse] (val x: Self) extends AnyVal {
    
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
    def setAction(value: FilterAction): Self = this.set("Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingCriteria(value: FindingCriteria): Self = this.set("FindingCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: FilterName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: FilterDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setRank(value: FilterRank): Self = this.set("Rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRank: Self = this.set("Rank", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
