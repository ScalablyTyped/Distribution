package typings.browserResolve

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Resolve a module path and call cb(err, path)
    *
    * @param id Identifier to resolve
    * @param callback
    */
  @scala.inline
  def apply(id: String, cb: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(id.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Resolve a module path and call cb(err, path)
    *
    * @param id Identifier to resolve
    * @param options Options to use for resolving, optional.
    * @param callback
    */
  @scala.inline
  def apply(id: String, opts: AsyncOpts, cb: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("browser-resolve", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns a module path
    * @param id Identifier to resolve
    * @param options Options to use for resolving.
    */
  @scala.inline
  def sync(id: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(id.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def sync(id: String, opts: SyncOpts): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.browserResolve.mod.Opts because var conflicts: basedir, packageFilter, paths. Inlined browser, filename, modules */ trait AsyncOpts
    extends StObject
       with typings.resolve.mod.AsyncOpts {
    
    /**
      * the 'browser' property to use from package.json
      * @default 'browser'
      */
    var browser: js.UndefOr[String] = js.undefined
    
    /**
      * the calling filename where the require() call originated (in the source)
      */
    var filename: js.UndefOr[String] = js.undefined
    
    /**
      * modules object with id to path mappings to consult before doing manual resolution
      * (use to provide core modules)
      */
    var modules: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object AsyncOpts {
    
    @scala.inline
    def apply(): AsyncOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsyncOpts]
    }
    
    @scala.inline
    implicit class AsyncOptsMutableBuilder[Self <: AsyncOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setModules(value: StringDictionary[String]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
    }
  }
  
  /**
    * Callback invoked when resolving asynchronously
    * @param error
    * @param resolved Absolute path to resolved identifier
    */
  type Callback = js.Function2[/* err */ Error | Null, /* resolved */ js.UndefOr[String], Unit]
  
  trait Opts extends StObject {
    
    /**
      * directory to begin resolving from
      */
    var basedir: js.UndefOr[String] = js.undefined
    
    /**
      * the 'browser' property to use from package.json
      * @default 'browser'
      */
    var browser: js.UndefOr[String] = js.undefined
    
    /**
      * the calling filename where the require() call originated (in the source)
      */
    var filename: js.UndefOr[String] = js.undefined
    
    /**
      * modules object with id to path mappings to consult before doing manual resolution
      * (use to provide core modules)
      */
    var modules: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * transform the parsed package.json contents before looking at the main field
      */
    var packageFilter: js.UndefOr[js.Function2[/* info */ js.Any, /* pkgdir */ String, js.Any]] = js.undefined
    
    /**
      * require.paths array to use if nothing is found on the normal node_modules recursive walk
      */
    var paths: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Opts {
    
    @scala.inline
    def apply(): Opts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Opts]
    }
    
    @scala.inline
    implicit class OptsMutableBuilder[Self <: Opts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasedir(value: String): Self = StObject.set(x, "basedir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasedirUndefined: Self = StObject.set(x, "basedir", js.undefined)
      
      @scala.inline
      def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setModules(value: StringDictionary[String]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      @scala.inline
      def setPackageFilter(value: (/* info */ js.Any, /* pkgdir */ String) => js.Any): Self = StObject.set(x, "packageFilter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPackageFilterUndefined: Self = StObject.set(x, "packageFilter", js.undefined)
      
      @scala.inline
      def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      @scala.inline
      def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value :_*))
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.browserResolve.mod.Opts because var conflicts: basedir, packageFilter, paths. Inlined browser, filename, modules */ trait SyncOpts
    extends StObject
       with typings.resolve.mod.SyncOpts {
    
    /**
      * the 'browser' property to use from package.json
      * @default 'browser'
      */
    var browser: js.UndefOr[String] = js.undefined
    
    /**
      * the calling filename where the require() call originated (in the source)
      */
    var filename: js.UndefOr[String] = js.undefined
    
    /**
      * modules object with id to path mappings to consult before doing manual resolution
      * (use to provide core modules)
      */
    var modules: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object SyncOpts {
    
    @scala.inline
    def apply(): SyncOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncOpts]
    }
    
    @scala.inline
    implicit class SyncOptsMutableBuilder[Self <: SyncOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setModules(value: StringDictionary[String]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
    }
  }
}
