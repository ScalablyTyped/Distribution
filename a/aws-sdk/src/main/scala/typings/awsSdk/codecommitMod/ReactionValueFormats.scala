package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactionValueFormats extends StObject {
  
  /**
    * The Emoji Version 1.0 graphic of the reaction. These graphics are interpreted slightly differently on different operating systems.
    */
  var emoji: js.UndefOr[ReactionEmoji] = js.undefined
  
  /**
    * The emoji short code for the reaction. Short codes are interpreted slightly differently on different operating systems. 
    */
  var shortCode: js.UndefOr[ReactionShortCode] = js.undefined
  
  /**
    * The Unicode codepoint for the reaction.
    */
  var unicode: js.UndefOr[ReactionUnicode] = js.undefined
}
object ReactionValueFormats {
  
  inline def apply(): ReactionValueFormats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactionValueFormats]
  }
  
  extension [Self <: ReactionValueFormats](x: Self) {
    
    inline def setEmoji(value: ReactionEmoji): Self = StObject.set(x, "emoji", value.asInstanceOf[js.Any])
    
    inline def setEmojiUndefined: Self = StObject.set(x, "emoji", js.undefined)
    
    inline def setShortCode(value: ReactionShortCode): Self = StObject.set(x, "shortCode", value.asInstanceOf[js.Any])
    
    inline def setShortCodeUndefined: Self = StObject.set(x, "shortCode", js.undefined)
    
    inline def setUnicode(value: ReactionUnicode): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
    
    inline def setUnicodeUndefined: Self = StObject.set(x, "unicode", js.undefined)
  }
}
