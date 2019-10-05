package typings.cryptojs.CryptoJS.lib

import typings.cryptojs.CryptoJS.format.IFormatter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CipherParams
  extends Base
     with CipherParamsData {
  def create(): CipherParams = js.native
  def create(cipherParams: CipherParamsData): CipherParams = js.native
  def init(): Unit = js.native
  def init(cipherParams: CipherParamsData): Unit = js.native
  def toString(formatter: IFormatter): String = js.native
}

