package typings.bip174.interfacesMod

import typings.bip174.anon.InputCount
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transaction extends js.Object {
  
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
  implicit class TransactionOps[Self <: Transaction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddInput(value: js.Any => Unit): Self = this.set("addInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddOutput(value: js.Any => Unit): Self = this.set("addOutput", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetInputOutputCounts(value: () => InputCount): Self = this.set("getInputOutputCounts", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToBuffer(value: () => Buffer): Self = this.set("toBuffer", js.Any.fromFunction0(value))
  }
}
