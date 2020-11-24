package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateSourceAnalysis extends js.Object {
  
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
  implicit class TemplateSourceAnalysisOps[Self <: TemplateSourceAnalysis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSetReferencesVarargs(value: DataSetReference*): Self = this.set("DataSetReferences", js.Array(value :_*))
    
    @scala.inline
    def setDataSetReferences(value: DataSetReferenceList): Self = this.set("DataSetReferences", value.asInstanceOf[js.Any])
  }
}
