package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoAccountDetailAuthorisedContacts
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * For people with single names this field need not be present. The single name should be in the lastName field
    */
  var firstName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * For people with single names the single name should be in this field
    */
  var lastName: String
  
  /**
    * Field is mandatory but array may be empty
    */
  var middleNames: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Also known as title or salutation. The prefix to the name (e.g. Mr, Mrs, Ms, Miss, Sir, etc)
    */
  var prefix: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Used for a trailing suffix to the name (e.g. Jr)
    */
  var suffix: js.UndefOr[String | Null] = js.undefined
}
object TelcoAccountDetailAuthorisedContacts {
  
  inline def apply(lastName: String): TelcoAccountDetailAuthorisedContacts = {
    val __obj = js.Dynamic.literal(lastName = lastName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelcoAccountDetailAuthorisedContacts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoAccountDetailAuthorisedContacts] (val x: Self) extends AnyVal {
    
    inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    inline def setFirstNameNull: Self = StObject.set(x, "firstName", null)
    
    inline def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
    
    inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    inline def setMiddleNames(value: js.Array[String]): Self = StObject.set(x, "middleNames", value.asInstanceOf[js.Any])
    
    inline def setMiddleNamesNull: Self = StObject.set(x, "middleNames", null)
    
    inline def setMiddleNamesUndefined: Self = StObject.set(x, "middleNames", js.undefined)
    
    inline def setMiddleNamesVarargs(value: String*): Self = StObject.set(x, "middleNames", js.Array(value*))
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixNull: Self = StObject.set(x, "prefix", null)
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixNull: Self = StObject.set(x, "suffix", null)
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
  }
}
