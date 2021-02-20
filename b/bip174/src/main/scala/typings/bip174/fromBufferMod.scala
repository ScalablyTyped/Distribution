package typings.bip174

import typings.bip174.interfacesMod.KeyValue
import typings.bip174.interfacesMod.Transaction
import typings.bip174.interfacesMod.TransactionFromBuffer
import typings.bip174.parserMod.PsbtAttributes
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromBufferMod {
  
  @JSImport("bip174/src/lib/parser/fromBuffer", "checkKeyBuffer")
  @js.native
  def checkKeyBuffer(`type`: String, keyBuf: Buffer, keyNum: Double): Unit = js.native
  
  @JSImport("bip174/src/lib/parser/fromBuffer", "psbtFromBuffer")
  @js.native
  def psbtFromBuffer(buffer: Buffer, txGetter: TransactionFromBuffer): PsbtAttributes = js.native
  
  @JSImport("bip174/src/lib/parser/fromBuffer", "psbtFromKeyVals")
  @js.native
  def psbtFromKeyVals(unsignedTx: Transaction, hasGlobalMapKeyValsInputKeyValsOutputKeyVals: PsbtFromKeyValsArg): PsbtAttributes = js.native
  
  @js.native
  trait PsbtFromKeyValsArg extends StObject {
    
    var globalMapKeyVals: js.Array[KeyValue] = js.native
    
    var inputKeyVals: js.Array[js.Array[KeyValue]] = js.native
    
    var outputKeyVals: js.Array[js.Array[KeyValue]] = js.native
  }
  object PsbtFromKeyValsArg {
    
    @scala.inline
    def apply(
      globalMapKeyVals: js.Array[KeyValue],
      inputKeyVals: js.Array[js.Array[KeyValue]],
      outputKeyVals: js.Array[js.Array[KeyValue]]
    ): PsbtFromKeyValsArg = {
      val __obj = js.Dynamic.literal(globalMapKeyVals = globalMapKeyVals.asInstanceOf[js.Any], inputKeyVals = inputKeyVals.asInstanceOf[js.Any], outputKeyVals = outputKeyVals.asInstanceOf[js.Any])
      __obj.asInstanceOf[PsbtFromKeyValsArg]
    }
    
    @scala.inline
    implicit class PsbtFromKeyValsArgMutableBuilder[Self <: PsbtFromKeyValsArg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobalMapKeyVals(value: js.Array[KeyValue]): Self = StObject.set(x, "globalMapKeyVals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalMapKeyValsVarargs(value: KeyValue*): Self = StObject.set(x, "globalMapKeyVals", js.Array(value :_*))
      
      @scala.inline
      def setInputKeyVals(value: js.Array[js.Array[KeyValue]]): Self = StObject.set(x, "inputKeyVals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputKeyValsVarargs(value: js.Array[KeyValue]*): Self = StObject.set(x, "inputKeyVals", js.Array(value :_*))
      
      @scala.inline
      def setOutputKeyVals(value: js.Array[js.Array[KeyValue]]): Self = StObject.set(x, "outputKeyVals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputKeyValsVarargs(value: js.Array[KeyValue]*): Self = StObject.set(x, "outputKeyVals", js.Array(value :_*))
    }
  }
}
