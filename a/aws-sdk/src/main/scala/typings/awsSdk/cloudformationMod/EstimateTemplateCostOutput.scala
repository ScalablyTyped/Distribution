package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EstimateTemplateCostOutput extends StObject {
  
  /**
    * An AWS Simple Monthly Calculator URL with a query string that describes the resources required to run the template.
    */
  var Url: js.UndefOr[typings.awsSdk.cloudformationMod.Url] = js.native
}
object EstimateTemplateCostOutput {
  
  @scala.inline
  def apply(): EstimateTemplateCostOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EstimateTemplateCostOutput]
  }
  
  @scala.inline
  implicit class EstimateTemplateCostOutputMutableBuilder[Self <: EstimateTemplateCostOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: Url): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
