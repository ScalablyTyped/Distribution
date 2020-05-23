package typings.awsSdk.textractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentMetadata extends js.Object {
  /**
    * The number of pages that are detected in the document.
    */
  var Pages: js.UndefOr[UInteger] = js.native
}

object DocumentMetadata {
  @scala.inline
  def apply(Pages: js.UndefOr[UInteger] = js.undefined): DocumentMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Pages)) __obj.updateDynamic("Pages")(Pages.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentMetadata]
  }
}

