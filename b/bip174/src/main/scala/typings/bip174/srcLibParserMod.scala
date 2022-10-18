package typings.bip174

import typings.bip174.anon.GlobalKeyVals
import typings.bip174.srcLibInterfacesMod.PsbtGlobal
import typings.bip174.srcLibInterfacesMod.PsbtInput
import typings.bip174.srcLibInterfacesMod.PsbtOutput
import typings.bip174.srcLibInterfacesMod.Transaction
import typings.bip174.srcLibInterfacesMod.TransactionFromBuffer
import typings.bip174.srcLibParserFromBufferMod.PsbtFromKeyValsArg
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLibParserMod {
  
  @JSImport("bip174/src/lib/parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkKeyBuffer(`type`: String, keyBuf: Buffer, keyNum: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkKeyBuffer")(`type`.asInstanceOf[js.Any], keyBuf.asInstanceOf[js.Any], keyNum.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def psbtFromBuffer(buffer: Buffer, txGetter: TransactionFromBuffer): PsbtAttributes = (^.asInstanceOf[js.Dynamic].applyDynamic("psbtFromBuffer")(buffer.asInstanceOf[js.Any], txGetter.asInstanceOf[js.Any])).asInstanceOf[PsbtAttributes]
  
  inline def psbtFromKeyVals(unsignedTx: Transaction, hasGlobalMapKeyValsInputKeyValsOutputKeyVals: PsbtFromKeyValsArg): PsbtAttributes = (^.asInstanceOf[js.Dynamic].applyDynamic("psbtFromKeyVals")(unsignedTx.asInstanceOf[js.Any], hasGlobalMapKeyValsInputKeyValsOutputKeyVals.asInstanceOf[js.Any])).asInstanceOf[PsbtAttributes]
  
  inline def psbtToBuffer(hasGlobalMapInputsOutputs: PsbtAttributes): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("psbtToBuffer")(hasGlobalMapInputsOutputs.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def psbtToKeyVals(hasGlobalMapInputsOutputs: PsbtAttributes): GlobalKeyVals = ^.asInstanceOf[js.Dynamic].applyDynamic("psbtToKeyVals")(hasGlobalMapInputsOutputs.asInstanceOf[js.Any]).asInstanceOf[GlobalKeyVals]
  
  trait PsbtAttributes extends StObject {
    
    var globalMap: PsbtGlobal
    
    var inputs: js.Array[PsbtInput]
    
    var outputs: js.Array[PsbtOutput]
  }
  object PsbtAttributes {
    
    inline def apply(globalMap: PsbtGlobal, inputs: js.Array[PsbtInput], outputs: js.Array[PsbtOutput]): PsbtAttributes = {
      val __obj = js.Dynamic.literal(globalMap = globalMap.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
      __obj.asInstanceOf[PsbtAttributes]
    }
    
    extension [Self <: PsbtAttributes](x: Self) {
      
      inline def setGlobalMap(value: PsbtGlobal): Self = StObject.set(x, "globalMap", value.asInstanceOf[js.Any])
      
      inline def setInputs(value: js.Array[PsbtInput]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      inline def setInputsVarargs(value: PsbtInput*): Self = StObject.set(x, "inputs", js.Array(value*))
      
      inline def setOutputs(value: js.Array[PsbtOutput]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      inline def setOutputsVarargs(value: PsbtOutput*): Self = StObject.set(x, "outputs", js.Array(value*))
    }
  }
}
