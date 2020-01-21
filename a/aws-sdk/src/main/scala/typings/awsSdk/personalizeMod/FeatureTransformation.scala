package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureTransformation extends js.Object {
  /**
    * The creation date and time (in Unix time) of the feature transformation.
    */
  var creationDateTime: js.UndefOr[Date] = js.native
  /**
    * Provides the default parameters for feature transformation.
    */
  var defaultParameters: js.UndefOr[FeaturizationParameters] = js.native
  /**
    * The Amazon Resource Name (ARN) of the FeatureTransformation object.
    */
  var featureTransformationArn: js.UndefOr[Arn] = js.native
  /**
    * The last update date and time (in Unix time) of the feature transformation.
    */
  var lastUpdatedDateTime: js.UndefOr[Date] = js.native
  /**
    * The name of the feature transformation.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The status of the feature transformation. A feature transformation can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED  
    */
  var status: js.UndefOr[Status] = js.native
}

object FeatureTransformation {
  @scala.inline
  def apply(
    creationDateTime: Date = null,
    defaultParameters: FeaturizationParameters = null,
    featureTransformationArn: Arn = null,
    lastUpdatedDateTime: Date = null,
    name: Name = null,
    status: Status = null
  ): FeatureTransformation = {
    val __obj = js.Dynamic.literal()
    if (creationDateTime != null) __obj.updateDynamic("creationDateTime")(creationDateTime.asInstanceOf[js.Any])
    if (defaultParameters != null) __obj.updateDynamic("defaultParameters")(defaultParameters.asInstanceOf[js.Any])
    if (featureTransformationArn != null) __obj.updateDynamic("featureTransformationArn")(featureTransformationArn.asInstanceOf[js.Any])
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureTransformation]
  }
}

