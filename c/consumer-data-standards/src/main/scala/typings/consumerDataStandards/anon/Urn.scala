package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Urn
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The CDR error code URN which the application-specific error code extends. Mandatory if the error `code` is an application-specific error rather than a standardised error code.
    */
  var urn: js.UndefOr[String | Null] = js.undefined
}
object Urn {
  
  inline def apply(): Urn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Urn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Urn] (val x: Self) extends AnyVal {
    
    inline def setUrn(value: String): Self = StObject.set(x, "urn", value.asInstanceOf[js.Any])
    
    inline def setUrnNull: Self = StObject.set(x, "urn", null)
    
    inline def setUrnUndefined: Self = StObject.set(x, "urn", js.undefined)
  }
}
