package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LastName
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * For people with single names this field need not be present. The single name should be in the lastName field
    */
  var firstName: js.UndefOr[String] = js.undefined
  
  /**
    * For people with single names the single name should be in this field
    */
  var lastName: String
  
  /**
    * Field is mandatory but array may be empty
    */
  var middleNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Also known as title or salutation. The prefix to the name (e.g. Mr, Mrs, Ms, Miss, Sir, etc)
    */
  var prefix: js.UndefOr[String] = js.undefined
  
  /**
    * Used for a trailing suffix to the name (e.g. Jr)
    */
  var suffix: js.UndefOr[String] = js.undefined
}
object LastName {
  
  inline def apply(lastName: String): LastName = {
    val __obj = js.Dynamic.literal(lastName = lastName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LastName] (val x: Self) extends AnyVal {
    
    inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    inline def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
    
    inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    inline def setMiddleNames(value: js.Array[String]): Self = StObject.set(x, "middleNames", value.asInstanceOf[js.Any])
    
    inline def setMiddleNamesUndefined: Self = StObject.set(x, "middleNames", js.undefined)
    
    inline def setMiddleNamesVarargs(value: String*): Self = StObject.set(x, "middleNames", js.Array(value*))
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
  }
}
