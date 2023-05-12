package typings.cucumberCucumber

import typings.cucumberCucumber.anon.PartialIConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConfigurationArgvParserMod {
  
  object default {
    
    @JSImport("@cucumber/cucumber/lib/configuration/argv_parser", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def collect[T](`val`: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("collect")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
    inline def collect[T](`val`: T, memo: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("collect")(`val`.asInstanceOf[js.Any], memo.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    
    inline def mergeJson(option: String): js.Function2[/* str */ String, /* memo */ js.UndefOr[js.Object], js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeJson")(option.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* str */ String, /* memo */ js.UndefOr[js.Object], js.Object]]
    
    inline def mergeTags(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeTags")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def mergeTags(value: String, memo: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeTags")(value.asInstanceOf[js.Any], memo.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def parse(argv: js.Array[String]): IParsedArgv = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(argv.asInstanceOf[js.Any]).asInstanceOf[IParsedArgv]
    
    inline def validateCountOption(value: String, optionName: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("validateCountOption")(value.asInstanceOf[js.Any], optionName.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def validateLanguage(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("validateLanguage")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  trait IParsedArgv extends StObject {
    
    var configuration: PartialIConfiguration
    
    var options: IParsedArgvOptions
  }
  object IParsedArgv {
    
    inline def apply(configuration: PartialIConfiguration, options: IParsedArgvOptions): IParsedArgv = {
      val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[IParsedArgv]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IParsedArgv] (val x: Self) extends AnyVal {
      
      inline def setConfiguration(value: PartialIConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: IParsedArgvOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  trait IParsedArgvOptions extends StObject {
    
    var config: js.UndefOr[String] = js.undefined
    
    var i18nKeywords: js.UndefOr[String] = js.undefined
    
    var i18nLanguages: js.UndefOr[Boolean] = js.undefined
    
    var profile: js.Array[String]
  }
  object IParsedArgvOptions {
    
    inline def apply(profile: js.Array[String]): IParsedArgvOptions = {
      val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any])
      __obj.asInstanceOf[IParsedArgvOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IParsedArgvOptions] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setI18nKeywords(value: String): Self = StObject.set(x, "i18nKeywords", value.asInstanceOf[js.Any])
      
      inline def setI18nKeywordsUndefined: Self = StObject.set(x, "i18nKeywords", js.undefined)
      
      inline def setI18nLanguages(value: Boolean): Self = StObject.set(x, "i18nLanguages", value.asInstanceOf[js.Any])
      
      inline def setI18nLanguagesUndefined: Self = StObject.set(x, "i18nLanguages", js.undefined)
      
      inline def setProfile(value: js.Array[String]): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setProfileVarargs(value: String*): Self = StObject.set(x, "profile", js.Array(value*))
    }
  }
}
