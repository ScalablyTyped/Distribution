package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidStorageOptions extends js.Object {
  
  /**
    * The valid range of Provisioned IOPS to gibibytes of storage multiplier. For example, 3-10, which means that provisioned IOPS can be between 3 and 10 times storage.
    */
  var IopsToStorageRatio: js.UndefOr[DoubleRangeList] = js.native
  
  /**
    * The valid range of provisioned IOPS. For example, 1000-20000.
    */
  var ProvisionedIops: js.UndefOr[RangeList] = js.native
  
  /**
    * The valid range of storage in gibibytes. For example, 100 to 16384.
    */
  var StorageSize: js.UndefOr[RangeList] = js.native
  
  /**
    * The valid storage types for your DB instance. For example, gp2, io1.
    */
  var StorageType: js.UndefOr[String] = js.native
}
object ValidStorageOptions {
  
  @scala.inline
  def apply(): ValidStorageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidStorageOptions]
  }
  
  @scala.inline
  implicit class ValidStorageOptionsOps[Self <: ValidStorageOptions] (val x: Self) extends AnyVal {
    
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
    def setIopsToStorageRatioVarargs(value: DoubleRange*): Self = this.set("IopsToStorageRatio", js.Array(value :_*))
    
    @scala.inline
    def setIopsToStorageRatio(value: DoubleRangeList): Self = this.set("IopsToStorageRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIopsToStorageRatio: Self = this.set("IopsToStorageRatio", js.undefined)
    
    @scala.inline
    def setProvisionedIopsVarargs(value: Range*): Self = this.set("ProvisionedIops", js.Array(value :_*))
    
    @scala.inline
    def setProvisionedIops(value: RangeList): Self = this.set("ProvisionedIops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisionedIops: Self = this.set("ProvisionedIops", js.undefined)
    
    @scala.inline
    def setStorageSizeVarargs(value: Range*): Self = this.set("StorageSize", js.Array(value :_*))
    
    @scala.inline
    def setStorageSize(value: RangeList): Self = this.set("StorageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageSize: Self = this.set("StorageSize", js.undefined)
    
    @scala.inline
    def setStorageType(value: String): Self = this.set("StorageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageType: Self = this.set("StorageType", js.undefined)
  }
}
