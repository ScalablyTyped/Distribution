package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HumanLoopDataAttributes extends js.Object {
  /**
    * Sets whether the input image is free of personally identifiable information.
    */
  var ContentClassifiers: js.UndefOr[typings.awsSdk.rekognitionMod.ContentClassifiers] = js.native
}

object HumanLoopDataAttributes {
  @scala.inline
  def apply(ContentClassifiers: ContentClassifiers = null): HumanLoopDataAttributes = {
    val __obj = js.Dynamic.literal()
    if (ContentClassifiers != null) __obj.updateDynamic("ContentClassifiers")(ContentClassifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[HumanLoopDataAttributes]
  }
}

