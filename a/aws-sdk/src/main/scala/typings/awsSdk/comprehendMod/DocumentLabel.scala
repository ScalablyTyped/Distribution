package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentLabel extends js.Object {
  /**
    * The name of the label.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The confidence score that Amazon Comprehend has this label correctly attributed.
    */
  var Score: js.UndefOr[Float] = js.native
}

object DocumentLabel {
  @scala.inline
  def apply(Name: String = null, Score: Int | scala.Double = null): DocumentLabel = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Score != null) __obj.updateDynamic("Score")(Score.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentLabel]
  }
}

