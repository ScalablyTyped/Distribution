package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information found in a configure request.
  */
trait ConfigureRequestArguments extends StObject {
  
  /**
    * The host's additional supported .js file extensions
    */
  var extraFileExtensions: js.UndefOr[Array[FileExtensionInfo]] = js.undefined
  
  /**
    * If present, tab settings apply only to this file.
    */
  var file: js.UndefOr[String] = js.undefined
  
  /**
    * The format options to use during formatting and other code editing features.
    */
  var formatOptions: js.UndefOr[FormatCodeSettings] = js.undefined
  
  /**
    * Information about the host, for example 'Emacs 24.4' or
    * 'Sublime Text version 3075'
    */
  var hostInfo: js.UndefOr[String] = js.undefined
  
  var preferences: js.UndefOr[UserPreferences] = js.undefined
  
  var watchOptions: js.UndefOr[WatchOptions] = js.undefined
}
object ConfigureRequestArguments {
  
  inline def apply(): ConfigureRequestArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigureRequestArguments]
  }
  
  extension [Self <: ConfigureRequestArguments](x: Self) {
    
    inline def setExtraFileExtensions(value: Array[FileExtensionInfo]): Self = StObject.set(x, "extraFileExtensions", value.asInstanceOf[js.Any])
    
    inline def setExtraFileExtensionsUndefined: Self = StObject.set(x, "extraFileExtensions", js.undefined)
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setFormatOptions(value: FormatCodeSettings): Self = StObject.set(x, "formatOptions", value.asInstanceOf[js.Any])
    
    inline def setFormatOptionsUndefined: Self = StObject.set(x, "formatOptions", js.undefined)
    
    inline def setHostInfo(value: String): Self = StObject.set(x, "hostInfo", value.asInstanceOf[js.Any])
    
    inline def setHostInfoUndefined: Self = StObject.set(x, "hostInfo", js.undefined)
    
    inline def setPreferences(value: UserPreferences): Self = StObject.set(x, "preferences", value.asInstanceOf[js.Any])
    
    inline def setPreferencesUndefined: Self = StObject.set(x, "preferences", js.undefined)
    
    inline def setWatchOptions(value: WatchOptions): Self = StObject.set(x, "watchOptions", value.asInstanceOf[js.Any])
    
    inline def setWatchOptionsUndefined: Self = StObject.set(x, "watchOptions", js.undefined)
  }
}
