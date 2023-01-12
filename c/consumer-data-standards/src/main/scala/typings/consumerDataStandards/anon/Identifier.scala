package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.ABN
import typings.consumerDataStandards.consumerDataStandardsStrings.EMAIL
import typings.consumerDataStandards.consumerDataStandardsStrings.ORG_IDENTIFIER
import typings.consumerDataStandards.consumerDataStandardsStrings.TELEPHONE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Identifier
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The identifier of the PayID (dependent on type)
    */
  var identifier: String
  
  /**
    * The name assigned to the PayID by the owner of the PayID
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of the PayID
    */
  var `type`: ABN | EMAIL | ORG_IDENTIFIER | TELEPHONE
}
object Identifier {
  
  inline def apply(identifier: String, `type`: ABN | EMAIL | ORG_IDENTIFIER | TELEPHONE): Identifier = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Identifier] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: ABN | EMAIL | ORG_IDENTIFIER | TELEPHONE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
