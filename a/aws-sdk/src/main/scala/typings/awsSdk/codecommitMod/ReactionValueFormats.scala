package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactionValueFormats extends js.Object {
  
  /**
    * The Emoji Version 1.0 graphic of the reaction. These graphics are interpreted slightly differently on different operating systems.
    */
  var emoji: js.UndefOr[ReactionEmoji] = js.native
  
  /**
    * The emoji short code for the reaction. Short codes are interpreted slightly differently on different operating systems. 
    */
  var shortCode: js.UndefOr[ReactionShortCode] = js.native
  
  /**
    * The Unicode codepoint for the reaction.
    */
  var unicode: js.UndefOr[ReactionUnicode] = js.native
}
object ReactionValueFormats {
  
  @scala.inline
  def apply(): ReactionValueFormats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactionValueFormats]
  }
  
  @scala.inline
  implicit class ReactionValueFormatsOps[Self <: ReactionValueFormats] (val x: Self) extends AnyVal {
    
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
    def setEmoji(value: ReactionEmoji): Self = this.set("emoji", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmoji: Self = this.set("emoji", js.undefined)
    
    @scala.inline
    def setShortCode(value: ReactionShortCode): Self = this.set("shortCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortCode: Self = this.set("shortCode", js.undefined)
    
    @scala.inline
    def setUnicode(value: ReactionUnicode): Self = this.set("unicode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnicode: Self = this.set("unicode", js.undefined)
  }
}
