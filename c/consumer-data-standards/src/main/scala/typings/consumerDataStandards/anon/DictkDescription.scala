package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictkDescription
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Description of the event and conditions that will result in the payment. Expected to be formatted for display to a customer
    */
  var description: String
}
object DictkDescription {
  
  inline def apply(description: String): DictkDescription = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictkDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DictkDescription] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
  }
}
