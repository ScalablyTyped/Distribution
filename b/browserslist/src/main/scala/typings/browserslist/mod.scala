package typings.browserslist

import org.scalablytyped.runtime.StringDictionary
import typings.browserslist.browserslistBooleans.`false`
import typings.browserslist.browserslistBooleans.`true`
import typings.browserslist.browserslistStrings.and
import typings.browserslist.browserslistStrings.or
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): js.Array[String] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Array[String]]
  inline def apply(queries: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].apply(queries.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def apply(queries: String, opts: Options): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(queries.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def apply(queries: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].apply(queries.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def apply(queries: js.Array[String], opts: Options): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(queries.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def apply(queries: Null, opts: Options): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(queries.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def apply(queries: Unit, opts: Options): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(queries.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @JSImport("browserslist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearCaches(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCaches")().asInstanceOf[Unit]
  
  /**
    * Return browsers market coverage.
    *
    * ```js
    * browserslist.coverage(browserslist('> 1% in US'), 'US') //=> 83.1
    * ```
    *
    * @param browsers Browsers names in Can I Use.
    * @param stats Which statistics should be used.
    * @returns Total market coverage for all selected browsers.
    */
  inline def coverage(browsers: js.Array[String]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("coverage")(browsers.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def coverage(browsers: js.Array[String], stats: StatsOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("coverage")(browsers.asInstanceOf[js.Any], stats.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Default browsers query
    */
  @JSImport("browserslist", "defaults")
  @js.native
  def defaults: js.Array[String] = js.native
  inline def defaults_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
  
  inline def findConfig(pathSegments: String*): js.UndefOr[Config] = ^.asInstanceOf[js.Dynamic].applyDynamic("findConfig")(pathSegments.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.UndefOr[Config]]
  
  inline def loadConfig(options: LoadConfigOptions): js.UndefOr[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadConfig")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[String]]]
  
  @JSImport("browserslist", "nodeVersions")
  @js.native
  def nodeVersions: js.Array[String] = js.native
  inline def nodeVersions_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeVersions")(x.asInstanceOf[js.Any])
  
  /**
    * Get queries AST to analyze the config content.
    *
    * @param queries Browser queries.
    * @param opts Options.
    * @returns An array of the data of each query in the config.
    */
  inline def parse(): js.Array[Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[js.Array[Query]]
  inline def parse(queries: String): js.Array[Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(queries.asInstanceOf[js.Any]).asInstanceOf[js.Array[Query]]
  inline def parse(queries: String, opts: Options): js.Array[Query] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(queries.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[Query]]
  inline def parse(queries: js.Array[String]): js.Array[Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(queries.asInstanceOf[js.Any]).asInstanceOf[js.Array[Query]]
  inline def parse(queries: js.Array[String], opts: Options): js.Array[Query] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(queries.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[Query]]
  inline def parse(queries: Null, opts: Options): js.Array[Query] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(queries.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[Query]]
  inline def parse(queries: Unit, opts: Options): js.Array[Query] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(queries.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[Query]]
  
  inline def parseConfig(string: String): Config = ^.asInstanceOf[js.Dynamic].applyDynamic("parseConfig")(string.asInstanceOf[js.Any]).asInstanceOf[Config]
  
  inline def readConfig(file: String): Config = ^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(file.asInstanceOf[js.Any]).asInstanceOf[Config]
  
  object usage {
    
    @JSImport("browserslist", "usage")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("browserslist", "usage.custom")
    @js.native
    def custom: js.UndefOr[Usage_ | Null] = js.native
    inline def custom_=(x: js.UndefOr[Usage_ | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("custom")(x.asInstanceOf[js.Any])
    
    @JSImport("browserslist", "usage.global")
    @js.native
    def global: js.UndefOr[Usage_] = js.native
    inline def global_=(x: js.UndefOr[Usage_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("global")(x.asInstanceOf[js.Any])
  }
  
  trait Config
    extends StObject
       with /* section */ StringDictionary[js.UndefOr[js.Array[String]]] {
    
    var defaults: js.Array[String]
  }
  object Config {
    
    inline def apply(defaults: js.Array[String]): Config = {
      val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      inline def setDefaults(value: js.Array[String]): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def setDefaultsVarargs(value: String*): Self = StObject.set(x, "defaults", js.Array(value*))
    }
  }
  
  trait LoadConfigOptions extends StObject {
    
    var config: js.UndefOr[String] = js.undefined
    
    var env: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
  }
  object LoadConfigOptions {
    
    inline def apply(): LoadConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoadConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
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
    
    /**
      * Do not throw on unknown version in direct query.
      */
    var ignoreUnknownVersions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Alias mobile browsers to the desktop version when Can I Use
      * doesn’t have data about the specified version.
      */
    var mobileToDesktop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Path to processed file. It will be used to find config files.
      */
    var path: js.UndefOr[String | `false`] = js.undefined
    
    /**
      * Custom browser usage statistics for "> 1% in my stats" query.
      */
    var stats: js.UndefOr[Stats | String] = js.undefined
    
    /**
      * Throw an error if env is not found.
      */
    var throwOnMissing: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setDangerousExtend(value: Boolean): Self = StObject.set(x, "dangerousExtend", value.asInstanceOf[js.Any])
      
      inline def setDangerousExtendUndefined: Self = StObject.set(x, "dangerousExtend", js.undefined)
      
      inline def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setIgnoreUnknownVersions(value: Boolean): Self = StObject.set(x, "ignoreUnknownVersions", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUnknownVersionsUndefined: Self = StObject.set(x, "ignoreUnknownVersions", js.undefined)
      
      inline def setMobileToDesktop(value: Boolean): Self = StObject.set(x, "mobileToDesktop", value.asInstanceOf[js.Any])
      
      inline def setMobileToDesktopUndefined: Self = StObject.set(x, "mobileToDesktop", js.undefined)
      
      inline def setPath(value: String | `false`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setStats(value: Stats | String): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      inline def setThrowOnMissing(value: Boolean): Self = StObject.set(x, "throwOnMissing", value.asInstanceOf[js.Any])
      
      inline def setThrowOnMissingUndefined: Self = StObject.set(x, "throwOnMissing", js.undefined)
    }
  }
  
  trait Query extends StObject {
    
    var compose: or | and
    
    var not: js.UndefOr[`true`] = js.undefined
    
    var query: String
    
    var `type`: String
  }
  object Query {
    
    inline def apply(compose: or | and, query: String, `type`: String): Query = {
      val __obj = js.Dynamic.literal(compose = compose.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Query]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Query] (val x: Self) extends AnyVal {
      
      inline def setCompose(value: or | and): Self = StObject.set(x, "compose", value.asInstanceOf[js.Any])
      
      inline def setNot(value: `true`): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
      
      inline def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Stats = StringDictionary[StringDictionary[Double]]
  
  /**
    * Which statistics should be used. Country code or custom statistics.
    * Pass `"my stats"` to load statistics from `Browserslist` files.
    */
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.browserslist.browserslistStrings.`my stats`
    - typings.browserslist.mod.Stats
    - typings.browserslist.anon.DataByBrowser
  */
  type StatsOptions = _StatsOptions | String | Stats
  
  type Usage_ = StringDictionary[Double]
  
  trait _StatsOptions extends StObject
  
  object global {
    
    object NodeJS {
      
      trait ProcessEnv extends StObject {
        
        var BROWSERSLIST: js.UndefOr[String] = js.undefined
        
        var BROWSERSLIST_CONFIG: js.UndefOr[String] = js.undefined
        
        var BROWSERSLIST_DANGEROUS_EXTEND: js.UndefOr[String] = js.undefined
        
        var BROWSERSLIST_DISABLE_CACHE: js.UndefOr[String] = js.undefined
        
        var BROWSERSLIST_ENV: js.UndefOr[String] = js.undefined
        
        var BROWSERSLIST_IGNORE_OLD_DATA: js.UndefOr[String] = js.undefined
        
        var BROWSERSLIST_STATS: js.UndefOr[String] = js.undefined
      }
      object ProcessEnv {
        
        inline def apply(): ProcessEnv = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ProcessEnv]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: ProcessEnv] (val x: Self) extends AnyVal {
          
          inline def setBROWSERSLIST(value: String): Self = StObject.set(x, "BROWSERSLIST", value.asInstanceOf[js.Any])
          
          inline def setBROWSERSLISTUndefined: Self = StObject.set(x, "BROWSERSLIST", js.undefined)
          
          inline def setBROWSERSLIST_CONFIG(value: String): Self = StObject.set(x, "BROWSERSLIST_CONFIG", value.asInstanceOf[js.Any])
          
          inline def setBROWSERSLIST_CONFIGUndefined: Self = StObject.set(x, "BROWSERSLIST_CONFIG", js.undefined)
          
          inline def setBROWSERSLIST_DANGEROUS_EXTEND(value: String): Self = StObject.set(x, "BROWSERSLIST_DANGEROUS_EXTEND", value.asInstanceOf[js.Any])
          
          inline def setBROWSERSLIST_DANGEROUS_EXTENDUndefined: Self = StObject.set(x, "BROWSERSLIST_DANGEROUS_EXTEND", js.undefined)
          
          inline def setBROWSERSLIST_DISABLE_CACHE(value: String): Self = StObject.set(x, "BROWSERSLIST_DISABLE_CACHE", value.asInstanceOf[js.Any])
          
          inline def setBROWSERSLIST_DISABLE_CACHEUndefined: Self = StObject.set(x, "BROWSERSLIST_DISABLE_CACHE", js.undefined)
          
          inline def setBROWSERSLIST_ENV(value: String): Self = StObject.set(x, "BROWSERSLIST_ENV", value.asInstanceOf[js.Any])
          
          inline def setBROWSERSLIST_ENVUndefined: Self = StObject.set(x, "BROWSERSLIST_ENV", js.undefined)
          
          inline def setBROWSERSLIST_IGNORE_OLD_DATA(value: String): Self = StObject.set(x, "BROWSERSLIST_IGNORE_OLD_DATA", value.asInstanceOf[js.Any])
          
          inline def setBROWSERSLIST_IGNORE_OLD_DATAUndefined: Self = StObject.set(x, "BROWSERSLIST_IGNORE_OLD_DATA", js.undefined)
          
          inline def setBROWSERSLIST_STATS(value: String): Self = StObject.set(x, "BROWSERSLIST_STATS", value.asInstanceOf[js.Any])
          
          inline def setBROWSERSLIST_STATSUndefined: Self = StObject.set(x, "BROWSERSLIST_STATS", js.undefined)
        }
      }
    }
  }
}
