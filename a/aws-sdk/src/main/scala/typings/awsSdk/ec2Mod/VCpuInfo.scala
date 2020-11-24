package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VCpuInfo extends js.Object {
  
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
  implicit class VCpuInfoOps[Self <: VCpuInfo] (val x: Self) extends AnyVal {
    
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
    def setDefaultCores(value: CoreCount): Self = this.set("DefaultCores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultCores: Self = this.set("DefaultCores", js.undefined)
    
    @scala.inline
    def setDefaultThreadsPerCore(value: ThreadsPerCore): Self = this.set("DefaultThreadsPerCore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultThreadsPerCore: Self = this.set("DefaultThreadsPerCore", js.undefined)
    
    @scala.inline
    def setDefaultVCpus(value: VCpuCount): Self = this.set("DefaultVCpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultVCpus: Self = this.set("DefaultVCpus", js.undefined)
    
    @scala.inline
    def setValidCoresVarargs(value: CoreCount*): Self = this.set("ValidCores", js.Array(value :_*))
    
    @scala.inline
    def setValidCores(value: CoreCountList): Self = this.set("ValidCores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidCores: Self = this.set("ValidCores", js.undefined)
    
    @scala.inline
    def setValidThreadsPerCoreVarargs(value: ThreadsPerCore*): Self = this.set("ValidThreadsPerCore", js.Array(value :_*))
    
    @scala.inline
    def setValidThreadsPerCore(value: ThreadsPerCoreList): Self = this.set("ValidThreadsPerCore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidThreadsPerCore: Self = this.set("ValidThreadsPerCore", js.undefined)
  }
}
