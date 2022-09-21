package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used to store a list of Plugin objects describing the available plugins; it's returned by the window.navigator.plugins property. The PluginArray is not a JavaScript array, but has the length property and supports accessing individual items using bracket notation (plugins[2]), as well as via item(index) and namedItem("name") methods.
  * @deprecated
  */
@js.native
trait PluginArray
  extends StObject
     with /* index */ NumberDictionary[Plugin] {
  
  /** @deprecated */
  def item(index: Double): Plugin | Null = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[Plugin]] = js.native
  
  /** @deprecated */
  val length: Double = js.native
  
  /** @deprecated */
  def namedItem(name: java.lang.String): Plugin | Null = js.native
  
  /** @deprecated */
  def refresh(): Unit = js.native
}
