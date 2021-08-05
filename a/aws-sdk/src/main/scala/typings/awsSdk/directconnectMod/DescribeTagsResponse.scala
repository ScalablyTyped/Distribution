package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTagsResponse extends StObject {
  
  /**
    * Information about the tags.
    */
  var resourceTags: js.UndefOr[ResourceTagList] = js.undefined
}
object DescribeTagsResponse {
  
  inline def apply(): DescribeTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTagsResponse]
  }
  
  extension [Self <: DescribeTagsResponse](x: Self) {
    
    inline def setResourceTags(value: ResourceTagList): Self = StObject.set(x, "resourceTags", value.asInstanceOf[js.Any])
    
    inline def setResourceTagsUndefined: Self = StObject.set(x, "resourceTags", js.undefined)
    
    inline def setResourceTagsVarargs(value: ResourceTag*): Self = StObject.set(x, "resourceTags", js.Array(value :_*))
  }
}
