package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCapacityProviderRequest extends js.Object {
  /**
    * The details of the Auto Scaling group for the capacity provider.
    */
  var autoScalingGroupProvider: AutoScalingGroupProvider = js.native
  /**
    * The name of the capacity provider. Up to 255 characters are allowed, including letters (upper and lowercase), numbers, underscores, and hyphens. The name cannot be prefixed with "aws", "ecs", or "fargate".
    */
  var name: String = js.native
  /**
    * The metadata that you apply to the capacity provider to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. The following basic restrictions apply to tags:   Maximum number of tags per resource - 50   For each resource, each tag key must be unique, and each tag key can have only one value.   Maximum key length - 128 Unicode characters in UTF-8   Maximum value length - 256 Unicode characters in UTF-8   If your tagging schema is used across multiple services and resources, remember that other services may have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : / @.   Tag keys and values are case-sensitive.   Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for either keys or values as it is reserved for AWS use. You cannot edit or delete tag keys or values with this prefix. Tags with this prefix do not count against your tags per resource limit.  
    */
  var tags: js.UndefOr[Tags] = js.native
}

object CreateCapacityProviderRequest {
  @scala.inline
  def apply(autoScalingGroupProvider: AutoScalingGroupProvider, name: String): CreateCapacityProviderRequest = {
    val __obj = js.Dynamic.literal(autoScalingGroupProvider = autoScalingGroupProvider.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCapacityProviderRequest]
  }
  @scala.inline
  implicit class CreateCapacityProviderRequestOps[Self <: CreateCapacityProviderRequest] (val x: Self) extends AnyVal {
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
    def setAutoScalingGroupProvider(value: AutoScalingGroupProvider): Self = this.set("autoScalingGroupProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: Tags): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

