package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceTags extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * The tags for the resource.
    */
  var Tags: js.UndefOr[mapOfString] = js.native
}

object ResourceTags {
  @scala.inline
  def apply(Arn: string = null, Tags: mapOfString = null): ResourceTags = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceTags]
  }
}

