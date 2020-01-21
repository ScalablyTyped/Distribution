package typings.camljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("camljs", JSImport.Namespace)
@js.native
class ^ () extends CamlBuilder

@JSImport("camljs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /** Use for:
    1. SPServices CAMLQuery attribute
    2. Creating partial expressions
    3. In conjunction with Any & All clauses
    */
  def Expression(): IFieldExpression = js.native
  def FromXml(xml: String): IRawQuery = js.native
}

