package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFindingsFilterResponse extends StObject {
  
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
  implicit class GetFindingsFilterResponseMutableBuilder[Self <: GetFindingsFilterResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: FindingsFilterAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setArn(value: string): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setDescription(value: string): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFindingCriteria(value: FindingCriteria): Self = StObject.set(x, "findingCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingCriteriaUndefined: Self = StObject.set(x, "findingCriteria", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPosition(value: integer): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
