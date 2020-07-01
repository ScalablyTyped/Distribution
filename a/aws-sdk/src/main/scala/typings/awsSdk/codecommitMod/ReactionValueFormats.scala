package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(emoji: ReactionEmoji = null, shortCode: ReactionShortCode = null, unicode: ReactionUnicode = null): ReactionValueFormats = {
    val __obj = js.Dynamic.literal()
    if (emoji != null) __obj.updateDynamic("emoji")(emoji.asInstanceOf[js.Any])
    if (shortCode != null) __obj.updateDynamic("shortCode")(shortCode.asInstanceOf[js.Any])
    if (unicode != null) __obj.updateDynamic("unicode")(unicode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionValueFormats]
  }
}

