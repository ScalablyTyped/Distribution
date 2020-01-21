package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRegistryResponse extends js.Object {
  /**
    * The description of the registry.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * The ARN of the registry.
    */
  var RegistryArn: js.UndefOr[string] = js.native
  /**
    * The name of the registry.
    */
  var RegistryName: js.UndefOr[string] = js.native
  /**
    * Tags associated with the registry.
    */
  var Tags: js.UndefOr[typings.awsSdk.schemasMod.Tags] = js.native
}

object DescribeRegistryResponse {
  @scala.inline
  def apply(
    Description: string = null,
    RegistryArn: string = null,
    RegistryName: string = null,
    Tags: Tags = null
  ): DescribeRegistryResponse = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (RegistryArn != null) __obj.updateDynamic("RegistryArn")(RegistryArn.asInstanceOf[js.Any])
    if (RegistryName != null) __obj.updateDynamic("RegistryName")(RegistryName.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRegistryResponse]
  }
}

