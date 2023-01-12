package typings.checCommerceJs

import typings.checCommerceJs.typesPriceMod.Price
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSelectedVariantMod {
  
  trait SelectedVariant extends StObject {
    
    var group_id: String
    
    var group_name: String
    
    var option_id: String
    
    var option_name: String
    
    var price: Price
  }
  object SelectedVariant {
    
    inline def apply(group_id: String, group_name: String, option_id: String, option_name: String, price: Price): SelectedVariant = {
      val __obj = js.Dynamic.literal(group_id = group_id.asInstanceOf[js.Any], group_name = group_name.asInstanceOf[js.Any], option_id = option_id.asInstanceOf[js.Any], option_name = option_name.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectedVariant]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectedVariant] (val x: Self) extends AnyVal {
      
      inline def setGroup_id(value: String): Self = StObject.set(x, "group_id", value.asInstanceOf[js.Any])
      
      inline def setGroup_name(value: String): Self = StObject.set(x, "group_name", value.asInstanceOf[js.Any])
      
      inline def setOption_id(value: String): Self = StObject.set(x, "option_id", value.asInstanceOf[js.Any])
      
      inline def setOption_name(value: String): Self = StObject.set(x, "option_name", value.asInstanceOf[js.Any])
      
      inline def setPrice(value: Price): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    }
  }
}
