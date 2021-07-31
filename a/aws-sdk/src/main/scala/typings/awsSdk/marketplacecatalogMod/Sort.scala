package typings.awsSdk.marketplacecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sort extends StObject {
  
  /**
    * For ListEntities, supported attributes include LastModifiedDate (default), Visibility, EntityId, and Name. For ListChangeSets, supported attributes include StartTime and EndTime.
    */
  var SortBy: js.UndefOr[typings.awsSdk.marketplacecatalogMod.SortBy] = js.undefined
  
  /**
    * The sorting order. Can be ASCENDING or DESCENDING. The default value is DESCENDING.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.marketplacecatalogMod.SortOrder] = js.undefined
}
object Sort {
  
  @scala.inline
  def apply(): Sort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sort]
  }
  
  @scala.inline
  implicit class SortMutableBuilder[Self <: Sort] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSortBy(value: SortBy): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    @scala.inline
    def setSortOrder(value: SortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
  }
}
