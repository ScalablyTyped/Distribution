package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListComponentsOutput extends StObject {
  
  /**
    * An array of components with summary data.
    */
  var components: ComponentSummaryList
  
  /**
    * A token that indicates the location of the next component in the array of components, after the current requested list of components.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListComponentsOutput {
  
  inline def apply(components: ComponentSummaryList): ListComponentsOutput = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListComponentsOutput]
  }
  
  extension [Self <: ListComponentsOutput](x: Self) {
    
    inline def setComponents(value: ComponentSummaryList): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsVarargs(value: ComponentSummary*): Self = StObject.set(x, "components", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
