package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateSourceAnalysis extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var Arn: typings.awsSdk.quicksightMod.Arn = js.native
  
  /**
    * A structure containing information about the dataset references used as placeholders in the template.
    */
  var DataSetReferences: DataSetReferenceList = js.native
}
object TemplateSourceAnalysis {
  
  @scala.inline
  def apply(Arn: Arn, DataSetReferences: DataSetReferenceList): TemplateSourceAnalysis = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], DataSetReferences = DataSetReferences.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateSourceAnalysis]
  }
  
  @scala.inline
  implicit class TemplateSourceAnalysisMutableBuilder[Self <: TemplateSourceAnalysis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSetReferences(value: DataSetReferenceList): Self = StObject.set(x, "DataSetReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSetReferencesVarargs(value: DataSetReference*): Self = StObject.set(x, "DataSetReferences", js.Array(value :_*))
  }
}
