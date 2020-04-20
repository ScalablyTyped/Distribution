package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageInfo extends js.Object {
  /**
  		 * 当前占用的空间大小, 单位kb
  		 */
  var currentSize: Double
  /**
  		 * 当前storage中所有的key
  		 */
  var keys: js.Array[String]
  /**
  		 * 限制的空间大小，单位kb
  		 */
  var limitSize: Double
}

object StorageInfo {
  @scala.inline
  def apply(currentSize: Double, keys: js.Array[String], limitSize: Double): StorageInfo = {
    val __obj = js.Dynamic.literal(currentSize = currentSize.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], limitSize = limitSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageInfo]
  }
}

