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

