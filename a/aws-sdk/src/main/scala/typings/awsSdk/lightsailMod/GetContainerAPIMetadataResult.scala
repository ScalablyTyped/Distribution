package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetContainerAPIMetadataResult extends js.Object {
  
  /**
    * Metadata about Lightsail containers, such as the current version of the Lightsail Control (lightsailctl) plugin.
    */
  var metadata: js.UndefOr[ContainerServiceMetadataEntryList] = js.native
}
object GetContainerAPIMetadataResult {
  
  @scala.inline
  def apply(): GetContainerAPIMetadataResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContainerAPIMetadataResult]
  }
  
  @scala.inline
  implicit class GetContainerAPIMetadataResultOps[Self <: GetContainerAPIMetadataResult] (val x: Self) extends AnyVal {
    
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
    def setMetadataVarargs(value: ContainerServiceMetadataEntry*): Self = this.set("metadata", js.Array(value :_*))
    
    @scala.inline
    def setMetadata(value: ContainerServiceMetadataEntryList): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
}
