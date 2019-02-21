package typings
package camljsLib.camljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("camljs", JSImport.Namespace)
@js.native
class namespaced () extends CamlBuilder

/* static members */
@JSImport("camljs", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  /** Use for:
    1. SPServices CAMLQuery attribute
    2. Creating partial expressions
    3. In conjunction with Any & All clauses
    */
  def Expression(): camljsLib.camljsMod.CamlBuilderNs.IFieldExpression = js.native
  def FromXml(xml: java.lang.String): camljsLib.camljsMod.CamlBuilderNs.IRawQuery = js.native
}

