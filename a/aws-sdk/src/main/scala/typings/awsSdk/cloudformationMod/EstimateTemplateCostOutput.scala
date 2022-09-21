package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EstimateTemplateCostOutput extends StObject {
  
  /**
    * An Amazon Web Services Simple Monthly Calculator URL with a query string that describes the resources required to run the template.
    */
  var Url: js.UndefOr[typings.awsSdk.cloudformationMod.Url] = js.undefined
}
object EstimateTemplateCostOutput {
  
  inline def apply(): EstimateTemplateCostOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EstimateTemplateCostOutput]
  }
  
  extension [Self <: EstimateTemplateCostOutput](x: Self) {
    
    inline def setUrl(value: Url): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
