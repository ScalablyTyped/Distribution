package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Summary extends StObject {
  
  /**
    * The finding classification of the recommendation.
    */
  var name: js.UndefOr[Finding] = js.undefined
  
  /**
    * The value of the recommendation summary.
    */
  var value: js.UndefOr[SummaryValue] = js.undefined
}
object Summary {
  
  inline def apply(): Summary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Summary]
  }
  
  extension [Self <: Summary](x: Self) {
    
    inline def setName(value: Finding): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: SummaryValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
