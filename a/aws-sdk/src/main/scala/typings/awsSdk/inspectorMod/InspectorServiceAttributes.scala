package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InspectorServiceAttributes extends StObject {
  
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
  implicit class InspectorServiceAttributesMutableBuilder[Self <: InspectorServiceAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssessmentRunArn(value: Arn): Self = StObject.set(x, "assessmentRunArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssessmentRunArnUndefined: Self = StObject.set(x, "assessmentRunArn", js.undefined)
    
    @scala.inline
    def setRulesPackageArn(value: Arn): Self = StObject.set(x, "rulesPackageArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesPackageArnUndefined: Self = StObject.set(x, "rulesPackageArn", js.undefined)
    
    @scala.inline
    def setSchemaVersion(value: NumericVersion): Self = StObject.set(x, "schemaVersion", value.asInstanceOf[js.Any])
  }
}
