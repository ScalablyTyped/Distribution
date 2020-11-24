package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachToIndexResponse extends js.Object {
  
  /**
    * The ObjectIdentifier of the object that was attached to the index.
    */
  var AttachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.native
}
object AttachToIndexResponse {
  
  @scala.inline
  def apply(): AttachToIndexResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachToIndexResponse]
  }
  
  @scala.inline
  implicit class AttachToIndexResponseOps[Self <: AttachToIndexResponse] (val x: Self) extends AnyVal {
    
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
    def setAttachedObjectIdentifier(value: ObjectIdentifier): Self = this.set("AttachedObjectIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachedObjectIdentifier: Self = this.set("AttachedObjectIdentifier", js.undefined)
  }
}
