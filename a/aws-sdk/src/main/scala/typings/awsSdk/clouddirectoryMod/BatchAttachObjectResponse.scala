package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchAttachObjectResponse extends js.Object {
  
  /**
    * The ObjectIdentifier of the object that has been attached.
    */
  var attachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.native
}
object BatchAttachObjectResponse {
  
  @scala.inline
  def apply(): BatchAttachObjectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchAttachObjectResponse]
  }
  
  @scala.inline
  implicit class BatchAttachObjectResponseOps[Self <: BatchAttachObjectResponse] (val x: Self) extends AnyVal {
    
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
    def setAttachedObjectIdentifier(value: ObjectIdentifier): Self = this.set("attachedObjectIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachedObjectIdentifier: Self = this.set("attachedObjectIdentifier", js.undefined)
  }
}
