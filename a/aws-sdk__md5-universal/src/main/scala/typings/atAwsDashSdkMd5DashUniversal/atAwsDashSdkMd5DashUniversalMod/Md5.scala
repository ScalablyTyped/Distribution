package typings.atAwsDashSdkMd5DashUniversal.atAwsDashSdkMd5DashUniversalMod

import typings.atAwsDashSdkMd5DashUniversal.atAwsDashSdkMd5DashUniversalStrings.ascii
import typings.atAwsDashSdkMd5DashUniversal.atAwsDashSdkMd5DashUniversalStrings.latin1
import typings.atAwsDashSdkMd5DashUniversal.atAwsDashSdkMd5DashUniversalStrings.utf8
import typings.atAwsDashSdkTypes.buildCryptoMod.Hash
import typings.atAwsDashSdkTypes.buildCryptoMod.SourceData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/md5-universal", "Md5")
@js.native
class Md5 () extends Hash {
  val hash: js.Any = js.native
  @JSName("update")
  def update_ascii(data: SourceData, encoding: ascii): Unit = js.native
  @JSName("update")
  def update_latin1(data: SourceData, encoding: latin1): Unit = js.native
  @JSName("update")
  def update_utf8(data: SourceData, encoding: utf8): Unit = js.native
}

