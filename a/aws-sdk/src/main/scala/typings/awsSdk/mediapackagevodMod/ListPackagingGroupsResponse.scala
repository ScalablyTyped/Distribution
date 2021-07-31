package typings.awsSdk.mediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPackagingGroupsResponse extends StObject {
  
  /**
    * A token that can be used to resume pagination from the end of the collection.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * A list of MediaPackage VOD PackagingGroup resources.
    */
  var PackagingGroups: js.UndefOr[listOfPackagingGroup] = js.undefined
}
object ListPackagingGroupsResponse {
  
  @scala.inline
  def apply(): ListPackagingGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPackagingGroupsResponse]
  }
  
  @scala.inline
  implicit class ListPackagingGroupsResponseMutableBuilder[Self <: ListPackagingGroupsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPackagingGroups(value: listOfPackagingGroup): Self = StObject.set(x, "PackagingGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackagingGroupsUndefined: Self = StObject.set(x, "PackagingGroups", js.undefined)
    
    @scala.inline
    def setPackagingGroupsVarargs(value: PackagingGroup*): Self = StObject.set(x, "PackagingGroups", js.Array(value :_*))
  }
}
