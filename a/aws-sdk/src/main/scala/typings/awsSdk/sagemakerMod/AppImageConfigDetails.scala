package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppImageConfigDetails extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the AppImageConfig.
    */
  var AppImageConfigArn: js.UndefOr[typings.awsSdk.sagemakerMod.AppImageConfigArn] = js.native
  
  /**
    * The name of the AppImageConfig. Must be unique to your account.
    */
  var AppImageConfigName: js.UndefOr[typings.awsSdk.sagemakerMod.AppImageConfigName] = js.native
  
  /**
    * When the AppImageConfig was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The configuration for the file system and kernels in the SageMaker image.
    */
  var KernelGatewayImageConfig: js.UndefOr[typings.awsSdk.sagemakerMod.KernelGatewayImageConfig] = js.native
  
  /**
    * When the AppImageConfig was last modified.
    */
  var LastModifiedTime: js.UndefOr[Timestamp] = js.native
}
object AppImageConfigDetails {
  
  @scala.inline
  def apply(): AppImageConfigDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppImageConfigDetails]
  }
  
  @scala.inline
  implicit class AppImageConfigDetailsOps[Self <: AppImageConfigDetails] (val x: Self) extends AnyVal {
    
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
    def setAppImageConfigArn(value: AppImageConfigArn): Self = this.set("AppImageConfigArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppImageConfigArn: Self = this.set("AppImageConfigArn", js.undefined)
    
    @scala.inline
    def setAppImageConfigName(value: AppImageConfigName): Self = this.set("AppImageConfigName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppImageConfigName: Self = this.set("AppImageConfigName", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    
    @scala.inline
    def setKernelGatewayImageConfig(value: KernelGatewayImageConfig): Self = this.set("KernelGatewayImageConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKernelGatewayImageConfig: Self = this.set("KernelGatewayImageConfig", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: Timestamp): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("LastModifiedTime", js.undefined)
  }
}
