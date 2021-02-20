package typings.awsSdkSharedIniFileLoader

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/shared-ini-file-loader", "ENV_CONFIG_PATH")
  @js.native
  val ENV_CONFIG_PATH: /* "AWS_CONFIG_FILE" */ String = js.native
  
  @JSImport("@aws-sdk/shared-ini-file-loader", "ENV_CREDENTIALS_PATH")
  @js.native
  val ENV_CREDENTIALS_PATH: /* "AWS_SHARED_CREDENTIALS_FILE" */ String = js.native
  
  @JSImport("@aws-sdk/shared-ini-file-loader", "loadSharedConfigFiles")
  @js.native
  def loadSharedConfigFiles(): js.Promise[SharedConfigFiles] = js.native
  @JSImport("@aws-sdk/shared-ini-file-loader", "loadSharedConfigFiles")
  @js.native
  def loadSharedConfigFiles(init: SharedConfigInit): js.Promise[SharedConfigFiles] = js.native
  
  type ParsedIniData = StringDictionary[Profile]
  
  type Profile = StringDictionary[js.UndefOr[String]]
  
  @js.native
  trait SharedConfigFiles extends StObject {
    
    var configFile: ParsedIniData = js.native
    
    var credentialsFile: ParsedIniData = js.native
  }
  object SharedConfigFiles {
    
    @scala.inline
    def apply(configFile: ParsedIniData, credentialsFile: ParsedIniData): SharedConfigFiles = {
      val __obj = js.Dynamic.literal(configFile = configFile.asInstanceOf[js.Any], credentialsFile = credentialsFile.asInstanceOf[js.Any])
      __obj.asInstanceOf[SharedConfigFiles]
    }
    
    @scala.inline
    implicit class SharedConfigFilesMutableBuilder[Self <: SharedConfigFiles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfigFile(value: ParsedIniData): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialsFile(value: ParsedIniData): Self = StObject.set(x, "credentialsFile", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SharedConfigInit extends StObject {
    
    /**
      * The path at which to locate the ini config file. Defaults to the value of
      * the `AWS_CONFIG_FILE` environment variable (if defined) or
      * `~/.aws/config` otherwise.
      */
    var configFilepath: js.UndefOr[String] = js.native
    
    /**
      * The path at which to locate the ini credentials file. Defaults to the
      * value of the `AWS_SHARED_CREDENTIALS_FILE` environment variable (if
      * defined) or `~/.aws/credentials` otherwise.
      */
    var filepath: js.UndefOr[String] = js.native
  }
  object SharedConfigInit {
    
    @scala.inline
    def apply(): SharedConfigInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedConfigInit]
    }
    
    @scala.inline
    implicit class SharedConfigInitMutableBuilder[Self <: SharedConfigInit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfigFilepath(value: String): Self = StObject.set(x, "configFilepath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigFilepathUndefined: Self = StObject.set(x, "configFilepath", js.undefined)
      
      @scala.inline
      def setFilepath(value: String): Self = StObject.set(x, "filepath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilepathUndefined: Self = StObject.set(x, "filepath", js.undefined)
    }
  }
}
