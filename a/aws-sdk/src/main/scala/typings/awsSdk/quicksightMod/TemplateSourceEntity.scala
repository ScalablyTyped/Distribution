package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateSourceEntity extends StObject {
  
  /**
    * The source analysis, if it is based on an analysis.
    */
  var SourceAnalysis: js.UndefOr[TemplateSourceAnalysis] = js.undefined
  
  /**
    * The source template, if it is based on an template.
    */
  var SourceTemplate: js.UndefOr[TemplateSourceTemplate] = js.undefined
}
object TemplateSourceEntity {
  
  @scala.inline
  def apply(): TemplateSourceEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateSourceEntity]
  }
  
  @scala.inline
  implicit class TemplateSourceEntityMutableBuilder[Self <: TemplateSourceEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceAnalysis(value: TemplateSourceAnalysis): Self = StObject.set(x, "SourceAnalysis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceAnalysisUndefined: Self = StObject.set(x, "SourceAnalysis", js.undefined)
    
    @scala.inline
    def setSourceTemplate(value: TemplateSourceTemplate): Self = StObject.set(x, "SourceTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTemplateUndefined: Self = StObject.set(x, "SourceTemplate", js.undefined)
  }
}
