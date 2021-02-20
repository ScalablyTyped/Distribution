package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListJobsSortCriteria extends StObject {
  
  /**
    * The property to sort the results by.
    */
  var attributeName: js.UndefOr[ListJobsSortAttributeName] = js.native
  
  /**
    * The sort order to apply to the results, based on the value for the property specified by the attributeName property. Valid values are: ASC, sort the results in ascending order; and, DESC, sort the results in descending order.
    */
  var orderBy: js.UndefOr[OrderBy] = js.native
}
object ListJobsSortCriteria {
  
  @scala.inline
  def apply(): ListJobsSortCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobsSortCriteria]
  }
  
  @scala.inline
  implicit class ListJobsSortCriteriaMutableBuilder[Self <: ListJobsSortCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeName(value: ListJobsSortAttributeName): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeNameUndefined: Self = StObject.set(x, "attributeName", js.undefined)
    
    @scala.inline
    def setOrderBy(value: OrderBy): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
  }
}
