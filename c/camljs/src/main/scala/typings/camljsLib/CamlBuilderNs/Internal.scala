package typings
package camljsLib.CamlBuilderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CamlBuilder.Internal")
@js.native
class Internal () extends js.Object

@JSGlobal("CamlBuilder.Internal")
@js.native
object Internal extends js.Object {
  def createExpression(): camljsLib.CamlBuilderNs.IFieldExpression = js.native
  def createRawQuery(xml: java.lang.String): camljsLib.CamlBuilderNs.IRawQuery = js.native
  def createView(): camljsLib.CamlBuilderNs.IView = js.native
  def createView(viewFields: js.Array[java.lang.String]): camljsLib.CamlBuilderNs.IView = js.native
  def createViewFields(viewFields: js.Array[java.lang.String]): camljsLib.CamlBuilderNs.IFinalizableToString = js.native
  def createWhere(): camljsLib.CamlBuilderNs.IFieldExpression = js.native
}

