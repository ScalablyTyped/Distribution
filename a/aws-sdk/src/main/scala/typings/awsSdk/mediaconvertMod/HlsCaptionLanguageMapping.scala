package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HlsCaptionLanguageMapping extends js.Object {
  /**
    * Caption channel.
    */
  var CaptionChannel: js.UndefOr[integerMinNegative2147483648Max2147483647] = js.native
  /**
    * Specify the language for this captions channel, using the ISO 639-2 or ISO 639-3 three-letter language code
    */
  var CustomLanguageCode: js.UndefOr[stringMin3Max3PatternAZaZ3] = js.native
  /**
    * Specify the language, using the ISO 639-2 three-letter code listed at https://www.loc.gov/standards/iso639-2/php/code_list.php.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.mediaconvertMod.LanguageCode] = js.native
  /**
    * Caption language description.
    */
  var LanguageDescription: js.UndefOr[string] = js.native
}

object HlsCaptionLanguageMapping {
  @scala.inline
  def apply(
    CaptionChannel: js.UndefOr[integerMinNegative2147483648Max2147483647] = js.undefined,
    CustomLanguageCode: stringMin3Max3PatternAZaZ3 = null,
    LanguageCode: LanguageCode = null,
    LanguageDescription: string = null
  ): HlsCaptionLanguageMapping = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CaptionChannel)) __obj.updateDynamic("CaptionChannel")(CaptionChannel.get.asInstanceOf[js.Any])
    if (CustomLanguageCode != null) __obj.updateDynamic("CustomLanguageCode")(CustomLanguageCode.asInstanceOf[js.Any])
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode.asInstanceOf[js.Any])
    if (LanguageDescription != null) __obj.updateDynamic("LanguageDescription")(LanguageDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[HlsCaptionLanguageMapping]
  }
}

