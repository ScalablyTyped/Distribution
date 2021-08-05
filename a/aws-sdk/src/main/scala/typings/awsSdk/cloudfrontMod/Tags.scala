package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tags extends StObject {
  
  /**
    *  A complex type that contains Tag elements.
    */
  var Items: js.UndefOr[TagList] = js.undefined
}
object Tags {
  
  inline def apply(): Tags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tags]
  }
  
  extension [Self <: Tags](x: Self) {
    
    inline def setItems(value: TagList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: Tag*): Self = StObject.set(x, "Items", js.Array(value :_*))
  }
}
