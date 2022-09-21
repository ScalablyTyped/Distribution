package typings.autoprefixerHGRVcKdE

import typings.autoprefixerHGRVcKdE.anon.Browsers
import typings.autoprefixerHGRVcKdE.anon.From
import typings.autoprefixerHGRVcKdE.autoprefixerHGRVcKdEBooleans.`true`
import typings.autoprefixerHGRVcKdE.autoprefixerHGRVcKdEStrings.`no-2009`
import typings.browserslist.mod.Stats
import typings.postcss.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Plugin & ExportedAPI = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Plugin & ExportedAPI]
  inline def apply(browsers: js.Array[String]): Plugin & ExportedAPI = ^.asInstanceOf[js.Dynamic].apply(browsers.asInstanceOf[js.Any]).asInstanceOf[Plugin & ExportedAPI]
  inline def apply(browsers: js.Array[String], options: Options): Plugin & ExportedAPI = (^.asInstanceOf[js.Dynamic].apply(browsers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Plugin & ExportedAPI]
  inline def apply(options: Options): Plugin & ExportedAPI = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Plugin & ExportedAPI]
  
  @JSImport(".autoprefixer-hGRVcKdE", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** Autoprefixer default browsers */
  @JSImport(".autoprefixer-hGRVcKdE", "defaults")
  @js.native
  def defaults: js.Array[String] = js.native
  inline def defaults_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
  
  /** Inspect with default Autoprefixer */
  @JSImport(".autoprefixer-hGRVcKdE", "info")
  @js.native
  def info: js.Function1[/* options */ js.UndefOr[From], String] = js.native
  inline def info_=(x: js.Function1[/* options */ js.UndefOr[From], String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("info")(x.asInstanceOf[js.Any])
  
  @JSImport(".autoprefixer-hGRVcKdE", "postcss")
  @js.native
  def postcss: `true` = js.native
  inline def postcss_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("postcss")(x.asInstanceOf[js.Any])
  
  @js.native
  trait ExportedAPI extends StObject {
    
    var browsers: String | js.Array[String] = js.native
    
    /** Autoprefixer data */
    var data: Browsers = js.native
    
    /** Autoprefixer default browsers */
    var defaults: js.Array[String] = js.native
    
    /** Inspect with default Autoprefixer */
    def info(): String = js.native
    def info(options: From): String = js.native
    
    var options: Options = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.autoprefixerHGRVcKdE.autoprefixerHGRVcKdEStrings.autoplace
    - typings.autoprefixerHGRVcKdE.autoprefixerHGRVcKdEStrings.`no-autoplace`
  */
  trait GridValue extends StObject
  object GridValue {
    
    inline def autoplace: typings.autoprefixerHGRVcKdE.autoprefixerHGRVcKdEStrings.autoplace = "autoplace".asInstanceOf[typings.autoprefixerHGRVcKdE.autoprefixerHGRVcKdEStrings.autoplace]
    
    inline def `no-autoplace`: typings.autoprefixerHGRVcKdE.autoprefixerHGRVcKdEStrings.`no-autoplace` = "no-autoplace".asInstanceOf[typings.autoprefixerHGRVcKdE.autoprefixerHGRVcKdEStrings.`no-autoplace`]
  }
  
  trait Options extends StObject {
    
    /** should Autoprefixer add prefixes. */
    var add: js.UndefOr[Boolean] = js.undefined
    
    /** should Autoprefixer use Visual Cascade, if CSS is uncompressed */
    var cascade: js.UndefOr[Boolean] = js.undefined
    
    /** environment for `Browserslist` */
    var env: js.UndefOr[String] = js.undefined
    
    /** should Autoprefixer add prefixes for flexbox properties */
    var flexbox: js.UndefOr[Boolean | `no-2009`] = js.undefined
    
    /** should Autoprefixer add IE 10-11 prefixes for Grid Layout properties */
    var grid: js.UndefOr[Boolean | GridValue] = js.undefined
    
    /** do not raise error on unknown browser version in `Browserslist` config. */
    var ignoreUnknownVersions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * list of queries for target browsers.
      * Try to not use it.
      * The best practice is to use `.browserslistrc` config or `browserslist` key in `package.json`
      * to share target browsers with Babel, ESLint and Stylelint
      */
    var overrideBrowserslist: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** should Autoprefixer [remove outdated] prefixes */
    var remove: js.UndefOr[Boolean] = js.undefined
    
    /** custom usage statistics for > 10% in my stats browsers query */
    var stats: js.UndefOr[Stats] = js.undefined
    
    /** should Autoprefixer add prefixes for @supports parameters. */
    var supports: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAdd(value: Boolean): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
      
      inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
      
      inline def setCascade(value: Boolean): Self = StObject.set(x, "cascade", value.asInstanceOf[js.Any])
      
      inline def setCascadeUndefined: Self = StObject.set(x, "cascade", js.undefined)
      
      inline def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setFlexbox(value: Boolean | `no-2009`): Self = StObject.set(x, "flexbox", value.asInstanceOf[js.Any])
      
      inline def setFlexboxUndefined: Self = StObject.set(x, "flexbox", js.undefined)
      
      inline def setGrid(value: Boolean | GridValue): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      inline def setIgnoreUnknownVersions(value: Boolean): Self = StObject.set(x, "ignoreUnknownVersions", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUnknownVersionsUndefined: Self = StObject.set(x, "ignoreUnknownVersions", js.undefined)
      
      inline def setOverrideBrowserslist(value: String | js.Array[String]): Self = StObject.set(x, "overrideBrowserslist", value.asInstanceOf[js.Any])
      
      inline def setOverrideBrowserslistUndefined: Self = StObject.set(x, "overrideBrowserslist", js.undefined)
      
      inline def setOverrideBrowserslistVarargs(value: String*): Self = StObject.set(x, "overrideBrowserslist", js.Array(value*))
      
      inline def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      inline def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      inline def setSupports(value: Boolean): Self = StObject.set(x, "supports", value.asInstanceOf[js.Any])
      
      inline def setSupportsUndefined: Self = StObject.set(x, "supports", js.undefined)
    }
  }
  
  object global {
    
    object NodeJS {
      
      trait ProcessEnv extends StObject {
        
        var AUTOPREFIXER_GRID: js.UndefOr[GridValue] = js.undefined
      }
      object ProcessEnv {
        
        inline def apply(): ProcessEnv = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ProcessEnv]
        }
        
        extension [Self <: ProcessEnv](x: Self) {
          
          inline def setAUTOPREFIXER_GRID(value: GridValue): Self = StObject.set(x, "AUTOPREFIXER_GRID", value.asInstanceOf[js.Any])
          
          inline def setAUTOPREFIXER_GRIDUndefined: Self = StObject.set(x, "AUTOPREFIXER_GRID", js.undefined)
        }
      }
    }
  }
}
