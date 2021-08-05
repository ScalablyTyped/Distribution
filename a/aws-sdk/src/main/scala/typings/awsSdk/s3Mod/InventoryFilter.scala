package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventoryFilter extends StObject {
  
  /**
    * The prefix that an object must have to be included in the inventory results.
    */
  var Prefix: typings.awsSdk.s3Mod.Prefix
}
object InventoryFilter {
  
  inline def apply(Prefix: Prefix): InventoryFilter = {
    val __obj = js.Dynamic.literal(Prefix = Prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryFilter]
  }
  
  extension [Self <: InventoryFilter](x: Self) {
    
    inline def setPrefix(value: Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
  }
}
