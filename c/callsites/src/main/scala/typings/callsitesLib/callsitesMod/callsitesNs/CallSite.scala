package typings
package callsitesLib.callsitesMod.callsitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallSite extends js.Object {
  def getColumnNumber(): scala.Double
  def getEvalOrigin(): CallSite | java.lang.String
  def getFileName(): js.UndefOr[java.lang.String]
  def getFunction(): js.UndefOr[js.Function]
   // tslint:disable-line ban-types
  def getFunctionName(): java.lang.String
  def getLineNumber(): scala.Double
  def getMethodName(): java.lang.String | scala.Null
  def getThis(): js.UndefOr[js.Object]
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
    getEvalOrigin: js.Function0[CallSite | java.lang.String],
    getFileName: js.Function0[js.UndefOr[java.lang.String]],
    getFunction: js.Function0[js.UndefOr[js.Function]],
    getFunctionName: js.Function0[java.lang.String],
    getLineNumber: js.Function0[scala.Double],
    getMethodName: js.Function0[java.lang.String | scala.Null],
    getThis: js.Function0[js.UndefOr[js.Object]],
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

