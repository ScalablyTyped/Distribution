package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Loa extends js.Object {
  /**
    * The binary contents of the LOA-CFA document.
    */
  var loaContent: js.UndefOr[LoaContent] = js.native
  /**
    * The standard media type for the LOA-CFA document. The only supported value is application/pdf.
    */
  var loaContentType: js.UndefOr[LoaContentType] = js.native
}

object Loa {
  @scala.inline
  def apply(loaContent: LoaContent = null, loaContentType: LoaContentType = null): Loa = {
    val __obj = js.Dynamic.literal()
    if (loaContent != null) __obj.updateDynamic("loaContent")(loaContent.asInstanceOf[js.Any])
    if (loaContentType != null) __obj.updateDynamic("loaContentType")(loaContentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loa]
  }
}

