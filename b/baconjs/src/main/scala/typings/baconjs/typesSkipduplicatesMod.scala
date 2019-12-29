package typings.baconjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/skipduplicates", JSImport.Namespace)
@js.native
object typesSkipduplicatesMod extends js.Object {
  def default[A](src: typings.baconjs.typesObservableMod.default[A]): typings.baconjs.typesObservableMod.default[A] = js.native
  def default[A](src: typings.baconjs.typesObservableMod.default[A], isEqual: Equals[A]): typings.baconjs.typesObservableMod.default[A] = js.native
  def equals[A](a: A, b: A): Boolean = js.native
  type Equals[A] = js.Function2[/* left */ A, /* right */ A, Boolean]
}

