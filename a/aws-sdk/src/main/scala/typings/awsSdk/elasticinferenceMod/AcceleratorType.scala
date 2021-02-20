package typings.awsSdk.elasticinferenceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcceleratorType extends StObject {
  
  /**
    *  The name of the Elastic Inference Accelerator type. 
    */
  var acceleratorTypeName: js.UndefOr[AcceleratorTypeName] = js.native
  
  /**
    *  The memory information of the Elastic Inference Accelerator type. 
    */
  var memoryInfo: js.UndefOr[MemoryInfo] = js.native
  
  /**
    *  The throughput information of the Elastic Inference Accelerator type. 
    */
  var throughputInfo: js.UndefOr[ThroughputInfoList] = js.native
}
object AcceleratorType {
  
  @scala.inline
  def apply(): AcceleratorType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceleratorType]
  }
  
  @scala.inline
  implicit class AcceleratorTypeMutableBuilder[Self <: AcceleratorType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceleratorTypeName(value: AcceleratorTypeName): Self = StObject.set(x, "acceleratorTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceleratorTypeNameUndefined: Self = StObject.set(x, "acceleratorTypeName", js.undefined)
    
    @scala.inline
    def setMemoryInfo(value: MemoryInfo): Self = StObject.set(x, "memoryInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryInfoUndefined: Self = StObject.set(x, "memoryInfo", js.undefined)
    
    @scala.inline
    def setThroughputInfo(value: ThroughputInfoList): Self = StObject.set(x, "throughputInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThroughputInfoUndefined: Self = StObject.set(x, "throughputInfo", js.undefined)
    
    @scala.inline
    def setThroughputInfoVarargs(value: KeyValuePair*): Self = StObject.set(x, "throughputInfo", js.Array(value :_*))
  }
}
