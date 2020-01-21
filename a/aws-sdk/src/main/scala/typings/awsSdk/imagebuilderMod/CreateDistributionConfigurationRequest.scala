package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDistributionConfigurationRequest extends js.Object {
  /**
    *  The idempotency token of the distribution configuration. 
    */
  var clientToken: ClientToken = js.native
  /**
    *  The description of the distribution configuration. 
    */
  var description: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The distributions of the distribution configuration. 
    */
  var distributions: DistributionList = js.native
  /**
    *  The name of the distribution configuration. 
    */
  var name: ResourceName = js.native
  /**
    *  The tags of the distribution configuration. 
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object CreateDistributionConfigurationRequest {
  @scala.inline
  def apply(
    clientToken: ClientToken,
    distributions: DistributionList,
    name: ResourceName,
    description: NonEmptyString = null,
    tags: TagMap = null
  ): CreateDistributionConfigurationRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], distributions = distributions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDistributionConfigurationRequest]
  }
}

