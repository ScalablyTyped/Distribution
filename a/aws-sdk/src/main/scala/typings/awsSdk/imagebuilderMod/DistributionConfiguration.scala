package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionConfiguration extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the distribution configuration.
    */
  var arn: js.UndefOr[ImageBuilderArn] = js.native
  /**
    * The date on which this distribution configuration was created.
    */
  var dateCreated: js.UndefOr[DateTime] = js.native
  /**
    * The date on which this distribution configuration was last updated.
    */
  var dateUpdated: js.UndefOr[DateTime] = js.native
  /**
    * The description of the distribution configuration.
    */
  var description: js.UndefOr[NonEmptyString] = js.native
  /**
    * The distributions of the distribution configuration.
    */
  var distributions: js.UndefOr[DistributionList] = js.native
  /**
    * The name of the distribution configuration.
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The tags of the distribution configuration.
    */
  var tags: js.UndefOr[TagMap] = js.native
  /**
    * The maximum duration in minutes for this distribution configuration.
    */
  var timeoutMinutes: DistributionTimeoutMinutes = js.native
}

object DistributionConfiguration {
  @scala.inline
  def apply(
    timeoutMinutes: DistributionTimeoutMinutes,
    arn: ImageBuilderArn = null,
    dateCreated: DateTime = null,
    dateUpdated: DateTime = null,
    description: NonEmptyString = null,
    distributions: DistributionList = null,
    name: ResourceName = null,
    tags: TagMap = null
  ): DistributionConfiguration = {
    val __obj = js.Dynamic.literal(timeoutMinutes = timeoutMinutes.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (dateCreated != null) __obj.updateDynamic("dateCreated")(dateCreated.asInstanceOf[js.Any])
    if (dateUpdated != null) __obj.updateDynamic("dateUpdated")(dateUpdated.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (distributions != null) __obj.updateDynamic("distributions")(distributions.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionConfiguration]
  }
}

