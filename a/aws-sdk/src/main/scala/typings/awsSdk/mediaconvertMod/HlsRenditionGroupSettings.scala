package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HlsRenditionGroupSettings extends StObject {
  
  /**
    * Optional. Specify alternative group ID
    */
  var RenditionGroupId: js.UndefOr[string] = js.undefined
  
  /**
    * Optional. Specify ISO 639-2 or ISO 639-3 code in the language property
    */
  var RenditionLanguageCode: js.UndefOr[LanguageCode] = js.undefined
  
  /**
    * Optional. Specify media name
    */
  var RenditionName: js.UndefOr[string] = js.undefined
}
object HlsRenditionGroupSettings {
  
  inline def apply(): HlsRenditionGroupSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsRenditionGroupSettings]
  }
  
  extension [Self <: HlsRenditionGroupSettings](x: Self) {
    
    inline def setRenditionGroupId(value: string): Self = StObject.set(x, "RenditionGroupId", value.asInstanceOf[js.Any])
    
    inline def setRenditionGroupIdUndefined: Self = StObject.set(x, "RenditionGroupId", js.undefined)
    
    inline def setRenditionLanguageCode(value: LanguageCode): Self = StObject.set(x, "RenditionLanguageCode", value.asInstanceOf[js.Any])
    
    inline def setRenditionLanguageCodeUndefined: Self = StObject.set(x, "RenditionLanguageCode", js.undefined)
    
    inline def setRenditionName(value: string): Self = StObject.set(x, "RenditionName", value.asInstanceOf[js.Any])
    
    inline def setRenditionNameUndefined: Self = StObject.set(x, "RenditionName", js.undefined)
  }
}
