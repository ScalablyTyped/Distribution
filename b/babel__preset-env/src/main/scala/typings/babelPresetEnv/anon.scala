package typings.babelPresetEnv

import typings.babelPresetEnv.babelPresetEnvBooleans.`true`
import typings.babelPresetEnv.babelPresetEnvStrings.current
import typings.babelPresetEnv.babelPresetEnvStrings.tp
import typings.babelPresetEnv.mod.CorejsOption
import typings.babelPresetEnv.mod.CorejsVersion
import typings.babelPresetEnv.mod._TargetsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Browsers
    extends StObject
       with _TargetsOptions {
    
    var browsers: String | js.Array[String]
  }
  object Browsers {
    
    inline def apply(browsers: String | js.Array[String]): Browsers = {
      val __obj = js.Dynamic.literal(browsers = browsers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Browsers]
    }
    
    extension [Self <: Browsers](x: Self) {
      
      inline def setBrowsers(value: String | js.Array[String]): Self = StObject.set(x, "browsers", value.asInstanceOf[js.Any])
      
      inline def setBrowsersVarargs(value: String*): Self = StObject.set(x, "browsers", js.Array(value :_*))
    }
  }
  
  trait Esmodules
    extends StObject
       with _TargetsOptions {
    
    var esmodules: `true`
  }
  object Esmodules {
    
    inline def apply(): Esmodules = {
      val __obj = js.Dynamic.literal(esmodules = true)
      __obj.asInstanceOf[Esmodules]
    }
    
    extension [Self <: Esmodules](x: Self) {
      
      inline def setEsmodules(value: `true`): Self = StObject.set(x, "esmodules", value.asInstanceOf[js.Any])
    }
  }
  
  trait Node
    extends StObject
       with _TargetsOptions {
    
    var node: String | current | `true`
  }
  object Node {
    
    inline def apply(node: String | current | `true`): Node = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node]
    }
    
    extension [Self <: Node](x: Self) {
      
      inline def setNode(value: String | current | `true`): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait Proposals
    extends StObject
       with CorejsOption {
    
    var proposals: Boolean
    
    var version: CorejsVersion
  }
  object Proposals {
    
    inline def apply(proposals: Boolean, version: CorejsVersion): Proposals = {
      val __obj = js.Dynamic.literal(proposals = proposals.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Proposals]
    }
    
    extension [Self <: Proposals](x: Self) {
      
      inline def setProposals(value: Boolean): Self = StObject.set(x, "proposals", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: CorejsVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait Safari
    extends StObject
       with _TargetsOptions {
    
    var safari: String | tp
  }
  object Safari {
    
    inline def apply(safari: String | tp): Safari = {
      val __obj = js.Dynamic.literal(safari = safari.asInstanceOf[js.Any])
      __obj.asInstanceOf[Safari]
    }
    
    extension [Self <: Safari](x: Self) {
      
      inline def setSafari(value: String | tp): Self = StObject.set(x, "safari", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ key in @babel/preset-env.@babel/preset-env.Target ]:? string} */
  trait keyinTargetstring
    extends StObject
       with _TargetsOptions {
    
    var Android: js.UndefOr[String] = js.undefined
    
    var Baidu: js.UndefOr[String] = js.undefined
    
    var BlackBerry: js.UndefOr[String] = js.undefined
    
    var Chrome: js.UndefOr[String] = js.undefined
    
    var ChromeAndroid: js.UndefOr[String] = js.undefined
    
    var Edge: js.UndefOr[String] = js.undefined
    
    var Electron: js.UndefOr[String] = js.undefined
    
    var Explorer: js.UndefOr[String] = js.undefined
    
    var ExplorerMobile: js.UndefOr[String] = js.undefined
    
    var Firefox: js.UndefOr[String] = js.undefined
    
    var FirefoxAndroid: js.UndefOr[String] = js.undefined
    
    var Node: js.UndefOr[String] = js.undefined
    
    var Opera: js.UndefOr[String] = js.undefined
    
    var OperaMini: js.UndefOr[String] = js.undefined
    
    var OperaMobile: js.UndefOr[String] = js.undefined
    
    var QQAndroid: js.UndefOr[String] = js.undefined
    
    var Safari: js.UndefOr[String] = js.undefined
    
    var Samsung: js.UndefOr[String] = js.undefined
    
    var UCAndroid: js.UndefOr[String] = js.undefined
    
    var and_chr: js.UndefOr[String] = js.undefined
    
    var and_ff: js.UndefOr[String] = js.undefined
    
    var and_qq: js.UndefOr[String] = js.undefined
    
    var and_uc: js.UndefOr[String] = js.undefined
    
    var bb: js.UndefOr[String] = js.undefined
    
    var ff: js.UndefOr[String] = js.undefined
    
    var iOS: js.UndefOr[String] = js.undefined
    
    var ie: js.UndefOr[String] = js.undefined
    
    var ie_mob: js.UndefOr[String] = js.undefined
    
    var ios_saf: js.UndefOr[String] = js.undefined
    
    var kaios: js.UndefOr[String] = js.undefined
    
    var op_mini: js.UndefOr[String] = js.undefined
    
    var op_mob: js.UndefOr[String] = js.undefined
  }
  object keyinTargetstring {
    
    inline def apply(): keyinTargetstring = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[keyinTargetstring]
    }
    
    extension [Self <: keyinTargetstring](x: Self) {
      
      inline def setAnd_chr(value: String): Self = StObject.set(x, "and_chr", value.asInstanceOf[js.Any])
      
      inline def setAnd_chrUndefined: Self = StObject.set(x, "and_chr", js.undefined)
      
      inline def setAnd_ff(value: String): Self = StObject.set(x, "and_ff", value.asInstanceOf[js.Any])
      
      inline def setAnd_ffUndefined: Self = StObject.set(x, "and_ff", js.undefined)
      
      inline def setAnd_qq(value: String): Self = StObject.set(x, "and_qq", value.asInstanceOf[js.Any])
      
      inline def setAnd_qqUndefined: Self = StObject.set(x, "and_qq", js.undefined)
      
      inline def setAnd_uc(value: String): Self = StObject.set(x, "and_uc", value.asInstanceOf[js.Any])
      
      inline def setAnd_ucUndefined: Self = StObject.set(x, "and_uc", js.undefined)
      
      inline def setAndroid(value: String): Self = StObject.set(x, "Android", value.asInstanceOf[js.Any])
      
      inline def setAndroidUndefined: Self = StObject.set(x, "Android", js.undefined)
      
      inline def setBaidu(value: String): Self = StObject.set(x, "Baidu", value.asInstanceOf[js.Any])
      
      inline def setBaiduUndefined: Self = StObject.set(x, "Baidu", js.undefined)
      
      inline def setBb(value: String): Self = StObject.set(x, "bb", value.asInstanceOf[js.Any])
      
      inline def setBbUndefined: Self = StObject.set(x, "bb", js.undefined)
      
      inline def setBlackBerry(value: String): Self = StObject.set(x, "BlackBerry", value.asInstanceOf[js.Any])
      
      inline def setBlackBerryUndefined: Self = StObject.set(x, "BlackBerry", js.undefined)
      
      inline def setChrome(value: String): Self = StObject.set(x, "Chrome", value.asInstanceOf[js.Any])
      
      inline def setChromeAndroid(value: String): Self = StObject.set(x, "ChromeAndroid", value.asInstanceOf[js.Any])
      
      inline def setChromeAndroidUndefined: Self = StObject.set(x, "ChromeAndroid", js.undefined)
      
      inline def setChromeUndefined: Self = StObject.set(x, "Chrome", js.undefined)
      
      inline def setEdge(value: String): Self = StObject.set(x, "Edge", value.asInstanceOf[js.Any])
      
      inline def setEdgeUndefined: Self = StObject.set(x, "Edge", js.undefined)
      
      inline def setElectron(value: String): Self = StObject.set(x, "Electron", value.asInstanceOf[js.Any])
      
      inline def setElectronUndefined: Self = StObject.set(x, "Electron", js.undefined)
      
      inline def setExplorer(value: String): Self = StObject.set(x, "Explorer", value.asInstanceOf[js.Any])
      
      inline def setExplorerMobile(value: String): Self = StObject.set(x, "ExplorerMobile", value.asInstanceOf[js.Any])
      
      inline def setExplorerMobileUndefined: Self = StObject.set(x, "ExplorerMobile", js.undefined)
      
      inline def setExplorerUndefined: Self = StObject.set(x, "Explorer", js.undefined)
      
      inline def setFf(value: String): Self = StObject.set(x, "ff", value.asInstanceOf[js.Any])
      
      inline def setFfUndefined: Self = StObject.set(x, "ff", js.undefined)
      
      inline def setFirefox(value: String): Self = StObject.set(x, "Firefox", value.asInstanceOf[js.Any])
      
      inline def setFirefoxAndroid(value: String): Self = StObject.set(x, "FirefoxAndroid", value.asInstanceOf[js.Any])
      
      inline def setFirefoxAndroidUndefined: Self = StObject.set(x, "FirefoxAndroid", js.undefined)
      
      inline def setFirefoxUndefined: Self = StObject.set(x, "Firefox", js.undefined)
      
      inline def setIOS(value: String): Self = StObject.set(x, "iOS", value.asInstanceOf[js.Any])
      
      inline def setIOSUndefined: Self = StObject.set(x, "iOS", js.undefined)
      
      inline def setIe(value: String): Self = StObject.set(x, "ie", value.asInstanceOf[js.Any])
      
      inline def setIeUndefined: Self = StObject.set(x, "ie", js.undefined)
      
      inline def setIe_mob(value: String): Self = StObject.set(x, "ie_mob", value.asInstanceOf[js.Any])
      
      inline def setIe_mobUndefined: Self = StObject.set(x, "ie_mob", js.undefined)
      
      inline def setIos_saf(value: String): Self = StObject.set(x, "ios_saf", value.asInstanceOf[js.Any])
      
      inline def setIos_safUndefined: Self = StObject.set(x, "ios_saf", js.undefined)
      
      inline def setKaios(value: String): Self = StObject.set(x, "kaios", value.asInstanceOf[js.Any])
      
      inline def setKaiosUndefined: Self = StObject.set(x, "kaios", js.undefined)
      
      inline def setNode(value: String): Self = StObject.set(x, "Node", value.asInstanceOf[js.Any])
      
      inline def setNodeUndefined: Self = StObject.set(x, "Node", js.undefined)
      
      inline def setOp_mini(value: String): Self = StObject.set(x, "op_mini", value.asInstanceOf[js.Any])
      
      inline def setOp_miniUndefined: Self = StObject.set(x, "op_mini", js.undefined)
      
      inline def setOp_mob(value: String): Self = StObject.set(x, "op_mob", value.asInstanceOf[js.Any])
      
      inline def setOp_mobUndefined: Self = StObject.set(x, "op_mob", js.undefined)
      
      inline def setOpera(value: String): Self = StObject.set(x, "Opera", value.asInstanceOf[js.Any])
      
      inline def setOperaMini(value: String): Self = StObject.set(x, "OperaMini", value.asInstanceOf[js.Any])
      
      inline def setOperaMiniUndefined: Self = StObject.set(x, "OperaMini", js.undefined)
      
      inline def setOperaMobile(value: String): Self = StObject.set(x, "OperaMobile", value.asInstanceOf[js.Any])
      
      inline def setOperaMobileUndefined: Self = StObject.set(x, "OperaMobile", js.undefined)
      
      inline def setOperaUndefined: Self = StObject.set(x, "Opera", js.undefined)
      
      inline def setQQAndroid(value: String): Self = StObject.set(x, "QQAndroid", value.asInstanceOf[js.Any])
      
      inline def setQQAndroidUndefined: Self = StObject.set(x, "QQAndroid", js.undefined)
      
      inline def setSafari(value: String): Self = StObject.set(x, "Safari", value.asInstanceOf[js.Any])
      
      inline def setSafariUndefined: Self = StObject.set(x, "Safari", js.undefined)
      
      inline def setSamsung(value: String): Self = StObject.set(x, "Samsung", value.asInstanceOf[js.Any])
      
      inline def setSamsungUndefined: Self = StObject.set(x, "Samsung", js.undefined)
      
      inline def setUCAndroid(value: String): Self = StObject.set(x, "UCAndroid", value.asInstanceOf[js.Any])
      
      inline def setUCAndroidUndefined: Self = StObject.set(x, "UCAndroid", js.undefined)
    }
  }
}
