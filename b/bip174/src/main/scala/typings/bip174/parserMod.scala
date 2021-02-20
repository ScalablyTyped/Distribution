package typings.bip174

import typings.bip174.anon.GlobalKeyVals
import typings.bip174.fromBufferMod.PsbtFromKeyValsArg
import typings.bip174.interfacesMod.PsbtGlobal
import typings.bip174.interfacesMod.PsbtInput
import typings.bip174.interfacesMod.PsbtOutput
import typings.bip174.interfacesMod.Transaction
import typings.bip174.interfacesMod.TransactionFromBuffer
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMod {
  
  @JSImport("bip174/src/lib/parser", "checkKeyBuffer")
  @js.native
  def checkKeyBuffer(`type`: String, keyBuf: Buffer, keyNum: Double): Unit = js.native
  
  @JSImport("bip174/src/lib/parser", "psbtFromBuffer")
  @js.native
  def psbtFromBuffer(buffer: Buffer, txGetter: TransactionFromBuffer): PsbtAttributes = js.native
  
  @JSImport("bip174/src/lib/parser", "psbtFromKeyVals")
  @js.native
  def psbtFromKeyVals(unsignedTx: Transaction, hasGlobalMapKeyValsInputKeyValsOutputKeyVals: PsbtFromKeyValsArg): PsbtAttributes = js.native
  
  @JSImport("bip174/src/lib/parser", "psbtToBuffer")
  @js.native
  def psbtToBuffer(hasGlobalMapInputsOutputs: PsbtAttributes): Buffer = js.native
  
  @JSImport("bip174/src/lib/parser", "psbtToKeyVals")
  @js.native
  def psbtToKeyVals(hasGlobalMapInputsOutputs: PsbtAttributes): GlobalKeyVals = js.native
  
  @js.native
  trait PsbtAttributes extends StObject {
    
    var globalMap: PsbtGlobal = js.native
    
    var inputs: js.Array[PsbtInput] = js.native
    
    var outputs: js.Array[PsbtOutput] = js.native
  }
  object PsbtAttributes {
    
    @scala.inline
    def apply(globalMap: PsbtGlobal, inputs: js.Array[PsbtInput], outputs: js.Array[PsbtOutput]): PsbtAttributes = {
      val __obj = js.Dynamic.literal(globalMap = globalMap.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
      __obj.asInstanceOf[PsbtAttributes]
    }
    
    @scala.inline
    implicit class PsbtAttributesMutableBuilder[Self <: PsbtAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobalMap(value: PsbtGlobal): Self = StObject.set(x, "globalMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputs(value: js.Array[PsbtInput]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputsVarargs(value: PsbtInput*): Self = StObject.set(x, "inputs", js.Array(value :_*))
      
      @scala.inline
      def setOutputs(value: js.Array[PsbtOutput]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputsVarargs(value: PsbtOutput*): Self = StObject.set(x, "outputs", js.Array(value :_*))
    }
  }
}
