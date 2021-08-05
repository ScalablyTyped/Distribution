package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisSourceEntity extends StObject {
  
  /**
    * The source template for the source entity of the analysis.
    */
  var SourceTemplate: js.UndefOr[AnalysisSourceTemplate] = js.undefined
}
object AnalysisSourceEntity {
  
  inline def apply(): AnalysisSourceEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalysisSourceEntity]
  }
  
  extension [Self <: AnalysisSourceEntity](x: Self) {
    
    inline def setSourceTemplate(value: AnalysisSourceTemplate): Self = StObject.set(x, "SourceTemplate", value.asInstanceOf[js.Any])
    
    inline def setSourceTemplateUndefined: Self = StObject.set(x, "SourceTemplate", js.undefined)
  }
}
