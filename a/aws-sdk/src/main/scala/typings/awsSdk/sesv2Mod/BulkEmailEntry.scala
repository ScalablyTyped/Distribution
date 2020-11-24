package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkEmailEntry extends js.Object {
  
  /**
    * Represents the destination of the message, consisting of To:, CC:, and BCC: fields.  Amazon SES does not support the SMTPUTF8 extension, as described in RFC6531. For this reason, the local part of a destination email address (the part of the email address that precedes the @ sign) may only contain 7-bit ASCII characters. If the domain part of an address (the part after the @ sign) contains non-ASCII characters, they must be encoded using Punycode, as described in RFC3492. 
    */
  var Destination: typings.awsSdk.sesv2Mod.Destination = js.native
  
  /**
    * The ReplacementEmailContent associated with a BulkEmailEntry.
    */
  var ReplacementEmailContent: js.UndefOr[typings.awsSdk.sesv2Mod.ReplacementEmailContent] = js.native
  
  /**
    * A list of tags, in the form of name/value pairs, to apply to an email that you send using the SendBulkTemplatedEmail operation. Tags correspond to characteristics of the email that you define, so that you can publish email sending events.
    */
  var ReplacementTags: js.UndefOr[MessageTagList] = js.native
}
object BulkEmailEntry {
  
  @scala.inline
  def apply(Destination: Destination): BulkEmailEntry = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkEmailEntry]
  }
  
  @scala.inline
  implicit class BulkEmailEntryOps[Self <: BulkEmailEntry] (val x: Self) extends AnyVal {
    
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
    def setDestination(value: Destination): Self = this.set("Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacementEmailContent(value: ReplacementEmailContent): Self = this.set("ReplacementEmailContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplacementEmailContent: Self = this.set("ReplacementEmailContent", js.undefined)
    
    @scala.inline
    def setReplacementTagsVarargs(value: MessageTag*): Self = this.set("ReplacementTags", js.Array(value :_*))
    
    @scala.inline
    def setReplacementTags(value: MessageTagList): Self = this.set("ReplacementTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplacementTags: Self = this.set("ReplacementTags", js.undefined)
  }
}
