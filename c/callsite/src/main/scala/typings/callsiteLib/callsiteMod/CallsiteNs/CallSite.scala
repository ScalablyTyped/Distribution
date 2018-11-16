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

