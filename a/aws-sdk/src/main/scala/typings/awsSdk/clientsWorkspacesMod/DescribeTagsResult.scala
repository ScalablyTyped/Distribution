package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTagsResult extends StObject {
  
  /**
    * The tags.
    */
  var TagList: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.TagList] = js.undefined
}
object DescribeTagsResult {
  
  inline def apply(): DescribeTagsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTagsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeTagsResult] (val x: Self) extends AnyVal {
    
    inline def setTagList(value: TagList): Self = StObject.set(x, "TagList", value.asInstanceOf[js.Any])
    
    inline def setTagListUndefined: Self = StObject.set(x, "TagList", js.undefined)
    
    inline def setTagListVarargs(value: Tag*): Self = StObject.set(x, "TagList", js.Array(value*))
  }
}
