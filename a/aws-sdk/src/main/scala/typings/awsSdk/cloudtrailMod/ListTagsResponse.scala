package typings.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsResponse extends StObject {
  
  /**
    * Reserved for future use.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list of resource tags.
    */
  var ResourceTagList: js.UndefOr[typings.awsSdk.cloudtrailMod.ResourceTagList] = js.undefined
}
object ListTagsResponse {
  
  @scala.inline
  def apply(): ListTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsResponse]
  }
  
  @scala.inline
  implicit class ListTagsResponseMutableBuilder[Self <: ListTagsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setResourceTagList(value: ResourceTagList): Self = StObject.set(x, "ResourceTagList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTagListUndefined: Self = StObject.set(x, "ResourceTagList", js.undefined)
    
    @scala.inline
    def setResourceTagListVarargs(value: ResourceTag*): Self = StObject.set(x, "ResourceTagList", js.Array(value :_*))
  }
}
