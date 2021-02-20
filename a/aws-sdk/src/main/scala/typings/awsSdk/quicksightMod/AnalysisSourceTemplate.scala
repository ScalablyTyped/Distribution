package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalysisSourceTemplate extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the source template of an analysis.
    */
  var Arn: typings.awsSdk.quicksightMod.Arn = js.native
  
  /**
    * The dataset references of the source template of an analysis.
    */
  var DataSetReferences: DataSetReferenceList = js.native
}
object AnalysisSourceTemplate {
  
  @scala.inline
  def apply(Arn: Arn, DataSetReferences: DataSetReferenceList): AnalysisSourceTemplate = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], DataSetReferences = DataSetReferences.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalysisSourceTemplate]
  }
  
  @scala.inline
  implicit class AnalysisSourceTemplateMutableBuilder[Self <: AnalysisSourceTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSetReferences(value: DataSetReferenceList): Self = StObject.set(x, "DataSetReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSetReferencesVarargs(value: DataSetReference*): Self = StObject.set(x, "DataSetReferences", js.Array(value :_*))
  }
}
