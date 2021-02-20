package typings.cosmiconfig

import typings.cosmiconfig.anon.ClearCaches
import typings.cosmiconfig.anon.ClearLoadCache
import typings.cosmiconfig.typesMod.Config
import typings.cosmiconfig.typesMod.CosmiconfigResult
import typings.cosmiconfig.typesMod.Loaders
import typings.cosmiconfig.typesMod.LoadersSync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cosmiconfig", "cosmiconfig")
  @js.native
  def cosmiconfig(moduleName: String): ClearCaches = js.native
  @JSImport("cosmiconfig", "cosmiconfig")
  @js.native
  def cosmiconfig(moduleName: String, options: Options): ClearCaches = js.native
  
  @JSImport("cosmiconfig", "cosmiconfigSync")
  @js.native
  def cosmiconfigSync(moduleName: String): ClearLoadCache = js.native
  @JSImport("cosmiconfig", "cosmiconfigSync")
  @js.native
  def cosmiconfigSync(moduleName: String, options: OptionsSync): ClearLoadCache = js.native
  
  /* Inlined std.Readonly<{ readonly .cjs :cosmiconfig.cosmiconfig.LoaderSync,  readonly .js :cosmiconfig.cosmiconfig.LoaderSync,  readonly .json :cosmiconfig.cosmiconfig.LoaderSync,  readonly .yaml :cosmiconfig.cosmiconfig.LoaderSync,  readonly .yml :cosmiconfig.cosmiconfig.LoaderSync,  readonly noExt :cosmiconfig.cosmiconfig.LoaderSync}> */
  object defaultLoaders {
    
    @JSImport("cosmiconfig", "defaultLoaders..cjs")
    @js.native
    def cjs(filepath: String, content: String): LoaderResult = js.native
    
    @JSImport("cosmiconfig", "defaultLoaders..js")
    @js.native
    def js_(filepath: String, content: String): LoaderResult = js.native
    
    @JSImport("cosmiconfig", "defaultLoaders..json")
    @js.native
    def json(filepath: String, content: String): LoaderResult = js.native
    
    @JSImport("cosmiconfig", "defaultLoaders.noExt")
    @js.native
    def noExt(filepath: String, content: String): LoaderResult = js.native
    
    @JSImport("cosmiconfig", "defaultLoaders..yaml")
    @js.native
    def yaml(filepath: String, content: String): LoaderResult = js.native
    
    @JSImport("cosmiconfig", "defaultLoaders..yml")
    @js.native
    def yml(filepath: String, content: String): LoaderResult = js.native
  }
  
  type Loader = (js.Function2[/* filepath */ String, /* content */ String, js.Promise[LoaderResult]]) | LoaderSync
  
  type LoaderResult = Config | Null
  
  type LoaderSync = js.Function2[/* filepath */ String, /* content */ String, LoaderResult]
  
  @js.native
  trait Options extends OptionsBase {
    
    var loaders: js.UndefOr[Loaders] = js.native
    
    var transform: js.UndefOr[Transform] = js.native
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
      def setLoaders(value: Loaders): Self = StObject.set(x, "loaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadersUndefined: Self = StObject.set(x, "loaders", js.undefined)
      
      @scala.inline
      def setTransform(
        value: /* CosmiconfigResult */ CosmiconfigResult => CosmiconfigResult | js.Promise[CosmiconfigResult]
      ): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  @js.native
  trait OptionsBase extends StObject {
    
    var cache: js.UndefOr[Boolean] = js.native
    
    var ignoreEmptySearchPlaces: js.UndefOr[Boolean] = js.native
    
    var packageProp: js.UndefOr[String | js.Array[String]] = js.native
    
    var searchPlaces: js.UndefOr[js.Array[String]] = js.native
    
    var stopDir: js.UndefOr[String] = js.native
  }
  object OptionsBase {
    
    @scala.inline
    def apply(): OptionsBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsBase]
    }
    
    @scala.inline
    implicit class OptionsBaseMutableBuilder[Self <: OptionsBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setIgnoreEmptySearchPlaces(value: Boolean): Self = StObject.set(x, "ignoreEmptySearchPlaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreEmptySearchPlacesUndefined: Self = StObject.set(x, "ignoreEmptySearchPlaces", js.undefined)
      
      @scala.inline
      def setPackageProp(value: String | js.Array[String]): Self = StObject.set(x, "packageProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackagePropUndefined: Self = StObject.set(x, "packageProp", js.undefined)
      
      @scala.inline
      def setPackagePropVarargs(value: String*): Self = StObject.set(x, "packageProp", js.Array(value :_*))
      
      @scala.inline
      def setSearchPlaces(value: js.Array[String]): Self = StObject.set(x, "searchPlaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchPlacesUndefined: Self = StObject.set(x, "searchPlaces", js.undefined)
      
      @scala.inline
      def setSearchPlacesVarargs(value: String*): Self = StObject.set(x, "searchPlaces", js.Array(value :_*))
      
      @scala.inline
      def setStopDir(value: String): Self = StObject.set(x, "stopDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopDirUndefined: Self = StObject.set(x, "stopDir", js.undefined)
    }
  }
  
  @js.native
  trait OptionsSync extends OptionsBase {
    
    var loaders: js.UndefOr[LoadersSync] = js.native
    
    var transform: js.UndefOr[TransformSync] = js.native
  }
  object OptionsSync {
    
    @scala.inline
    def apply(): OptionsSync = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsSync]
    }
    
    @scala.inline
    implicit class OptionsSyncMutableBuilder[Self <: OptionsSync] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoaders(value: LoadersSync): Self = StObject.set(x, "loaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadersUndefined: Self = StObject.set(x, "loaders", js.undefined)
      
      @scala.inline
      def setTransform(value: /* CosmiconfigResult */ CosmiconfigResult => CosmiconfigResult): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  type Transform = (js.Function1[/* CosmiconfigResult */ CosmiconfigResult, js.Promise[CosmiconfigResult]]) | TransformSync
  
  type TransformSync = js.Function1[/* CosmiconfigResult */ CosmiconfigResult, CosmiconfigResult]
}
