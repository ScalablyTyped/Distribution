package typings.webpackCdYQfbEx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object minChunkSizePluginDTsMod {
  
  trait MinChunkSizePluginOptions extends StObject {
    
    /**
    	 * Minimum number of characters
    	 */
    var minChunkSize: Double
  }
  object MinChunkSizePluginOptions {
    
    inline def apply(minChunkSize: Double): MinChunkSizePluginOptions = {
      val __obj = js.Dynamic.literal(minChunkSize = minChunkSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[MinChunkSizePluginOptions]
    }
    
    extension [Self <: MinChunkSizePluginOptions](x: Self) {
      
      inline def setMinChunkSize(value: Double): Self = StObject.set(x, "minChunkSize", value.asInstanceOf[js.Any])
    }
  }
}
