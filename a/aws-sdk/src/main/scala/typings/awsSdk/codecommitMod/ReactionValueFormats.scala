package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactionValueFormats extends StObject {
  
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
  implicit class ReactionValueFormatsMutableBuilder[Self <: ReactionValueFormats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmoji(value: ReactionEmoji): Self = StObject.set(x, "emoji", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmojiUndefined: Self = StObject.set(x, "emoji", js.undefined)
    
    @scala.inline
    def setShortCode(value: ReactionShortCode): Self = StObject.set(x, "shortCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortCodeUndefined: Self = StObject.set(x, "shortCode", js.undefined)
    
    @scala.inline
    def setUnicode(value: ReactionUnicode): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnicodeUndefined: Self = StObject.set(x, "unicode", js.undefined)
  }
}
