package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageCodeItem extends StObject {
  
  /**
    * Provides the total time, in seconds, each identified language is spoken in your media.
    */
  var DurationInSeconds: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.DurationInSeconds] = js.undefined
  
  /**
    * Provides the language code for each language identified in your media.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.LanguageCode] = js.undefined
}
object LanguageCodeItem {
  
  inline def apply(): LanguageCodeItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageCodeItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LanguageCodeItem] (val x: Self) extends AnyVal {
    
    inline def setDurationInSeconds(value: DurationInSeconds): Self = StObject.set(x, "DurationInSeconds", value.asInstanceOf[js.Any])
    
    inline def setDurationInSecondsUndefined: Self = StObject.set(x, "DurationInSeconds", js.undefined)
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
  }
}
