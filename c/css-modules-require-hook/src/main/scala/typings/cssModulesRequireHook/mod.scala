package typings.cssModulesRequireHook

import org.scalablytyped.runtime.Shortcut
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("css-modules-require-hook", JSImport.Namespace)
  @js.native
  val ^ : js.Function1[/* options */ js.UndefOr[Options], Unit] = js.native
  
  @js.native
  trait Options extends StObject {
    
    /** Appends custom plugins to the end of the PostCSS pipeline. */
    var append: js.UndefOr[js.Array[_]] = js.native
    
    /** Camelizes exported class names. */
    var camelCase: js.UndefOr[Boolean] = js.native
    
    /** Short alias for the postcss-modules-extract-imports plugin's createImportedName option. */
    var createImportedName: js.UndefOr[js.Function] = js.native
    
    /** Helps you to invalidate cache of all require calls. */
    var devMode: js.UndefOr[Boolean] = js.native
    
    /** Attach the require hook to additional file extensions. */
    var extensions: js.UndefOr[String | js.Array[String]] = js.native
    
    /** Short alias for the postcss-modules-scope plugin's option. */
    var generateScopedName: js.UndefOr[String | js.Function] = js.native
    
    /** Short alias for the generic-names helper option. */
    var hashPrefix: js.UndefOr[String] = js.native
    
    /** Provides possibility to exclude particular files from processing. */
    var ignore: js.UndefOr[String | RegExp | (js.Function1[/* filepath */ String, Boolean])] = js.native
    
    /** Short alias for the postcss-modules-local-by-default plugin's option. */
    var mode: js.UndefOr[String] = js.native
    
    /** Prepends custom plugins to the beginning of the PostCSS pipeline. */
    var prepend: js.UndefOr[js.Array[_]] = js.native
    
    /** In rare cases you may want to precompile styles, before they will be passed to the PostCSS pipeline. */
    var preprocessCss: js.UndefOr[js.Function] = js.native
    
    /** In rare cases you may want to get compiled styles in runtime, so providing this option helps. */
    var processCss: js.UndefOr[js.Function] = js.native
    
    /** Provides possibility to pass custom options to the LazyResult instance. */
    var processorOpts: js.UndefOr[js.Object] = js.native
    
    /** Provides absolute path to the project directory. */
    var rootDir: js.UndefOr[String] = js.native
    
    /** Provides the full list of PostCSS plugins to the pipeline. */
    var use: js.UndefOr[js.Array[_]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppend(value: js.Array[_]): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
      
      @scala.inline
      def setAppendVarargs(value: js.Any*): Self = StObject.set(x, "append", js.Array(value :_*))
      
      @scala.inline
      def setCamelCase(value: Boolean): Self = StObject.set(x, "camelCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCamelCaseUndefined: Self = StObject.set(x, "camelCase", js.undefined)
      
      @scala.inline
      def setCreateImportedName(value: js.Function): Self = StObject.set(x, "createImportedName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateImportedNameUndefined: Self = StObject.set(x, "createImportedName", js.undefined)
      
      @scala.inline
      def setDevMode(value: Boolean): Self = StObject.set(x, "devMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevModeUndefined: Self = StObject.set(x, "devMode", js.undefined)
      
      @scala.inline
      def setExtensions(value: String | js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      @scala.inline
      def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      @scala.inline
      def setGenerateScopedName(value: String | js.Function): Self = StObject.set(x, "generateScopedName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenerateScopedNameUndefined: Self = StObject.set(x, "generateScopedName", js.undefined)
      
      @scala.inline
      def setHashPrefix(value: String): Self = StObject.set(x, "hashPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashPrefixUndefined: Self = StObject.set(x, "hashPrefix", js.undefined)
      
      @scala.inline
      def setIgnore(value: String | RegExp | (js.Function1[/* filepath */ String, Boolean])): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreFunction1(value: /* filepath */ String => Boolean): Self = StObject.set(x, "ignore", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setPrepend(value: js.Array[_]): Self = StObject.set(x, "prepend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrependUndefined: Self = StObject.set(x, "prepend", js.undefined)
      
      @scala.inline
      def setPrependVarargs(value: js.Any*): Self = StObject.set(x, "prepend", js.Array(value :_*))
      
      @scala.inline
      def setPreprocessCss(value: js.Function): Self = StObject.set(x, "preprocessCss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreprocessCssUndefined: Self = StObject.set(x, "preprocessCss", js.undefined)
      
      @scala.inline
      def setProcessCss(value: js.Function): Self = StObject.set(x, "processCss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessCssUndefined: Self = StObject.set(x, "processCss", js.undefined)
      
      @scala.inline
      def setProcessorOpts(value: js.Object): Self = StObject.set(x, "processorOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessorOptsUndefined: Self = StObject.set(x, "processorOpts", js.undefined)
      
      @scala.inline
      def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootDirUndefined: Self = StObject.set(x, "rootDir", js.undefined)
      
      @scala.inline
      def setUse(value: js.Array[_]): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
      
      @scala.inline
      def setUseVarargs(value: js.Any*): Self = StObject.set(x, "use", js.Array(value :_*))
    }
  }
  
  type _To = js.Function1[/* options */ js.UndefOr[Options], Unit]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Function1[/* options */ js.UndefOr[Options], Unit] = ^
}
