package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GreenPercentage
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Percentage of green power intrinsically included in the plan
    */
  var greenPercentage: String
}
object GreenPercentage {
  
  inline def apply(greenPercentage: String): GreenPercentage = {
    val __obj = js.Dynamic.literal(greenPercentage = greenPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[GreenPercentage]
  }
  
  extension [Self <: GreenPercentage](x: Self) {
    
    inline def setGreenPercentage(value: String): Self = StObject.set(x, "greenPercentage", value.asInstanceOf[js.Any])
  }
}
