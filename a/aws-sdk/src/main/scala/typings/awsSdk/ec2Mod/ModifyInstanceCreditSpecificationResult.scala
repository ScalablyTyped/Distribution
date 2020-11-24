package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyInstanceCreditSpecificationResult extends js.Object {
  
  /**
    * Information about the instances whose credit option for CPU usage was successfully modified.
    */
  var SuccessfulInstanceCreditSpecifications: js.UndefOr[SuccessfulInstanceCreditSpecificationSet] = js.native
  
  /**
    * Information about the instances whose credit option for CPU usage was not modified.
    */
  var UnsuccessfulInstanceCreditSpecifications: js.UndefOr[UnsuccessfulInstanceCreditSpecificationSet] = js.native
}
object ModifyInstanceCreditSpecificationResult {
  
  @scala.inline
  def apply(): ModifyInstanceCreditSpecificationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyInstanceCreditSpecificationResult]
  }
  
  @scala.inline
  implicit class ModifyInstanceCreditSpecificationResultOps[Self <: ModifyInstanceCreditSpecificationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSuccessfulInstanceCreditSpecificationsVarargs(value: SuccessfulInstanceCreditSpecificationItem*): Self = this.set("SuccessfulInstanceCreditSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setSuccessfulInstanceCreditSpecifications(value: SuccessfulInstanceCreditSpecificationSet): Self = this.set("SuccessfulInstanceCreditSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessfulInstanceCreditSpecifications: Self = this.set("SuccessfulInstanceCreditSpecifications", js.undefined)
    
    @scala.inline
    def setUnsuccessfulInstanceCreditSpecificationsVarargs(value: UnsuccessfulInstanceCreditSpecificationItem*): Self = this.set("UnsuccessfulInstanceCreditSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setUnsuccessfulInstanceCreditSpecifications(value: UnsuccessfulInstanceCreditSpecificationSet): Self = this.set("UnsuccessfulInstanceCreditSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnsuccessfulInstanceCreditSpecifications: Self = this.set("UnsuccessfulInstanceCreditSpecifications", js.undefined)
  }
}
