package typings.awsSdk2Types

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSharedIniIniLoaderMod {
  
  @JSImport("aws-sdk2-types/lib/shared-ini/ini-loader", "IniLoader")
  @js.native
  open class IniLoader () extends StObject {
    
    /** Remove all cached files. Used after config files are updated. */
    def clearCachedFiles(): Unit = js.native
    
    /**
      * Load configurations from config/credentials files and cache them 
      * for later use. If no file is specified it will try to load default
      * files.
      * @returns {object} object of all profile information in the file
      */
    def loadFrom(options: LoadFileOptions): IniFileContent = js.native
  }
  
  type IniFileContent = StringDictionary[StringDictionary[String]]
  
  trait LoadFileOptions extends StObject {
    
    var filename: js.UndefOr[String] = js.undefined
    
    var isConfig: js.UndefOr[Boolean] = js.undefined
  }
  object LoadFileOptions {
    
    inline def apply(): LoadFileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadFileOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoadFileOptions] (val x: Self) extends AnyVal {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setIsConfig(value: Boolean): Self = StObject.set(x, "isConfig", value.asInstanceOf[js.Any])
      
      inline def setIsConfigUndefined: Self = StObject.set(x, "isConfig", js.undefined)
    }
  }
}
