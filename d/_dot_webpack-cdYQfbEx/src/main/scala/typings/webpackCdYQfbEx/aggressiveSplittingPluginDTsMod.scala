package typings.webpackCdYQfbEx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aggressiveSplittingPluginDTsMod {
  
  trait AggressiveSplittingPluginOptions extends StObject {
    
    /**
    	 * Default: 0
    	 */
    var chunkOverhead: js.UndefOr[Double] = js.undefined
    
    /**
    	 * Default: 1
    	 */
    var entryChunkMultiplicator: js.UndefOr[Double] = js.undefined
    
    /**
    	 * Byte, maxsize of per file. Default: 51200
    	 */
    var maxSize: js.UndefOr[Double] = js.undefined
    
    /**
    	 * Byte, split point. Default: 30720
    	 */
    var minSize: js.UndefOr[Double] = js.undefined
  }
  object AggressiveSplittingPluginOptions {
    
    inline def apply(): AggressiveSplittingPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AggressiveSplittingPluginOptions]
    }
    
    extension [Self <: AggressiveSplittingPluginOptions](x: Self) {
      
      inline def setChunkOverhead(value: Double): Self = StObject.set(x, "chunkOverhead", value.asInstanceOf[js.Any])
      
      inline def setChunkOverheadUndefined: Self = StObject.set(x, "chunkOverhead", js.undefined)
      
      inline def setEntryChunkMultiplicator(value: Double): Self = StObject.set(x, "entryChunkMultiplicator", value.asInstanceOf[js.Any])
      
      inline def setEntryChunkMultiplicatorUndefined: Self = StObject.set(x, "entryChunkMultiplicator", js.undefined)
      
      inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      inline def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
      
      inline def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
    }
  }
}
