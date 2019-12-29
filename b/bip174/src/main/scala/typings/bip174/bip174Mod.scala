package typings.bip174

import typings.bip174.srcLibInterfacesMod.KeyValue
import typings.bip174.srcLibInterfacesMod.PsbtGlobal
import typings.bip174.srcLibInterfacesMod.PsbtGlobalUpdate
import typings.bip174.srcLibInterfacesMod.PsbtInput
import typings.bip174.srcLibInterfacesMod.PsbtInputExtended
import typings.bip174.srcLibInterfacesMod.PsbtInputUpdate
import typings.bip174.srcLibInterfacesMod.PsbtOutput
import typings.bip174.srcLibInterfacesMod.PsbtOutputExtended
import typings.bip174.srcLibInterfacesMod.PsbtOutputUpdate
import typings.bip174.srcLibInterfacesMod.Transaction
import typings.bip174.srcLibInterfacesMod.TransactionFromBuffer
import typings.node.Buffer
import typings.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip174", JSImport.Namespace)
@js.native
object bip174Mod extends js.Object {
  @js.native
  class Psbt protected () extends js.Object {
    def this(tx: Transaction) = this()
    val globalMap: PsbtGlobal = js.native
    val inputs: js.Array[PsbtInput] = js.native
    val outputs: js.Array[PsbtOutput] = js.native
    def addInput(inputData: PsbtInputExtended): this.type = js.native
    def addOutput(outputData: PsbtOutputExtended): this.type = js.native
    def addUnknownKeyValToGlobal(keyVal: KeyValue): this.type = js.native
    def addUnknownKeyValToInput(inputIndex: Double, keyVal: KeyValue): this.type = js.native
    def addUnknownKeyValToOutput(outputIndex: Double, keyVal: KeyValue): this.type = js.native
    def clearFinalizedInput(inputIndex: Double): this.type = js.native
    def combine(those: this.type*): this.type = js.native
    def getTransaction(): Buffer = js.native
    def toBase64(): String = js.native
    def toBuffer(): Buffer = js.native
    def toHex(): String = js.native
    def updateGlobal(updateData: PsbtGlobalUpdate): this.type = js.native
    def updateInput(inputIndex: Double, updateData: PsbtInputUpdate): this.type = js.native
    def updateOutput(outputIndex: Double, updateData: PsbtOutputUpdate): this.type = js.native
  }
  
  /* static members */
  @js.native
  object Psbt extends js.Object {
    def fromBase64[T /* <: TypeofClassPsbt */](data: String, txFromBuffer: TransactionFromBuffer): InstanceType[T] = js.native
    def fromBuffer[T /* <: TypeofClassPsbt */](buffer: Buffer, txFromBuffer: TransactionFromBuffer): InstanceType[T] = js.native
    def fromHex[T /* <: TypeofClassPsbt */](data: String, txFromBuffer: TransactionFromBuffer): InstanceType[T] = js.native
  }
  
}

