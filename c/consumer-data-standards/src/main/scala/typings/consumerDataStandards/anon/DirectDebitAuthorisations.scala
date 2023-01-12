package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectDebitAuthorisations
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The list of authorisations returned
    */
  var directDebitAuthorisations: js.Array[AuthorisedEntity]
}
object DirectDebitAuthorisations {
  
  inline def apply(directDebitAuthorisations: js.Array[AuthorisedEntity]): DirectDebitAuthorisations = {
    val __obj = js.Dynamic.literal(directDebitAuthorisations = directDebitAuthorisations.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectDebitAuthorisations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectDebitAuthorisations] (val x: Self) extends AnyVal {
    
    inline def setDirectDebitAuthorisations(value: js.Array[AuthorisedEntity]): Self = StObject.set(x, "directDebitAuthorisations", value.asInstanceOf[js.Any])
    
    inline def setDirectDebitAuthorisationsVarargs(value: AuthorisedEntity*): Self = StObject.set(x, "directDebitAuthorisations", js.Array(value*))
  }
}
