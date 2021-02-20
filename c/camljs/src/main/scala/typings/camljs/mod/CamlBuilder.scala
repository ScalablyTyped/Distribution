package typings.camljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CamlBuilder extends StObject {
  
  /** Generate <View> tag for SP.CamlQuery
    @param viewFields If omitted, default view fields are requested; otherwise, only values for the fields with the specified internal names are returned.
    Specifying view fields is a good practice, as it decreases traffic between server and client.
    Additionally you can specify aggregated fields, e.g. { count: "<field name>" }, { sum: "<field name>" }, etc.. */
  def View(): IView = js.native
  def View(viewFields: js.Array[ViewField]): IView = js.native
  
  /** Generate <ViewFields> tag for SPServices */
  def ViewFields(viewFields: js.Array[String]): IFinalizableToString = js.native
  
  /** Generate CAML Query, starting from <Where> tag */
  def Where(): IFieldExpression = js.native
}
