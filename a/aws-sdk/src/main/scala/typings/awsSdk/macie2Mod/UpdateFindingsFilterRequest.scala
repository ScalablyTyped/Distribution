package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFindingsFilterRequest extends StObject {
  
  /**
    * The action to perform on findings that meet the filter criteria (findingCriteria). Valid values are: ARCHIVE, suppress (automatically archive) the findings; and, NOOP, don't perform any action on the findings.
    */
  var action: js.UndefOr[FindingsFilterAction] = js.undefined
  
  /**
    * A custom description of the filter. The description can contain as many as 512 characters. We strongly recommend that you avoid including any sensitive data in the description of a filter. Other users might be able to see the filter's description, depending on the actions that they're allowed to perform in Amazon Macie.
    */
  var description: js.UndefOr[string] = js.undefined
  
  /**
    * The criteria to use to filter findings.
    */
  var findingCriteria: js.UndefOr[FindingCriteria] = js.undefined
  
  /**
    * The unique identifier for the Amazon Macie resource or account that the request applies to.
    */
  var id: string
  
  /**
    * A custom name for the filter. The name must contain at least 3 characters and can contain as many as 64 characters. We strongly recommend that you avoid including any sensitive data in the name of a filter. Other users might be able to see the filter's name, depending on the actions that they're allowed to perform in Amazon Macie.
    */
  var name: js.UndefOr[string] = js.undefined
  
  /**
    * The position of the filter in the list of saved filters on the Amazon Macie console. This value also determines the order in which the filter is applied to findings, relative to other filters that are also applied to the findings.
    */
  var position: js.UndefOr[integer] = js.undefined
}
object UpdateFindingsFilterRequest {
  
  inline def apply(id: string): UpdateFindingsFilterRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFindingsFilterRequest]
  }
  
  extension [Self <: UpdateFindingsFilterRequest](x: Self) {
    
    inline def setAction(value: FindingsFilterAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setDescription(value: string): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFindingCriteria(value: FindingCriteria): Self = StObject.set(x, "findingCriteria", value.asInstanceOf[js.Any])
    
    inline def setFindingCriteriaUndefined: Self = StObject.set(x, "findingCriteria", js.undefined)
    
    inline def setId(value: string): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: string): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPosition(value: integer): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
