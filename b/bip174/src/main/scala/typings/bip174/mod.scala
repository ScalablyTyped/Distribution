package typings.bip174

import typings.bip174.anon.TypeofPsbt
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
import typings.node.bufferMod.global.Buffer
import typings.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bip174", "Psbt")
  @js.native
  open class Psbt protected () extends StObject {
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
    
    @JSImport("bip174", "Psbt")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromBase64[T /* <: TypeofPsbt */](data: String, txFromBuffer: TransactionFromBuffer): InstanceType[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64")(data.asInstanceOf[js.Any], txFromBuffer.asInstanceOf[js.Any])).asInstanceOf[InstanceType[T]]
    
    inline def fromBuffer[T /* <: TypeofPsbt */](buffer: Buffer, txFromBuffer: TransactionFromBuffer): InstanceType[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any], txFromBuffer.asInstanceOf[js.Any])).asInstanceOf[InstanceType[T]]
    
    inline def fromHex[T /* <: TypeofPsbt */](data: String, txFromBuffer: TransactionFromBuffer): InstanceType[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(data.asInstanceOf[js.Any], txFromBuffer.asInstanceOf[js.Any])).asInstanceOf[InstanceType[T]]
  }
}
