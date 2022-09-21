package typings.webpackCdYQfbEx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object occurrenceOrderModuleIdsPluginDTsMod {
  
  trait OccurrenceOrderModuleIdsPluginOptions extends StObject {
    
    /**
    	 * Prioritise initial size over total size
    	 */
    var prioritiseInitial: js.UndefOr[Boolean] = js.undefined
  }
  object OccurrenceOrderModuleIdsPluginOptions {
    
    inline def apply(): OccurrenceOrderModuleIdsPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OccurrenceOrderModuleIdsPluginOptions]
    }
    
    extension [Self <: OccurrenceOrderModuleIdsPluginOptions](x: Self) {
      
      inline def setPrioritiseInitial(value: Boolean): Self = StObject.set(x, "prioritiseInitial", value.asInstanceOf[js.Any])
      
      inline def setPrioritiseInitialUndefined: Self = StObject.set(x, "prioritiseInitial", js.undefined)
    }
  }
}
