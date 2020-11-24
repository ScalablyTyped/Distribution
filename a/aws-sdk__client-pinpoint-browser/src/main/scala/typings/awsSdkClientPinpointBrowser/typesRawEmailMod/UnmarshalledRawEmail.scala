package typings.awsSdkClientPinpointBrowser.typesRawEmailMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledRawEmail extends RawEmail {
  
  /**
    * The raw data of the email.
    */
  @JSName("Data")
  var Data_UnmarshalledRawEmail: js.UndefOr[Uint8Array] = js.native
}
object UnmarshalledRawEmail {
  
  @scala.inline
  def apply(): UnmarshalledRawEmail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledRawEmail]
  }
  
  @scala.inline
  implicit class UnmarshalledRawEmailOps[Self <: UnmarshalledRawEmail] (val x: Self) extends AnyVal {
    
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
    def setData(value: Uint8Array): Self = this.set("Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("Data", js.undefined)
  }
}
