package typings.cssModulesRequireHook

import org.scalablytyped.runtime.Shortcut
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("css-modules-require-hook", JSImport.Namespace)
  @js.native
  val ^ : js.Function1[/* options */ js.UndefOr[Options], Unit] = js.native
  
  trait Options extends StObject {
    
    /** Appends custom plugins to the end of the PostCSS pipeline. */
    var append: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /** Camelizes exported class names. */
    var camelCase: js.UndefOr[Boolean] = js.undefined
    
    /** Short alias for the postcss-modules-extract-imports plugin's createImportedName option. */
    var createImportedName: js.UndefOr[js.Function] = js.undefined
    
    /** Helps you to invalidate cache of all require calls. */
    var devMode: js.UndefOr[Boolean] = js.undefined
    
    /** Attach the require hook to additional file extensions. */
    var extensions: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** Short alias for the postcss-modules-scope plugin's option. */
    var generateScopedName: js.UndefOr[String | js.Function] = js.undefined
    
    /** Short alias for the generic-names helper option. */
    var hashPrefix: js.UndefOr[String] = js.undefined
    
    /** Provides possibility to exclude particular files from processing. */
    var ignore: js.UndefOr[String | RegExp | (js.Function1[/* filepath */ String, Boolean])] = js.undefined
    
    /** Short alias for the postcss-modules-local-by-default plugin's option. */
    var mode: js.UndefOr[String] = js.undefined
    
    /** Prepends custom plugins to the beginning of the PostCSS pipeline. */
    var prepend: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /** In rare cases you may want to precompile styles, before they will be passed to the PostCSS pipeline. */
    var preprocessCss: js.UndefOr[js.Function] = js.undefined
    
    /** In rare cases you may want to get compiled styles in runtime, so providing this option helps. */
    var processCss: js.UndefOr[js.Function] = js.undefined
    
    /** Provides possibility to pass custom options to the LazyResult instance. */
    var processorOpts: js.UndefOr[js.Object] = js.undefined
    
    /** Provides absolute path to the project directory. */
    var rootDir: js.UndefOr[String] = js.undefined
    
    /** Provides the full list of PostCSS plugins to the pipeline. */
    var use: js.UndefOr[js.Array[js.Any]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAppend(value: js.Array[js.Any]): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
      
      inline def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
      
      inline def setAppendVarargs(value: js.Any*): Self = StObject.set(x, "append", js.Array(value :_*))
      
      inline def setCamelCase(value: Boolean): Self = StObject.set(x, "camelCase", value.asInstanceOf[js.Any])
      
      inline def setCamelCaseUndefined: Self = StObject.set(x, "camelCase", js.undefined)
      
      inline def setCreateImportedName(value: js.Function): Self = StObject.set(x, "createImportedName", value.asInstanceOf[js.Any])
      
      inline def setCreateImportedNameUndefined: Self = StObject.set(x, "createImportedName", js.undefined)
      
      inline def setDevMode(value: Boolean): Self = StObject.set(x, "devMode", value.asInstanceOf[js.Any])
      
      inline def setDevModeUndefined: Self = StObject.set(x, "devMode", js.undefined)
      
      inline def setExtensions(value: String | js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      inline def setGenerateScopedName(value: String | js.Function): Self = StObject.set(x, "generateScopedName", value.asInstanceOf[js.Any])
      
      inline def setGenerateScopedNameUndefined: Self = StObject.set(x, "generateScopedName", js.undefined)
      
      inline def setHashPrefix(value: String): Self = StObject.set(x, "hashPrefix", value.asInstanceOf[js.Any])
      
      inline def setHashPrefixUndefined: Self = StObject.set(x, "hashPrefix", js.undefined)
      
      inline def setIgnore(value: String | RegExp | (js.Function1[/* filepath */ String, Boolean])): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFunction1(value: /* filepath */ String => Boolean): Self = StObject.set(x, "ignore", js.Any.fromFunction1(value))
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setPrepend(value: js.Array[js.Any]): Self = StObject.set(x, "prepend", value.asInstanceOf[js.Any])
      
      inline def setPrependUndefined: Self = StObject.set(x, "prepend", js.undefined)
      
      inline def setPrependVarargs(value: js.Any*): Self = StObject.set(x, "prepend", js.Array(value :_*))
      
      inline def setPreprocessCss(value: js.Function): Self = StObject.set(x, "preprocessCss", value.asInstanceOf[js.Any])
      
      inline def setPreprocessCssUndefined: Self = StObject.set(x, "preprocessCss", js.undefined)
      
      inline def setProcessCss(value: js.Function): Self = StObject.set(x, "processCss", value.asInstanceOf[js.Any])
      
      inline def setProcessCssUndefined: Self = StObject.set(x, "processCss", js.undefined)
      
      inline def setProcessorOpts(value: js.Object): Self = StObject.set(x, "processorOpts", value.asInstanceOf[js.Any])
      
      inline def setProcessorOptsUndefined: Self = StObject.set(x, "processorOpts", js.undefined)
      
      inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
      
      inline def setRootDirUndefined: Self = StObject.set(x, "rootDir", js.undefined)
      
      inline def setUse(value: js.Array[js.Any]): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
      
      inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
      
      inline def setUseVarargs(value: js.Any*): Self = StObject.set(x, "use", js.Array(value :_*))
    }
  }
  
  type _To = js.Function1[/* options */ js.UndefOr[Options], Unit]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Function1[/* options */ js.UndefOr[Options], Unit] = ^
}
