package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetContainerImagesResult extends js.Object {
  
  /**
    * An array of objects that describe container images that are registered to the container service.
    */
  var containerImages: js.UndefOr[ContainerImageList] = js.native
}
object GetContainerImagesResult {
  
  @scala.inline
  def apply(): GetContainerImagesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContainerImagesResult]
  }
  
  @scala.inline
  implicit class GetContainerImagesResultOps[Self <: GetContainerImagesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContainerImagesVarargs(value: ContainerImage*): Self = this.set("containerImages", js.Array(value :_*))
    
    @scala.inline
    def setContainerImages(value: ContainerImageList): Self = this.set("containerImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerImages: Self = this.set("containerImages", js.undefined)
  }
}
