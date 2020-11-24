package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppSpecification extends js.Object {
  
  /**
    * The arguments for a container used to run a processing job.
    */
  var ContainerArguments: js.UndefOr[typings.awsSdk.sagemakerMod.ContainerArguments] = js.native
  
  /**
    * The entrypoint for a container used to run a processing job.
    */
  var ContainerEntrypoint: js.UndefOr[typings.awsSdk.sagemakerMod.ContainerEntrypoint] = js.native
  
  /**
    * The container image to be run by the processing job.
    */
  var ImageUri: typings.awsSdk.sagemakerMod.ImageUri = js.native
}
object AppSpecification {
  
  @scala.inline
  def apply(ImageUri: ImageUri): AppSpecification = {
    val __obj = js.Dynamic.literal(ImageUri = ImageUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppSpecification]
  }
  
  @scala.inline
  implicit class AppSpecificationOps[Self <: AppSpecification] (val x: Self) extends AnyVal {
    
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
    def setImageUri(value: ImageUri): Self = this.set("ImageUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerArgumentsVarargs(value: ContainerArgument*): Self = this.set("ContainerArguments", js.Array(value :_*))
    
    @scala.inline
    def setContainerArguments(value: ContainerArguments): Self = this.set("ContainerArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerArguments: Self = this.set("ContainerArguments", js.undefined)
    
    @scala.inline
    def setContainerEntrypointVarargs(value: ContainerEntrypointString*): Self = this.set("ContainerEntrypoint", js.Array(value :_*))
    
    @scala.inline
    def setContainerEntrypoint(value: ContainerEntrypoint): Self = this.set("ContainerEntrypoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerEntrypoint: Self = this.set("ContainerEntrypoint", js.undefined)
  }
}
