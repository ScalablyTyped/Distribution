package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VCpuInfo extends StObject {
  
  /**
    * The default number of cores for the instance type.
    */
  var DefaultCores: js.UndefOr[CoreCount] = js.native
  
  /**
    * The default number of threads per core for the instance type.
    */
  var DefaultThreadsPerCore: js.UndefOr[ThreadsPerCore] = js.native
  
  /**
    * The default number of vCPUs for the instance type.
    */
  var DefaultVCpus: js.UndefOr[VCpuCount] = js.native
  
  /**
    * The valid number of cores that can be configured for the instance type.
    */
  var ValidCores: js.UndefOr[CoreCountList] = js.native
  
  /**
    * The valid number of threads per core that can be configured for the instance type. 
    */
  var ValidThreadsPerCore: js.UndefOr[ThreadsPerCoreList] = js.native
}
object VCpuInfo {
  
  @scala.inline
  def apply(): VCpuInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VCpuInfo]
  }
  
  @scala.inline
  implicit class VCpuInfoMutableBuilder[Self <: VCpuInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultCores(value: CoreCount): Self = StObject.set(x, "DefaultCores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCoresUndefined: Self = StObject.set(x, "DefaultCores", js.undefined)
    
    @scala.inline
    def setDefaultThreadsPerCore(value: ThreadsPerCore): Self = StObject.set(x, "DefaultThreadsPerCore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultThreadsPerCoreUndefined: Self = StObject.set(x, "DefaultThreadsPerCore", js.undefined)
    
    @scala.inline
    def setDefaultVCpus(value: VCpuCount): Self = StObject.set(x, "DefaultVCpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultVCpusUndefined: Self = StObject.set(x, "DefaultVCpus", js.undefined)
    
    @scala.inline
    def setValidCores(value: CoreCountList): Self = StObject.set(x, "ValidCores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidCoresUndefined: Self = StObject.set(x, "ValidCores", js.undefined)
    
    @scala.inline
    def setValidCoresVarargs(value: CoreCount*): Self = StObject.set(x, "ValidCores", js.Array(value :_*))
    
    @scala.inline
    def setValidThreadsPerCore(value: ThreadsPerCoreList): Self = StObject.set(x, "ValidThreadsPerCore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidThreadsPerCoreUndefined: Self = StObject.set(x, "ValidThreadsPerCore", js.undefined)
    
    @scala.inline
    def setValidThreadsPerCoreVarargs(value: ThreadsPerCore*): Self = StObject.set(x, "ValidThreadsPerCore", js.Array(value :_*))
  }
}
