package typings.babelPresetEnv

import typings.babelPresetEnv.babelPresetEnvBooleans.`true`
import typings.babelPresetEnv.babelPresetEnvStrings.current
import typings.babelPresetEnv.babelPresetEnvStrings.tp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type BrowserslistQuery = String
  
  /* Rewritten from type alias, can be one of: 
    - typings.babelPresetEnv.mod.CorejsVersion
    - typings.babelPresetEnv.anon.Proposals
  */
  trait CorejsOption extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.babelPresetEnv.babelPresetEnvInts.`2`
    - typings.babelPresetEnv.babelPresetEnvInts.`3`
  */
  trait CorejsVersion
    extends StObject
       with CorejsOption
  object CorejsVersion {
    
    inline def `2`: typings.babelPresetEnv.babelPresetEnvInts.`2` = 2.asInstanceOf[typings.babelPresetEnv.babelPresetEnvInts.`2`]
    
    inline def `3`: typings.babelPresetEnv.babelPresetEnvInts.`3` = 3.asInstanceOf[typings.babelPresetEnv.babelPresetEnvInts.`3`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.babelPresetEnv.babelPresetEnvBooleans.`false`
    - typings.babelPresetEnv.babelPresetEnvStrings.amd
    - typings.babelPresetEnv.babelPresetEnvStrings.umd
    - typings.babelPresetEnv.babelPresetEnvStrings.systemjs
    - typings.babelPresetEnv.babelPresetEnvStrings.commonjs
    - typings.babelPresetEnv.babelPresetEnvStrings.cjs
    - typings.babelPresetEnv.babelPresetEnvStrings.auto
  */
  trait ModuleOption extends StObject
  object ModuleOption {
    
    inline def amd: typings.babelPresetEnv.babelPresetEnvStrings.amd = "amd".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.amd]
    
    inline def auto: typings.babelPresetEnv.babelPresetEnvStrings.auto = "auto".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.auto]
    
    inline def cjs: typings.babelPresetEnv.babelPresetEnvStrings.cjs = "cjs".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.cjs]
    
    inline def commonjs: typings.babelPresetEnv.babelPresetEnvStrings.commonjs = "commonjs".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.commonjs]
    
    inline def `false`: typings.babelPresetEnv.babelPresetEnvBooleans.`false` = false.asInstanceOf[typings.babelPresetEnv.babelPresetEnvBooleans.`false`]
    
    inline def systemjs: typings.babelPresetEnv.babelPresetEnvStrings.systemjs = "systemjs".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.systemjs]
    
    inline def umd: typings.babelPresetEnv.babelPresetEnvStrings.umd = "umd".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.umd]
  }
  
  trait Options extends StObject {
    
    var bugfixes: js.UndefOr[Boolean] = js.undefined
    
    var configPath: js.UndefOr[String] = js.undefined
    
    var corejs: js.UndefOr[CorejsOption] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var exclude: js.UndefOr[PluginList] = js.undefined
    
    var forceAllTransforms: js.UndefOr[Boolean] = js.undefined
    
    var ignoreBrowserslistConfig: js.UndefOr[Boolean] = js.undefined
    
    var include: js.UndefOr[PluginList] = js.undefined
    
    var loose: js.UndefOr[Boolean] = js.undefined
    
    var modules: js.UndefOr[ModuleOption] = js.undefined
    
    var shippedProposals: js.UndefOr[Boolean] = js.undefined
    
    var spec: js.UndefOr[Boolean] = js.undefined
    
    var targets: js.UndefOr[TargetsOptions] = js.undefined
    
    var useBuiltIns: js.UndefOr[UseBuiltInsOption] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBugfixes(value: Boolean): Self = StObject.set(x, "bugfixes", value.asInstanceOf[js.Any])
      
      inline def setBugfixesUndefined: Self = StObject.set(x, "bugfixes", js.undefined)
      
      inline def setConfigPath(value: String): Self = StObject.set(x, "configPath", value.asInstanceOf[js.Any])
      
      inline def setConfigPathUndefined: Self = StObject.set(x, "configPath", js.undefined)
      
      inline def setCorejs(value: CorejsOption): Self = StObject.set(x, "corejs", value.asInstanceOf[js.Any])
      
      inline def setCorejsUndefined: Self = StObject.set(x, "corejs", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setExclude(value: PluginList): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: PluginListItem*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setForceAllTransforms(value: Boolean): Self = StObject.set(x, "forceAllTransforms", value.asInstanceOf[js.Any])
      
      inline def setForceAllTransformsUndefined: Self = StObject.set(x, "forceAllTransforms", js.undefined)
      
      inline def setIgnoreBrowserslistConfig(value: Boolean): Self = StObject.set(x, "ignoreBrowserslistConfig", value.asInstanceOf[js.Any])
      
      inline def setIgnoreBrowserslistConfigUndefined: Self = StObject.set(x, "ignoreBrowserslistConfig", js.undefined)
      
      inline def setInclude(value: PluginList): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: PluginListItem*): Self = StObject.set(x, "include", js.Array(value*))
      
      inline def setLoose(value: Boolean): Self = StObject.set(x, "loose", value.asInstanceOf[js.Any])
      
      inline def setLooseUndefined: Self = StObject.set(x, "loose", js.undefined)
      
      inline def setModules(value: ModuleOption): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      inline def setShippedProposals(value: Boolean): Self = StObject.set(x, "shippedProposals", value.asInstanceOf[js.Any])
      
      inline def setShippedProposalsUndefined: Self = StObject.set(x, "shippedProposals", js.undefined)
      
      inline def setSpec(value: Boolean): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
      
      inline def setTargets(value: TargetsOptions): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
      
      inline def setTargetsVarargs(value: BrowserslistQuery*): Self = StObject.set(x, "targets", js.Array(value*))
      
      inline def setUseBuiltIns(value: UseBuiltInsOption): Self = StObject.set(x, "useBuiltIns", value.asInstanceOf[js.Any])
      
      inline def setUseBuiltInsUndefined: Self = StObject.set(x, "useBuiltIns", js.undefined)
    }
  }
  
  type PluginList = js.Array[PluginListItem]
  
  type PluginListItem = String | js.RegExp
  
  /* Rewritten from type alias, can be one of: 
    - typings.babelPresetEnv.babelPresetEnvStrings.Android
    - typings.babelPresetEnv.babelPresetEnvStrings.Baidu
    - typings.babelPresetEnv.babelPresetEnvStrings.BlackBerry
    - typings.babelPresetEnv.babelPresetEnvStrings.bb
    - typings.babelPresetEnv.babelPresetEnvStrings.Chrome
    - typings.babelPresetEnv.babelPresetEnvStrings.ChromeAndroid
    - typings.babelPresetEnv.babelPresetEnvStrings.and_chr
    - typings.babelPresetEnv.babelPresetEnvStrings.Edge
    - typings.babelPresetEnv.babelPresetEnvStrings.Electron
    - typings.babelPresetEnv.babelPresetEnvStrings.Explorer
    - typings.babelPresetEnv.babelPresetEnvStrings.ie
    - typings.babelPresetEnv.babelPresetEnvStrings.ExplorerMobile
    - typings.babelPresetEnv.babelPresetEnvStrings.ie_mob
    - typings.babelPresetEnv.babelPresetEnvStrings.Firefox
    - typings.babelPresetEnv.babelPresetEnvStrings.ff
    - typings.babelPresetEnv.babelPresetEnvStrings.FirefoxAndroid
    - typings.babelPresetEnv.babelPresetEnvStrings.and_ff
    - typings.babelPresetEnv.babelPresetEnvStrings.iOS
    - typings.babelPresetEnv.babelPresetEnvStrings.ios_saf
    - typings.babelPresetEnv.babelPresetEnvStrings.Node
    - typings.babelPresetEnv.babelPresetEnvStrings.Opera
    - typings.babelPresetEnv.babelPresetEnvStrings.OperaMini
    - typings.babelPresetEnv.babelPresetEnvStrings.op_mini
    - typings.babelPresetEnv.babelPresetEnvStrings.OperaMobile
    - typings.babelPresetEnv.babelPresetEnvStrings.op_mob
    - typings.babelPresetEnv.babelPresetEnvStrings.QQAndroid
    - typings.babelPresetEnv.babelPresetEnvStrings.and_qq
    - typings.babelPresetEnv.babelPresetEnvStrings.Safari
    - typings.babelPresetEnv.babelPresetEnvStrings.Samsung
    - typings.babelPresetEnv.babelPresetEnvStrings.UCAndroid
    - typings.babelPresetEnv.babelPresetEnvStrings.and_uc
    - typings.babelPresetEnv.babelPresetEnvStrings.kaios
  */
  trait Target extends StObject
  object Target {
    
    inline def Android: typings.babelPresetEnv.babelPresetEnvStrings.Android = "Android".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.Android]
    
    inline def Baidu: typings.babelPresetEnv.babelPresetEnvStrings.Baidu = "Baidu".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.Baidu]
    
    inline def BlackBerry: typings.babelPresetEnv.babelPresetEnvStrings.BlackBerry = "BlackBerry".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.BlackBerry]
    
    inline def Chrome: typings.babelPresetEnv.babelPresetEnvStrings.Chrome = "Chrome".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.Chrome]
    
    inline def ChromeAndroid: typings.babelPresetEnv.babelPresetEnvStrings.ChromeAndroid = "ChromeAndroid".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.ChromeAndroid]
    
    inline def Edge: typings.babelPresetEnv.babelPresetEnvStrings.Edge = "Edge".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.Edge]
    
    inline def Electron: typings.babelPresetEnv.babelPresetEnvStrings.Electron = "Electron".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.Electron]
    
    inline def Explorer: typings.babelPresetEnv.babelPresetEnvStrings.Explorer = "Explorer".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.Explorer]
    
    inline def ExplorerMobile: typings.babelPresetEnv.babelPresetEnvStrings.ExplorerMobile = "ExplorerMobile".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.ExplorerMobile]
    
    inline def Firefox: typings.babelPresetEnv.babelPresetEnvStrings.Firefox = "Firefox".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.Firefox]
    
    inline def FirefoxAndroid: typings.babelPresetEnv.babelPresetEnvStrings.FirefoxAndroid = "FirefoxAndroid".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.FirefoxAndroid]
    
    inline def Node: typings.babelPresetEnv.babelPresetEnvStrings.Node = "Node".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.Node]
    
    inline def Opera: typings.babelPresetEnv.babelPresetEnvStrings.Opera = "Opera".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.Opera]
    
    inline def OperaMini: typings.babelPresetEnv.babelPresetEnvStrings.OperaMini = "OperaMini".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.OperaMini]
    
    inline def OperaMobile: typings.babelPresetEnv.babelPresetEnvStrings.OperaMobile = "OperaMobile".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.OperaMobile]
    
    inline def QQAndroid: typings.babelPresetEnv.babelPresetEnvStrings.QQAndroid = "QQAndroid".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.QQAndroid]
    
    inline def Safari: typings.babelPresetEnv.babelPresetEnvStrings.Safari = "Safari".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.Safari]
    
    inline def Samsung: typings.babelPresetEnv.babelPresetEnvStrings.Samsung = "Samsung".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.Samsung]
    
    inline def UCAndroid: typings.babelPresetEnv.babelPresetEnvStrings.UCAndroid = "UCAndroid".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.UCAndroid]
    
    inline def and_chr: typings.babelPresetEnv.babelPresetEnvStrings.and_chr = "and_chr".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.and_chr]
    
    inline def and_ff: typings.babelPresetEnv.babelPresetEnvStrings.and_ff = "and_ff".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.and_ff]
    
    inline def and_qq: typings.babelPresetEnv.babelPresetEnvStrings.and_qq = "and_qq".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.and_qq]
    
    inline def and_uc: typings.babelPresetEnv.babelPresetEnvStrings.and_uc = "and_uc".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.and_uc]
    
    inline def bb: typings.babelPresetEnv.babelPresetEnvStrings.bb = "bb".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.bb]
    
    inline def ff: typings.babelPresetEnv.babelPresetEnvStrings.ff = "ff".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.ff]
    
    inline def iOS: typings.babelPresetEnv.babelPresetEnvStrings.iOS = "iOS".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.iOS]
    
    inline def ie: typings.babelPresetEnv.babelPresetEnvStrings.ie = "ie".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.ie]
    
    inline def ie_mob: typings.babelPresetEnv.babelPresetEnvStrings.ie_mob = "ie_mob".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.ie_mob]
    
    inline def ios_saf: typings.babelPresetEnv.babelPresetEnvStrings.ios_saf = "ios_saf".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.ios_saf]
    
    inline def kaios: typings.babelPresetEnv.babelPresetEnvStrings.kaios = "kaios".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.kaios]
    
    inline def op_mini: typings.babelPresetEnv.babelPresetEnvStrings.op_mini = "op_mini".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.op_mini]
    
    inline def op_mob: typings.babelPresetEnv.babelPresetEnvStrings.op_mob = "op_mob".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.op_mob]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.babelPresetEnv.mod.BrowserslistQuery
    - js.Array[typings.babelPresetEnv.mod.BrowserslistQuery]
    - typings.babelPresetEnv.anon.keyinTargetstring
    - typings.babelPresetEnv.anon.Esmodules
    - typings.babelPresetEnv.anon.Node
    - typings.babelPresetEnv.anon.Safari
    - typings.babelPresetEnv.anon.Browsers
  */
  type TargetsOptions = _TargetsOptions | js.Array[BrowserslistQuery] | BrowserslistQuery
  
  /* Rewritten from type alias, can be one of: 
    - typings.babelPresetEnv.babelPresetEnvBooleans.`false`
    - typings.babelPresetEnv.babelPresetEnvStrings.usage
    - typings.babelPresetEnv.babelPresetEnvStrings.entry
  */
  trait UseBuiltInsOption extends StObject
  object UseBuiltInsOption {
    
    inline def entry: typings.babelPresetEnv.babelPresetEnvStrings.entry = "entry".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.entry]
    
    inline def `false`: typings.babelPresetEnv.babelPresetEnvBooleans.`false` = false.asInstanceOf[typings.babelPresetEnv.babelPresetEnvBooleans.`false`]
    
    inline def usage: typings.babelPresetEnv.babelPresetEnvStrings.usage = "usage".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.usage]
  }
  
  trait _TargetsOptions extends StObject
  object _TargetsOptions {
    
    inline def Browsers(browsers: String | js.Array[String]): typings.babelPresetEnv.anon.Browsers = {
      val __obj = js.Dynamic.literal(browsers = browsers.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.babelPresetEnv.anon.Browsers]
    }
    
    inline def Esmodules(): typings.babelPresetEnv.anon.Esmodules = {
      val __obj = js.Dynamic.literal(esmodules = true)
      __obj.asInstanceOf[typings.babelPresetEnv.anon.Esmodules]
    }
    
    inline def Node(node: String | current | `true`): typings.babelPresetEnv.anon.Node = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.babelPresetEnv.anon.Node]
    }
    
    inline def Safari(safari: String | tp): typings.babelPresetEnv.anon.Safari = {
      val __obj = js.Dynamic.literal(safari = safari.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.babelPresetEnv.anon.Safari]
    }
    
    inline def keyinTargetstring(): typings.babelPresetEnv.anon.keyinTargetstring = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.babelPresetEnv.anon.keyinTargetstring]
    }
  }
}
