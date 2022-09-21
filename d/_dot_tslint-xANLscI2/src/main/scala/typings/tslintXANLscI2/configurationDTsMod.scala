package typings.tslintXANLscI2

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import typings.tslintXANLscI2.anon.PartialIOptions
import typings.tslintXANLscI2.anon.PartialexcludeArraystring
import typings.tslintXANLscI2.anon.Severity
import typings.tslintXANLscI2.ruleDTsMod.IOptions
import typings.tslintXANLscI2.ruleDTsMod.RuleSeverity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configurationDTsMod {
  
  @JSImport(".tslint-xANLscI2/lib/configuration.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport(".tslint-xANLscI2/lib/configuration.d.ts", "CONFIG_FILENAME")
  @js.native
  val CONFIG_FILENAME: /* "tslint.json" */ String = js.native
  
  @JSImport(".tslint-xANLscI2/lib/configuration.d.ts", "CONFIG_FILENAMES")
  @js.native
  val CONFIG_FILENAMES: js.Array[String] = js.native
  
  @JSImport(".tslint-xANLscI2/lib/configuration.d.ts", "DEFAULT_CONFIG")
  @js.native
  val DEFAULT_CONFIG: IConfigurationFile = js.native
  
  @JSImport(".tslint-xANLscI2/lib/configuration.d.ts", "EMPTY_CONFIG")
  @js.native
  val EMPTY_CONFIG: IConfigurationFile = js.native
  
  @JSImport(".tslint-xANLscI2/lib/configuration.d.ts", "JSON_CONFIG_FILENAME")
  @js.native
  val JSON_CONFIG_FILENAME: /* "tslint.json" */ String = js.native
  
  inline def convertRuleOptions(ruleConfiguration: Map[String, PartialIOptions]): js.Array[IOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertRuleOptions")(ruleConfiguration.asInstanceOf[js.Any]).asInstanceOf[js.Array[IOptions]]
  
  inline def extendConfigurationFile(targetConfig: IConfigurationFile, nextConfigSource: IConfigurationFile): IConfigurationFile = (^.asInstanceOf[js.Dynamic].applyDynamic("extendConfigurationFile")(targetConfig.asInstanceOf[js.Any], nextConfigSource.asInstanceOf[js.Any])).asInstanceOf[IConfigurationFile]
  
  inline def findConfiguration(configFile: String): IConfigurationLoadResult = ^.asInstanceOf[js.Dynamic].applyDynamic("findConfiguration")(configFile.asInstanceOf[js.Any]).asInstanceOf[IConfigurationLoadResult]
  inline def findConfiguration(configFile: String, inputFilePath: String): IConfigurationLoadResult = (^.asInstanceOf[js.Dynamic].applyDynamic("findConfiguration")(configFile.asInstanceOf[js.Any], inputFilePath.asInstanceOf[js.Any])).asInstanceOf[IConfigurationLoadResult]
  inline def findConfiguration(configFile: Null, inputFilePath: String): IConfigurationLoadResult = (^.asInstanceOf[js.Dynamic].applyDynamic("findConfiguration")(configFile.asInstanceOf[js.Any], inputFilePath.asInstanceOf[js.Any])).asInstanceOf[IConfigurationLoadResult]
  
  inline def findConfigurationPath(suppliedConfigFilePath: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("findConfigurationPath")(suppliedConfigFilePath.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def findConfigurationPath(suppliedConfigFilePath: String, inputFilePath: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("findConfigurationPath")(suppliedConfigFilePath.asInstanceOf[js.Any], inputFilePath.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def findConfigurationPath(suppliedConfigFilePath: Null, inputFilePath: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("findConfigurationPath")(suppliedConfigFilePath.asInstanceOf[js.Any], inputFilePath.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def getRelativePath(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRelativePath")().asInstanceOf[js.UndefOr[String]]
  inline def getRelativePath(directory: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRelativePath")(directory.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def getRelativePath(directory: String, relativeTo: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelativePath")(directory.asInstanceOf[js.Any], relativeTo.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def getRelativePath(directory: Null, relativeTo: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelativePath")(directory.asInstanceOf[js.Any], relativeTo.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def getRelativePath(directory: Unit, relativeTo: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelativePath")(directory.asInstanceOf[js.Any], relativeTo.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def getRulesDirectories(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRulesDirectories")().asInstanceOf[js.Array[String]]
  inline def getRulesDirectories(directories: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRulesDirectories")(directories.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def getRulesDirectories(directories: String, relativeTo: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRulesDirectories")(directories.asInstanceOf[js.Any], relativeTo.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def getRulesDirectories(directories: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRulesDirectories")(directories.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def getRulesDirectories(directories: js.Array[String], relativeTo: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRulesDirectories")(directories.asInstanceOf[js.Any], relativeTo.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def getRulesDirectories(directories: Unit, relativeTo: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRulesDirectories")(directories.asInstanceOf[js.Any], relativeTo.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def isFileExcluded(filepath: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFileExcluded")(filepath.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isFileExcluded(filepath: String, configFile: IConfigurationFile): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFileExcluded")(filepath.asInstanceOf[js.Any], configFile.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def loadConfigurationFromPath(): IConfigurationFile = ^.asInstanceOf[js.Dynamic].applyDynamic("loadConfigurationFromPath")().asInstanceOf[IConfigurationFile]
  inline def loadConfigurationFromPath(configFilePath: String): IConfigurationFile = ^.asInstanceOf[js.Dynamic].applyDynamic("loadConfigurationFromPath")(configFilePath.asInstanceOf[js.Any]).asInstanceOf[IConfigurationFile]
  inline def loadConfigurationFromPath(configFilePath: String, _originalFilePath: String): IConfigurationFile = (^.asInstanceOf[js.Dynamic].applyDynamic("loadConfigurationFromPath")(configFilePath.asInstanceOf[js.Any], _originalFilePath.asInstanceOf[js.Any])).asInstanceOf[IConfigurationFile]
  inline def loadConfigurationFromPath(configFilePath: Unit, _originalFilePath: String): IConfigurationFile = (^.asInstanceOf[js.Dynamic].applyDynamic("loadConfigurationFromPath")(configFilePath.asInstanceOf[js.Any], _originalFilePath.asInstanceOf[js.Any])).asInstanceOf[IConfigurationFile]
  
  inline def parseConfigFile(configFile: RawConfigFile): IConfigurationFile = ^.asInstanceOf[js.Dynamic].applyDynamic("parseConfigFile")(configFile.asInstanceOf[js.Any]).asInstanceOf[IConfigurationFile]
  inline def parseConfigFile(configFile: RawConfigFile, configFileDir: String): IConfigurationFile = (^.asInstanceOf[js.Dynamic].applyDynamic("parseConfigFile")(configFile.asInstanceOf[js.Any], configFileDir.asInstanceOf[js.Any])).asInstanceOf[IConfigurationFile]
  inline def parseConfigFile(
    configFile: RawConfigFile,
    configFileDir: String,
    readConfig: js.Function1[/* path */ String, RawConfigFile]
  ): IConfigurationFile = (^.asInstanceOf[js.Dynamic].applyDynamic("parseConfigFile")(configFile.asInstanceOf[js.Any], configFileDir.asInstanceOf[js.Any], readConfig.asInstanceOf[js.Any])).asInstanceOf[IConfigurationFile]
  inline def parseConfigFile(
    configFile: RawConfigFile,
    configFileDir: Unit,
    readConfig: js.Function1[/* path */ String, RawConfigFile]
  ): IConfigurationFile = (^.asInstanceOf[js.Dynamic].applyDynamic("parseConfigFile")(configFile.asInstanceOf[js.Any], configFileDir.asInstanceOf[js.Any], readConfig.asInstanceOf[js.Any])).asInstanceOf[IConfigurationFile]
  
  inline def readConfigurationFile(filepath: String): RawConfigFile = ^.asInstanceOf[js.Dynamic].applyDynamic("readConfigurationFile")(filepath.asInstanceOf[js.Any]).asInstanceOf[RawConfigFile]
  
  inline def stringifyConfiguration(configFile: IConfigurationFile): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyConfiguration")(configFile.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def useAsPath(directory: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useAsPath")(directory.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait IConfigurationFile extends StObject {
    
    /**
      * @deprecated property is never set
      *
      * The severity that is applied to rules in this config file as well as rules
      * in any inherited config files which have their severity set to "default".
      * Not inherited.
      */
    var defaultSeverity: js.UndefOr[RuleSeverity] = js.undefined
    
    /**
      * An array of config files whose rules are inherited by this config file.
      */
    var `extends`: js.Array[String]
    
    /**
      * Rules that are used to lint to JavaScript files.
      */
    var jsRules: Map[String, PartialIOptions]
    
    /**
      * A subset of the CLI options.
      */
    var linterOptions: js.UndefOr[PartialexcludeArraystring] = js.undefined
    
    /**
      * Rules that are used to lint TypeScript files.
      */
    var rules: Map[String, PartialIOptions]
    
    /**
      * Directories containing custom rules. Resolved using node module semantics.
      */
    var rulesDirectory: js.Array[String]
  }
  object IConfigurationFile {
    
    inline def apply(
      `extends`: js.Array[String],
      jsRules: Map[String, PartialIOptions],
      rules: Map[String, PartialIOptions],
      rulesDirectory: js.Array[String]
    ): IConfigurationFile = {
      val __obj = js.Dynamic.literal(jsRules = jsRules.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any], rulesDirectory = rulesDirectory.asInstanceOf[js.Any])
      __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IConfigurationFile]
    }
    
    extension [Self <: IConfigurationFile](x: Self) {
      
      inline def setDefaultSeverity(value: RuleSeverity): Self = StObject.set(x, "defaultSeverity", value.asInstanceOf[js.Any])
      
      inline def setDefaultSeverityUndefined: Self = StObject.set(x, "defaultSeverity", js.undefined)
      
      inline def setExtends(value: js.Array[String]): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      inline def setExtendsVarargs(value: String*): Self = StObject.set(x, "extends", js.Array(value*))
      
      inline def setJsRules(value: Map[String, PartialIOptions]): Self = StObject.set(x, "jsRules", value.asInstanceOf[js.Any])
      
      inline def setLinterOptions(value: PartialexcludeArraystring): Self = StObject.set(x, "linterOptions", value.asInstanceOf[js.Any])
      
      inline def setLinterOptionsUndefined: Self = StObject.set(x, "linterOptions", js.undefined)
      
      inline def setRules(value: Map[String, PartialIOptions]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesDirectory(value: js.Array[String]): Self = StObject.set(x, "rulesDirectory", value.asInstanceOf[js.Any])
      
      inline def setRulesDirectoryVarargs(value: String*): Self = StObject.set(x, "rulesDirectory", js.Array(value*))
    }
  }
  
  trait IConfigurationLoadResult extends StObject {
    
    var path: js.UndefOr[String] = js.undefined
    
    var results: js.UndefOr[IConfigurationFile] = js.undefined
  }
  object IConfigurationLoadResult {
    
    inline def apply(): IConfigurationLoadResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IConfigurationLoadResult]
    }
    
    extension [Self <: IConfigurationLoadResult](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setResults(value: IConfigurationFile): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    }
  }
  
  trait RawConfigFile extends StObject {
    
    var defaultSeverity: js.UndefOr[String] = js.undefined
    
    var `extends`: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var jsRules: js.UndefOr[RawRulesConfig | Boolean] = js.undefined
    
    var linterOptions: js.UndefOr[PartialexcludeArraystring] = js.undefined
    
    var rules: js.UndefOr[RawRulesConfig] = js.undefined
    
    var rulesDirectory: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object RawConfigFile {
    
    inline def apply(): RawConfigFile = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RawConfigFile]
    }
    
    extension [Self <: RawConfigFile](x: Self) {
      
      inline def setDefaultSeverity(value: String): Self = StObject.set(x, "defaultSeverity", value.asInstanceOf[js.Any])
      
      inline def setDefaultSeverityUndefined: Self = StObject.set(x, "defaultSeverity", js.undefined)
      
      inline def setExtends(value: String | js.Array[String]): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
      
      inline def setExtendsVarargs(value: String*): Self = StObject.set(x, "extends", js.Array(value*))
      
      inline def setJsRules(value: RawRulesConfig | Boolean): Self = StObject.set(x, "jsRules", value.asInstanceOf[js.Any])
      
      inline def setJsRulesUndefined: Self = StObject.set(x, "jsRules", js.undefined)
      
      inline def setLinterOptions(value: PartialexcludeArraystring): Self = StObject.set(x, "linterOptions", value.asInstanceOf[js.Any])
      
      inline def setLinterOptionsUndefined: Self = StObject.set(x, "linterOptions", js.undefined)
      
      inline def setRules(value: RawRulesConfig): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesDirectory(value: String | js.Array[String]): Self = StObject.set(x, "rulesDirectory", value.asInstanceOf[js.Any])
      
      inline def setRulesDirectoryUndefined: Self = StObject.set(x, "rulesDirectory", js.undefined)
      
      inline def setRulesDirectoryVarargs(value: String*): Self = StObject.set(x, "rulesDirectory", js.Array(value*))
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    }
  }
  
  type RawRuleConfig = js.UndefOr[Null | Boolean | js.Array[Any] | Severity]
  
  type RawRulesConfig = StringDictionary[RawRuleConfig]
}
