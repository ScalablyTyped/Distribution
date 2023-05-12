package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContractUri
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * URI of the contract conditions
    */
  var contractUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Description of the contract
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Minimum contract duration in months
    */
  var duration: Double
  
  /**
    * Name of the contract
    */
  var name: String
}
object ContractUri {
  
  inline def apply(duration: Double, name: String): ContractUri = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContractUri]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContractUri] (val x: Self) extends AnyVal {
    
    inline def setContractUri(value: String): Self = StObject.set(x, "contractUri", value.asInstanceOf[js.Any])
    
    inline def setContractUriNull: Self = StObject.set(x, "contractUri", null)
    
    inline def setContractUriUndefined: Self = StObject.set(x, "contractUri", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
