package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRegexPatternSetRequest extends js.Object {
  /**
    * The RegexPatternSetId of the RegexPatternSet that you want to get. RegexPatternSetId is returned by CreateRegexPatternSet and by ListRegexPatternSets.
    */
  var RegexPatternSetId: ResourceId = js.native
}

object GetRegexPatternSetRequest {
  @scala.inline
  def apply(RegexPatternSetId: ResourceId): GetRegexPatternSetRequest = {
    val __obj = js.Dynamic.literal(RegexPatternSetId = RegexPatternSetId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetRegexPatternSetRequest]
  }
}

