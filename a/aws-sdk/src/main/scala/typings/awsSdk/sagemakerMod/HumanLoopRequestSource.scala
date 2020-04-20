package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HumanLoopRequestSource extends js.Object {
  /**
    * Specifies whether Amazon Rekognition or Amazon Textract are used as the integration source. The default field settings and JSON parsing rules are different based on the integration source. Valid values:
    */
  var AwsManagedHumanLoopRequestSource: typings.awsSdk.sagemakerMod.AwsManagedHumanLoopRequestSource = js.native
}

object HumanLoopRequestSource {
  @scala.inline
  def apply(AwsManagedHumanLoopRequestSource: AwsManagedHumanLoopRequestSource): HumanLoopRequestSource = {
    val __obj = js.Dynamic.literal(AwsManagedHumanLoopRequestSource = AwsManagedHumanLoopRequestSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[HumanLoopRequestSource]
  }
}

