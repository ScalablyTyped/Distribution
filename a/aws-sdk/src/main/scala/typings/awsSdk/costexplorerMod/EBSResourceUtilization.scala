package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EBSResourceUtilization extends js.Object {
  
  /**
    *  The maximum size of read operations per second 
    */
  var EbsReadBytesPerSecond: js.UndefOr[GenericString] = js.native
  
  /**
    *  The maximum number of read operations per second. 
    */
  var EbsReadOpsPerSecond: js.UndefOr[GenericString] = js.native
  
  /**
    *  The maximum size of write operations per second. 
    */
  var EbsWriteBytesPerSecond: js.UndefOr[GenericString] = js.native
  
  /**
    *  The maximum number of write operations per second. 
    */
  var EbsWriteOpsPerSecond: js.UndefOr[GenericString] = js.native
}
object EBSResourceUtilization {
  
  @scala.inline
  def apply(): EBSResourceUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EBSResourceUtilization]
  }
  
  @scala.inline
  implicit class EBSResourceUtilizationOps[Self <: EBSResourceUtilization] (val x: Self) extends AnyVal {
    
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
    def setEbsReadBytesPerSecond(value: GenericString): Self = this.set("EbsReadBytesPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEbsReadBytesPerSecond: Self = this.set("EbsReadBytesPerSecond", js.undefined)
    
    @scala.inline
    def setEbsReadOpsPerSecond(value: GenericString): Self = this.set("EbsReadOpsPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEbsReadOpsPerSecond: Self = this.set("EbsReadOpsPerSecond", js.undefined)
    
    @scala.inline
    def setEbsWriteBytesPerSecond(value: GenericString): Self = this.set("EbsWriteBytesPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEbsWriteBytesPerSecond: Self = this.set("EbsWriteBytesPerSecond", js.undefined)
    
    @scala.inline
    def setEbsWriteOpsPerSecond(value: GenericString): Self = this.set("EbsWriteOpsPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEbsWriteOpsPerSecond: Self = this.set("EbsWriteOpsPerSecond", js.undefined)
  }
}
