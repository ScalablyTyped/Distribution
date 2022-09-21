package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import typings.typescriptNn5FuAjk.Array
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.FileExtensionInfo
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.FormatCodeSettings
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.WatchOptions
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.UserPreferences
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostConfiguration extends StObject {
  
  var extraFileExtensions: js.UndefOr[Array[FileExtensionInfo]] = js.undefined
  
  var formatCodeOptions: FormatCodeSettings
  
  var hostInfo: String
  
  var preferences: UserPreferences
  
  var watchOptions: js.UndefOr[WatchOptions] = js.undefined
}
object HostConfiguration {
  
  inline def apply(formatCodeOptions: FormatCodeSettings, hostInfo: String, preferences: UserPreferences): HostConfiguration = {
    val __obj = js.Dynamic.literal(formatCodeOptions = formatCodeOptions.asInstanceOf[js.Any], hostInfo = hostInfo.asInstanceOf[js.Any], preferences = preferences.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostConfiguration]
  }
  
  extension [Self <: HostConfiguration](x: Self) {
    
    inline def setExtraFileExtensions(value: Array[FileExtensionInfo]): Self = StObject.set(x, "extraFileExtensions", value.asInstanceOf[js.Any])
    
    inline def setExtraFileExtensionsUndefined: Self = StObject.set(x, "extraFileExtensions", js.undefined)
    
    inline def setFormatCodeOptions(value: FormatCodeSettings): Self = StObject.set(x, "formatCodeOptions", value.asInstanceOf[js.Any])
    
    inline def setHostInfo(value: String): Self = StObject.set(x, "hostInfo", value.asInstanceOf[js.Any])
    
    inline def setPreferences(value: UserPreferences): Self = StObject.set(x, "preferences", value.asInstanceOf[js.Any])
    
    inline def setWatchOptions(value: WatchOptions): Self = StObject.set(x, "watchOptions", value.asInstanceOf[js.Any])
    
    inline def setWatchOptionsUndefined: Self = StObject.set(x, "watchOptions", js.undefined)
  }
}
