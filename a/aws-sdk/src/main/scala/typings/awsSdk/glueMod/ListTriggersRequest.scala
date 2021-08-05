package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTriggersRequest extends StObject {
  
  /**
    *  The name of the job for which to retrieve triggers. The trigger that can start this job is returned. If there is no such trigger, all triggers are returned.
    */
  var DependentJobName: js.UndefOr[NameString] = js.undefined
  
  /**
    * The maximum size of a list to return.
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  
  /**
    * A continuation token, if this is a continuation request.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
  
  /**
    * Specifies to return only these tagged resources.
    */
  var Tags: js.UndefOr[TagsMap] = js.undefined
}
object ListTriggersRequest {
  
  inline def apply(): ListTriggersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTriggersRequest]
  }
  
  extension [Self <: ListTriggersRequest](x: Self) {
    
    inline def setDependentJobName(value: NameString): Self = StObject.set(x, "DependentJobName", value.asInstanceOf[js.Any])
    
    inline def setDependentJobNameUndefined: Self = StObject.set(x, "DependentJobName", js.undefined)
    
    inline def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
