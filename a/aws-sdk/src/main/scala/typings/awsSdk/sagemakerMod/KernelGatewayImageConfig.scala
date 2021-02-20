package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KernelGatewayImageConfig extends StObject {
  
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
  implicit class KernelGatewayImageConfigMutableBuilder[Self <: KernelGatewayImageConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileSystemConfig(value: FileSystemConfig): Self = StObject.set(x, "FileSystemConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSystemConfigUndefined: Self = StObject.set(x, "FileSystemConfig", js.undefined)
    
    @scala.inline
    def setKernelSpecs(value: KernelSpecs): Self = StObject.set(x, "KernelSpecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelSpecsVarargs(value: KernelSpec*): Self = StObject.set(x, "KernelSpecs", js.Array(value :_*))
  }
}
