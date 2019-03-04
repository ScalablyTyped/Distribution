package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenDocumentOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 文件路径，可通过 downFile 获得
  		 */
  var filePath: java.lang.String
  /**
  		 * 文件类型，指定文件类型打开文件，有效值 doc, xls, ppt, pdf, docx, xlsx, pptx
  		 */
  var fileType: js.UndefOr[
    baiduDashAppLib.baiduDashAppLibStrings.doc | baiduDashAppLib.baiduDashAppLibStrings.xls | baiduDashAppLib.baiduDashAppLibStrings.ppt | baiduDashAppLib.baiduDashAppLibStrings.pdf | baiduDashAppLib.baiduDashAppLibStrings.docx | baiduDashAppLib.baiduDashAppLibStrings.xlsx | baiduDashAppLib.baiduDashAppLibStrings.pptx
  ] = js.undefined
}

object OpenDocumentOptions {
  @scala.inline
  def apply(
    filePath: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    fileType: baiduDashAppLib.baiduDashAppLibStrings.doc | baiduDashAppLib.baiduDashAppLibStrings.xls | baiduDashAppLib.baiduDashAppLibStrings.ppt | baiduDashAppLib.baiduDashAppLibStrings.pdf | baiduDashAppLib.baiduDashAppLibStrings.docx | baiduDashAppLib.baiduDashAppLibStrings.xlsx | baiduDashAppLib.baiduDashAppLibStrings.pptx = null,
    success: js.Function1[js.Any, scala.Unit] = null
  ): OpenDocumentOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (fileType != null) __obj.updateDynamic("fileType")(fileType.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[OpenDocumentOptions]
  }
}

