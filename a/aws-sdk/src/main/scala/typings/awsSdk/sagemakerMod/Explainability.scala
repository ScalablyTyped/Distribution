package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Explainability extends StObject {
  
  /**
    * The explainability report for a model.
    */
  var Report: js.UndefOr[MetricsSource] = js.undefined
}
object Explainability {
  
  inline def apply(): Explainability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Explainability]
  }
  
  extension [Self <: Explainability](x: Self) {
    
    inline def setReport(value: MetricsSource): Self = StObject.set(x, "Report", value.asInstanceOf[js.Any])
    
    inline def setReportUndefined: Self = StObject.set(x, "Report", js.undefined)
  }
}
