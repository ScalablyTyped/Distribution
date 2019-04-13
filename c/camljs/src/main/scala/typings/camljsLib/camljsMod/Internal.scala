package typings
package camljsLib.camljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("camljs", "Internal")
@js.native
class Internal () extends js.Object

/* static members */
@JSImport("camljs", "Internal")
@js.native
object Internal extends js.Object {
  def createExpression(): camljsLib.camljsMod.IFieldExpression = js.native
  def createRawQuery(xml: java.lang.String): camljsLib.camljsMod.IRawQuery = js.native
  def createView(): camljsLib.camljsMod.IView = js.native
  def createView(viewFields: js.Array[camljsLib.camljsMod.ViewField]): camljsLib.camljsMod.IView = js.native
  def createViewFields(viewFields: js.Array[java.lang.String]): camljsLib.camljsMod.IFinalizableToString = js.native
  def createWhere(): camljsLib.camljsMod.IFieldExpression = js.native
}

