package typings.awsSdk.mediatailorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceResponse extends js.Object {
  /**
    * A comma-separated list of tag key:value pairs. For example: 
    {
    "Key1": "Value1",
    "Key2": "Value2"
    }
    
    */
  var Tags: js.UndefOr[mapOfString] = js.native
}

object ListTagsForResourceResponse {
  @scala.inline
  def apply(Tags: mapOfString = null): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
}

