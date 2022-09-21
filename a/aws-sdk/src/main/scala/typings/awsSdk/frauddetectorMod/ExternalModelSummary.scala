package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalModelSummary extends StObject {
  
  /**
    * The endpoint of the Amazon SageMaker model.
    */
  var modelEndpoint: js.UndefOr[String] = js.undefined
  
  /**
    * The source of the model.
    */
  var modelSource: js.UndefOr[ModelSource] = js.undefined
}
object ExternalModelSummary {
  
  inline def apply(): ExternalModelSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalModelSummary]
  }
  
  extension [Self <: ExternalModelSummary](x: Self) {
    
    inline def setModelEndpoint(value: String): Self = StObject.set(x, "modelEndpoint", value.asInstanceOf[js.Any])
    
    inline def setModelEndpointUndefined: Self = StObject.set(x, "modelEndpoint", js.undefined)
    
    inline def setModelSource(value: ModelSource): Self = StObject.set(x, "modelSource", value.asInstanceOf[js.Any])
    
    inline def setModelSourceUndefined: Self = StObject.set(x, "modelSource", js.undefined)
  }
}
