package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConstraintSummary extends StObject {
  
  /**
    * The description of the constraint.
    */
  var Description: js.UndefOr[ConstraintDescription] = js.undefined
  
  /**
    * The type of constraint.    LAUNCH     NOTIFICATION    STACKSET    TEMPLATE   
    */
  var Type: js.UndefOr[ConstraintType] = js.undefined
}
object ConstraintSummary {
  
  @scala.inline
  def apply(): ConstraintSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstraintSummary]
  }
  
  @scala.inline
  implicit class ConstraintSummaryMutableBuilder[Self <: ConstraintSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: ConstraintDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setType(value: ConstraintType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
