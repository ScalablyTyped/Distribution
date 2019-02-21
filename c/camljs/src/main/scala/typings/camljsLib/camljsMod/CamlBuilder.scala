package typings
package camljsLib.camljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CamlBuilder extends js.Object {
  /** Generate <View> tag for SP.CamlQuery
    @param viewFields If omitted, default view fields are requested; otherwise, only values for the fields with the specified internal names are returned.
    Specifying view fields is a good practice, as it decreases traffic between server and client.
    Additionally you can specify aggregated fields, e.g. { count: "<field name>" }, { sum: "<field name>" }, etc.. */
  def View(): camljsLib.camljsMod.CamlBuilderNs.IView = js.native
  def View(viewFields: js.Array[camljsLib.camljsMod.CamlBuilderNs.ViewField]): camljsLib.camljsMod.CamlBuilderNs.IView = js.native
  /** Generate <ViewFields> tag for SPServices */
  def ViewFields(viewFields: js.Array[java.lang.String]): camljsLib.camljsMod.CamlBuilderNs.IFinalizableToString = js.native
  /** Generate CAML Query, starting from <Where> tag */
  def Where(): camljsLib.camljsMod.CamlBuilderNs.IFieldExpression = js.native
}

