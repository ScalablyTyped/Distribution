package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(schemaVersion: NumericVersion, assessmentRunArn: Arn = null, rulesPackageArn: Arn = null): InspectorServiceAttributes = {
    val __obj = js.Dynamic.literal(schemaVersion = schemaVersion.asInstanceOf[js.Any])
    if (assessmentRunArn != null) __obj.updateDynamic("assessmentRunArn")(assessmentRunArn.asInstanceOf[js.Any])
    if (rulesPackageArn != null) __obj.updateDynamic("rulesPackageArn")(rulesPackageArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectorServiceAttributes]
  }
}

