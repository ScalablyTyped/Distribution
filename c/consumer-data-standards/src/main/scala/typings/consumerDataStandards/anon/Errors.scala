package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Errors
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Number of calls resulting in error due to server execution over time
    */
  var errors: Dictk
  
  /**
    * Number of calls rejected due to traffic thresholds over time
    */
  var rejections: Dictk
}
object Errors {
  
  inline def apply(errors: Dictk, rejections: Dictk): Errors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], rejections = rejections.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Errors] (val x: Self) extends AnyVal {
    
    inline def setErrors(value: Dictk): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setRejections(value: Dictk): Self = StObject.set(x, "rejections", value.asInstanceOf[js.Any])
  }
}
