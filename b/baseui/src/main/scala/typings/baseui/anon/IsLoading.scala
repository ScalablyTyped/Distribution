package typings.baseui.anon

import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.mini
import typings.baseui.baseuiStrings.search
import typings.baseui.baseuiStrings.select
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsLoading extends StObject {
  
  @JSName("$error")
  var $error: Boolean
  
  @JSName("$isLoading")
  var $isLoading: Boolean
  
  @JSName("$multi")
  var $multi: Boolean
  
  @JSName("$required")
  var $required: Boolean
  
  @JSName("$searchable")
  var $searchable: Boolean
  
  @JSName("$size")
  var $size: default_ | compact | large_ | mini
  
  @JSName("$type")
  var $type: search | select
  
  @JSName("$width")
  var $width: Double
}
object IsLoading {
  
  inline def apply(
    $error: Boolean,
    $isLoading: Boolean,
    $multi: Boolean,
    $required: Boolean,
    $searchable: Boolean,
    $size: default_ | compact | large_ | mini,
    $type: search | select,
    $width: Double
  ): IsLoading = {
    val __obj = js.Dynamic.literal($error = $error.asInstanceOf[js.Any], $isLoading = $isLoading.asInstanceOf[js.Any], $multi = $multi.asInstanceOf[js.Any], $required = $required.asInstanceOf[js.Any], $searchable = $searchable.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], $width = $width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsLoading]
  }
  
  extension [Self <: IsLoading](x: Self) {
    
    inline def set$error(value: Boolean): Self = StObject.set(x, "$error", value.asInstanceOf[js.Any])
    
    inline def set$isLoading(value: Boolean): Self = StObject.set(x, "$isLoading", value.asInstanceOf[js.Any])
    
    inline def set$multi(value: Boolean): Self = StObject.set(x, "$multi", value.asInstanceOf[js.Any])
    
    inline def set$required(value: Boolean): Self = StObject.set(x, "$required", value.asInstanceOf[js.Any])
    
    inline def set$searchable(value: Boolean): Self = StObject.set(x, "$searchable", value.asInstanceOf[js.Any])
    
    inline def set$size(value: default_ | compact | large_ | mini): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
    
    inline def set$type(value: search | select): Self = StObject.set(x, "$type", value.asInstanceOf[js.Any])
    
    inline def set$width(value: Double): Self = StObject.set(x, "$width", value.asInstanceOf[js.Any])
  }
}
