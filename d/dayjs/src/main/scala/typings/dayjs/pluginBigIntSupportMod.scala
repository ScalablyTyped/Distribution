package typings.dayjs

import org.scalablytyped.runtime.Shortcut
import typings.dayjs.mod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginBigIntSupportMod extends Shortcut {
  
  @JSImport("dayjs/plugin/bigIntSupport", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[Any] = js.native
  
  type _To = PluginFunc[Any]
  
  /* This means you don't have to write `^`, but can instead just say `pluginBigIntSupportMod.foo` */
  override def _to: PluginFunc[Any] = ^
  
  /* augmented module */
  object dayjsAugmentingMod {
    
    trait ConfigTypeMap extends StObject {
      
      var bigIntSupport: js.BigInt
    }
    object ConfigTypeMap {
      
      inline def apply(bigIntSupport: js.BigInt): ConfigTypeMap = {
        val __obj = js.Dynamic.literal(bigIntSupport = bigIntSupport.asInstanceOf[js.Any])
        __obj.asInstanceOf[ConfigTypeMap]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ConfigTypeMap] (val x: Self) extends AnyVal {
        
        inline def setBigIntSupport(value: js.BigInt): Self = StObject.set(x, "bigIntSupport", value.asInstanceOf[js.Any])
      }
    }
  }
}
