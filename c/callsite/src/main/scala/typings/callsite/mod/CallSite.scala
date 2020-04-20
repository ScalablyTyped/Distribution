package typings.callsite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallSite extends js.Object {
  def getColumnNumber(): Double
  def getEvalOrigin(): String
  def getFileName(): String
  def getFunction(): js.Function
  def getFunctionName(): String
  def getLineNumber(): Double
  def getMethodName(): String
  def getThis(): js.Any
  def getTypeName(): String
  def isConstructor(): Boolean
  def isEval(): Boolean
  def isNative(): Boolean
  def isToplevel(): Boolean
}

object CallSite {
  @scala.inline
  def apply(
    getColumnNumber: () => Double,
    getEvalOrigin: () => String,
    getFileName: () => String,
    getFunction: () => js.Function,
    getFunctionName: () => String,
    getLineNumber: () => Double,
    getMethodName: () => String,
    getThis: () => js.Any,
    getTypeName: () => String,
    isConstructor: () => Boolean,
    isEval: () => Boolean,
    isNative: () => Boolean,
    isToplevel: () => Boolean
  ): CallSite = {
    val __obj = js.Dynamic.literal(getColumnNumber = js.Any.fromFunction0(getColumnNumber), getEvalOrigin = js.Any.fromFunction0(getEvalOrigin), getFileName = js.Any.fromFunction0(getFileName), getFunction = js.Any.fromFunction0(getFunction), getFunctionName = js.Any.fromFunction0(getFunctionName), getLineNumber = js.Any.fromFunction0(getLineNumber), getMethodName = js.Any.fromFunction0(getMethodName), getThis = js.Any.fromFunction0(getThis), getTypeName = js.Any.fromFunction0(getTypeName), isConstructor = js.Any.fromFunction0(isConstructor), isEval = js.Any.fromFunction0(isEval), isNative = js.Any.fromFunction0(isNative), isToplevel = js.Any.fromFunction0(isToplevel))
    __obj.asInstanceOf[CallSite]
  }
}

