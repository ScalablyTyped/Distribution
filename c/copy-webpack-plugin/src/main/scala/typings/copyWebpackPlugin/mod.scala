package typings.copyWebpackPlugin

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.copyWebpackPlugin.copyWebpackPluginStrings.dir
import typings.copyWebpackPlugin.copyWebpackPluginStrings.file
import typings.copyWebpackPlugin.copyWebpackPluginStrings.template
import typings.node.Buffer
import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("copy-webpack-plugin", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Plugin {
    def this(options: CopyPluginOptions) = this()
  }
  @JSImport("copy-webpack-plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Object & CopyPlugin = js.native
  
  @js.native
  trait CopyPlugin
    extends StObject
       with Instantiable0[Plugin]
       with Instantiable1[/* options */ CopyPluginOptions, Plugin]
  
  trait CopyPluginOptions extends StObject {
    
    var options: js.UndefOr[Options] = js.undefined
    
    var patterns: js.Array[StringPattern | ObjectPattern]
  }
  object CopyPluginOptions {
    
    inline def apply(patterns: js.Array[StringPattern | ObjectPattern]): CopyPluginOptions = {
      val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
      __obj.asInstanceOf[CopyPluginOptions]
    }
    
    extension [Self <: CopyPluginOptions](x: Self) {
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPatterns(value: js.Array[StringPattern | ObjectPattern]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      inline def setPatternsVarargs(value: (StringPattern | ObjectPattern)*): Self = StObject.set(x, "patterns", js.Array(value :_*))
    }
  }
  
  trait ObjectPattern extends StObject {
    
    /**
      * Enable/disable and configure caching. Default path to cache directory: node_modules/.cache/copy-webpack-plugin.
      * @default false
      */
    var cacheTransform: js.UndefOr[Boolean | String | js.Object] = js.undefined
    
    /**
      * A path that determines how to interpret the `from` path.
      * {@link https://webpack.js.org/plugins/copy-webpack-plugin/#context}
      * @default options.context | compiler.options.context
      */
    var context: js.UndefOr[String] = js.undefined
    
    /**
      * Allows to filter copied assets.
      */
    var filter: js.UndefOr[js.Function1[/* resourcePath */ String, Boolean]] = js.undefined
    
    /**
      * Removes all directory references and only copies file names. (default: `false`)
      * If files have the same name, the result is non-deterministic.
      * {@link https://webpack.js.org/plugins/copy-webpack-plugin/#flatten}
      * @default false
      */
    var flatten: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Overwrites files already in `compilation.assets` (usually added by other plugins.
      * {@link https://webpack.js.org/plugins/copy-webpack-plugin/#force}
      * @default false
      */
    var force: js.UndefOr[Boolean] = js.undefined
    
    /**
      * File source path or glob
      * {@link https://webpack.js.org/plugins/copy-webpack-plugin/#from}
      * @default undefined
      */
    var from: String
    
    /**
      * Allows to configure the glob pattern matching library used by the plugin.
      * {@link https://webpack.js.org/plugins/copy-webpack-plugin/#globoptions}
      */
    var globOptions: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Doesn't generate an error on missing file(s);
      * @default false
      */
    var noErrorOnMissing: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Path or webpack file-loader patterns. defaults:
      * output root if `from` is file or dir.
      * resolved glob path if `from` is glob.
      * {@link https://webpack.js.org/plugins/copy-webpack-plugin/#to}
      * @default compiler.options.output
      */
    var to: js.UndefOr[String] = js.undefined
    
    /**
      * How to interpret `to`. default: undefined
      * `file` - if 'to' has extension or 'from' is file.
      * `dir` - if 'from' is directory, 'to' has no extension or ends in '/'.
      * `template` - if 'to' contains a template pattern.
      * @default undefined
      */
    var toType: js.UndefOr[file | dir | template] = js.undefined
    
    /**
      * Function that modifies file contents before writing to webpack. (default: `(content, path) => content`)
      * {@link https://webpack.js.org/plugins/copy-webpack-plugin/#transform}
      * @default undefined
      */
    var transform: js.UndefOr[
        js.Function2[
          /* content */ Buffer, 
          /* absoluteFrom */ String, 
          String | Buffer | (js.Promise[String | Buffer])
        ]
      ] = js.undefined
    
    /**
      * Allows to modify the writing path.
      * Returns the new path or a promise that resolves into the new path
      * @default undefined
      */
    var transformPath: js.UndefOr[
        js.Function2[/* targetPath */ String, /* absolutePath */ String, String | js.Promise[String]]
      ] = js.undefined
  }
  object ObjectPattern {
    
    inline def apply(from: String): ObjectPattern = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjectPattern]
    }
    
    extension [Self <: ObjectPattern](x: Self) {
      
      inline def setCacheTransform(value: Boolean | String | js.Object): Self = StObject.set(x, "cacheTransform", value.asInstanceOf[js.Any])
      
      inline def setCacheTransformUndefined: Self = StObject.set(x, "cacheTransform", js.undefined)
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setFilter(value: /* resourcePath */ String => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFlatten(value: Boolean): Self = StObject.set(x, "flatten", value.asInstanceOf[js.Any])
      
      inline def setFlattenUndefined: Self = StObject.set(x, "flatten", js.undefined)
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setGlobOptions(value: js.Object): Self = StObject.set(x, "globOptions", value.asInstanceOf[js.Any])
      
      inline def setGlobOptionsUndefined: Self = StObject.set(x, "globOptions", js.undefined)
      
      inline def setNoErrorOnMissing(value: Boolean): Self = StObject.set(x, "noErrorOnMissing", value.asInstanceOf[js.Any])
      
      inline def setNoErrorOnMissingUndefined: Self = StObject.set(x, "noErrorOnMissing", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToType(value: file | dir | template): Self = StObject.set(x, "toType", value.asInstanceOf[js.Any])
      
      inline def setToTypeUndefined: Self = StObject.set(x, "toType", js.undefined)
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setTransform(
        value: (/* content */ Buffer, /* absoluteFrom */ String) => String | Buffer | (js.Promise[String | Buffer])
      ): Self = StObject.set(x, "transform", js.Any.fromFunction2(value))
      
      inline def setTransformPath(value: (/* targetPath */ String, /* absolutePath */ String) => String | js.Promise[String]): Self = StObject.set(x, "transformPath", js.Any.fromFunction2(value))
      
      inline def setTransformPathUndefined: Self = StObject.set(x, "transformPath", js.undefined)
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    /**
      * Limits the number of simultaneous requests to fs
      * @default 100
      */
    var concurrency: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      inline def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
    }
  }
  
  type StringPattern = String
  
  type _To = js.Object & CopyPlugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & CopyPlugin = ^
}
