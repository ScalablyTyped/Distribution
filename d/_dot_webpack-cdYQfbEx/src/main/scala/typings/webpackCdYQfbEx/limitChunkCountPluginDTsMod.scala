package typings.webpackCdYQfbEx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object limitChunkCountPluginDTsMod {
  
  trait LimitChunkCountPluginOptions extends StObject {
    
    /**
    	 * Limit the maximum number of chunks using a value greater greater than or equal to 1
    	 */
    var maxChunks: js.UndefOr[Double] = js.undefined
    
    /**
    	 * Set a minimum chunk size
    	 */
    var minChunkSize: js.UndefOr[Double] = js.undefined
  }
  object LimitChunkCountPluginOptions {
    
    inline def apply(): LimitChunkCountPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LimitChunkCountPluginOptions]
    }
    
    extension [Self <: LimitChunkCountPluginOptions](x: Self) {
      
      inline def setMaxChunks(value: Double): Self = StObject.set(x, "maxChunks", value.asInstanceOf[js.Any])
      
      inline def setMaxChunksUndefined: Self = StObject.set(x, "maxChunks", js.undefined)
      
      inline def setMinChunkSize(value: Double): Self = StObject.set(x, "minChunkSize", value.asInstanceOf[js.Any])
      
      inline def setMinChunkSizeUndefined: Self = StObject.set(x, "minChunkSize", js.undefined)
    }
  }
}
