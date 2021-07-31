package typings.dc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataGridWidget
  extends StObject
     with BaseMixin[DataGridWidget] {
  
  def beginSlice(): Double = js.native
  def beginSlice(t: Double): DataGridWidget = js.native
  @JSName("beginSlice")
  var beginSlice_Original: IGetSet[Double, DataGridWidget] = js.native
  
  def endSlice(): Double = js.native
  def endSlice(t: Double): DataGridWidget = js.native
  @JSName("endSlice")
  var endSlice_Original: IGetSet[Double, DataGridWidget] = js.native
  
  def html(): Accessor[js.Any, String] = js.native
  def html(t: Accessor[js.Any, String]): DataGridWidget = js.native
  
  def htmlSection(): Accessor[js.Any, String] = js.native
  def htmlSection(t: Accessor[js.Any, String]): DataGridWidget = js.native
  @JSName("htmlSection")
  var htmlSection_Original: IGetSet[Accessor[js.Any, String], DataGridWidget] = js.native
  
  @JSName("html")
  var html_Original: IGetSet[Accessor[js.Any, String], DataGridWidget] = js.native
  
  def order(): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  def order(t: js.Function2[/* a */ js.Any, /* b */ js.Any, Double]): DataGridWidget = js.native
  @JSName("order")
  var order_Original: IGetSet[js.Function2[/* a */ js.Any, /* b */ js.Any, Double], DataGridWidget] = js.native
  
  def section(): js.Function = js.native
  def section(t: js.Function): DataGridWidget = js.native
  @JSName("section")
  var section_Original: IGetSet[js.Function, DataGridWidget] = js.native
  
  def size(): Double = js.native
  def size(t: Double): DataGridWidget = js.native
  @JSName("size")
  var size_Original: IGetSet[Double, DataGridWidget] = js.native
  
  def sortBy(): Accessor[js.Any, js.Any] = js.native
  def sortBy(t: Accessor[js.Any, js.Any]): DataGridWidget = js.native
  @JSName("sortBy")
  var sortBy_Original: IGetSet[Accessor[js.Any, js.Any], DataGridWidget] = js.native
}
