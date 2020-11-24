package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterContainerImageResult extends js.Object {
  
  var containerImage: js.UndefOr[ContainerImage] = js.native
}
object RegisterContainerImageResult {
  
  @scala.inline
  def apply(): RegisterContainerImageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterContainerImageResult]
  }
  
  @scala.inline
  implicit class RegisterContainerImageResultOps[Self <: RegisterContainerImageResult] (val x: Self) extends AnyVal {
    
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
    def setContainerImage(value: ContainerImage): Self = this.set("containerImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerImage: Self = this.set("containerImage", js.undefined)
  }
}
