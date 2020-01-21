package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDiscovererResponse extends js.Object {
  /**
    * The description of the discoverer.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * The ARN of the discoverer.
    */
  var DiscovererArn: js.UndefOr[string] = js.native
  /**
    * The ID of the discoverer.
    */
  var DiscovererId: js.UndefOr[string] = js.native
  /**
    * The ARN of the event bus.
    */
  var SourceArn: js.UndefOr[string] = js.native
  /**
    * The state of the discoverer.
    */
  var State: js.UndefOr[DiscovererState] = js.native
  /**
    * Tags associated with the resource.
    */
  var Tags: js.UndefOr[typings.awsSdk.schemasMod.Tags] = js.native
}

object DescribeDiscovererResponse {
  @scala.inline
  def apply(
    Description: string = null,
    DiscovererArn: string = null,
    DiscovererId: string = null,
    SourceArn: string = null,
    State: DiscovererState = null,
    Tags: Tags = null
  ): DescribeDiscovererResponse = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (DiscovererArn != null) __obj.updateDynamic("DiscovererArn")(DiscovererArn.asInstanceOf[js.Any])
    if (DiscovererId != null) __obj.updateDynamic("DiscovererId")(DiscovererId.asInstanceOf[js.Any])
    if (SourceArn != null) __obj.updateDynamic("SourceArn")(SourceArn.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDiscovererResponse]
  }
}

