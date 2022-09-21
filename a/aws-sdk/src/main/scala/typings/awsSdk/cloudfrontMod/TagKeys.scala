package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagKeys extends StObject {
  
  /**
    *  A complex type that contains Tag key elements.
    */
  var Items: js.UndefOr[TagKeyList] = js.undefined
}
object TagKeys {
  
  inline def apply(): TagKeys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagKeys]
  }
  
  extension [Self <: TagKeys](x: Self) {
    
    inline def setItems(value: TagKeyList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: TagKey*): Self = StObject.set(x, "Items", js.Array(value*))
  }
}
