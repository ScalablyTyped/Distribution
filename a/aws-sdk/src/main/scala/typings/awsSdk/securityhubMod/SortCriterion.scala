package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortCriterion extends StObject {
  
  /**
    * The finding attribute used to sort findings.
    */
  var Field: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The order used to sort findings.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.securityhubMod.SortOrder] = js.undefined
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
    def setField(value: NonEmptyString): Self = StObject.set(x, "Field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "Field", js.undefined)
    
    @scala.inline
    def setSortOrder(value: SortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
  }
}
