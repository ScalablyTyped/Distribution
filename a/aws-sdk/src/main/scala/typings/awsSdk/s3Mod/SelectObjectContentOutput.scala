package typings.awsSdk.s3Mod

import typings.awsSdk.anon.Cont
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectObjectContentOutput extends js.Object {
  
  /**
    * The array of results.
    */
  var Payload: js.UndefOr[SelectObjectContentEventStream] = js.native
}
object SelectObjectContentOutput {
  
  @scala.inline
  def apply(): SelectObjectContentOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectObjectContentOutput]
  }
  
  @scala.inline
  implicit class SelectObjectContentOutputOps[Self <: SelectObjectContentOutput] (val x: Self) extends AnyVal {
    
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
    def setPayloadVarargs(value: Cont*): Self = this.set("Payload", js.Array(value :_*))
    
    @scala.inline
    def setPayload(value: SelectObjectContentEventStream): Self = this.set("Payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("Payload", js.undefined)
  }
}
