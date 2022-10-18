package typings.awsSdkSharedIniFileLoader

import typings.awsSdkTypes.distTypesProfileMod.SharedConfigFiles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLoadSharedConfigFilesMod {
  
  @JSImport("@aws-sdk/shared-ini-file-loader/dist-types/loadSharedConfigFiles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadSharedConfigFiles(): js.Promise[SharedConfigFiles] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSharedConfigFiles")().asInstanceOf[js.Promise[SharedConfigFiles]]
  inline def loadSharedConfigFiles(init: SharedConfigInit): js.Promise[SharedConfigFiles] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSharedConfigFiles")(init.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SharedConfigFiles]]
  
  trait SharedConfigInit extends StObject {
    
    /**
      * The path at which to locate the ini config file. Defaults to the value of
      * the `AWS_CONFIG_FILE` environment variable (if defined) or
      * `~/.aws/config` otherwise.
      */
    var configFilepath: js.UndefOr[String] = js.undefined
    
    /**
      * The path at which to locate the ini credentials file. Defaults to the
      * value of the `AWS_SHARED_CREDENTIALS_FILE` environment variable (if
      * defined) or `~/.aws/credentials` otherwise.
      */
    var filepath: js.UndefOr[String] = js.undefined
  }
  object SharedConfigInit {
    
    inline def apply(): SharedConfigInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedConfigInit]
    }
    
    extension [Self <: SharedConfigInit](x: Self) {
      
      inline def setConfigFilepath(value: String): Self = StObject.set(x, "configFilepath", value.asInstanceOf[js.Any])
      
      inline def setConfigFilepathUndefined: Self = StObject.set(x, "configFilepath", js.undefined)
      
      inline def setFilepath(value: String): Self = StObject.set(x, "filepath", value.asInstanceOf[js.Any])
      
      inline def setFilepathUndefined: Self = StObject.set(x, "filepath", js.undefined)
    }
  }
}
