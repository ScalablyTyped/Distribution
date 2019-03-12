package typings
package callsiteLib.callsiteMod.CallsiteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallSite extends js.Object {
  def getColumnNumber(): scala.Double
  def getEvalOrigin(): java.lang.String
  def getFileName(): java.lang.String
  def getFunction(): js.Function
  def getFunctionName(): java.lang.String
  def getLineNumber(): scala.Double
  def getMethodName(): java.lang.String
  def getThis(): js.Any
  def getTypeName(): java.lang.String
  def isConstructor(): scala.Boolean
  def isEval(): scala.Boolean
  def isNative(): scala.Boolean
  def isToplevel(): scala.Boolean
}

object CallSite {
  @scala.inline
  def apply(
    getColumnNumber: () => scala.Double,
    getEvalOrigin: () => java.lang.String,
    getFileName: () => java.lang.String,
    getFunction: () => js.Function,
    getFunctionName: () => java.lang.String,
    getLineNumber: () => scala.Double,
    getMethodName: () => java.lang.String,
    getThis: () => js.Any,
    getTypeName: () => java.lang.String,
    isConstructor: () => scala.Boolean,
    isEval: () => scala.Boolean,
    isNative: () => scala.Boolean,
    isToplevel: () => scala.Boolean
  ): CallSite = {
    val __obj = js.Dynamic.literal(getColumnNumber = js.Any.fromFunction0(getColumnNumber), getEvalOrigin = js.Any.fromFunction0(getEvalOrigin), getFileName = js.Any.fromFunction0(getFileName), getFunction = js.Any.fromFunction0(getFunction), getFunctionName = js.Any.fromFunction0(getFunctionName), getLineNumber = js.Any.fromFunction0(getLineNumber), getMethodName = js.Any.fromFunction0(getMethodName), getThis = js.Any.fromFunction0(getThis), getTypeName = js.Any.fromFunction0(getTypeName), isConstructor = js.Any.fromFunction0(isConstructor), isEval = js.Any.fromFunction0(isEval), isNative = js.Any.fromFunction0(isNative), isToplevel = js.Any.fromFunction0(isToplevel))
  
    __obj.asInstanceOf[CallSite]
  }
}

