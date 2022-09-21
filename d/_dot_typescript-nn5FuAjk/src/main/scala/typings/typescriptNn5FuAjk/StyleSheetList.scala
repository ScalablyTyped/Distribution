package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A list of StyleSheet. */
@js.native
trait StyleSheetList
  extends StObject
     with /* index */ NumberDictionary[CSSStyleSheet] {
  
  def item(index: Double): CSSStyleSheet | Null = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[CSSStyleSheet]] = js.native
  
  val length: Double = js.native
}
