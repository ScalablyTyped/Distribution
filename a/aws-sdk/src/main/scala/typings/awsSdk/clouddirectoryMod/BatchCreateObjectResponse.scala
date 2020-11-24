package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchCreateObjectResponse extends js.Object {
  
  /**
    * The ID that is associated with the object.
    */
  var ObjectIdentifier: js.UndefOr[typings.awsSdk.clouddirectoryMod.ObjectIdentifier] = js.native
}
object BatchCreateObjectResponse {
  
  @scala.inline
  def apply(): BatchCreateObjectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateObjectResponse]
  }
  
  @scala.inline
  implicit class BatchCreateObjectResponseOps[Self <: BatchCreateObjectResponse] (val x: Self) extends AnyVal {
    
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
    def setObjectIdentifier(value: ObjectIdentifier): Self = this.set("ObjectIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectIdentifier: Self = this.set("ObjectIdentifier", js.undefined)
  }
}
