package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageConfig extends js.Object {
  
  /**
    * Set this to one of the following values:    Platform - The model image is hosted in Amazon ECR.    Vpc - The model image is hosted in a private Docker registry in your VPC.  
    */
  var RepositoryAccessMode: typings.awsSdk.sagemakerMod.RepositoryAccessMode = js.native
}
object ImageConfig {
  
  @scala.inline
  def apply(RepositoryAccessMode: RepositoryAccessMode): ImageConfig = {
    val __obj = js.Dynamic.literal(RepositoryAccessMode = RepositoryAccessMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageConfig]
  }
  
  @scala.inline
  implicit class ImageConfigOps[Self <: ImageConfig] (val x: Self) extends AnyVal {
    
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
    def setRepositoryAccessMode(value: RepositoryAccessMode): Self = this.set("RepositoryAccessMode", value.asInstanceOf[js.Any])
  }
}
