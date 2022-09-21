package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VCpuInfo extends StObject {
  
  /**
    * The default number of cores for the instance type.
    */
  var DefaultCores: js.UndefOr[CoreCount] = js.undefined
  
  /**
    * The default number of threads per core for the instance type.
    */
  var DefaultThreadsPerCore: js.UndefOr[ThreadsPerCore] = js.undefined
  
  /**
    * The default number of vCPUs for the instance type.
    */
  var DefaultVCpus: js.UndefOr[VCpuCount] = js.undefined
  
  /**
    * The valid number of cores that can be configured for the instance type.
    */
  var ValidCores: js.UndefOr[CoreCountList] = js.undefined
  
  /**
    * The valid number of threads per core that can be configured for the instance type. 
    */
  var ValidThreadsPerCore: js.UndefOr[ThreadsPerCoreList] = js.undefined
}
object VCpuInfo {
  
  inline def apply(): VCpuInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VCpuInfo]
  }
  
  extension [Self <: VCpuInfo](x: Self) {
    
    inline def setDefaultCores(value: CoreCount): Self = StObject.set(x, "DefaultCores", value.asInstanceOf[js.Any])
    
    inline def setDefaultCoresUndefined: Self = StObject.set(x, "DefaultCores", js.undefined)
    
    inline def setDefaultThreadsPerCore(value: ThreadsPerCore): Self = StObject.set(x, "DefaultThreadsPerCore", value.asInstanceOf[js.Any])
    
    inline def setDefaultThreadsPerCoreUndefined: Self = StObject.set(x, "DefaultThreadsPerCore", js.undefined)
    
    inline def setDefaultVCpus(value: VCpuCount): Self = StObject.set(x, "DefaultVCpus", value.asInstanceOf[js.Any])
    
    inline def setDefaultVCpusUndefined: Self = StObject.set(x, "DefaultVCpus", js.undefined)
    
    inline def setValidCores(value: CoreCountList): Self = StObject.set(x, "ValidCores", value.asInstanceOf[js.Any])
    
    inline def setValidCoresUndefined: Self = StObject.set(x, "ValidCores", js.undefined)
    
    inline def setValidCoresVarargs(value: CoreCount*): Self = StObject.set(x, "ValidCores", js.Array(value*))
    
    inline def setValidThreadsPerCore(value: ThreadsPerCoreList): Self = StObject.set(x, "ValidThreadsPerCore", value.asInstanceOf[js.Any])
    
    inline def setValidThreadsPerCoreUndefined: Self = StObject.set(x, "ValidThreadsPerCore", js.undefined)
    
    inline def setValidThreadsPerCoreVarargs(value: ThreadsPerCore*): Self = StObject.set(x, "ValidThreadsPerCore", js.Array(value*))
  }
}
