package typings.baconjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skipduplicatesMod {
  
  @JSImport("baconjs/types/skipduplicates", JSImport.Default)
  @js.native
  def default[A](src: typings.baconjs.observableMod.default[A]): typings.baconjs.observableMod.default[A] = js.native
  @JSImport("baconjs/types/skipduplicates", JSImport.Default)
  @js.native
  def default[A](src: typings.baconjs.observableMod.default[A], isEqual: Equals[A]): typings.baconjs.observableMod.default[A] = js.native
  
  @JSImport("baconjs/types/skipduplicates", "equals")
  @js.native
  def equals_[A](a: A, b: A): Boolean = js.native
  
  type Equals[A] = js.Function2[/* left */ A, /* right */ A, Boolean]
}
