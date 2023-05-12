package typings.cosmiconfig

import typings.cosmiconfig.distTypesMod.Config
import typings.cosmiconfig.distTypesMod.CosmiconfigResult
import typings.cosmiconfig.distTypesMod.Loaders
import typings.cosmiconfig.distTypesMod.LoadersSync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cosmiconfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cosmiconfig(moduleName: String): PublicExplorer = ^.asInstanceOf[js.Dynamic].applyDynamic("cosmiconfig")(moduleName.asInstanceOf[js.Any]).asInstanceOf[PublicExplorer]
  inline def cosmiconfig(moduleName: String, options: Options): PublicExplorer = (^.asInstanceOf[js.Dynamic].applyDynamic("cosmiconfig")(moduleName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PublicExplorer]
  
  inline def cosmiconfigSync(moduleName: String): PublicExplorerSync = ^.asInstanceOf[js.Dynamic].applyDynamic("cosmiconfigSync")(moduleName.asInstanceOf[js.Any]).asInstanceOf[PublicExplorerSync]
  inline def cosmiconfigSync(moduleName: String, options: OptionsSync): PublicExplorerSync = (^.asInstanceOf[js.Dynamic].applyDynamic("cosmiconfigSync")(moduleName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PublicExplorerSync]
  
  /* Inlined std.Readonly<{ readonly .cjs :cosmiconfig.cosmiconfig.LoaderSync,  readonly .js :cosmiconfig.cosmiconfig.LoaderSync,  readonly .json :cosmiconfig.cosmiconfig.LoaderSync,  readonly .yaml :cosmiconfig.cosmiconfig.LoaderSync,  readonly .yml :cosmiconfig.cosmiconfig.LoaderSync,  readonly noExt :cosmiconfig.cosmiconfig.LoaderSync}> */
  object defaultLoaders {
    
    @JSImport("cosmiconfig", "defaultLoaders")
    @js.native
    val ^ : js.Any = js.native
    
    inline def cjs(filepath: String, content: String): LoaderResult = (^.asInstanceOf[js.Dynamic].applyDynamic(".cjs")(filepath.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[LoaderResult]
    
    inline def js_(filepath: String, content: String): LoaderResult = (^.asInstanceOf[js.Dynamic].applyDynamic(".js")(filepath.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[LoaderResult]
    
    inline def json(filepath: String, content: String): LoaderResult = (^.asInstanceOf[js.Dynamic].applyDynamic(".json")(filepath.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[LoaderResult]
    
    inline def noExt(filepath: String, content: String): LoaderResult = (^.asInstanceOf[js.Dynamic].applyDynamic("noExt")(filepath.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[LoaderResult]
    
    inline def yaml(filepath: String, content: String): LoaderResult = (^.asInstanceOf[js.Dynamic].applyDynamic(".yaml")(filepath.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[LoaderResult]
    
    inline def yml(filepath: String, content: String): LoaderResult = (^.asInstanceOf[js.Dynamic].applyDynamic(".yml")(filepath.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[LoaderResult]
  }
  
  @JSImport("cosmiconfig", "metaSearchPlaces")
  @js.native
  val metaSearchPlaces: js.Array[String] = js.native
  
  type Loader = (js.Function2[/* filepath */ String, /* content */ String, js.Promise[LoaderResult]]) | LoaderSync
  
  type LoaderResult = Config | Null
  
  type LoaderSync = js.Function2[/* filepath */ String, /* content */ String, LoaderResult]
  
  trait Options
    extends StObject
       with OptionsBase {
    
    var loaders: js.UndefOr[Loaders] = js.undefined
    
    var transform: js.UndefOr[Transform] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setLoaders(value: Loaders): Self = StObject.set(x, "loaders", value.asInstanceOf[js.Any])
      
      inline def setLoadersUndefined: Self = StObject.set(x, "loaders", js.undefined)
      
      inline def setTransform(
        value: /* CosmiconfigResult */ CosmiconfigResult => CosmiconfigResult | js.Promise[CosmiconfigResult]
      ): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  trait OptionsBase extends StObject {
    
    var cache: js.UndefOr[Boolean] = js.undefined
    
    var ignoreEmptySearchPlaces: js.UndefOr[Boolean] = js.undefined
    
    var packageProp: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var searchPlaces: js.UndefOr[js.Array[String]] = js.undefined
    
    var stopDir: js.UndefOr[String] = js.undefined
  }
  object OptionsBase {
    
    inline def apply(): OptionsBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsBase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionsBase] (val x: Self) extends AnyVal {
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setIgnoreEmptySearchPlaces(value: Boolean): Self = StObject.set(x, "ignoreEmptySearchPlaces", value.asInstanceOf[js.Any])
      
      inline def setIgnoreEmptySearchPlacesUndefined: Self = StObject.set(x, "ignoreEmptySearchPlaces", js.undefined)
      
      inline def setPackageProp(value: String | js.Array[String]): Self = StObject.set(x, "packageProp", value.asInstanceOf[js.Any])
      
      inline def setPackagePropUndefined: Self = StObject.set(x, "packageProp", js.undefined)
      
      inline def setPackagePropVarargs(value: String*): Self = StObject.set(x, "packageProp", js.Array(value*))
      
      inline def setSearchPlaces(value: js.Array[String]): Self = StObject.set(x, "searchPlaces", value.asInstanceOf[js.Any])
      
      inline def setSearchPlacesUndefined: Self = StObject.set(x, "searchPlaces", js.undefined)
      
      inline def setSearchPlacesVarargs(value: String*): Self = StObject.set(x, "searchPlaces", js.Array(value*))
      
      inline def setStopDir(value: String): Self = StObject.set(x, "stopDir", value.asInstanceOf[js.Any])
      
      inline def setStopDirUndefined: Self = StObject.set(x, "stopDir", js.undefined)
    }
  }
  
  trait OptionsSync
    extends StObject
       with OptionsBase {
    
    var loaders: js.UndefOr[LoadersSync] = js.undefined
    
    var transform: js.UndefOr[TransformSync] = js.undefined
  }
  object OptionsSync {
    
    inline def apply(): OptionsSync = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsSync]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionsSync] (val x: Self) extends AnyVal {
      
      inline def setLoaders(value: LoadersSync): Self = StObject.set(x, "loaders", value.asInstanceOf[js.Any])
      
      inline def setLoadersUndefined: Self = StObject.set(x, "loaders", js.undefined)
      
      inline def setTransform(value: /* CosmiconfigResult */ CosmiconfigResult => CosmiconfigResult): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  @js.native
  trait PublicExplorer
    extends StObject
       with PublicExplorerBase {
    
    def load(filepath: String): js.Promise[CosmiconfigResult] = js.native
    
    def search(): js.Promise[CosmiconfigResult] = js.native
    def search(searchFrom: String): js.Promise[CosmiconfigResult] = js.native
  }
  
  trait PublicExplorerBase extends StObject {
    
    def clearCaches(): Unit
    
    def clearLoadCache(): Unit
    
    def clearSearchCache(): Unit
  }
  object PublicExplorerBase {
    
    inline def apply(clearCaches: () => Unit, clearLoadCache: () => Unit, clearSearchCache: () => Unit): PublicExplorerBase = {
      val __obj = js.Dynamic.literal(clearCaches = js.Any.fromFunction0(clearCaches), clearLoadCache = js.Any.fromFunction0(clearLoadCache), clearSearchCache = js.Any.fromFunction0(clearSearchCache))
      __obj.asInstanceOf[PublicExplorerBase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PublicExplorerBase] (val x: Self) extends AnyVal {
      
      inline def setClearCaches(value: () => Unit): Self = StObject.set(x, "clearCaches", js.Any.fromFunction0(value))
      
      inline def setClearLoadCache(value: () => Unit): Self = StObject.set(x, "clearLoadCache", js.Any.fromFunction0(value))
      
      inline def setClearSearchCache(value: () => Unit): Self = StObject.set(x, "clearSearchCache", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait PublicExplorerSync
    extends StObject
       with PublicExplorerBase {
    
    def load(filepath: String): CosmiconfigResult = js.native
    
    def search(): CosmiconfigResult = js.native
    def search(searchFrom: String): CosmiconfigResult = js.native
  }
  
  type Transform = (js.Function1[/* CosmiconfigResult */ CosmiconfigResult, js.Promise[CosmiconfigResult]]) | TransformSync
  
  type TransformSync = js.Function1[/* CosmiconfigResult */ CosmiconfigResult, CosmiconfigResult]
}
