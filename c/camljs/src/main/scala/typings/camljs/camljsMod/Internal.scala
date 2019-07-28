package typings.camljs.camljsMod

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
  def createExpression(): IFieldExpression = js.native
  def createRawQuery(xml: String): IRawQuery = js.native
  def createView(): IView = js.native
  def createView(viewFields: js.Array[ViewField]): IView = js.native
  def createViewFields(viewFields: js.Array[String]): IFinalizableToString = js.native
  def createWhere(): IFieldExpression = js.native
}

