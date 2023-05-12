package typings.cucumberCucumber

import typings.cucumberCucumber.anon.PartialIConfiguration
import typings.cucumberCucumber.libConfigurationArgvParserMod.IParsedArgv
import typings.cucumberCucumber.libConfigurationTypesMod.IConfiguration
import typings.cucumberCucumber.libLoggerMod.ILogger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConfigurationMod {
  
  @JSImport("@cucumber/cucumber/lib/configuration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object ArgvParser {
    
    @JSImport("@cucumber/cucumber/lib/configuration", "ArgvParser")
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
  
  @JSImport("@cucumber/cucumber/lib/configuration", "DEFAULT_CONFIGURATION")
  @js.native
  val DEFAULT_CONFIGURATION: IConfiguration = js.native
  
  object OptionSplitter {
    
    @JSImport("@cucumber/cucumber/lib/configuration", "OptionSplitter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def split(option: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("split")(option.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  }
  
  inline def fromFile(logger: ILogger, cwd: String, file: String): js.Promise[PartialIConfiguration] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(logger.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any], file.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PartialIConfiguration]]
  inline def fromFile(logger: ILogger, cwd: String, file: String, profiles: js.Array[String]): js.Promise[PartialIConfiguration] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(logger.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any], file.asInstanceOf[js.Any], profiles.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PartialIConfiguration]]
  
  inline def isTruthyString(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTruthyString")().asInstanceOf[Boolean]
  inline def isTruthyString(s: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTruthyString")(s.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def mergeConfigurations[T](source: T, configurations: PartialIConfiguration*): T = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeConfigurations")(scala.List(source.asInstanceOf[js.Any]).`++`(configurations.asInstanceOf[Seq[js.Any]])*).asInstanceOf[T]
}
