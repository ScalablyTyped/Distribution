package typings.consumerDataStandards.adminMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.Dictk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecondaryHolderMetrics
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Number of calls resulting in error due to server execution over time
    */
  var errors: Dictk
  
  /**
    * Number of calls resulting in a rejection due to server execution over time
    */
  var rejections: Dictk
}
object SecondaryHolderMetrics {
  
  inline def apply(errors: Dictk, rejections: Dictk): SecondaryHolderMetrics = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], rejections = rejections.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecondaryHolderMetrics]
  }
  
  extension [Self <: SecondaryHolderMetrics](x: Self) {
    
    inline def setErrors(value: Dictk): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setRejections(value: Dictk): Self = StObject.set(x, "rejections", value.asInstanceOf[js.Any])
  }
}
