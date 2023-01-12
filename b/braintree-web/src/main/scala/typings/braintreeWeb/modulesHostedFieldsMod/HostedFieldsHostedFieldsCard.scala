package typings.braintreeWeb.modulesHostedFieldsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostedFieldsHostedFieldsCard extends StObject {
  
  var code: HostedFieldsCardCode
  
  var niceType: String
  
  var `type`: String
}
object HostedFieldsHostedFieldsCard {
  
  inline def apply(code: HostedFieldsCardCode, niceType: String, `type`: String): HostedFieldsHostedFieldsCard = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], niceType = niceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedFieldsHostedFieldsCard]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HostedFieldsHostedFieldsCard] (val x: Self) extends AnyVal {
    
    inline def setCode(value: HostedFieldsCardCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setNiceType(value: String): Self = StObject.set(x, "niceType", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
