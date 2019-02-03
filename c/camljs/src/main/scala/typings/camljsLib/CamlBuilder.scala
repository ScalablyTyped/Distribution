package typings
package camljsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CamlBuilder")
@js.native
class CamlBuilder () extends js.Object {
  /** Generate <View> tag for SP.CamlQuery
    @param viewFields If omitted, default view fields are requested; otherwise, only values for the fields with the specified internal names are returned.
    Specifying view fields is a good practice, as it decreases traffic between server and client. */
  def View(): camljsLib.CamlBuilderNs.IView = js.native
  def View(viewFields: js.Array[java.lang.String]): camljsLib.CamlBuilderNs.IView = js.native
  /** Generate <ViewFields> tag for SPServices */
  def ViewFields(viewFields: js.Array[java.lang.String]): camljsLib.CamlBuilderNs.IFinalizableToString = js.native
  /** Generate CAML Query, starting from <Where> tag */
  def Where(): camljsLib.CamlBuilderNs.IFieldExpression = js.native
}

/* static members */
@JSGlobal("CamlBuilder")
@js.native
object CamlBuilder extends js.Object {
  /** Use for:
    1. SPServices CAMLQuery attribute
    2. Creating partial expressions
    3. In conjunction with Any & All clauses
    */
  def Expression(): camljsLib.CamlBuilderNs.IFieldExpression = js.native
  def FromXml(xml: java.lang.String): camljsLib.CamlBuilderNs.IRawQuery = js.native
}

