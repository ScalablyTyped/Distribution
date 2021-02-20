package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalysisSourceEntity extends StObject {
  
  /**
    * The source template for the source entity of the analysis.
    */
  var SourceTemplate: js.UndefOr[AnalysisSourceTemplate] = js.native
}
object AnalysisSourceEntity {
  
  @scala.inline
  def apply(): AnalysisSourceEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalysisSourceEntity]
  }
  
  @scala.inline
  implicit class AnalysisSourceEntityMutableBuilder[Self <: AnalysisSourceEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceTemplate(value: AnalysisSourceTemplate): Self = StObject.set(x, "SourceTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTemplateUndefined: Self = StObject.set(x, "SourceTemplate", js.undefined)
  }
}
