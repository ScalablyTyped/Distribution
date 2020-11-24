package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptionLanguageMapping extends js.Object {
  
  /**
    * The closed caption channel being described by this CaptionLanguageMapping.  Each channel mapping must have a unique channel number (maximum of 4)
    */
  var CaptionChannel: integerMin1Max4 = js.native
  
  /**
    * Three character ISO 639-2 language code (see http://www.loc.gov/standards/iso639-2)
    */
  var LanguageCode: stringMin3Max3 = js.native
  
  /**
    * Textual description of language
    */
  var LanguageDescription: stringMin1 = js.native
}
object CaptionLanguageMapping {
  
  @scala.inline
  def apply(CaptionChannel: integerMin1Max4, LanguageCode: stringMin3Max3, LanguageDescription: stringMin1): CaptionLanguageMapping = {
    val __obj = js.Dynamic.literal(CaptionChannel = CaptionChannel.asInstanceOf[js.Any], LanguageCode = LanguageCode.asInstanceOf[js.Any], LanguageDescription = LanguageDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionLanguageMapping]
  }
  
  @scala.inline
  implicit class CaptionLanguageMappingOps[Self <: CaptionLanguageMapping] (val x: Self) extends AnyVal {
    
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
    def setCaptionChannel(value: integerMin1Max4): Self = this.set("CaptionChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCode(value: stringMin3Max3): Self = this.set("LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageDescription(value: stringMin1): Self = this.set("LanguageDescription", value.asInstanceOf[js.Any])
  }
}
