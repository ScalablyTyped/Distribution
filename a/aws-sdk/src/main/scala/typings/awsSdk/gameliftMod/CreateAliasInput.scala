package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAliasInput extends js.Object {
  /**
    * A human-readable description of the alias.
    */
  var Description: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * A descriptive label that is associated with an alias. Alias names do not need to be unique.
    */
  var Name: NonBlankAndLengthConstraintString = js.native
  /**
    * The routing configuration, including routing type and fleet target, for the alias. 
    */
  var RoutingStrategy: typings.awsSdk.gameliftMod.RoutingStrategy = js.native
  /**
    * A list of labels to assign to the new alias resource. Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource management, access management and cost allocation. For more information, see  Tagging AWS Resources in the AWS General Reference. Once the resource is created, you can use TagResource, UntagResource, and ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than stated. See the AWS General Reference for actual tagging limits.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateAliasInput {
  @scala.inline
  def apply(
    Name: NonBlankAndLengthConstraintString,
    RoutingStrategy: RoutingStrategy,
    Description: NonZeroAndMaxString = null,
    Tags: TagList = null
  ): CreateAliasInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RoutingStrategy = RoutingStrategy.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAliasInput]
  }
}

