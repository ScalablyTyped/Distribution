package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): HlsCaptionLanguageMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsCaptionLanguageMapping]
  }
  
  @scala.inline
  implicit class HlsCaptionLanguageMappingOps[Self <: HlsCaptionLanguageMapping] (val x: Self) extends AnyVal {
    
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
    def setCaptionChannel(value: integerMinNegative2147483648Max2147483647): Self = this.set("CaptionChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptionChannel: Self = this.set("CaptionChannel", js.undefined)
    
    @scala.inline
    def setCustomLanguageCode(value: stringMin3Max3PatternAZaZ3): Self = this.set("CustomLanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomLanguageCode: Self = this.set("CustomLanguageCode", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: LanguageCode): Self = this.set("LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCode: Self = this.set("LanguageCode", js.undefined)
    
    @scala.inline
    def setLanguageDescription(value: string): Self = this.set("LanguageDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageDescription: Self = this.set("LanguageDescription", js.undefined)
  }
}
