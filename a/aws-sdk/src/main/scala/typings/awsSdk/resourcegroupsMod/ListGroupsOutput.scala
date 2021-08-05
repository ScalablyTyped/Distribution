package typings.awsSdk.resourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGroupsOutput extends StObject {
  
  /**
    * A list of GroupIdentifier objects. Each identifier is an object that contains both the Name and the GroupArn.
    */
  var GroupIdentifiers: js.UndefOr[GroupIdentifierList] = js.undefined
  
  /**
    * This output element is deprecated and shouldn't be used. Refer to GroupIdentifiers instead.
    */
  var Groups: js.UndefOr[GroupList] = js.undefined
  
  /**
    * If present, indicates that more output is available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.resourcegroupsMod.NextToken] = js.undefined
}
object ListGroupsOutput {
  
  inline def apply(): ListGroupsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGroupsOutput]
  }
  
  extension [Self <: ListGroupsOutput](x: Self) {
    
    inline def setGroupIdentifiers(value: GroupIdentifierList): Self = StObject.set(x, "GroupIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setGroupIdentifiersUndefined: Self = StObject.set(x, "GroupIdentifiers", js.undefined)
    
    inline def setGroupIdentifiersVarargs(value: GroupIdentifier*): Self = StObject.set(x, "GroupIdentifiers", js.Array(value :_*))
    
    inline def setGroups(value: GroupList): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    inline def setGroupsVarargs(value: Group*): Self = StObject.set(x, "Groups", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
