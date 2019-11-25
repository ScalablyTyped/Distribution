package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #endregion
// #region 媒体API列表
// 媒体-----图片
/* Rewritten from type alias, can be one of: 
  - typings.baiduDashApp.baiduDashAppStrings.original
  - typings.baiduDashApp.baiduDashAppStrings.compressed
*/
trait ImageSizeType extends js.Object

object ImageSizeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def compressed: typings.baiduDashApp.baiduDashAppStrings.compressed = this.cast("compressed")
  @scala.inline
  def original: typings.baiduDashApp.baiduDashAppStrings.original = this.cast("original")
}

