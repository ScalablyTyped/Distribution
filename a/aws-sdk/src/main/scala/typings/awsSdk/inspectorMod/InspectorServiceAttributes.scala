package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InspectorServiceAttributes extends js.Object {
  
  /**
    * The ARN of the assessment run during which the finding is generated.
    */
  var assessmentRunArn: js.UndefOr[Arn] = js.native
  
  /**
    * The ARN of the rules package that is used to generate the finding.
    */
  var rulesPackageArn: js.UndefOr[Arn] = js.native
  
  /**
    * The schema version of this data type.
    */
  var schemaVersion: NumericVersion = js.native
}
object InspectorServiceAttributes {
  
  @scala.inline
  def apply(schemaVersion: NumericVersion): InspectorServiceAttributes = {
    val __obj = js.Dynamic.literal(schemaVersion = schemaVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectorServiceAttributes]
  }
  
  @scala.inline
  implicit class InspectorServiceAttributesOps[Self <: InspectorServiceAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSchemaVersion(value: NumericVersion): Self = this.set("schemaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssessmentRunArn(value: Arn): Self = this.set("assessmentRunArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssessmentRunArn: Self = this.set("assessmentRunArn", js.undefined)
    
    @scala.inline
    def setRulesPackageArn(value: Arn): Self = this.set("rulesPackageArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRulesPackageArn: Self = this.set("rulesPackageArn", js.undefined)
  }
}
