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
    getColumnNumber: js.Function0[scala.Double],
    getEvalOrigin: js.Function0[java.lang.String],
    getFileName: js.Function0[java.lang.String],
    getFunction: js.Function0[js.Function],
    getFunctionName: js.Function0[java.lang.String],
    getLineNumber: js.Function0[scala.Double],
    getMethodName: js.Function0[java.lang.String],
    getThis: js.Function0[js.Any],
    getTypeName: js.Function0[java.lang.String],
    isConstructor: js.Function0[scala.Boolean],
    isEval: js.Function0[scala.Boolean],
    isNative: js.Function0[scala.Boolean],
    isToplevel: js.Function0[scala.Boolean]
  ): CallSite = {
    val __obj = js.Dynamic.literal(getColumnNumber = getColumnNumber, getEvalOrigin = getEvalOrigin, getFileName = getFileName, getFunction = getFunction, getFunctionName = getFunctionName, getLineNumber = getLineNumber, getMethodName = getMethodName, getThis = getThis, getTypeName = getTypeName, isConstructor = isConstructor, isEval = isEval, isNative = isNative, isToplevel = isToplevel)
  
    __obj.asInstanceOf[CallSite]
  }
}

