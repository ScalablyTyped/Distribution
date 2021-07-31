package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFindingsFilterRequest extends StObject {
  
  /**
    * The action to perform on findings that meet the filter criteria (findingCriteria). Valid values are: ARCHIVE, suppress (automatically archive) the findings; and, NOOP, don't perform any action on the findings.
    */
  var action: FindingsFilterAction
  
  /**
    * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[string] = js.undefined
  
  /**
    * A custom description of the filter. The description can contain as many as 512 characters. We strongly recommend that you avoid including any sensitive data in the description of a filter. Other users of your account might be able to see the filter's description, depending on the actions that they're allowed to perform in Amazon Macie.
    */
  var description: js.UndefOr[string] = js.undefined
  
  /**
    * The criteria to use to filter findings.
    */
  var findingCriteria: FindingCriteria
  
  /**
    * A custom name for the filter. The name must contain at least 3 characters and can contain as many as 64 characters. We strongly recommend that you avoid including any sensitive data in the name of a filter. Other users of your account might be able to see the filter's name, depending on the actions that they're allowed to perform in Amazon Macie.
    */
  var name: string
  
  /**
    * The position of the filter in the list of saved filters on the Amazon Macie console. This value also determines the order in which the filter is applied to findings, relative to other filters that are also applied to the findings.
    */
  var position: js.UndefOr[integer] = js.undefined
  
  /**
    * A map of key-value pairs that specifies the tags to associate with the filter. A findings filter can have a maximum of 50 tags. Each tag consists of a tag key and an associated tag value. The maximum length of a tag key is 128 characters. The maximum length of a tag value is 256 characters.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateFindingsFilterRequest {
  
  @scala.inline
  def apply(action: FindingsFilterAction, findingCriteria: FindingCriteria, name: string): CreateFindingsFilterRequest = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], findingCriteria = findingCriteria.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFindingsFilterRequest]
  }
  
  @scala.inline
  implicit class CreateFindingsFilterRequestMutableBuilder[Self <: CreateFindingsFilterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: FindingsFilterAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientToken(value: string): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    @scala.inline
    def setDescription(value: string): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFindingCriteria(value: FindingCriteria): Self = StObject.set(x, "findingCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
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
