package typings.critters

import typings.critters.crittersStrings.`js-lazy`
import typings.critters.crittersStrings.body
import typings.critters.crittersStrings.debug
import typings.critters.crittersStrings.error
import typings.critters.crittersStrings.info
import typings.critters.crittersStrings.js_
import typings.critters.crittersStrings.media
import typings.critters.crittersStrings.silent
import typings.critters.crittersStrings.swap
import typings.critters.crittersStrings.trace
import typings.critters.crittersStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("critters", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Critters {
    /**
      * Create an instance of Critters with custom options.
      * The `.process()` method can be called repeatedly to re-use this instance and its cache.
      */
    def this(options: Options) = this()
    
    /**
      * Given a stylesheet URL, returns the corresponding CSS asset.
      * Overriding this method requires doing your own URL normalization, so it's generally better to override `readFile()`.
      */
    /* CompleteClass */
    override def getCssAsset(href: String): js.UndefOr[js.Promise[js.UndefOr[String]] | String] = js.native
    
    /**
      * Process an HTML document to inline critical CSS from its stylesheets.
      * @param {string} html String containing a full HTML document to be parsed.
      * @returns {string} A modified copy of the provided HTML with critical CSS inlined.
      */
    /* CompleteClass */
    override def process(html: String): js.Promise[String] = js.native
    
    /**
      * Read the contents of a file from the specified filesystem or disk.
      * Override this method to customize how stylesheets are loaded.
      */
    /* CompleteClass */
    override def readFile(filename: String): js.Promise[String] | String = js.native
  }
  
  trait Critters extends StObject {
    
    /**
      * Given a stylesheet URL, returns the corresponding CSS asset.
      * Overriding this method requires doing your own URL normalization, so it's generally better to override `readFile()`.
      */
    def getCssAsset(href: String): js.UndefOr[js.Promise[js.UndefOr[String]] | String]
    
    /**
      * Process an HTML document to inline critical CSS from its stylesheets.
      * @param {string} html String containing a full HTML document to be parsed.
      * @returns {string} A modified copy of the provided HTML with critical CSS inlined.
      */
    def process(html: String): js.Promise[String]
    
    /**
      * Read the contents of a file from the specified filesystem or disk.
      * Override this method to customize how stylesheets are loaded.
      */
    def readFile(filename: String): js.Promise[String] | String
  }
  object Critters {
    
    inline def apply(
      getCssAsset: String => js.UndefOr[js.Promise[js.UndefOr[String]] | String],
      process: String => js.Promise[String],
      readFile: String => js.Promise[String] | String
    ): Critters = {
      val __obj = js.Dynamic.literal(getCssAsset = js.Any.fromFunction1(getCssAsset), process = js.Any.fromFunction1(process), readFile = js.Any.fromFunction1(readFile))
      __obj.asInstanceOf[Critters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Critters] (val x: Self) extends AnyVal {
      
      inline def setGetCssAsset(value: String => js.UndefOr[js.Promise[js.UndefOr[String]] | String]): Self = StObject.set(x, "getCssAsset", js.Any.fromFunction1(value))
      
      inline def setProcess(value: String => js.Promise[String]): Self = StObject.set(x, "process", js.Any.fromFunction1(value))
      
      inline def setReadFile(value: String => js.Promise[String] | String): Self = StObject.set(x, "readFile", js.Any.fromFunction1(value))
    }
  }
  
  trait Logger extends StObject {
    
    var debug: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.undefined
    
    var error: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.undefined
    
    var info: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.undefined
    
    var trace: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.undefined
    
    var warn: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.undefined
  }
  object Logger {
    
    inline def apply(): Logger = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Logger]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Logger] (val x: Self) extends AnyVal {
      
      inline def setDebug(value: /* message */ String => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setError(value: /* message */ String => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setInfo(value: /* message */ String => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setTrace(value: /* message */ String => Unit): Self = StObject.set(x, "trace", js.Any.fromFunction1(value))
      
      inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
      
      inline def setWarn(value: /* message */ String => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
      
      inline def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var additionalStylesheets: js.UndefOr[js.Array[String]] = js.undefined
    
    var compress: js.UndefOr[Boolean] = js.undefined
    
    var external: js.UndefOr[Boolean] = js.undefined
    
    var fonts: js.UndefOr[Boolean] = js.undefined
    
    var inlineFonts: js.UndefOr[Boolean] = js.undefined
    
    var inlineThreshold: js.UndefOr[Double] = js.undefined
    
    var keyframes: js.UndefOr[String] = js.undefined
    
    var logLevel: js.UndefOr[info | warn | error | trace | debug | silent] = js.undefined
    
    var logger: js.UndefOr[Logger] = js.undefined
    
    var mergeStylesheets: js.UndefOr[Boolean] = js.undefined
    
    var minimumExternalSize: js.UndefOr[Double] = js.undefined
    
    var noscriptFallback: js.UndefOr[Boolean] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var preload: js.UndefOr[body | media | swap | js_ | `js-lazy`] = js.undefined
    
    var preloadFonts: js.UndefOr[Boolean] = js.undefined
    
    var pruneSource: js.UndefOr[Boolean] = js.undefined
    
    var publicPath: js.UndefOr[String] = js.undefined
    
    var reduceInlineStyles: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAdditionalStylesheets(value: js.Array[String]): Self = StObject.set(x, "additionalStylesheets", value.asInstanceOf[js.Any])
      
      inline def setAdditionalStylesheetsUndefined: Self = StObject.set(x, "additionalStylesheets", js.undefined)
      
      inline def setAdditionalStylesheetsVarargs(value: String*): Self = StObject.set(x, "additionalStylesheets", js.Array(value*))
      
      inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      inline def setExternal(value: Boolean): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      inline def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
      
      inline def setFonts(value: Boolean): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
      
      inline def setFontsUndefined: Self = StObject.set(x, "fonts", js.undefined)
      
      inline def setInlineFonts(value: Boolean): Self = StObject.set(x, "inlineFonts", value.asInstanceOf[js.Any])
      
      inline def setInlineFontsUndefined: Self = StObject.set(x, "inlineFonts", js.undefined)
      
      inline def setInlineThreshold(value: Double): Self = StObject.set(x, "inlineThreshold", value.asInstanceOf[js.Any])
      
      inline def setInlineThresholdUndefined: Self = StObject.set(x, "inlineThreshold", js.undefined)
      
      inline def setKeyframes(value: String): Self = StObject.set(x, "keyframes", value.asInstanceOf[js.Any])
      
      inline def setKeyframesUndefined: Self = StObject.set(x, "keyframes", js.undefined)
      
      inline def setLogLevel(value: info | warn | error | trace | debug | silent): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setMergeStylesheets(value: Boolean): Self = StObject.set(x, "mergeStylesheets", value.asInstanceOf[js.Any])
      
      inline def setMergeStylesheetsUndefined: Self = StObject.set(x, "mergeStylesheets", js.undefined)
      
      inline def setMinimumExternalSize(value: Double): Self = StObject.set(x, "minimumExternalSize", value.asInstanceOf[js.Any])
      
      inline def setMinimumExternalSizeUndefined: Self = StObject.set(x, "minimumExternalSize", js.undefined)
      
      inline def setNoscriptFallback(value: Boolean): Self = StObject.set(x, "noscriptFallback", value.asInstanceOf[js.Any])
      
      inline def setNoscriptFallbackUndefined: Self = StObject.set(x, "noscriptFallback", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPreload(value: body | media | swap | js_ | `js-lazy`): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      inline def setPreloadFonts(value: Boolean): Self = StObject.set(x, "preloadFonts", value.asInstanceOf[js.Any])
      
      inline def setPreloadFontsUndefined: Self = StObject.set(x, "preloadFonts", js.undefined)
      
      inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      inline def setPruneSource(value: Boolean): Self = StObject.set(x, "pruneSource", value.asInstanceOf[js.Any])
      
      inline def setPruneSourceUndefined: Self = StObject.set(x, "pruneSource", js.undefined)
      
      inline def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      inline def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
      
      inline def setReduceInlineStyles(value: Boolean): Self = StObject.set(x, "reduceInlineStyles", value.asInstanceOf[js.Any])
      
      inline def setReduceInlineStylesUndefined: Self = StObject.set(x, "reduceInlineStyles", js.undefined)
    }
  }
}
