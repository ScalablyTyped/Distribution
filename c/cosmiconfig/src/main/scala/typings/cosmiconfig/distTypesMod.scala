package typings.cosmiconfig

import org.scalablytyped.runtime.StringDictionary
import typings.cosmiconfig.mod.Loader
import typings.cosmiconfig.mod.LoaderSync
import typings.cosmiconfig.mod.Transform
import typings.cosmiconfig.mod.TransformSync
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  type Cache = Map[String, CosmiconfigResult]
  
  type Config = Any
  
  type CosmiconfigResult = typings.cosmiconfig.anon.Config | Null
  
  /* Inlined parent std.Required<cosmiconfig.cosmiconfig.Options> */
  trait ExplorerOptions extends StObject {
    
    var cache: Boolean
    
    var ignoreEmptySearchPlaces: Boolean
    
    var loaders: Loaders
    
    var packageProp: String | js.Array[String]
    
    var searchPlaces: js.Array[String]
    
    var stopDir: String
    
    var transform: Transform
  }
  object ExplorerOptions {
    
    inline def apply(
      cache: Boolean,
      ignoreEmptySearchPlaces: Boolean,
      loaders: Loaders,
      packageProp: String | js.Array[String],
      searchPlaces: js.Array[String],
      stopDir: String,
      transform: /* CosmiconfigResult */ CosmiconfigResult => CosmiconfigResult | js.Promise[CosmiconfigResult]
    ): ExplorerOptions = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], ignoreEmptySearchPlaces = ignoreEmptySearchPlaces.asInstanceOf[js.Any], loaders = loaders.asInstanceOf[js.Any], packageProp = packageProp.asInstanceOf[js.Any], searchPlaces = searchPlaces.asInstanceOf[js.Any], stopDir = stopDir.asInstanceOf[js.Any], transform = js.Any.fromFunction1(transform))
      __obj.asInstanceOf[ExplorerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExplorerOptions] (val x: Self) extends AnyVal {
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setIgnoreEmptySearchPlaces(value: Boolean): Self = StObject.set(x, "ignoreEmptySearchPlaces", value.asInstanceOf[js.Any])
      
      inline def setLoaders(value: Loaders): Self = StObject.set(x, "loaders", value.asInstanceOf[js.Any])
      
      inline def setPackageProp(value: String | js.Array[String]): Self = StObject.set(x, "packageProp", value.asInstanceOf[js.Any])
      
      inline def setPackagePropVarargs(value: String*): Self = StObject.set(x, "packageProp", js.Array(value*))
      
      inline def setSearchPlaces(value: js.Array[String]): Self = StObject.set(x, "searchPlaces", value.asInstanceOf[js.Any])
      
      inline def setSearchPlacesVarargs(value: String*): Self = StObject.set(x, "searchPlaces", js.Array(value*))
      
      inline def setStopDir(value: String): Self = StObject.set(x, "stopDir", value.asInstanceOf[js.Any])
      
      inline def setTransform(
        value: /* CosmiconfigResult */ CosmiconfigResult => CosmiconfigResult | js.Promise[CosmiconfigResult]
      ): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined parent std.Required<cosmiconfig.cosmiconfig.OptionsSync> */
  trait ExplorerOptionsSync extends StObject {
    
    var cache: Boolean
    
    var ignoreEmptySearchPlaces: Boolean
    
    var loaders: LoadersSync
    
    var packageProp: String | js.Array[String]
    
    var searchPlaces: js.Array[String]
    
    var stopDir: String
    
    def transform(CosmiconfigResult: CosmiconfigResult): CosmiconfigResult
    @JSName("transform")
    var transform_Original: TransformSync
  }
  object ExplorerOptionsSync {
    
    inline def apply(
      cache: Boolean,
      ignoreEmptySearchPlaces: Boolean,
      loaders: LoadersSync,
      packageProp: String | js.Array[String],
      searchPlaces: js.Array[String],
      stopDir: String,
      transform: /* CosmiconfigResult */ CosmiconfigResult => CosmiconfigResult
    ): ExplorerOptionsSync = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], ignoreEmptySearchPlaces = ignoreEmptySearchPlaces.asInstanceOf[js.Any], loaders = loaders.asInstanceOf[js.Any], packageProp = packageProp.asInstanceOf[js.Any], searchPlaces = searchPlaces.asInstanceOf[js.Any], stopDir = stopDir.asInstanceOf[js.Any], transform = js.Any.fromFunction1(transform))
      __obj.asInstanceOf[ExplorerOptionsSync]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExplorerOptionsSync] (val x: Self) extends AnyVal {
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setIgnoreEmptySearchPlaces(value: Boolean): Self = StObject.set(x, "ignoreEmptySearchPlaces", value.asInstanceOf[js.Any])
      
      inline def setLoaders(value: LoadersSync): Self = StObject.set(x, "loaders", value.asInstanceOf[js.Any])
      
      inline def setPackageProp(value: String | js.Array[String]): Self = StObject.set(x, "packageProp", value.asInstanceOf[js.Any])
      
      inline def setPackagePropVarargs(value: String*): Self = StObject.set(x, "packageProp", js.Array(value*))
      
      inline def setSearchPlaces(value: js.Array[String]): Self = StObject.set(x, "searchPlaces", value.asInstanceOf[js.Any])
      
      inline def setSearchPlacesVarargs(value: String*): Self = StObject.set(x, "searchPlaces", js.Array(value*))
      
      inline def setStopDir(value: String): Self = StObject.set(x, "stopDir", value.asInstanceOf[js.Any])
      
      inline def setTransform(value: /* CosmiconfigResult */ CosmiconfigResult => CosmiconfigResult): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
    }
  }
  
  type LoadedFileContent = js.UndefOr[Config | Null]
  
  type Loaders = StringDictionary[Loader]
  
  type LoadersSync = StringDictionary[LoaderSync]
}
