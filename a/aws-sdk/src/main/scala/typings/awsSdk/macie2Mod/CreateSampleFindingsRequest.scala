package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSampleFindingsRequest extends js.Object {
  /**
    * An array that lists one or more types of findings to include in the set of sample findings. Currently, the only supported value is Policy:IAMUser/S3BucketEncryptionDisabled. 
    */
  var findingTypes: js.UndefOr[listOfFindingType] = js.native
}

object CreateSampleFindingsRequest {
  @scala.inline
  def apply(findingTypes: listOfFindingType = null): CreateSampleFindingsRequest = {
    val __obj = js.Dynamic.literal()
    if (findingTypes != null) __obj.updateDynamic("findingTypes")(findingTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSampleFindingsRequest]
  }
}

