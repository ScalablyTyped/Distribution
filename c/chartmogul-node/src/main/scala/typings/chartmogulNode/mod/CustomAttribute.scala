package typings.chartmogulNode.mod

import typings.chartmogulNode.anon.Custom
import typings.chartmogulNode.anon.CustomArray
import typings.chartmogulNode.anon.CustomStrings
import typings.chartmogulNode.commonMod.Entries
import typings.chartmogulNode.commonMod.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CustomAttribute {
  
  @JSImport("chartmogul-node", "CustomAttribute")
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(config: Config, uuid: String, data: Custom): js.Promise[Entries[typings.chartmogulNode.mod.Customer.Customer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(config.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Entries[typings.chartmogulNode.mod.Customer.Customer]]]
  inline def add(config: Config, uuid: String, data: CustomArray): js.Promise[CustomAttributes] = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(config.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CustomAttributes]]
  
  inline def remove(config: Config, uuid: String, data: CustomStrings): js.Promise[CustomAttributes] = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(config.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CustomAttributes]]
  
  inline def update(config: Config, uuid: String, data: CustomAttributes): js.Promise[CustomAttributes] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(config.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CustomAttributes]]
  
  trait CustomAttributes extends StObject {
    
    var custom: Map
  }
  object CustomAttributes {
    
    inline def apply(custom: Map): CustomAttributes = {
      val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomAttributes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomAttributes] (val x: Self) extends AnyVal {
      
      inline def setCustom(value: Map): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    }
  }
}
