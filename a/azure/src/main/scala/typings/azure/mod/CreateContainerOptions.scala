package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateContainerOptions extends TimeoutIntervalOptions {
  
  var metadata: js.UndefOr[StorageMetadata] = js.native
  
  var publicAccessLevel: js.UndefOr[String] = js.native
}
object CreateContainerOptions {
  
  @scala.inline
  def apply(): CreateContainerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateContainerOptions]
  }
  
  @scala.inline
  implicit class CreateContainerOptionsOps[Self <: CreateContainerOptions] (val x: Self) extends AnyVal {
    
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
    def setMetadata(value: StorageMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setPublicAccessLevel(value: String): Self = this.set("publicAccessLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicAccessLevel: Self = this.set("publicAccessLevel", js.undefined)
  }
}
