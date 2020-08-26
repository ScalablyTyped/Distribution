package typings.awsSdk.resourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComplianceDetails extends js.Object {
  /**
    * Whether a resource is compliant with the effective tag policy.
    */
  var ComplianceStatus: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.ComplianceStatus] = js.native
  /**
    * These are keys defined in the effective policy that are on the resource with either incorrect case treatment or noncompliant values. 
    */
  var KeysWithNoncompliantValues: js.UndefOr[TagKeyList] = js.native
  /**
    * These tag keys on the resource are noncompliant with the effective tag policy.
    */
  var NoncompliantKeys: js.UndefOr[TagKeyList] = js.native
}

object ComplianceDetails {
  @scala.inline
  def apply(): ComplianceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceDetails]
  }
  @scala.inline
  implicit class ComplianceDetailsOps[Self <: ComplianceDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComplianceStatus(value: ComplianceStatus): Self = this.set("ComplianceStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplianceStatus: Self = this.set("ComplianceStatus", js.undefined)
    @scala.inline
    def setKeysWithNoncompliantValuesVarargs(value: TagKey*): Self = this.set("KeysWithNoncompliantValues", js.Array(value :_*))
    @scala.inline
    def setKeysWithNoncompliantValues(value: TagKeyList): Self = this.set("KeysWithNoncompliantValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeysWithNoncompliantValues: Self = this.set("KeysWithNoncompliantValues", js.undefined)
    @scala.inline
    def setNoncompliantKeysVarargs(value: TagKey*): Self = this.set("NoncompliantKeys", js.Array(value :_*))
    @scala.inline
    def setNoncompliantKeys(value: TagKeyList): Self = this.set("NoncompliantKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoncompliantKeys: Self = this.set("NoncompliantKeys", js.undefined)
  }
  
}

