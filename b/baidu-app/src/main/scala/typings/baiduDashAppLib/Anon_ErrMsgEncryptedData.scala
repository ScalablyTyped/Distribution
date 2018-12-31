package typings
package baiduDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrMsgEncryptedData extends js.Object {
  /** 包括敏感数据在内的完整转发信息的加密数据，详细见[加密数据解密算法](https://smartprogram.baidu.com/docs/develop/api/open_log/#login/) */
  var encryptedData: java.lang.String
  /** 错误信息 */
  var errMsg: java.lang.String
  /** 加密算法的初始向量，详细见[加密数据解密算法](https://smartprogram.baidu.com/docs/develop/api/open_log/#login/) */
  var iv: java.lang.String
}

