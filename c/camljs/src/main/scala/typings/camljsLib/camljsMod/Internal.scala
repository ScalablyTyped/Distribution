package typings
package camljsLib.camljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("camljs", "Internal")
@js.native
class Internal ()
  extends camljsLib.camljsMod.CamlBuilderNs.Internal

/* static members */
@JSImport("camljs", "Internal")
@js.native
object Internal extends js.Object {
  def createExpression(): camljsLib.camljsMod.CamlBuilderNs.IFieldExpression = js.native
  def createRawQuery(xml: java.lang.String): camljsLib.camljsMod.CamlBuilderNs.IRawQuery = js.native
  def createView(): camljsLib.camljsMod.CamlBuilderNs.IView = js.native
  def createView(viewFields: js.Array[camljsLib.camljsMod.CamlBuilderNs.ViewField]): camljsLib.camljsMod.CamlBuilderNs.IView = js.native
  def createViewFields(viewFields: js.Array[java.lang.String]): camljsLib.camljsMod.CamlBuilderNs.IFinalizableToString = js.native
  def createWhere(): camljsLib.camljsMod.CamlBuilderNs.IFieldExpression = js.native
}

