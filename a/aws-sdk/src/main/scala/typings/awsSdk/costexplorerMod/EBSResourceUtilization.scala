package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EBSResourceUtilization extends StObject {
  
  /**
    *  The maximum size of read operations per second 
    */
  var EbsReadBytesPerSecond: js.UndefOr[GenericString] = js.undefined
  
  /**
    *  The maximum number of read operations per second. 
    */
  var EbsReadOpsPerSecond: js.UndefOr[GenericString] = js.undefined
  
  /**
    *  The maximum size of write operations per second. 
    */
  var EbsWriteBytesPerSecond: js.UndefOr[GenericString] = js.undefined
  
  /**
    *  The maximum number of write operations per second. 
    */
  var EbsWriteOpsPerSecond: js.UndefOr[GenericString] = js.undefined
}
object EBSResourceUtilization {
  
  inline def apply(): EBSResourceUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EBSResourceUtilization]
  }
  
  extension [Self <: EBSResourceUtilization](x: Self) {
    
    inline def setEbsReadBytesPerSecond(value: GenericString): Self = StObject.set(x, "EbsReadBytesPerSecond", value.asInstanceOf[js.Any])
    
    inline def setEbsReadBytesPerSecondUndefined: Self = StObject.set(x, "EbsReadBytesPerSecond", js.undefined)
    
    inline def setEbsReadOpsPerSecond(value: GenericString): Self = StObject.set(x, "EbsReadOpsPerSecond", value.asInstanceOf[js.Any])
    
    inline def setEbsReadOpsPerSecondUndefined: Self = StObject.set(x, "EbsReadOpsPerSecond", js.undefined)
    
    inline def setEbsWriteBytesPerSecond(value: GenericString): Self = StObject.set(x, "EbsWriteBytesPerSecond", value.asInstanceOf[js.Any])
    
    inline def setEbsWriteBytesPerSecondUndefined: Self = StObject.set(x, "EbsWriteBytesPerSecond", js.undefined)
    
    inline def setEbsWriteOpsPerSecond(value: GenericString): Self = StObject.set(x, "EbsWriteOpsPerSecond", value.asInstanceOf[js.Any])
    
    inline def setEbsWriteOpsPerSecondUndefined: Self = StObject.set(x, "EbsWriteOpsPerSecond", js.undefined)
  }
}
