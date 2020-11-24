package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KernelGatewayImageConfig extends js.Object {
  
  /**
    * The Amazon Elastic File System (EFS) storage configuration for a SageMaker image.
    */
  var FileSystemConfig: js.UndefOr[typings.awsSdk.sagemakerMod.FileSystemConfig] = js.native
  
  /**
    * The specification of the Jupyter kernels in the image.
    */
  var KernelSpecs: typings.awsSdk.sagemakerMod.KernelSpecs = js.native
}
object KernelGatewayImageConfig {
  
  @scala.inline
  def apply(KernelSpecs: KernelSpecs): KernelGatewayImageConfig = {
    val __obj = js.Dynamic.literal(KernelSpecs = KernelSpecs.asInstanceOf[js.Any])
    __obj.asInstanceOf[KernelGatewayImageConfig]
  }
  
  @scala.inline
  implicit class KernelGatewayImageConfigOps[Self <: KernelGatewayImageConfig] (val x: Self) extends AnyVal {
    
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
    def setKernelSpecsVarargs(value: KernelSpec*): Self = this.set("KernelSpecs", js.Array(value :_*))
    
    @scala.inline
    def setKernelSpecs(value: KernelSpecs): Self = this.set("KernelSpecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSystemConfig(value: FileSystemConfig): Self = this.set("FileSystemConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileSystemConfig: Self = this.set("FileSystemConfig", js.undefined)
  }
}
