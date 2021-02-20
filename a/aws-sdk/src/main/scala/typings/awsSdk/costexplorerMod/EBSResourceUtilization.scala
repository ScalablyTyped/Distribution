package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EBSResourceUtilization extends StObject {
  
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
  implicit class EBSResourceUtilizationMutableBuilder[Self <: EBSResourceUtilization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEbsReadBytesPerSecond(value: GenericString): Self = StObject.set(x, "EbsReadBytesPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsReadBytesPerSecondUndefined: Self = StObject.set(x, "EbsReadBytesPerSecond", js.undefined)
    
    @scala.inline
    def setEbsReadOpsPerSecond(value: GenericString): Self = StObject.set(x, "EbsReadOpsPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsReadOpsPerSecondUndefined: Self = StObject.set(x, "EbsReadOpsPerSecond", js.undefined)
    
    @scala.inline
    def setEbsWriteBytesPerSecond(value: GenericString): Self = StObject.set(x, "EbsWriteBytesPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsWriteBytesPerSecondUndefined: Self = StObject.set(x, "EbsWriteBytesPerSecond", js.undefined)
    
    @scala.inline
    def setEbsWriteOpsPerSecond(value: GenericString): Self = StObject.set(x, "EbsWriteOpsPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsWriteOpsPerSecondUndefined: Self = StObject.set(x, "EbsWriteOpsPerSecond", js.undefined)
  }
}
