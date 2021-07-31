package typings.babelPresetEnv

import typings.babelPresetEnv.babelPresetEnvBooleans.`true`
import typings.babelPresetEnv.babelPresetEnvStrings.current
import typings.babelPresetEnv.babelPresetEnvStrings.tp
import typings.std.RegExp
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
    - typings.babelPresetEnv.babelPresetEnvNumbers.`2`
    - typings.babelPresetEnv.babelPresetEnvNumbers.`3`
  */
  trait CorejsVersion
    extends StObject
       with CorejsOption
  object CorejsVersion {
    
    @scala.inline
    def `2`: typings.babelPresetEnv.babelPresetEnvNumbers.`2` = 2.asInstanceOf[typings.babelPresetEnv.babelPresetEnvNumbers.`2`]
    
    @scala.inline
    def `3`: typings.babelPresetEnv.babelPresetEnvNumbers.`3` = 3.asInstanceOf[typings.babelPresetEnv.babelPresetEnvNumbers.`3`]
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
    
    @scala.inline
    def amd: typings.babelPresetEnv.babelPresetEnvStrings.amd = "amd".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.amd]
    
    @scala.inline
    def auto: typings.babelPresetEnv.babelPresetEnvStrings.auto = "auto".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.auto]
    
    @scala.inline
    def cjs: typings.babelPresetEnv.babelPresetEnvStrings.cjs = "cjs".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.cjs]
    
    @scala.inline
    def commonjs: typings.babelPresetEnv.babelPresetEnvStrings.commonjs = "commonjs".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.commonjs]
    
    @scala.inline
    def `false`: typings.babelPresetEnv.babelPresetEnvBooleans.`false` = false.asInstanceOf[typings.babelPresetEnv.babelPresetEnvBooleans.`false`]
    
    @scala.inline
    def systemjs: typings.babelPresetEnv.babelPresetEnvStrings.systemjs = "systemjs".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.systemjs]
    
    @scala.inline
    def umd: typings.babelPresetEnv.babelPresetEnvStrings.umd = "umd".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.umd]
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
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBugfixes(value: Boolean): Self = StObject.set(x, "bugfixes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBugfixesUndefined: Self = StObject.set(x, "bugfixes", js.undefined)
      
      @scala.inline
      def setConfigPath(value: String): Self = StObject.set(x, "configPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigPathUndefined: Self = StObject.set(x, "configPath", js.undefined)
      
      @scala.inline
      def setCorejs(value: CorejsOption): Self = StObject.set(x, "corejs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCorejsUndefined: Self = StObject.set(x, "corejs", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setExclude(value: PluginList): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: PluginListItem*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setForceAllTransforms(value: Boolean): Self = StObject.set(x, "forceAllTransforms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceAllTransformsUndefined: Self = StObject.set(x, "forceAllTransforms", js.undefined)
      
      @scala.inline
      def setIgnoreBrowserslistConfig(value: Boolean): Self = StObject.set(x, "ignoreBrowserslistConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreBrowserslistConfigUndefined: Self = StObject.set(x, "ignoreBrowserslistConfig", js.undefined)
      
      @scala.inline
      def setInclude(value: PluginList): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setIncludeVarargs(value: PluginListItem*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      @scala.inline
      def setLoose(value: Boolean): Self = StObject.set(x, "loose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLooseUndefined: Self = StObject.set(x, "loose", js.undefined)
      
      @scala.inline
      def setModules(value: ModuleOption): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      @scala.inline
      def setShippedProposals(value: Boolean): Self = StObject.set(x, "shippedProposals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShippedProposalsUndefined: Self = StObject.set(x, "shippedProposals", js.undefined)
      
      @scala.inline
      def setSpec(value: Boolean): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
      
      @scala.inline
      def setTargets(value: TargetsOptions): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
      
      @scala.inline
      def setTargetsVarargs(value: BrowserslistQuery*): Self = StObject.set(x, "targets", js.Array(value :_*))
      
      @scala.inline
      def setUseBuiltIns(value: UseBuiltInsOption): Self = StObject.set(x, "useBuiltIns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseBuiltInsUndefined: Self = StObject.set(x, "useBuiltIns", js.undefined)
    }
  }
  
  type PluginList = js.Array[PluginListItem]
  
  type PluginListItem = String | RegExp
  
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
    
    @scala.inline
    def Android: typings.babelPresetEnv.babelPresetEnvStrings.Android = "Android".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.Android]
    
    @scala.inline
    def Baidu: typings.babelPresetEnv.babelPresetEnvStrings.Baidu = "Baidu".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.Baidu]
    
    @scala.inline
    def BlackBerry: typings.babelPresetEnv.babelPresetEnvStrings.BlackBerry = "BlackBerry".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.BlackBerry]
    
    @scala.inline
    def Chrome: typings.babelPresetEnv.babelPresetEnvStrings.Chrome = "Chrome".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.Chrome]
    
    @scala.inline
    def ChromeAndroid: typings.babelPresetEnv.babelPresetEnvStrings.ChromeAndroid = "ChromeAndroid".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.ChromeAndroid]
    
    @scala.inline
    def Edge: typings.babelPresetEnv.babelPresetEnvStrings.Edge = "Edge".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.Edge]
    
    @scala.inline
    def Electron: typings.babelPresetEnv.babelPresetEnvStrings.Electron = "Electron".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.Electron]
    
    @scala.inline
    def Explorer: typings.babelPresetEnv.babelPresetEnvStrings.Explorer = "Explorer".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.Explorer]
    
    @scala.inline
    def ExplorerMobile: typings.babelPresetEnv.babelPresetEnvStrings.ExplorerMobile = "ExplorerMobile".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.ExplorerMobile]
    
    @scala.inline
    def Firefox: typings.babelPresetEnv.babelPresetEnvStrings.Firefox = "Firefox".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.Firefox]
    
    @scala.inline
    def FirefoxAndroid: typings.babelPresetEnv.babelPresetEnvStrings.FirefoxAndroid = "FirefoxAndroid".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.FirefoxAndroid]
    
    @scala.inline
    def Node: typings.babelPresetEnv.babelPresetEnvStrings.Node = "Node".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.Node]
    
    @scala.inline
    def Opera: typings.babelPresetEnv.babelPresetEnvStrings.Opera = "Opera".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.Opera]
    
    @scala.inline
    def OperaMini: typings.babelPresetEnv.babelPresetEnvStrings.OperaMini = "OperaMini".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.OperaMini]
    
    @scala.inline
    def OperaMobile: typings.babelPresetEnv.babelPresetEnvStrings.OperaMobile = "OperaMobile".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.OperaMobile]
    
    @scala.inline
    def QQAndroid: typings.babelPresetEnv.babelPresetEnvStrings.QQAndroid = "QQAndroid".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.QQAndroid]
    
    @scala.inline
    def Safari: typings.babelPresetEnv.babelPresetEnvStrings.Safari = "Safari".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.Safari]
    
    @scala.inline
    def Samsung: typings.babelPresetEnv.babelPresetEnvStrings.Samsung = "Samsung".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.Samsung]
    
    @scala.inline
    def UCAndroid: typings.babelPresetEnv.babelPresetEnvStrings.UCAndroid = "UCAndroid".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.UCAndroid]
    
    @scala.inline
    def and_chr: typings.babelPresetEnv.babelPresetEnvStrings.and_chr = "and_chr".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.and_chr]
    
    @scala.inline
    def and_ff: typings.babelPresetEnv.babelPresetEnvStrings.and_ff = "and_ff".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.and_ff]
    
    @scala.inline
    def and_qq: typings.babelPresetEnv.babelPresetEnvStrings.and_qq = "and_qq".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.and_qq]
    
    @scala.inline
    def and_uc: typings.babelPresetEnv.babelPresetEnvStrings.and_uc = "and_uc".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.and_uc]
    
    @scala.inline
    def bb: typings.babelPresetEnv.babelPresetEnvStrings.bb = "bb".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.bb]
    
    @scala.inline
    def ff: typings.babelPresetEnv.babelPresetEnvStrings.ff = "ff".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.ff]
    
    @scala.inline
    def iOS: typings.babelPresetEnv.babelPresetEnvStrings.iOS = "iOS".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.iOS]
    
    @scala.inline
    def ie: typings.babelPresetEnv.babelPresetEnvStrings.ie = "ie".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.ie]
    
    @scala.inline
    def ie_mob: typings.babelPresetEnv.babelPresetEnvStrings.ie_mob = "ie_mob".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.ie_mob]
    
    @scala.inline
    def ios_saf: typings.babelPresetEnv.babelPresetEnvStrings.ios_saf = "ios_saf".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.ios_saf]
    
    @scala.inline
    def kaios: typings.babelPresetEnv.babelPresetEnvStrings.kaios = "kaios".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.kaios]
    
    @scala.inline
    def op_mini: typings.babelPresetEnv.babelPresetEnvStrings.op_mini = "op_mini".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.op_mini]
    
    @scala.inline
    def op_mob: typings.babelPresetEnv.babelPresetEnvStrings.op_mob = "op_mob".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.op_mob]
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
    
    @scala.inline
    def entry: typings.babelPresetEnv.babelPresetEnvStrings.entry = "entry".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.entry]
    
    @scala.inline
    def `false`: typings.babelPresetEnv.babelPresetEnvBooleans.`false` = false.asInstanceOf[typings.babelPresetEnv.babelPresetEnvBooleans.`false`]
    
    @scala.inline
    def usage: typings.babelPresetEnv.babelPresetEnvStrings.usage = "usage".asInstanceOf[typings.babelPresetEnv.babelPresetEnvStrings.usage]
  }
  
  trait _TargetsOptions extends StObject
  object _TargetsOptions {
    
    @scala.inline
    def Browsers(browsers: String | js.Array[String]): typings.babelPresetEnv.anon.Browsers = {
      val __obj = js.Dynamic.literal(browsers = browsers.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.babelPresetEnv.anon.Browsers]
    }
    
    @scala.inline
    def Esmodules(): typings.babelPresetEnv.anon.Esmodules = {
      val __obj = js.Dynamic.literal(esmodules = true)
      __obj.asInstanceOf[typings.babelPresetEnv.anon.Esmodules]
    }
    
    @scala.inline
    def Node(node: String | current | `true`): typings.babelPresetEnv.anon.Node = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.babelPresetEnv.anon.Node]
    }
    
    @scala.inline
    def Safari(safari: String | tp): typings.babelPresetEnv.anon.Safari = {
      val __obj = js.Dynamic.literal(safari = safari.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.babelPresetEnv.anon.Safari]
    }
    
    @scala.inline
    def keyinTargetstring(): typings.babelPresetEnv.anon.keyinTargetstring = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.babelPresetEnv.anon.keyinTargetstring]
    }
  }
}
