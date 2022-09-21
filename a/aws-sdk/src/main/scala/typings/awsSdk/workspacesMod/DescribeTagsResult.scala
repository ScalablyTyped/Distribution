package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTagsResult extends StObject {
  
  /**
    * The tags.
    */
  var TagList: js.UndefOr[typings.awsSdk.workspacesMod.TagList] = js.undefined
}
object DescribeTagsResult {
  
  inline def apply(): DescribeTagsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTagsResult]
  }
  
  extension [Self <: DescribeTagsResult](x: Self) {
    
    inline def setTagList(value: TagList): Self = StObject.set(x, "TagList", value.asInstanceOf[js.Any])
    
    inline def setTagListUndefined: Self = StObject.set(x, "TagList", js.undefined)
    
    inline def setTagListVarargs(value: Tag*): Self = StObject.set(x, "TagList", js.Array(value*))
  }
}
