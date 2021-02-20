package typings.bip174.interfacesMod

import typings.bip174.anon.InputCount
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transaction extends StObject {
  
  def addInput(objectArg: js.Any): Unit = js.native
  
  def addOutput(objectArg: js.Any): Unit = js.native
  
  def getInputOutputCounts(): InputCount = js.native
  
  def toBuffer(): Buffer = js.native
}
object Transaction {
  
  @scala.inline
  def apply(
    addInput: js.Any => Unit,
    addOutput: js.Any => Unit,
    getInputOutputCounts: () => InputCount,
    toBuffer: () => Buffer
  ): Transaction = {
    val __obj = js.Dynamic.literal(addInput = js.Any.fromFunction1(addInput), addOutput = js.Any.fromFunction1(addOutput), getInputOutputCounts = js.Any.fromFunction0(getInputOutputCounts), toBuffer = js.Any.fromFunction0(toBuffer))
    __obj.asInstanceOf[Transaction]
  }
  
  @scala.inline
  implicit class TransactionMutableBuilder[Self <: Transaction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddInput(value: js.Any => Unit): Self = StObject.set(x, "addInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddOutput(value: js.Any => Unit): Self = StObject.set(x, "addOutput", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetInputOutputCounts(value: () => InputCount): Self = StObject.set(x, "getInputOutputCounts", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToBuffer(value: () => Buffer): Self = StObject.set(x, "toBuffer", js.Any.fromFunction0(value))
  }
}
