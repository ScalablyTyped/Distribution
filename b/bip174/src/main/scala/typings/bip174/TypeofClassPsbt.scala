package typings.bip174

import org.scalablytyped.runtime.Instantiable1
import typings.bip174.bip174Mod.Psbt
import typings.bip174.srcLibInterfacesMod.Transaction
import typings.bip174.srcLibInterfacesMod.TransactionFromBuffer
import typings.node.Buffer
import typings.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassPsbt extends Instantiable1[/* tx */ Transaction, Psbt] {
  def fromBase64[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: typeof Psbt */ js.Any */](`this`: T, data: String, txFromBuffer: TransactionFromBuffer): InstanceType[T] = js.native
  def fromBuffer[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: typeof Psbt */ js.Any */](`this`: T, buffer: Buffer, txFromBuffer: TransactionFromBuffer): InstanceType[T] = js.native
  def fromHex[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: typeof Psbt */ js.Any */](`this`: T, data: String, txFromBuffer: TransactionFromBuffer): InstanceType[T] = js.native
}

