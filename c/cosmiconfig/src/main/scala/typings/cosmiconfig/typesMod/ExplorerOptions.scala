package typings.cosmiconfig.typesMod

import typings.cosmiconfig.mod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Required<cosmiconfig.cosmiconfig.Options> */
@js.native
trait ExplorerOptions extends js.Object {
  
  var cache: Boolean = js.native
  
  var ignoreEmptySearchPlaces: Boolean = js.native
  
  var loaders: Loaders = js.native
  
  var packageProp: String | js.Array[String] = js.native
  
  var searchPlaces: js.Array[String] = js.native
  
  var stopDir: String = js.native
  
  var transform: Transform = js.native
}
object ExplorerOptions {
  
  @scala.inline
  def apply(
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
  implicit class ExplorerOptionsOps[Self <: ExplorerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreEmptySearchPlaces(value: Boolean): Self = this.set("ignoreEmptySearchPlaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoaders(value: Loaders): Self = this.set("loaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackagePropVarargs(value: String*): Self = this.set("packageProp", js.Array(value :_*))
    
    @scala.inline
    def setPackageProp(value: String | js.Array[String]): Self = this.set("packageProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchPlacesVarargs(value: String*): Self = this.set("searchPlaces", js.Array(value :_*))
    
    @scala.inline
    def setSearchPlaces(value: js.Array[String]): Self = this.set("searchPlaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopDir(value: String): Self = this.set("stopDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransform(
      value: /* CosmiconfigResult */ CosmiconfigResult => CosmiconfigResult | js.Promise[CosmiconfigResult]
    ): Self = this.set("transform", js.Any.fromFunction1(value))
  }
}
