package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptionLanguageMapping extends StObject {
  
  /**
    * The closed caption channel being described by this CaptionLanguageMapping.  Each channel mapping must have a unique channel number (maximum of 4)
    */
  var CaptionChannel: integerMin1Max4
  
  /**
    * Three character ISO 639-2 language code (see http://www.loc.gov/standards/iso639-2)
    */
  var LanguageCode: stringMin3Max3
  
  /**
    * Textual description of language
    */
  var LanguageDescription: stringMin1
}
object CaptionLanguageMapping {
  
  inline def apply(CaptionChannel: integerMin1Max4, LanguageCode: stringMin3Max3, LanguageDescription: stringMin1): CaptionLanguageMapping = {
    val __obj = js.Dynamic.literal(CaptionChannel = CaptionChannel.asInstanceOf[js.Any], LanguageCode = LanguageCode.asInstanceOf[js.Any], LanguageDescription = LanguageDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionLanguageMapping]
  }
  
  extension [Self <: CaptionLanguageMapping](x: Self) {
    
    inline def setCaptionChannel(value: integerMin1Max4): Self = StObject.set(x, "CaptionChannel", value.asInstanceOf[js.Any])
    
    inline def setLanguageCode(value: stringMin3Max3): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageDescription(value: stringMin1): Self = StObject.set(x, "LanguageDescription", value.asInstanceOf[js.Any])
  }
}
