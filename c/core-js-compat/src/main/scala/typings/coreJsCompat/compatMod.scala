package typings.coreJsCompat

import org.scalablytyped.runtime.StringDictionary
import typings.coreJsCompat.sharedMod.ModuleName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compatMod {
  
  inline def apply(): CompatOutput = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[CompatOutput]
  inline def apply(options: CompatOptions): CompatOutput = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[CompatOutput]
  
  @JSImport("core-js-compat/compat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type BrowserslistQuery = String | js.Array[String]
  
  trait CompatOptions extends StObject {
    
    /** a blacklist, entry / module / namespace / an array of them, by default - empty list */
    var exclude: js.UndefOr[Modules] = js.undefined
    
    /**
      * @deprecated use `modules` instead
      */
    var filter: js.UndefOr[Modules] = js.undefined
    
    /** inverse of the result, shows modules that are NOT required for the target environment */
    var inverse: js.UndefOr[Boolean] = js.undefined
    
    /** entry / module / namespace / an array of them, by default - all `core-js` modules */
    var modules: js.UndefOr[Modules] = js.undefined
    
    /** optional browserslist or core-js-compat format query */
    var targets: js.UndefOr[Targets | BrowserslistQuery] = js.undefined
    
    /** used `core-js` version, by default the latest */
    var version: js.UndefOr[String] = js.undefined
  }
  object CompatOptions {
    
    inline def apply(): CompatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompatOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompatOptions] (val x: Self) extends AnyVal {
      
      inline def setExclude(value: Modules): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: StringOrRegExp*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setFilter(value: Modules): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFilterVarargs(value: StringOrRegExp*): Self = StObject.set(x, "filter", js.Array(value*))
      
      inline def setInverse(value: Boolean): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
      
      inline def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
      
      inline def setModules(value: Modules): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      inline def setModulesVarargs(value: StringOrRegExp*): Self = StObject.set(x, "modules", js.Array(value*))
      
      inline def setTargets(value: Targets | BrowserslistQuery): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
      
      inline def setTargetsVarargs(value: String*): Self = StObject.set(x, "targets", js.Array(value*))
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait CompatOutput extends StObject {
    
    /** array of required modules */
    var list: js.Array[ModuleName]
    
    /** object with targets for each module */
    var targets: StringDictionary[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ target in core-js-compat.core-js-compat/shared.Target ]:? core-js-compat.core-js-compat/shared.TargetVersion} */ js.Any
      ]
  }
  object CompatOutput {
    
    inline def apply(
      list: js.Array[ModuleName],
      targets: StringDictionary[
          /* import warning: importer.ImportType#apply Failed type conversion: {[ target in core-js-compat.core-js-compat/shared.Target ]:? core-js-compat.core-js-compat/shared.TargetVersion} */ js.Any
        ]
    ): CompatOutput = {
      val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompatOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompatOutput] (val x: Self) extends AnyVal {
      
      inline def setList(value: js.Array[ModuleName]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListVarargs(value: ModuleName*): Self = StObject.set(x, "list", js.Array(value*))
      
      inline def setTargets(
        value: StringDictionary[
              /* import warning: importer.ImportType#apply Failed type conversion: {[ target in core-js-compat.core-js-compat/shared.Target ]:? core-js-compat.core-js-compat/shared.TargetVersion} */ js.Any
            ]
      ): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ target in core-js-compat.core-js-compat/shared.Target ]:? string | number} */
  trait Environments extends StObject {
    
    var android: js.UndefOr[String | Double] = js.undefined
    
    var bun: js.UndefOr[String | Double] = js.undefined
    
    var chrome: js.UndefOr[String | Double] = js.undefined
    
    var `chrome-android`: js.UndefOr[String | Double] = js.undefined
    
    var deno: js.UndefOr[String | Double] = js.undefined
    
    var edge: js.UndefOr[String | Double] = js.undefined
    
    var electron: js.UndefOr[String | Double] = js.undefined
    
    var firefox: js.UndefOr[String | Double] = js.undefined
    
    var `firefox-android`: js.UndefOr[String | Double] = js.undefined
    
    var hermes: js.UndefOr[String | Double] = js.undefined
    
    var ie: js.UndefOr[String | Double] = js.undefined
    
    var ios: js.UndefOr[String | Double] = js.undefined
    
    var node: js.UndefOr[String | Double] = js.undefined
    
    var oculus: js.UndefOr[String | Double] = js.undefined
    
    var opera: js.UndefOr[String | Double] = js.undefined
    
    var `opera-android`: js.UndefOr[String | Double] = js.undefined
    
    var opera_mobile: js.UndefOr[String | Double] = js.undefined
    
    var phantom: js.UndefOr[String | Double] = js.undefined
    
    var quest: js.UndefOr[String | Double] = js.undefined
    
    var react: js.UndefOr[String | Double] = js.undefined
    
    var `react-native`: js.UndefOr[String | Double] = js.undefined
    
    var rhino: js.UndefOr[String | Double] = js.undefined
    
    var safari: js.UndefOr[String | Double] = js.undefined
    
    var samsung: js.UndefOr[String | Double] = js.undefined
  }
  object Environments {
    
    inline def apply(): Environments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Environments]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Environments] (val x: Self) extends AnyVal {
      
      inline def setAndroid(value: String | Double): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
      
      inline def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
      
      inline def setBun(value: String | Double): Self = StObject.set(x, "bun", value.asInstanceOf[js.Any])
      
      inline def setBunUndefined: Self = StObject.set(x, "bun", js.undefined)
      
      inline def setChrome(value: String | Double): Self = StObject.set(x, "chrome", value.asInstanceOf[js.Any])
      
      inline def `setChrome-android`(value: String | Double): Self = StObject.set(x, "chrome-android", value.asInstanceOf[js.Any])
      
      inline def `setChrome-androidUndefined`: Self = StObject.set(x, "chrome-android", js.undefined)
      
      inline def setChromeUndefined: Self = StObject.set(x, "chrome", js.undefined)
      
      inline def setDeno(value: String | Double): Self = StObject.set(x, "deno", value.asInstanceOf[js.Any])
      
      inline def setDenoUndefined: Self = StObject.set(x, "deno", js.undefined)
      
      inline def setEdge(value: String | Double): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
      
      inline def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
      
      inline def setElectron(value: String | Double): Self = StObject.set(x, "electron", value.asInstanceOf[js.Any])
      
      inline def setElectronUndefined: Self = StObject.set(x, "electron", js.undefined)
      
      inline def setFirefox(value: String | Double): Self = StObject.set(x, "firefox", value.asInstanceOf[js.Any])
      
      inline def `setFirefox-android`(value: String | Double): Self = StObject.set(x, "firefox-android", value.asInstanceOf[js.Any])
      
      inline def `setFirefox-androidUndefined`: Self = StObject.set(x, "firefox-android", js.undefined)
      
      inline def setFirefoxUndefined: Self = StObject.set(x, "firefox", js.undefined)
      
      inline def setHermes(value: String | Double): Self = StObject.set(x, "hermes", value.asInstanceOf[js.Any])
      
      inline def setHermesUndefined: Self = StObject.set(x, "hermes", js.undefined)
      
      inline def setIe(value: String | Double): Self = StObject.set(x, "ie", value.asInstanceOf[js.Any])
      
      inline def setIeUndefined: Self = StObject.set(x, "ie", js.undefined)
      
      inline def setIos(value: String | Double): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
      
      inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
      
      inline def setNode(value: String | Double): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      inline def setOculus(value: String | Double): Self = StObject.set(x, "oculus", value.asInstanceOf[js.Any])
      
      inline def setOculusUndefined: Self = StObject.set(x, "oculus", js.undefined)
      
      inline def setOpera(value: String | Double): Self = StObject.set(x, "opera", value.asInstanceOf[js.Any])
      
      inline def `setOpera-android`(value: String | Double): Self = StObject.set(x, "opera-android", value.asInstanceOf[js.Any])
      
      inline def `setOpera-androidUndefined`: Self = StObject.set(x, "opera-android", js.undefined)
      
      inline def setOperaUndefined: Self = StObject.set(x, "opera", js.undefined)
      
      inline def setOpera_mobile(value: String | Double): Self = StObject.set(x, "opera_mobile", value.asInstanceOf[js.Any])
      
      inline def setOpera_mobileUndefined: Self = StObject.set(x, "opera_mobile", js.undefined)
      
      inline def setPhantom(value: String | Double): Self = StObject.set(x, "phantom", value.asInstanceOf[js.Any])
      
      inline def setPhantomUndefined: Self = StObject.set(x, "phantom", js.undefined)
      
      inline def setQuest(value: String | Double): Self = StObject.set(x, "quest", value.asInstanceOf[js.Any])
      
      inline def setQuestUndefined: Self = StObject.set(x, "quest", js.undefined)
      
      inline def setReact(value: String | Double): Self = StObject.set(x, "react", value.asInstanceOf[js.Any])
      
      inline def `setReact-native`(value: String | Double): Self = StObject.set(x, "react-native", value.asInstanceOf[js.Any])
      
      inline def `setReact-nativeUndefined`: Self = StObject.set(x, "react-native", js.undefined)
      
      inline def setReactUndefined: Self = StObject.set(x, "react", js.undefined)
      
      inline def setRhino(value: String | Double): Self = StObject.set(x, "rhino", value.asInstanceOf[js.Any])
      
      inline def setRhinoUndefined: Self = StObject.set(x, "rhino", js.undefined)
      
      inline def setSafari(value: String | Double): Self = StObject.set(x, "safari", value.asInstanceOf[js.Any])
      
      inline def setSafariUndefined: Self = StObject.set(x, "safari", js.undefined)
      
      inline def setSamsung(value: String | Double): Self = StObject.set(x, "samsung", value.asInstanceOf[js.Any])
      
      inline def setSamsungUndefined: Self = StObject.set(x, "samsung", js.undefined)
    }
  }
  
  type Modules = StringOrRegExp | js.Array[StringOrRegExp]
  
  type StringOrRegExp = String | js.RegExp
  
  /* Inlined core-js-compat.core-js-compat/compat.Environments & {  browsers :core-js-compat.core-js-compat/compat.Environments | core-js-compat.core-js-compat/compat.BrowserslistQuery | undefined,   esmodules :boolean | undefined} */
  trait Targets extends StObject {
    
    var android: js.UndefOr[String | Double] = js.undefined
    
    var browsers: js.UndefOr[Environments | BrowserslistQuery] = js.undefined
    
    var bun: js.UndefOr[String | Double] = js.undefined
    
    var chrome: js.UndefOr[String | Double] = js.undefined
    
    var `chrome-android`: js.UndefOr[String | Double] = js.undefined
    
    var deno: js.UndefOr[String | Double] = js.undefined
    
    var edge: js.UndefOr[String | Double] = js.undefined
    
    var electron: js.UndefOr[String | Double] = js.undefined
    
    var esmodules: js.UndefOr[Boolean] = js.undefined
    
    var firefox: js.UndefOr[String | Double] = js.undefined
    
    var `firefox-android`: js.UndefOr[String | Double] = js.undefined
    
    var hermes: js.UndefOr[String | Double] = js.undefined
    
    var ie: js.UndefOr[String | Double] = js.undefined
    
    var ios: js.UndefOr[String | Double] = js.undefined
    
    var node: js.UndefOr[String | Double] = js.undefined
    
    var oculus: js.UndefOr[String | Double] = js.undefined
    
    var opera: js.UndefOr[String | Double] = js.undefined
    
    var `opera-android`: js.UndefOr[String | Double] = js.undefined
    
    var opera_mobile: js.UndefOr[String | Double] = js.undefined
    
    var phantom: js.UndefOr[String | Double] = js.undefined
    
    var quest: js.UndefOr[String | Double] = js.undefined
    
    var react: js.UndefOr[String | Double] = js.undefined
    
    var `react-native`: js.UndefOr[String | Double] = js.undefined
    
    var rhino: js.UndefOr[String | Double] = js.undefined
    
    var safari: js.UndefOr[String | Double] = js.undefined
    
    var samsung: js.UndefOr[String | Double] = js.undefined
  }
  object Targets {
    
    inline def apply(): Targets = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Targets]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Targets] (val x: Self) extends AnyVal {
      
      inline def setAndroid(value: String | Double): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
      
      inline def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
      
      inline def setBrowsers(value: Environments | BrowserslistQuery): Self = StObject.set(x, "browsers", value.asInstanceOf[js.Any])
      
      inline def setBrowsersUndefined: Self = StObject.set(x, "browsers", js.undefined)
      
      inline def setBrowsersVarargs(value: String*): Self = StObject.set(x, "browsers", js.Array(value*))
      
      inline def setBun(value: String | Double): Self = StObject.set(x, "bun", value.asInstanceOf[js.Any])
      
      inline def setBunUndefined: Self = StObject.set(x, "bun", js.undefined)
      
      inline def setChrome(value: String | Double): Self = StObject.set(x, "chrome", value.asInstanceOf[js.Any])
      
      inline def `setChrome-android`(value: String | Double): Self = StObject.set(x, "chrome-android", value.asInstanceOf[js.Any])
      
      inline def `setChrome-androidUndefined`: Self = StObject.set(x, "chrome-android", js.undefined)
      
      inline def setChromeUndefined: Self = StObject.set(x, "chrome", js.undefined)
      
      inline def setDeno(value: String | Double): Self = StObject.set(x, "deno", value.asInstanceOf[js.Any])
      
      inline def setDenoUndefined: Self = StObject.set(x, "deno", js.undefined)
      
      inline def setEdge(value: String | Double): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
      
      inline def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
      
      inline def setElectron(value: String | Double): Self = StObject.set(x, "electron", value.asInstanceOf[js.Any])
      
      inline def setElectronUndefined: Self = StObject.set(x, "electron", js.undefined)
      
      inline def setEsmodules(value: Boolean): Self = StObject.set(x, "esmodules", value.asInstanceOf[js.Any])
      
      inline def setEsmodulesUndefined: Self = StObject.set(x, "esmodules", js.undefined)
      
      inline def setFirefox(value: String | Double): Self = StObject.set(x, "firefox", value.asInstanceOf[js.Any])
      
      inline def `setFirefox-android`(value: String | Double): Self = StObject.set(x, "firefox-android", value.asInstanceOf[js.Any])
      
      inline def `setFirefox-androidUndefined`: Self = StObject.set(x, "firefox-android", js.undefined)
      
      inline def setFirefoxUndefined: Self = StObject.set(x, "firefox", js.undefined)
      
      inline def setHermes(value: String | Double): Self = StObject.set(x, "hermes", value.asInstanceOf[js.Any])
      
      inline def setHermesUndefined: Self = StObject.set(x, "hermes", js.undefined)
      
      inline def setIe(value: String | Double): Self = StObject.set(x, "ie", value.asInstanceOf[js.Any])
      
      inline def setIeUndefined: Self = StObject.set(x, "ie", js.undefined)
      
      inline def setIos(value: String | Double): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
      
      inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
      
      inline def setNode(value: String | Double): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      inline def setOculus(value: String | Double): Self = StObject.set(x, "oculus", value.asInstanceOf[js.Any])
      
      inline def setOculusUndefined: Self = StObject.set(x, "oculus", js.undefined)
      
      inline def setOpera(value: String | Double): Self = StObject.set(x, "opera", value.asInstanceOf[js.Any])
      
      inline def `setOpera-android`(value: String | Double): Self = StObject.set(x, "opera-android", value.asInstanceOf[js.Any])
      
      inline def `setOpera-androidUndefined`: Self = StObject.set(x, "opera-android", js.undefined)
      
      inline def setOperaUndefined: Self = StObject.set(x, "opera", js.undefined)
      
      inline def setOpera_mobile(value: String | Double): Self = StObject.set(x, "opera_mobile", value.asInstanceOf[js.Any])
      
      inline def setOpera_mobileUndefined: Self = StObject.set(x, "opera_mobile", js.undefined)
      
      inline def setPhantom(value: String | Double): Self = StObject.set(x, "phantom", value.asInstanceOf[js.Any])
      
      inline def setPhantomUndefined: Self = StObject.set(x, "phantom", js.undefined)
      
      inline def setQuest(value: String | Double): Self = StObject.set(x, "quest", value.asInstanceOf[js.Any])
      
      inline def setQuestUndefined: Self = StObject.set(x, "quest", js.undefined)
      
      inline def setReact(value: String | Double): Self = StObject.set(x, "react", value.asInstanceOf[js.Any])
      
      inline def `setReact-native`(value: String | Double): Self = StObject.set(x, "react-native", value.asInstanceOf[js.Any])
      
      inline def `setReact-nativeUndefined`: Self = StObject.set(x, "react-native", js.undefined)
      
      inline def setReactUndefined: Self = StObject.set(x, "react", js.undefined)
      
      inline def setRhino(value: String | Double): Self = StObject.set(x, "rhino", value.asInstanceOf[js.Any])
      
      inline def setRhinoUndefined: Self = StObject.set(x, "rhino", js.undefined)
      
      inline def setSafari(value: String | Double): Self = StObject.set(x, "safari", value.asInstanceOf[js.Any])
      
      inline def setSafariUndefined: Self = StObject.set(x, "safari", js.undefined)
      
      inline def setSamsung(value: String | Double): Self = StObject.set(x, "samsung", value.asInstanceOf[js.Any])
      
      inline def setSamsungUndefined: Self = StObject.set(x, "samsung", js.undefined)
    }
  }
}
