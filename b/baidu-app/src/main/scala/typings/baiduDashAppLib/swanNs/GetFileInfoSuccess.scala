package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFileInfoSuccess extends js.Object {
  /** 按照传入的 digestAlgorithm 计算得出的的文件摘要 */
  var digest: java.lang.String
  /** 文件大小，单位：B */
  var size: scala.Double
}

object GetFileInfoSuccess {
  @scala.inline
  def apply(digest: java.lang.String, size: scala.Double): GetFileInfoSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("digest")(digest)
    __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[GetFileInfoSuccess]
  }
}

