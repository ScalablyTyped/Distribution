package typings.awsSdk.fisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteExperimentTemplateResponse extends StObject {
  
  /**
    * Information about the experiment template.
    */
  var experimentTemplate: js.UndefOr[ExperimentTemplate] = js.undefined
}
object DeleteExperimentTemplateResponse {
  
  inline def apply(): DeleteExperimentTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteExperimentTemplateResponse]
  }
  
  extension [Self <: DeleteExperimentTemplateResponse](x: Self) {
    
    inline def setExperimentTemplate(value: ExperimentTemplate): Self = StObject.set(x, "experimentTemplate", value.asInstanceOf[js.Any])
    
    inline def setExperimentTemplateUndefined: Self = StObject.set(x, "experimentTemplate", js.undefined)
  }
}
