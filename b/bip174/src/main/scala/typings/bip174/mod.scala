package typings.bip174

import typings.bip174.anon.TypeofPsbt
import typings.bip174.interfacesMod.KeyValue
import typings.bip174.interfacesMod.PsbtGlobal
import typings.bip174.interfacesMod.PsbtGlobalUpdate
import typings.bip174.interfacesMod.PsbtInput
import typings.bip174.interfacesMod.PsbtInputExtended
import typings.bip174.interfacesMod.PsbtInputUpdate
import typings.bip174.interfacesMod.PsbtOutput
import typings.bip174.interfacesMod.PsbtOutputExtended
import typings.bip174.interfacesMod.PsbtOutputUpdate
import typings.bip174.interfacesMod.Transaction
import typings.bip174.interfacesMod.TransactionFromBuffer
import typings.node.Buffer
import typings.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bip174", "Psbt")
  @js.native
  class Psbt protected () extends StObject {
    def this(tx: Transaction) = this()
    
    def addInput(inputData: PsbtInputExtended): this.type = js.native
    
    def addOutput(outputData: PsbtOutputExtended): this.type = js.native
    
    def addUnknownKeyValToGlobal(keyVal: KeyValue): this.type = js.native
    
    def addUnknownKeyValToInput(inputIndex: Double, keyVal: KeyValue): this.type = js.native
    
    def addUnknownKeyValToOutput(outputIndex: Double, keyVal: KeyValue): this.type = js.native
    
    def clearFinalizedInput(inputIndex: Double): this.type = js.native
    
    def combine(those: this.type*): this.type = js.native
    
    def getTransaction(): Buffer = js.native
    
    val globalMap: PsbtGlobal = js.native
    
    val inputs: js.Array[PsbtInput] = js.native
    
    val outputs: js.Array[PsbtOutput] = js.native
    
    def toBase64(): String = js.native
    
    def toBuffer(): Buffer = js.native
    
    def toHex(): String = js.native
    
    def updateGlobal(updateData: PsbtGlobalUpdate): this.type = js.native
    
    def updateInput(inputIndex: Double, updateData: PsbtInputUpdate): this.type = js.native
    
    def updateOutput(outputIndex: Double, updateData: PsbtOutputUpdate): this.type = js.native
  }
  /* static members */
  object Psbt {
    
    @JSImport("bip174", "Psbt.fromBase64")
    @js.native
    def fromBase64[T /* <: TypeofPsbt */](data: String, txFromBuffer: TransactionFromBuffer): InstanceType[T] = js.native
    
    @JSImport("bip174", "Psbt.fromBuffer")
    @js.native
    def fromBuffer[T /* <: TypeofPsbt */](buffer: Buffer, txFromBuffer: TransactionFromBuffer): InstanceType[T] = js.native
    
    @JSImport("bip174", "Psbt.fromHex")
    @js.native
    def fromHex[T /* <: TypeofPsbt */](data: String, txFromBuffer: TransactionFromBuffer): InstanceType[T] = js.native
  }
}
