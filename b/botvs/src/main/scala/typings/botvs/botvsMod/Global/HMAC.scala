package typings.botvs.botvsMod.Global

import typings.botvs.botvsStrings.base64
import typings.botvs.botvsStrings.hex
import typings.botvs.botvsStrings.md5
import typings.botvs.botvsStrings.raw
import typings.botvs.botvsStrings.sha1
import typings.botvs.botvsStrings.sha256
import typings.botvs.botvsStrings.sha512
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("HMAC")
@js.native
object HMAC extends js.Object {
  def apply(Algo: md5, OutputAlgo: base64, Data: String, password: String): String = js.native
  /**
    * 支持 md5/sha256/sha512/sha1 的HMAC加密计算, 只支持实盘
    *
    * 第二个参数可设置为raw/hex/base64, 分别指输出加密后的 原始内容/hex编码过的/base64编码过的
    * Log(HMAC('md5', 'hex', 'hello', 'pass'));
    * Log(HMAC('sha512', 'base64', 'hello', 'pass'));
    *
    * @param {"md5" | "sha256" | "sha512" | "sha1"} Algo
    * @param {"hex" | "base64" | "raw"} OutputAlgo
    * @param {string} Data
    * @param {string} password
    * @return {string}
    */
  def apply(Algo: md5, OutputAlgo: hex, Data: String, password: String): String = js.native
  def apply(Algo: md5, OutputAlgo: raw, Data: String, password: String): String = js.native
  def apply(Algo: sha1, OutputAlgo: base64, Data: String, password: String): String = js.native
  def apply(Algo: sha1, OutputAlgo: hex, Data: String, password: String): String = js.native
  def apply(Algo: sha1, OutputAlgo: raw, Data: String, password: String): String = js.native
  def apply(Algo: sha256, OutputAlgo: base64, Data: String, password: String): String = js.native
  def apply(Algo: sha256, OutputAlgo: hex, Data: String, password: String): String = js.native
  def apply(Algo: sha256, OutputAlgo: raw, Data: String, password: String): String = js.native
  def apply(Algo: sha512, OutputAlgo: base64, Data: String, password: String): String = js.native
  def apply(Algo: sha512, OutputAlgo: hex, Data: String, password: String): String = js.native
  def apply(Algo: sha512, OutputAlgo: raw, Data: String, password: String): String = js.native
}

