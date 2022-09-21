package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bias extends StObject {
  
  /**
    * The post-training bias report for a model.
    */
  var PostTrainingReport: js.UndefOr[MetricsSource] = js.undefined
  
  /**
    * The pre-training bias report for a model.
    */
  var PreTrainingReport: js.UndefOr[MetricsSource] = js.undefined
  
  /**
    * The bias report for a model
    */
  var Report: js.UndefOr[MetricsSource] = js.undefined
}
object Bias {
  
  inline def apply(): Bias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bias]
  }
  
  extension [Self <: Bias](x: Self) {
    
    inline def setPostTrainingReport(value: MetricsSource): Self = StObject.set(x, "PostTrainingReport", value.asInstanceOf[js.Any])
    
    inline def setPostTrainingReportUndefined: Self = StObject.set(x, "PostTrainingReport", js.undefined)
    
    inline def setPreTrainingReport(value: MetricsSource): Self = StObject.set(x, "PreTrainingReport", value.asInstanceOf[js.Any])
    
    inline def setPreTrainingReportUndefined: Self = StObject.set(x, "PreTrainingReport", js.undefined)
    
    inline def setReport(value: MetricsSource): Self = StObject.set(x, "Report", value.asInstanceOf[js.Any])
    
    inline def setReportUndefined: Self = StObject.set(x, "Report", js.undefined)
  }
}
