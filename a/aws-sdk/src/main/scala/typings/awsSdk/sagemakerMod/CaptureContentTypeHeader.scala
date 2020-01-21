package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptureContentTypeHeader extends js.Object {
  /**
    * 
    */
  var CsvContentTypes: js.UndefOr[typings.awsSdk.sagemakerMod.CsvContentTypes] = js.native
  /**
    * 
    */
  var JsonContentTypes: js.UndefOr[typings.awsSdk.sagemakerMod.JsonContentTypes] = js.native
}

object CaptureContentTypeHeader {
  @scala.inline
  def apply(CsvContentTypes: CsvContentTypes = null, JsonContentTypes: JsonContentTypes = null): CaptureContentTypeHeader = {
    val __obj = js.Dynamic.literal()
    if (CsvContentTypes != null) __obj.updateDynamic("CsvContentTypes")(CsvContentTypes.asInstanceOf[js.Any])
    if (JsonContentTypes != null) __obj.updateDynamic("JsonContentTypes")(JsonContentTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureContentTypeHeader]
  }
}

