package typings.bip174.srcLibInterfacesMod

import typings.bip174.anon.InputCount
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transaction extends StObject {
  
  def addInput(objectArg: Any): Unit
  
  def addOutput(objectArg: Any): Unit
  
  def getInputOutputCounts(): InputCount
  
  def toBuffer(): Buffer
}
object Transaction {
  
  inline def apply(
    addInput: Any => Unit,
    addOutput: Any => Unit,
    getInputOutputCounts: () => InputCount,
    toBuffer: () => Buffer
  ): Transaction = {
    val __obj = js.Dynamic.literal(addInput = js.Any.fromFunction1(addInput), addOutput = js.Any.fromFunction1(addOutput), getInputOutputCounts = js.Any.fromFunction0(getInputOutputCounts), toBuffer = js.Any.fromFunction0(toBuffer))
    __obj.asInstanceOf[Transaction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Transaction] (val x: Self) extends AnyVal {
    
    inline def setAddInput(value: Any => Unit): Self = StObject.set(x, "addInput", js.Any.fromFunction1(value))
    
    inline def setAddOutput(value: Any => Unit): Self = StObject.set(x, "addOutput", js.Any.fromFunction1(value))
    
    inline def setGetInputOutputCounts(value: () => InputCount): Self = StObject.set(x, "getInputOutputCounts", js.Any.fromFunction0(value))
    
    inline def setToBuffer(value: () => Buffer): Self = StObject.set(x, "toBuffer", js.Any.fromFunction0(value))
  }
}
