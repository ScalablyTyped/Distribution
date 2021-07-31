package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketSortCriteria extends StObject {
  
  /**
    * The name of the attribute to sort the results by. This value can be the name of any property that Amazon Macie defines as bucket metadata, such as bucketName or accountId.
    */
  var attributeName: js.UndefOr[string] = js.undefined
  
  /**
    * The sort order to apply to the results, based on the value for the property specified by the attributeName property. Valid values are: ASC, sort the results in ascending order; and, DESC, sort the results in descending order.
    */
  var orderBy: js.UndefOr[OrderBy] = js.undefined
}
object BucketSortCriteria {
  
  @scala.inline
  def apply(): BucketSortCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketSortCriteria]
  }
  
  @scala.inline
  implicit class BucketSortCriteriaMutableBuilder[Self <: BucketSortCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeName(value: string): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeNameUndefined: Self = StObject.set(x, "attributeName", js.undefined)
    
    @scala.inline
    def setOrderBy(value: OrderBy): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
  }
}
