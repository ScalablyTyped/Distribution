package typings.babelPresetEnv

import typings.babelPresetEnv.babelPresetEnvBooleans.`true`
import typings.babelPresetEnv.babelPresetEnvStrings.current
import typings.babelPresetEnv.babelPresetEnvStrings.tp
import typings.babelPresetEnv.mod.CorejsOption
import typings.babelPresetEnv.mod.CorejsVersion
import typings.babelPresetEnv.mod._TargetsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Browsers extends _TargetsOptions {
    
    var browsers: String | js.Array[String] = js.native
  }
  object Browsers {
    
    @scala.inline
    def apply(browsers: String | js.Array[String]): Browsers = {
      val __obj = js.Dynamic.literal(browsers = browsers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Browsers]
    }
    
    @scala.inline
    implicit class BrowsersMutableBuilder[Self <: Browsers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowsers(value: String | js.Array[String]): Self = StObject.set(x, "browsers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowsersVarargs(value: String*): Self = StObject.set(x, "browsers", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Esmodules extends _TargetsOptions {
    
    var esmodules: `true` = js.native
  }
  object Esmodules {
    
    @scala.inline
    def apply(esmodules: `true`): Esmodules = {
      val __obj = js.Dynamic.literal(esmodules = esmodules.asInstanceOf[js.Any])
      __obj.asInstanceOf[Esmodules]
    }
    
    @scala.inline
    implicit class EsmodulesMutableBuilder[Self <: Esmodules] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEsmodules(value: `true`): Self = StObject.set(x, "esmodules", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Node extends _TargetsOptions {
    
    var node: String | current | `true` = js.native
  }
  object Node {
    
    @scala.inline
    def apply(node: String | current | `true`): Node = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node]
    }
    
    @scala.inline
    implicit class NodeMutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNode(value: String | current | `true`): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Proposals extends CorejsOption {
    
    var proposals: Boolean = js.native
    
    var version: CorejsVersion = js.native
  }
  object Proposals {
    
    @scala.inline
    def apply(proposals: Boolean, version: CorejsVersion): Proposals = {
      val __obj = js.Dynamic.literal(proposals = proposals.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Proposals]
    }
    
    @scala.inline
    implicit class ProposalsMutableBuilder[Self <: Proposals] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProposals(value: Boolean): Self = StObject.set(x, "proposals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: CorejsVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Safari extends _TargetsOptions {
    
    var safari: String | tp = js.native
  }
  object Safari {
    
    @scala.inline
    def apply(safari: String | tp): Safari = {
      val __obj = js.Dynamic.literal(safari = safari.asInstanceOf[js.Any])
      __obj.asInstanceOf[Safari]
    }
    
    @scala.inline
    implicit class SafariMutableBuilder[Self <: Safari] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSafari(value: String | tp): Self = StObject.set(x, "safari", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ key in @babel/preset-env.@babel/preset-env.Target ]:? string} */
  @js.native
  trait keyinTargetstring extends _TargetsOptions {
    
    var Android: js.UndefOr[String] = js.native
    
    var Baidu: js.UndefOr[String] = js.native
    
    var BlackBerry: js.UndefOr[String] = js.native
    
    var Chrome: js.UndefOr[String] = js.native
    
    var ChromeAndroid: js.UndefOr[String] = js.native
    
    var Edge: js.UndefOr[String] = js.native
    
    var Electron: js.UndefOr[String] = js.native
    
    var Explorer: js.UndefOr[String] = js.native
    
    var ExplorerMobile: js.UndefOr[String] = js.native
    
    var Firefox: js.UndefOr[String] = js.native
    
    var FirefoxAndroid: js.UndefOr[String] = js.native
    
    var Node: js.UndefOr[String] = js.native
    
    var Opera: js.UndefOr[String] = js.native
    
    var OperaMini: js.UndefOr[String] = js.native
    
    var OperaMobile: js.UndefOr[String] = js.native
    
    var QQAndroid: js.UndefOr[String] = js.native
    
    var Safari: js.UndefOr[String] = js.native
    
    var Samsung: js.UndefOr[String] = js.native
    
    var UCAndroid: js.UndefOr[String] = js.native
    
    var and_chr: js.UndefOr[String] = js.native
    
    var and_ff: js.UndefOr[String] = js.native
    
    var and_qq: js.UndefOr[String] = js.native
    
    var and_uc: js.UndefOr[String] = js.native
    
    var bb: js.UndefOr[String] = js.native
    
    var ff: js.UndefOr[String] = js.native
    
    var iOS: js.UndefOr[String] = js.native
    
    var ie: js.UndefOr[String] = js.native
    
    var ie_mob: js.UndefOr[String] = js.native
    
    var ios_saf: js.UndefOr[String] = js.native
    
    var kaios: js.UndefOr[String] = js.native
    
    var op_mini: js.UndefOr[String] = js.native
    
    var op_mob: js.UndefOr[String] = js.native
  }
  object keyinTargetstring {
    
    @scala.inline
    def apply(): keyinTargetstring = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[keyinTargetstring]
    }
    
    @scala.inline
    implicit class keyinTargetstringMutableBuilder[Self <: keyinTargetstring] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnd_chr(value: String): Self = StObject.set(x, "and_chr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnd_chrUndefined: Self = StObject.set(x, "and_chr", js.undefined)
      
      @scala.inline
      def setAnd_ff(value: String): Self = StObject.set(x, "and_ff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnd_ffUndefined: Self = StObject.set(x, "and_ff", js.undefined)
      
      @scala.inline
      def setAnd_qq(value: String): Self = StObject.set(x, "and_qq", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnd_qqUndefined: Self = StObject.set(x, "and_qq", js.undefined)
      
      @scala.inline
      def setAnd_uc(value: String): Self = StObject.set(x, "and_uc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnd_ucUndefined: Self = StObject.set(x, "and_uc", js.undefined)
      
      @scala.inline
      def setAndroid(value: String): Self = StObject.set(x, "Android", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAndroidUndefined: Self = StObject.set(x, "Android", js.undefined)
      
      @scala.inline
      def setBaidu(value: String): Self = StObject.set(x, "Baidu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaiduUndefined: Self = StObject.set(x, "Baidu", js.undefined)
      
      @scala.inline
      def setBb(value: String): Self = StObject.set(x, "bb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBbUndefined: Self = StObject.set(x, "bb", js.undefined)
      
      @scala.inline
      def setBlackBerry(value: String): Self = StObject.set(x, "BlackBerry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlackBerryUndefined: Self = StObject.set(x, "BlackBerry", js.undefined)
      
      @scala.inline
      def setChrome(value: String): Self = StObject.set(x, "Chrome", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChromeAndroid(value: String): Self = StObject.set(x, "ChromeAndroid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChromeAndroidUndefined: Self = StObject.set(x, "ChromeAndroid", js.undefined)
      
      @scala.inline
      def setChromeUndefined: Self = StObject.set(x, "Chrome", js.undefined)
      
      @scala.inline
      def setEdge(value: String): Self = StObject.set(x, "Edge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgeUndefined: Self = StObject.set(x, "Edge", js.undefined)
      
      @scala.inline
      def setElectron(value: String): Self = StObject.set(x, "Electron", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElectronUndefined: Self = StObject.set(x, "Electron", js.undefined)
      
      @scala.inline
      def setExplorer(value: String): Self = StObject.set(x, "Explorer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExplorerMobile(value: String): Self = StObject.set(x, "ExplorerMobile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExplorerMobileUndefined: Self = StObject.set(x, "ExplorerMobile", js.undefined)
      
      @scala.inline
      def setExplorerUndefined: Self = StObject.set(x, "Explorer", js.undefined)
      
      @scala.inline
      def setFf(value: String): Self = StObject.set(x, "ff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFfUndefined: Self = StObject.set(x, "ff", js.undefined)
      
      @scala.inline
      def setFirefox(value: String): Self = StObject.set(x, "Firefox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirefoxAndroid(value: String): Self = StObject.set(x, "FirefoxAndroid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirefoxAndroidUndefined: Self = StObject.set(x, "FirefoxAndroid", js.undefined)
      
      @scala.inline
      def setFirefoxUndefined: Self = StObject.set(x, "Firefox", js.undefined)
      
      @scala.inline
      def setIOS(value: String): Self = StObject.set(x, "iOS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIOSUndefined: Self = StObject.set(x, "iOS", js.undefined)
      
      @scala.inline
      def setIe(value: String): Self = StObject.set(x, "ie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIeUndefined: Self = StObject.set(x, "ie", js.undefined)
      
      @scala.inline
      def setIe_mob(value: String): Self = StObject.set(x, "ie_mob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIe_mobUndefined: Self = StObject.set(x, "ie_mob", js.undefined)
      
      @scala.inline
      def setIos_saf(value: String): Self = StObject.set(x, "ios_saf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIos_safUndefined: Self = StObject.set(x, "ios_saf", js.undefined)
      
      @scala.inline
      def setKaios(value: String): Self = StObject.set(x, "kaios", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKaiosUndefined: Self = StObject.set(x, "kaios", js.undefined)
      
      @scala.inline
      def setNode(value: String): Self = StObject.set(x, "Node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeUndefined: Self = StObject.set(x, "Node", js.undefined)
      
      @scala.inline
      def setOp_mini(value: String): Self = StObject.set(x, "op_mini", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOp_miniUndefined: Self = StObject.set(x, "op_mini", js.undefined)
      
      @scala.inline
      def setOp_mob(value: String): Self = StObject.set(x, "op_mob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOp_mobUndefined: Self = StObject.set(x, "op_mob", js.undefined)
      
      @scala.inline
      def setOpera(value: String): Self = StObject.set(x, "Opera", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperaMini(value: String): Self = StObject.set(x, "OperaMini", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperaMiniUndefined: Self = StObject.set(x, "OperaMini", js.undefined)
      
      @scala.inline
      def setOperaMobile(value: String): Self = StObject.set(x, "OperaMobile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperaMobileUndefined: Self = StObject.set(x, "OperaMobile", js.undefined)
      
      @scala.inline
      def setOperaUndefined: Self = StObject.set(x, "Opera", js.undefined)
      
      @scala.inline
      def setQQAndroid(value: String): Self = StObject.set(x, "QQAndroid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQQAndroidUndefined: Self = StObject.set(x, "QQAndroid", js.undefined)
      
      @scala.inline
      def setSafari(value: String): Self = StObject.set(x, "Safari", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSafariUndefined: Self = StObject.set(x, "Safari", js.undefined)
      
      @scala.inline
      def setSamsung(value: String): Self = StObject.set(x, "Samsung", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSamsungUndefined: Self = StObject.set(x, "Samsung", js.undefined)
      
      @scala.inline
      def setUCAndroid(value: String): Self = StObject.set(x, "UCAndroid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUCAndroidUndefined: Self = StObject.set(x, "UCAndroid", js.undefined)
    }
  }
}
