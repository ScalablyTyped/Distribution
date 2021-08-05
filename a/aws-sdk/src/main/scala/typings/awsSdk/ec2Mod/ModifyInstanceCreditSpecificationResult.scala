package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyInstanceCreditSpecificationResult extends StObject {
  
  /**
    * Information about the instances whose credit option for CPU usage was successfully modified.
    */
  var SuccessfulInstanceCreditSpecifications: js.UndefOr[SuccessfulInstanceCreditSpecificationSet] = js.undefined
  
  /**
    * Information about the instances whose credit option for CPU usage was not modified.
    */
  var UnsuccessfulInstanceCreditSpecifications: js.UndefOr[UnsuccessfulInstanceCreditSpecificationSet] = js.undefined
}
object ModifyInstanceCreditSpecificationResult {
  
  inline def apply(): ModifyInstanceCreditSpecificationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyInstanceCreditSpecificationResult]
  }
  
  extension [Self <: ModifyInstanceCreditSpecificationResult](x: Self) {
    
    inline def setSuccessfulInstanceCreditSpecifications(value: SuccessfulInstanceCreditSpecificationSet): Self = StObject.set(x, "SuccessfulInstanceCreditSpecifications", value.asInstanceOf[js.Any])
    
    inline def setSuccessfulInstanceCreditSpecificationsUndefined: Self = StObject.set(x, "SuccessfulInstanceCreditSpecifications", js.undefined)
    
    inline def setSuccessfulInstanceCreditSpecificationsVarargs(value: SuccessfulInstanceCreditSpecificationItem*): Self = StObject.set(x, "SuccessfulInstanceCreditSpecifications", js.Array(value :_*))
    
    inline def setUnsuccessfulInstanceCreditSpecifications(value: UnsuccessfulInstanceCreditSpecificationSet): Self = StObject.set(x, "UnsuccessfulInstanceCreditSpecifications", value.asInstanceOf[js.Any])
    
    inline def setUnsuccessfulInstanceCreditSpecificationsUndefined: Self = StObject.set(x, "UnsuccessfulInstanceCreditSpecifications", js.undefined)
    
    inline def setUnsuccessfulInstanceCreditSpecificationsVarargs(value: UnsuccessfulInstanceCreditSpecificationItem*): Self = StObject.set(x, "UnsuccessfulInstanceCreditSpecifications", js.Array(value :_*))
  }
}
