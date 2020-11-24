package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetObjectLegalHoldOutput extends js.Object {
  
  /**
    * The current Legal Hold status for the specified object.
    */
  var LegalHold: js.UndefOr[ObjectLockLegalHold] = js.native
}
object GetObjectLegalHoldOutput {
  
  @scala.inline
  def apply(): GetObjectLegalHoldOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetObjectLegalHoldOutput]
  }
  
  @scala.inline
  implicit class GetObjectLegalHoldOutputOps[Self <: GetObjectLegalHoldOutput] (val x: Self) extends AnyVal {
    
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
    def setLegalHold(value: ObjectLockLegalHold): Self = this.set("LegalHold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegalHold: Self = this.set("LegalHold", js.undefined)
  }
}
