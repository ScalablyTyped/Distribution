package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CpuOptionsRequest extends StObject {
  
  /**
    * The number of CPU cores for the instance.
    */
  var CoreCount: js.UndefOr[Integer] = js.native
  
  /**
    * The number of threads per CPU core. To disable multithreading for the instance, specify a value of 1. Otherwise, specify the default value of 2.
    */
  var ThreadsPerCore: js.UndefOr[Integer] = js.native
}
object CpuOptionsRequest {
  
  @scala.inline
  def apply(): CpuOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CpuOptionsRequest]
  }
  
  @scala.inline
  implicit class CpuOptionsRequestMutableBuilder[Self <: CpuOptionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoreCount(value: Integer): Self = StObject.set(x, "CoreCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoreCountUndefined: Self = StObject.set(x, "CoreCount", js.undefined)
    
    @scala.inline
    def setThreadsPerCore(value: Integer): Self = StObject.set(x, "ThreadsPerCore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreadsPerCoreUndefined: Self = StObject.set(x, "ThreadsPerCore", js.undefined)
  }
}
