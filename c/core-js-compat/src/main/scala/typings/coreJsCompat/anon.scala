package typings.coreJsCompat

import org.scalablytyped.runtime.StringDictionary
import typings.coreJsCompat.compatMod.CompatOptions
import typings.coreJsCompat.compatMod.CompatOutput
import typings.coreJsCompat.mod.CompatData
import typings.coreJsCompat.sharedMod.ModuleName
import typings.coreJsCompat.sharedMod.TargetVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Compat extends StObject {
    
    def compat(): CompatOutput
    def compat(options: CompatOptions): CompatOutput
    @JSName("compat")
    var compat_Original: js.Function1[/* options */ js.UndefOr[CompatOptions], CompatOutput]
    
    /** Full list compatibility data */
    var data: CompatData
    
    /** map of modules by `core-js` entry points */
    var entries: StringDictionary[js.Array[ModuleName]]
    
    /** The subset of modules which available in the passed `core-js` version */
    def getModulesListForTargetVersion(version: TargetVersion): js.Array[ModuleName]
    /** The subset of modules which available in the passed `core-js` version */
    @JSName("getModulesListForTargetVersion")
    var getModulesListForTargetVersion_Original: js.Function1[/* version */ TargetVersion, js.Array[ModuleName]]
    
    /** Full list of modules */
    var modules: js.Array[ModuleName]
  }
  object Compat {
    
    inline def apply(
      compat: /* options */ js.UndefOr[CompatOptions] => CompatOutput,
      data: CompatData,
      entries: StringDictionary[js.Array[ModuleName]],
      getModulesListForTargetVersion: /* version */ TargetVersion => js.Array[ModuleName],
      modules: js.Array[ModuleName]
    ): Compat = {
      val __obj = js.Dynamic.literal(compat = js.Any.fromFunction1(compat), data = data.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], getModulesListForTargetVersion = js.Any.fromFunction1(getModulesListForTargetVersion), modules = modules.asInstanceOf[js.Any])
      __obj.asInstanceOf[Compat]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Compat] (val x: Self) extends AnyVal {
      
      inline def setCompat(value: /* options */ js.UndefOr[CompatOptions] => CompatOutput): Self = StObject.set(x, "compat", js.Any.fromFunction1(value))
      
      inline def setData(value: CompatData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setEntries(value: StringDictionary[js.Array[ModuleName]]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setGetModulesListForTargetVersion(value: /* version */ TargetVersion => js.Array[ModuleName]): Self = StObject.set(x, "getModulesListForTargetVersion", js.Any.fromFunction1(value))
      
      inline def setModules(value: js.Array[ModuleName]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesVarargs(value: ModuleName*): Self = StObject.set(x, "modules", js.Array(value*))
    }
  }
  
  /* Inlined {[ target in core-js-compat.core-js-compat/shared.Target ]:? core-js-compat.core-js-compat/shared.TargetVersion} */
  trait targetinTargetTargetVersi extends StObject {
    
    var android: js.UndefOr[TargetVersion] = js.undefined
    
    var bun: js.UndefOr[TargetVersion] = js.undefined
    
    var chrome: js.UndefOr[TargetVersion] = js.undefined
    
    var `chrome-android`: js.UndefOr[TargetVersion] = js.undefined
    
    var deno: js.UndefOr[TargetVersion] = js.undefined
    
    var edge: js.UndefOr[TargetVersion] = js.undefined
    
    var electron: js.UndefOr[TargetVersion] = js.undefined
    
    var firefox: js.UndefOr[TargetVersion] = js.undefined
    
    var `firefox-android`: js.UndefOr[TargetVersion] = js.undefined
    
    var hermes: js.UndefOr[TargetVersion] = js.undefined
    
    var ie: js.UndefOr[TargetVersion] = js.undefined
    
    var ios: js.UndefOr[TargetVersion] = js.undefined
    
    var node: js.UndefOr[TargetVersion] = js.undefined
    
    var oculus: js.UndefOr[TargetVersion] = js.undefined
    
    var opera: js.UndefOr[TargetVersion] = js.undefined
    
    var `opera-android`: js.UndefOr[TargetVersion] = js.undefined
    
    var opera_mobile: js.UndefOr[TargetVersion] = js.undefined
    
    var phantom: js.UndefOr[TargetVersion] = js.undefined
    
    var quest: js.UndefOr[TargetVersion] = js.undefined
    
    var react: js.UndefOr[TargetVersion] = js.undefined
    
    var `react-native`: js.UndefOr[TargetVersion] = js.undefined
    
    var rhino: js.UndefOr[TargetVersion] = js.undefined
    
    var safari: js.UndefOr[TargetVersion] = js.undefined
    
    var samsung: js.UndefOr[TargetVersion] = js.undefined
  }
  object targetinTargetTargetVersi {
    
    inline def apply(): targetinTargetTargetVersi = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[targetinTargetTargetVersi]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: targetinTargetTargetVersi] (val x: Self) extends AnyVal {
      
      inline def setAndroid(value: TargetVersion): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
      
      inline def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
      
      inline def setBun(value: TargetVersion): Self = StObject.set(x, "bun", value.asInstanceOf[js.Any])
      
      inline def setBunUndefined: Self = StObject.set(x, "bun", js.undefined)
      
      inline def setChrome(value: TargetVersion): Self = StObject.set(x, "chrome", value.asInstanceOf[js.Any])
      
      inline def `setChrome-android`(value: TargetVersion): Self = StObject.set(x, "chrome-android", value.asInstanceOf[js.Any])
      
      inline def `setChrome-androidUndefined`: Self = StObject.set(x, "chrome-android", js.undefined)
      
      inline def setChromeUndefined: Self = StObject.set(x, "chrome", js.undefined)
      
      inline def setDeno(value: TargetVersion): Self = StObject.set(x, "deno", value.asInstanceOf[js.Any])
      
      inline def setDenoUndefined: Self = StObject.set(x, "deno", js.undefined)
      
      inline def setEdge(value: TargetVersion): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
      
      inline def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
      
      inline def setElectron(value: TargetVersion): Self = StObject.set(x, "electron", value.asInstanceOf[js.Any])
      
      inline def setElectronUndefined: Self = StObject.set(x, "electron", js.undefined)
      
      inline def setFirefox(value: TargetVersion): Self = StObject.set(x, "firefox", value.asInstanceOf[js.Any])
      
      inline def `setFirefox-android`(value: TargetVersion): Self = StObject.set(x, "firefox-android", value.asInstanceOf[js.Any])
      
      inline def `setFirefox-androidUndefined`: Self = StObject.set(x, "firefox-android", js.undefined)
      
      inline def setFirefoxUndefined: Self = StObject.set(x, "firefox", js.undefined)
      
      inline def setHermes(value: TargetVersion): Self = StObject.set(x, "hermes", value.asInstanceOf[js.Any])
      
      inline def setHermesUndefined: Self = StObject.set(x, "hermes", js.undefined)
      
      inline def setIe(value: TargetVersion): Self = StObject.set(x, "ie", value.asInstanceOf[js.Any])
      
      inline def setIeUndefined: Self = StObject.set(x, "ie", js.undefined)
      
      inline def setIos(value: TargetVersion): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
      
      inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
      
      inline def setNode(value: TargetVersion): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      inline def setOculus(value: TargetVersion): Self = StObject.set(x, "oculus", value.asInstanceOf[js.Any])
      
      inline def setOculusUndefined: Self = StObject.set(x, "oculus", js.undefined)
      
      inline def setOpera(value: TargetVersion): Self = StObject.set(x, "opera", value.asInstanceOf[js.Any])
      
      inline def `setOpera-android`(value: TargetVersion): Self = StObject.set(x, "opera-android", value.asInstanceOf[js.Any])
      
      inline def `setOpera-androidUndefined`: Self = StObject.set(x, "opera-android", js.undefined)
      
      inline def setOperaUndefined: Self = StObject.set(x, "opera", js.undefined)
      
      inline def setOpera_mobile(value: TargetVersion): Self = StObject.set(x, "opera_mobile", value.asInstanceOf[js.Any])
      
      inline def setOpera_mobileUndefined: Self = StObject.set(x, "opera_mobile", js.undefined)
      
      inline def setPhantom(value: TargetVersion): Self = StObject.set(x, "phantom", value.asInstanceOf[js.Any])
      
      inline def setPhantomUndefined: Self = StObject.set(x, "phantom", js.undefined)
      
      inline def setQuest(value: TargetVersion): Self = StObject.set(x, "quest", value.asInstanceOf[js.Any])
      
      inline def setQuestUndefined: Self = StObject.set(x, "quest", js.undefined)
      
      inline def setReact(value: TargetVersion): Self = StObject.set(x, "react", value.asInstanceOf[js.Any])
      
      inline def `setReact-native`(value: TargetVersion): Self = StObject.set(x, "react-native", value.asInstanceOf[js.Any])
      
      inline def `setReact-nativeUndefined`: Self = StObject.set(x, "react-native", js.undefined)
      
      inline def setReactUndefined: Self = StObject.set(x, "react", js.undefined)
      
      inline def setRhino(value: TargetVersion): Self = StObject.set(x, "rhino", value.asInstanceOf[js.Any])
      
      inline def setRhinoUndefined: Self = StObject.set(x, "rhino", js.undefined)
      
      inline def setSafari(value: TargetVersion): Self = StObject.set(x, "safari", value.asInstanceOf[js.Any])
      
      inline def setSafariUndefined: Self = StObject.set(x, "safari", js.undefined)
      
      inline def setSamsung(value: TargetVersion): Self = StObject.set(x, "samsung", value.asInstanceOf[js.Any])
      
      inline def setSamsungUndefined: Self = StObject.set(x, "samsung", js.undefined)
    }
  }
}
