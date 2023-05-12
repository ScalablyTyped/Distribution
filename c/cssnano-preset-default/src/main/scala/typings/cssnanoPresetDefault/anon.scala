package typings.cssnanoPresetDefault

import typings.browserslist.mod.Stats
import typings.cssnanoPresetDefault.cssnanoPresetDefaultBooleans.`false`
import typings.cssnanoPresetDefault.cssnanoPresetDefaultBooleans.`true`
import typings.cssnanoPresetDefault.cssnanoPresetDefaultStrings.double
import typings.cssnanoPresetDefault.cssnanoPresetDefaultStrings.single
import typings.postcss.mod.PluginCreator
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Exclude extends StObject {
    
    var exclude: js.UndefOr[`true`] = js.undefined
  }
  object Exclude {
    
    inline def apply(): Exclude = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Exclude]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Exclude] (val x: Self) extends AnyVal {
      
      inline def setExclude(value: `true`): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    }
  }
  
  /* Inlined postcss-discard-comments.postcss-discard-comments.Options & {  exclude :true | undefined} */
  trait Optionsexcludetrueundefin extends StObject {
    
    var exclude: js.UndefOr[`true`] = js.undefined
    
    var remove: js.UndefOr[js.Function1[/* s */ String, Boolean]] = js.undefined
    
    var removeAll: js.UndefOr[Boolean] = js.undefined
    
    var removeAllButFirst: js.UndefOr[Boolean] = js.undefined
  }
  object Optionsexcludetrueundefin {
    
    inline def apply(): Optionsexcludetrueundefin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Optionsexcludetrueundefin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Optionsexcludetrueundefin] (val x: Self) extends AnyVal {
      
      inline def setExclude(value: `true`): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setRemove(value: /* s */ String => Boolean): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setRemoveAll(value: Boolean): Self = StObject.set(x, "removeAll", value.asInstanceOf[js.Any])
      
      inline def setRemoveAllButFirst(value: Boolean): Self = StObject.set(x, "removeAllButFirst", value.asInstanceOf[js.Any])
      
      inline def setRemoveAllButFirstUndefined: Self = StObject.set(x, "removeAllButFirst", js.undefined)
      
      inline def setRemoveAllUndefined: Self = StObject.set(x, "removeAll", js.undefined)
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    }
  }
  
  /* Inlined postcss-normalize-charset.postcss-normalize-charset.Options & {  exclude :true | undefined} */
  trait OptionsexcludetrueundefinAdd extends StObject {
    
    var add: js.UndefOr[Boolean] = js.undefined
    
    var exclude: js.UndefOr[`true`] = js.undefined
  }
  object OptionsexcludetrueundefinAdd {
    
    inline def apply(): OptionsexcludetrueundefinAdd = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsexcludetrueundefinAdd]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionsexcludetrueundefinAdd] (val x: Self) extends AnyVal {
      
      inline def setAdd(value: Boolean): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
      
      inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
      
      inline def setExclude(value: `true`): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    }
  }
  
  /* Inlined postcss-convert-values.postcss-convert-values.Options & {  exclude :true | undefined} */
  trait OptionsexcludetrueundefinAngle extends StObject {
    
    var angle: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Path to config file with queries.
      */
    var config: js.UndefOr[String] = js.undefined
    
    /**
      * Disable security checks for extend query.
      */
    var dangerousExtend: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Processing environment. It will be used to take right queries
      * from config file.
      */
    var env: js.UndefOr[String] = js.undefined
    
    var exclude: js.UndefOr[`true`] = js.undefined
    
    /**
      * Do not throw on unknown version in direct query.
      */
    var ignoreUnknownVersions: js.UndefOr[Boolean] = js.undefined
    
    var length: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Alias mobile browsers to the desktop version when Can I Use
      * doesn’t have data about the specified version.
      */
    var mobileToDesktop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Path to processed file. It will be used to find config files.
      */
    var path: js.UndefOr[String | `false`] = js.undefined
    
    var precision: Boolean | Double
    
    /**
      * Custom browser usage statistics for "> 1% in my stats" query.
      */
    var stats: js.UndefOr[Stats | String] = js.undefined
    
    /**
      * Throw an error if env is not found.
      */
    var throwOnMissing: js.UndefOr[Boolean] = js.undefined
    
    var time: js.UndefOr[Boolean] = js.undefined
  }
  object OptionsexcludetrueundefinAngle {
    
    inline def apply(precision: Boolean | Double): OptionsexcludetrueundefinAngle = {
      val __obj = js.Dynamic.literal(precision = precision.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsexcludetrueundefinAngle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionsexcludetrueundefinAngle] (val x: Self) extends AnyVal {
      
      inline def setAngle(value: Boolean): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setDangerousExtend(value: Boolean): Self = StObject.set(x, "dangerousExtend", value.asInstanceOf[js.Any])
      
      inline def setDangerousExtendUndefined: Self = StObject.set(x, "dangerousExtend", js.undefined)
      
      inline def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setExclude(value: `true`): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setIgnoreUnknownVersions(value: Boolean): Self = StObject.set(x, "ignoreUnknownVersions", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUnknownVersionsUndefined: Self = StObject.set(x, "ignoreUnknownVersions", js.undefined)
      
      inline def setLength(value: Boolean): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setMobileToDesktop(value: Boolean): Self = StObject.set(x, "mobileToDesktop", value.asInstanceOf[js.Any])
      
      inline def setMobileToDesktopUndefined: Self = StObject.set(x, "mobileToDesktop", js.undefined)
      
      inline def setPath(value: String | `false`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPrecision(value: Boolean | Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setStats(value: Stats | String): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      inline def setThrowOnMissing(value: Boolean): Self = StObject.set(x, "throwOnMissing", value.asInstanceOf[js.Any])
      
      inline def setThrowOnMissingUndefined: Self = StObject.set(x, "throwOnMissing", js.undefined)
      
      inline def setTime(value: Boolean): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    }
  }
  
  /* Inlined postcss-svgo.postcss-svgo.Options & {  exclude :true | undefined} */
  trait OptionsexcludetrueundefinDatauri extends StObject {
    
    /** Output as Data URI string. */
    var datauri: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataUri */ Any
      ] = js.undefined
    
    var encode: js.UndefOr[Boolean] = js.undefined
    
    var exclude: js.UndefOr[`true`] = js.undefined
    
    /** Precision of floating point numbers. Will be passed to each plugin that suppors this param. */
    var floatPrecision: js.UndefOr[Double] = js.undefined
    
    /** Options for rendering optimized SVG from AST. */
    var js2svg: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringifyOptions */ Any
      ] = js.undefined
    
    /** Pass over SVGs multiple times to ensure all optimizations are applied. */
    var multipass: js.UndefOr[Boolean] = js.undefined
    
    /** Can be used by plugins, for example prefixids */
    var path: js.UndefOr[String] = js.undefined
    
    var plugins: js.UndefOr[js.Array[js.Object]] = js.undefined
  }
  object OptionsexcludetrueundefinDatauri {
    
    inline def apply(): OptionsexcludetrueundefinDatauri = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsexcludetrueundefinDatauri]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionsexcludetrueundefinDatauri] (val x: Self) extends AnyVal {
      
      inline def setDatauri(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataUri */ Any
      ): Self = StObject.set(x, "datauri", value.asInstanceOf[js.Any])
      
      inline def setDatauriUndefined: Self = StObject.set(x, "datauri", js.undefined)
      
      inline def setEncode(value: Boolean): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
      
      inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
      
      inline def setExclude(value: `true`): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setFloatPrecision(value: Double): Self = StObject.set(x, "floatPrecision", value.asInstanceOf[js.Any])
      
      inline def setFloatPrecisionUndefined: Self = StObject.set(x, "floatPrecision", js.undefined)
      
      inline def setJs2svg(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringifyOptions */ Any
      ): Self = StObject.set(x, "js2svg", value.asInstanceOf[js.Any])
      
      inline def setJs2svgUndefined: Self = StObject.set(x, "js2svg", js.undefined)
      
      inline def setMultipass(value: Boolean): Self = StObject.set(x, "multipass", value.asInstanceOf[js.Any])
      
      inline def setMultipassUndefined: Self = StObject.set(x, "multipass", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPlugins(value: js.Array[js.Object]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: js.Object*): Self = StObject.set(x, "plugins", js.Array(value*))
    }
  }
  
  /* Inlined postcss-minify-font-values.postcss-minify-font-values.Options & {  exclude :true | undefined} */
  trait OptionsexcludetrueundefinExclude extends StObject {
    
    var exclude: js.UndefOr[`true`] = js.undefined
    
    var removeAfterKeyword: js.UndefOr[Boolean] = js.undefined
    
    var removeDuplicates: js.UndefOr[Boolean] = js.undefined
    
    var removeQuotes: js.UndefOr[Boolean] = js.undefined
  }
  object OptionsexcludetrueundefinExclude {
    
    inline def apply(): OptionsexcludetrueundefinExclude = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsexcludetrueundefinExclude]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionsexcludetrueundefinExclude] (val x: Self) extends AnyVal {
      
      inline def setExclude(value: `true`): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setRemoveAfterKeyword(value: Boolean): Self = StObject.set(x, "removeAfterKeyword", value.asInstanceOf[js.Any])
      
      inline def setRemoveAfterKeywordUndefined: Self = StObject.set(x, "removeAfterKeyword", js.undefined)
      
      inline def setRemoveDuplicates(value: Boolean): Self = StObject.set(x, "removeDuplicates", value.asInstanceOf[js.Any])
      
      inline def setRemoveDuplicatesUndefined: Self = StObject.set(x, "removeDuplicates", js.undefined)
      
      inline def setRemoveQuotes(value: Boolean): Self = StObject.set(x, "removeQuotes", value.asInstanceOf[js.Any])
      
      inline def setRemoveQuotesUndefined: Self = StObject.set(x, "removeQuotes", js.undefined)
    }
  }
  
  /* Inlined postcss-normalize-string.postcss-normalize-string.Options & {  exclude :true | undefined} */
  trait OptionsexcludetrueundefinPreferredQuote extends StObject {
    
    var exclude: js.UndefOr[`true`] = js.undefined
    
    var preferredQuote: js.UndefOr[double | single] = js.undefined
  }
  object OptionsexcludetrueundefinPreferredQuote {
    
    inline def apply(): OptionsexcludetrueundefinPreferredQuote = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsexcludetrueundefinPreferredQuote]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionsexcludetrueundefinPreferredQuote] (val x: Self) extends AnyVal {
      
      inline def setExclude(value: `true`): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setPreferredQuote(value: double | single): Self = StObject.set(x, "preferredQuote", value.asInstanceOf[js.Any])
      
      inline def setPreferredQuoteUndefined: Self = StObject.set(x, "preferredQuote", js.undefined)
    }
  }
  
  trait Plugins extends StObject {
    
    var plugins: js.Array[js.Tuple2[PluginCreator[Any], js.UndefOr[Boolean | (Record[String, Any])]]]
  }
  object Plugins {
    
    inline def apply(plugins: js.Array[js.Tuple2[PluginCreator[Any], js.UndefOr[Boolean | (Record[String, Any])]]]): Plugins = {
      val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any])
      __obj.asInstanceOf[Plugins]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Plugins] (val x: Self) extends AnyVal {
      
      inline def setPlugins(value: js.Array[js.Tuple2[PluginCreator[Any], js.UndefOr[Boolean | (Record[String, Any])]]]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsVarargs(value: (js.Tuple2[PluginCreator[Any], js.UndefOr[Boolean | (Record[String, Any])]])*): Self = StObject.set(x, "plugins", js.Array(value*))
    }
  }
  
  /* Inlined postcss-calc.postcss-calc.PostCssCalcOptions & {  exclude :true | undefined} */
  trait PostCssCalcOptionsexclude extends StObject {
    
    var exclude: js.UndefOr[`true`] = js.undefined
    
    var mediaQueries: js.UndefOr[Boolean] = js.undefined
    
    var precision: js.UndefOr[Double | `false`] = js.undefined
    
    var preserve: js.UndefOr[Boolean] = js.undefined
    
    var selectors: js.UndefOr[Boolean] = js.undefined
    
    var warnWhenCannotResolve: js.UndefOr[Boolean] = js.undefined
  }
  object PostCssCalcOptionsexclude {
    
    inline def apply(): PostCssCalcOptionsexclude = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PostCssCalcOptionsexclude]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PostCssCalcOptionsexclude] (val x: Self) extends AnyVal {
      
      inline def setExclude(value: `true`): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setMediaQueries(value: Boolean): Self = StObject.set(x, "mediaQueries", value.asInstanceOf[js.Any])
      
      inline def setMediaQueriesUndefined: Self = StObject.set(x, "mediaQueries", js.undefined)
      
      inline def setPrecision(value: Double | `false`): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
      
      inline def setPreserveUndefined: Self = StObject.set(x, "preserve", js.undefined)
      
      inline def setSelectors(value: Boolean): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
      
      inline def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
      
      inline def setWarnWhenCannotResolve(value: Boolean): Self = StObject.set(x, "warnWhenCannotResolve", value.asInstanceOf[js.Any])
      
      inline def setWarnWhenCannotResolveUndefined: Self = StObject.set(x, "warnWhenCannotResolve", js.undefined)
    }
  }
}
