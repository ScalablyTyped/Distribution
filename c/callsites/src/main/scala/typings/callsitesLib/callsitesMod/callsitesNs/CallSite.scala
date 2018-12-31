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

