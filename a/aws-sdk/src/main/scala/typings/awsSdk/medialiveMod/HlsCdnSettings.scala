package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HlsCdnSettings extends StObject {
  
  var HlsAkamaiSettings: js.UndefOr[typings.awsSdk.medialiveMod.HlsAkamaiSettings] = js.undefined
  
  var HlsBasicPutSettings: js.UndefOr[typings.awsSdk.medialiveMod.HlsBasicPutSettings] = js.undefined
  
  var HlsMediaStoreSettings: js.UndefOr[typings.awsSdk.medialiveMod.HlsMediaStoreSettings] = js.undefined
  
  var HlsWebdavSettings: js.UndefOr[typings.awsSdk.medialiveMod.HlsWebdavSettings] = js.undefined
}
object HlsCdnSettings {
  
  inline def apply(): HlsCdnSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsCdnSettings]
  }
  
  extension [Self <: HlsCdnSettings](x: Self) {
    
    inline def setHlsAkamaiSettings(value: HlsAkamaiSettings): Self = StObject.set(x, "HlsAkamaiSettings", value.asInstanceOf[js.Any])
    
    inline def setHlsAkamaiSettingsUndefined: Self = StObject.set(x, "HlsAkamaiSettings", js.undefined)
    
    inline def setHlsBasicPutSettings(value: HlsBasicPutSettings): Self = StObject.set(x, "HlsBasicPutSettings", value.asInstanceOf[js.Any])
    
    inline def setHlsBasicPutSettingsUndefined: Self = StObject.set(x, "HlsBasicPutSettings", js.undefined)
    
    inline def setHlsMediaStoreSettings(value: HlsMediaStoreSettings): Self = StObject.set(x, "HlsMediaStoreSettings", value.asInstanceOf[js.Any])
    
    inline def setHlsMediaStoreSettingsUndefined: Self = StObject.set(x, "HlsMediaStoreSettings", js.undefined)
    
    inline def setHlsWebdavSettings(value: HlsWebdavSettings): Self = StObject.set(x, "HlsWebdavSettings", value.asInstanceOf[js.Any])
    
    inline def setHlsWebdavSettingsUndefined: Self = StObject.set(x, "HlsWebdavSettings", js.undefined)
  }
}
