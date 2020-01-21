package typings.bip174.interfacesMod

import typings.bip174.AnonInputCount
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transaction extends js.Object {
  def addInput(objectArg: js.Any): Unit
  def addOutput(objectArg: js.Any): Unit
  def getInputOutputCounts(): AnonInputCount
  def toBuffer(): Buffer
}

object Transaction {
  @scala.inline
  def apply(
    addInput: js.Any => Unit,
    addOutput: js.Any => Unit,
    getInputOutputCounts: () => AnonInputCount,
    toBuffer: () => Buffer
  ): Transaction = {
    val __obj = js.Dynamic.literal(addInput = js.Any.fromFunction1(addInput), addOutput = js.Any.fromFunction1(addOutput), getInputOutputCounts = js.Any.fromFunction0(getInputOutputCounts), toBuffer = js.Any.fromFunction0(toBuffer))
  
    __obj.asInstanceOf[Transaction]
  }
}

