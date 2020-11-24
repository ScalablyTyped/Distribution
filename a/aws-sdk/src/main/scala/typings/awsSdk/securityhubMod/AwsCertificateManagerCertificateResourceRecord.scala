package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsCertificateManagerCertificateResourceRecord extends js.Object {
  
  /**
    * The name of the resource.
    */
  var Name: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The type of resource.
    */
  var Type: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The value of the resource.
    */
  var Value: js.UndefOr[NonEmptyString] = js.native
}
object AwsCertificateManagerCertificateResourceRecord {
  
  @scala.inline
  def apply(): AwsCertificateManagerCertificateResourceRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCertificateManagerCertificateResourceRecord]
  }
  
  @scala.inline
  implicit class AwsCertificateManagerCertificateResourceRecordOps[Self <: AwsCertificateManagerCertificateResourceRecord] (val x: Self) extends AnyVal {
    
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
    def setName(value: NonEmptyString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setType(value: NonEmptyString): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    
    @scala.inline
    def setValue(value: NonEmptyString): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
}
