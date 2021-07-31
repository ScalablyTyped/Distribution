package typings.currencyFormatter

import org.scalablytyped.runtime.Shortcut
import typings.currencyFormatter.mod.Currency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object currenciesMod extends Shortcut {
  
  @JSImport("currency-formatter/currencies", JSImport.Namespace)
  @js.native
  val ^ : js.Array[Currency] = js.native
  
  type _To = js.Array[Currency]
  
  /* This means you don't have to write `^`, but can instead just say `currenciesMod.foo` */
  override def _to: js.Array[Currency] = ^
}
