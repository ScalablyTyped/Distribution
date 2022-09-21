package typings.webpackCdYQfbEx.webpackOptionsDTsMod

import org.scalablytyped.runtime.StringDictionary
import typings.webpackCdYQfbEx.anon.AutomaticNameDelimiter
import typings.webpackCdYQfbEx.anon.MaxSize
import typings.webpackCdYQfbEx.webpackCdYQfbExBooleans.`false`
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.all
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.async
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.initial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptimizationSplitChunksOptions extends StObject {
  
  /**
  	 * Sets the name delimiter for created chunks
  	 */
  var automaticNameDelimiter: js.UndefOr[String] = js.undefined
  
  /**
  	 * Sets the max length for the name of a created chunk
  	 */
  var automaticNameMaxLength: js.UndefOr[Double] = js.undefined
  
  /**
  	 * Assign modules to a cache group (modules from different cache groups are tried to keep in separate chunks)
  	 */
  var cacheGroups: js.UndefOr[
    /**
  		 * Configuration for a cache group
  		 */
  StringDictionary[`false` | js.Function | String | js.RegExp | AutomaticNameDelimiter]
  ] = js.undefined
  
  /**
  	 * Select chunks for determining shared modules (defaults to "async", "initial" and "all" requires adding these chunks to the HTML)
  	 */
  var chunks: js.UndefOr[initial | async | all | js.Function] = js.undefined
  
  /**
  	 * Size threshold at which splitting is enforced and other restrictions (maxAsyncRequests, maxInitialRequests) are ignored.
  	 */
  var enforceSizeThreshold: js.UndefOr[Double] = js.undefined
  
  /**
  	 * Options for modules not selected by any other cache group
  	 */
  var fallbackCacheGroup: js.UndefOr[MaxSize] = js.undefined
  
  /**
  	 * Sets the template for the filename for created chunks (Only works for initial chunks)
  	 */
  var filename: js.UndefOr[String] = js.undefined
  
  /**
  	 * Prevents exposing path info when creating names for parts splitted by maxSize
  	 */
  var hidePathInfo: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Maximum number of requests which are accepted for on-demand loading
  	 */
  var maxAsyncRequests: js.UndefOr[Double] = js.undefined
  
  /**
  	 * Maximum number of initial chunks which are accepted for an entry point
  	 */
  var maxInitialRequests: js.UndefOr[Double] = js.undefined
  
  /**
  	 * Maximal size hint for the created chunks
  	 */
  var maxSize: js.UndefOr[Double] = js.undefined
  
  /**
  	 * Minimum number of times a module has to be duplicated until it's considered for splitting
  	 */
  var minChunks: js.UndefOr[Double] = js.undefined
  
  /**
  	 * Minimal size for the created chunks
  	 */
  var minSize: js.UndefOr[Double] = js.undefined
  
  /**
  	 * Give chunks created a name (chunks with equal name are merged)
  	 */
  var name: js.UndefOr[Boolean | js.Function | String] = js.undefined
}
object OptimizationSplitChunksOptions {
  
  inline def apply(): OptimizationSplitChunksOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptimizationSplitChunksOptions]
  }
  
  extension [Self <: OptimizationSplitChunksOptions](x: Self) {
    
    inline def setAutomaticNameDelimiter(value: String): Self = StObject.set(x, "automaticNameDelimiter", value.asInstanceOf[js.Any])
    
    inline def setAutomaticNameDelimiterUndefined: Self = StObject.set(x, "automaticNameDelimiter", js.undefined)
    
    inline def setAutomaticNameMaxLength(value: Double): Self = StObject.set(x, "automaticNameMaxLength", value.asInstanceOf[js.Any])
    
    inline def setAutomaticNameMaxLengthUndefined: Self = StObject.set(x, "automaticNameMaxLength", js.undefined)
    
    inline def setCacheGroups(
      value: /**
    		 * Configuration for a cache group
    		 */
    StringDictionary[`false` | js.Function | String | js.RegExp | AutomaticNameDelimiter]
    ): Self = StObject.set(x, "cacheGroups", value.asInstanceOf[js.Any])
    
    inline def setCacheGroupsUndefined: Self = StObject.set(x, "cacheGroups", js.undefined)
    
    inline def setChunks(value: initial | async | all | js.Function): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
    
    inline def setChunksUndefined: Self = StObject.set(x, "chunks", js.undefined)
    
    inline def setEnforceSizeThreshold(value: Double): Self = StObject.set(x, "enforceSizeThreshold", value.asInstanceOf[js.Any])
    
    inline def setEnforceSizeThresholdUndefined: Self = StObject.set(x, "enforceSizeThreshold", js.undefined)
    
    inline def setFallbackCacheGroup(value: MaxSize): Self = StObject.set(x, "fallbackCacheGroup", value.asInstanceOf[js.Any])
    
    inline def setFallbackCacheGroupUndefined: Self = StObject.set(x, "fallbackCacheGroup", js.undefined)
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setHidePathInfo(value: Boolean): Self = StObject.set(x, "hidePathInfo", value.asInstanceOf[js.Any])
    
    inline def setHidePathInfoUndefined: Self = StObject.set(x, "hidePathInfo", js.undefined)
    
    inline def setMaxAsyncRequests(value: Double): Self = StObject.set(x, "maxAsyncRequests", value.asInstanceOf[js.Any])
    
    inline def setMaxAsyncRequestsUndefined: Self = StObject.set(x, "maxAsyncRequests", js.undefined)
    
    inline def setMaxInitialRequests(value: Double): Self = StObject.set(x, "maxInitialRequests", value.asInstanceOf[js.Any])
    
    inline def setMaxInitialRequestsUndefined: Self = StObject.set(x, "maxInitialRequests", js.undefined)
    
    inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    inline def setMinChunks(value: Double): Self = StObject.set(x, "minChunks", value.asInstanceOf[js.Any])
    
    inline def setMinChunksUndefined: Self = StObject.set(x, "minChunks", js.undefined)
    
    inline def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    inline def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
    
    inline def setName(value: Boolean | js.Function | String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
