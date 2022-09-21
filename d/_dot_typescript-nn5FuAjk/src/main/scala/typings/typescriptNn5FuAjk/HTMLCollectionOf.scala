package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLCollectionOf[T /* <: Element */]
  extends StObject
     with HTMLCollectionBase {
  
  @JSName(js.Symbol.iterator)
  var iterator_HTMLCollectionOf: js.Function0[IterableIterator[T]] = js.native
  
  def namedItem(name: java.lang.String): T | Null = js.native
}
