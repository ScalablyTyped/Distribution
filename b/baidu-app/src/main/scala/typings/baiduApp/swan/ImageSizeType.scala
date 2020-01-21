package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #endregion
// #region 媒体API列表
// 媒体-----图片
/* Rewritten from type alias, can be one of: 
  - typings.baiduApp.baiduAppStrings.original
  - typings.baiduApp.baiduAppStrings.compressed
*/
trait ImageSizeType extends js.Object

object ImageSizeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def compressed: typings.baiduApp.baiduAppStrings.compressed = this.cast("compressed")
  @scala.inline
  def original: typings.baiduApp.baiduAppStrings.original = this.cast("original")
}

