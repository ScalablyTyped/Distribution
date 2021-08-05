package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CpuOptions extends StObject {
  
  /**
    * The number of CPU cores for the instance.
    */
  var CoreCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of threads per CPU core.
    */
  var ThreadsPerCore: js.UndefOr[Integer] = js.undefined
}
object CpuOptions {
  
  inline def apply(): CpuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CpuOptions]
  }
  
  extension [Self <: CpuOptions](x: Self) {
    
    inline def setCoreCount(value: Integer): Self = StObject.set(x, "CoreCount", value.asInstanceOf[js.Any])
    
    inline def setCoreCountUndefined: Self = StObject.set(x, "CoreCount", js.undefined)
    
    inline def setThreadsPerCore(value: Integer): Self = StObject.set(x, "ThreadsPerCore", value.asInstanceOf[js.Any])
    
    inline def setThreadsPerCoreUndefined: Self = StObject.set(x, "ThreadsPerCore", js.undefined)
  }
}
