package typings.cashDom.mod

import typings.cashDom.cashDomBooleans.`true`
import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CashStatic extends js.Object {
  
  def each[T](arr: ArrayLike[T], callback: EachArrayCallback[T]): Unit = js.native
  def each[T](obj: PlainObject[T], callback: EachObjectCallback[T]): Unit = js.native
  
  def extend(): js.Any = js.native
  def extend(target: js.Any): (js.Function2[/* selector */ js.UndefOr[Selector], /* context */ js.UndefOr[Context | Cash], Cash]) with CashStatic = js.native
  def extend(target: js.Any, sources: js.Any*): js.Any = js.native
  @JSName("extend")
  def extend_true(deep: `true`, target: js.Any, sources: js.Any*): js.Any = js.native
  
  var fn: Cash = js.native
  
  var guid: Double = js.native
  
  def isArray(x: js.Any): /* is std.Array<any> */ Boolean = js.native
  
  def isFunction(x: js.Any): /* is std.Function */ Boolean = js.native
  
  def isNumeric(x: js.Any): Boolean = js.native
  
  def isPlainObject(x: js.Any): /* is cash-dom.cash-dom.PlainObject<any> */ Boolean = js.native
  
  def isWindow(x: js.Any): /* is std.Window */ Boolean = js.native
  
  def parseHTML(html: String): js.Array[EleLoose] = js.native
  
  def unique[T](arr: ArrayLike[T]): ArrayLike[T] = js.native
}
