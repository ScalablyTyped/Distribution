package typings.awsSdk.ssmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemIdentifier extends StObject {
  
  /**
    * The type of related item. 
    */
  var `type`: ItemType
  
  /**
    * Details about the related item.
    */
  var value: ItemValue
}
object ItemIdentifier {
  
  inline def apply(`type`: ItemType, value: ItemValue): ItemIdentifier = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemIdentifier]
  }
  
  extension [Self <: ItemIdentifier](x: Self) {
    
    inline def setType(value: ItemType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: ItemValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
