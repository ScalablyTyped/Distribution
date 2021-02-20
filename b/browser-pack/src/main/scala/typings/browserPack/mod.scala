package typings.browserPack

import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Pack node-style source files from a json stream into a browser bundle.
    * Source objects are written to browser-pack using 'write(row)'. browser-pack uses these properties of each row:
    *  - 'id' - A unique ID for this module.
    *  - 'deps' - An object mapping 'require()' argument strings to dependency row IDs, used for resolution at runtime.
    *  - 'entry' - When true, this module will be executed when the bundle loads. Otherwise, it will only be executed once some other module 'require()'s it.
    *  - 'order' - When 'row.entry' is true, this number indicates the order in which different entry modules are executed.
    *  - 'source' - The contents of the module.
    *  - 'nomap' - When true, a source map is not generated for this module.
    *  - 'sourceFile' - The file name to use for this module in the source map.
    */
  @JSImport("browser-pack", JSImport.Namespace)
  @js.native
  def apply(): ReadWriteStream = js.native
  @JSImport("browser-pack", JSImport.Namespace)
  @js.native
  def apply(opts: Options): ReadWriteStream = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Used if opts.preludePath is undefined, this is used to resolve the prelude.js file location, default: 'process.cwd()'
      */
    var basedir: js.UndefOr[String] = js.native
    
    /**
      * A string to use in place of 'require' if opts.hasExports is specified, default is 'require'
      */
    var externalRequireName: js.UndefOr[String] = js.native
    
    /**
      * Whether the bundle should include require= (or the opts.externalRequireName) so that
      * require() is available outside the bundle
      */
    var hasExports: js.UndefOr[Boolean] = js.native
    
    /**
      * Specify a custom prelude, but know what you're doing first. See the prelude.js file in
      * this repo for the default prelude. If you specify a custom prelude, you must also specify
      * a valid opts.preludePath to the prelude source file for sourcemaps to work
      */
    var prelude: js.UndefOr[String] = js.native
    
    /**
      * prelude.js path if a custom opts.prelude is specified
      */
    var preludePath: js.UndefOr[String] = js.native
    
    /**
      * If given, the writable end of the stream will expect objects to be written to
      * it instead of expecting a stream of json text it will need to parse, default false
      */
    var raw: js.UndefOr[Boolean] = js.native
    
    /**
      * If given and source maps are computed, the opts.sourceMapPrefix string will be used instead of default: '//#'
      */
    var sourceMapPrefix: js.UndefOr[String] = js.native
    
    /**
      * If given and source maps are computed, the root for the output source map will be defined. (default is no root)
      */
    var sourceRoot: js.UndefOr[String] = js.native
    
    /**
      * External string name to use for UMD, if not provided, UMD declaration is not wrapped around output
      */
    var standalone: js.UndefOr[String] = js.native
    
    /**
      * Sets the internal module name to export for standalone
      */
    var standaloneModule: js.UndefOr[String] = js.native
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
      def setBasedir(value: String): Self = StObject.set(x, "basedir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasedirUndefined: Self = StObject.set(x, "basedir", js.undefined)
      
      @scala.inline
      def setExternalRequireName(value: String): Self = StObject.set(x, "externalRequireName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalRequireNameUndefined: Self = StObject.set(x, "externalRequireName", js.undefined)
      
      @scala.inline
      def setHasExports(value: Boolean): Self = StObject.set(x, "hasExports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasExportsUndefined: Self = StObject.set(x, "hasExports", js.undefined)
      
      @scala.inline
      def setPrelude(value: String): Self = StObject.set(x, "prelude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreludePath(value: String): Self = StObject.set(x, "preludePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreludePathUndefined: Self = StObject.set(x, "preludePath", js.undefined)
      
      @scala.inline
      def setPreludeUndefined: Self = StObject.set(x, "prelude", js.undefined)
      
      @scala.inline
      def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      @scala.inline
      def setSourceMapPrefix(value: String): Self = StObject.set(x, "sourceMapPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapPrefixUndefined: Self = StObject.set(x, "sourceMapPrefix", js.undefined)
      
      @scala.inline
      def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
      
      @scala.inline
      def setStandalone(value: String): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStandaloneModule(value: String): Self = StObject.set(x, "standaloneModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStandaloneModuleUndefined: Self = StObject.set(x, "standaloneModule", js.undefined)
      
      @scala.inline
      def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
    }
  }
}
