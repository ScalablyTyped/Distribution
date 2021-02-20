package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortCriteria extends StObject {
  
  /**
    * Represents the finding attribute (for example, accountId) to sort findings by.
    */
  var AttributeName: js.UndefOr[String] = js.native
  
  /**
    * The order by which the sorted findings are to be displayed.
    */
  var OrderBy: js.UndefOr[typings.awsSdk.guarddutyMod.OrderBy] = js.native
}
object SortCriteria {
  
  @scala.inline
  def apply(): SortCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortCriteria]
  }
  
  @scala.inline
  implicit class SortCriteriaMutableBuilder[Self <: SortCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeName(value: String): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeNameUndefined: Self = StObject.set(x, "AttributeName", js.undefined)
    
    @scala.inline
    def setOrderBy(value: OrderBy): Self = StObject.set(x, "OrderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderByUndefined: Self = StObject.set(x, "OrderBy", js.undefined)
  }
}
