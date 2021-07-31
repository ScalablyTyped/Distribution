package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEventCategoriesResponse extends StObject {
  
  /**
    * A list of event categories.
    */
  var EventCategoryGroupList: js.UndefOr[typings.awsSdk.dmsMod.EventCategoryGroupList] = js.undefined
}
object DescribeEventCategoriesResponse {
  
  @scala.inline
  def apply(): DescribeEventCategoriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventCategoriesResponse]
  }
  
  @scala.inline
  implicit class DescribeEventCategoriesResponseMutableBuilder[Self <: DescribeEventCategoriesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventCategoryGroupList(value: EventCategoryGroupList): Self = StObject.set(x, "EventCategoryGroupList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventCategoryGroupListUndefined: Self = StObject.set(x, "EventCategoryGroupList", js.undefined)
    
    @scala.inline
    def setEventCategoryGroupListVarargs(value: EventCategoryGroup*): Self = StObject.set(x, "EventCategoryGroupList", js.Array(value :_*))
  }
}
