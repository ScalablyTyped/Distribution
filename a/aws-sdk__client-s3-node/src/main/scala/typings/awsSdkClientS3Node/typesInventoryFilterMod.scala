package typings.awsSdkClientS3Node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInventoryFilterMod {
  
  @js.native
  trait InventoryFilter extends StObject {
    
    /**
      * <p>The prefix that an object must have to be included in the inventory results.</p>
      */
    var Prefix: String = js.native
  }
  object InventoryFilter {
    
    @scala.inline
    def apply(Prefix: String): InventoryFilter = {
      val __obj = js.Dynamic.literal(Prefix = Prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[InventoryFilter]
    }
    
    @scala.inline
    implicit class InventoryFilterMutableBuilder[Self <: InventoryFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    }
  }
  
  type UnmarshalledInventoryFilter = InventoryFilter
}
