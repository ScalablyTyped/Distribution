package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortCriterion extends StObject {
  
  /**
    * The name of the field on which to sort.
    */
  var FieldName: js.UndefOr[ValueString] = js.undefined
  
  /**
    * An ascending or descending sort.
    */
  var Sort: js.UndefOr[typings.awsSdk.glueMod.Sort] = js.undefined
}
object SortCriterion {
  
  @scala.inline
  def apply(): SortCriterion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortCriterion]
  }
  
  @scala.inline
  implicit class SortCriterionMutableBuilder[Self <: SortCriterion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldName(value: ValueString): Self = StObject.set(x, "FieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldNameUndefined: Self = StObject.set(x, "FieldName", js.undefined)
    
    @scala.inline
    def setSort(value: Sort): Self = StObject.set(x, "Sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "Sort", js.undefined)
  }
}
