package typings
package catboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object catboxMod {
  type EnginePrototypeOrObject = EnginePrototype[js.Any] | ClientApi[js.Any]
  type GenerateFunc[T] = js.Function2[/* id */ java.lang.String, /* flags */ GenerateFuncFlags, stdLib.Promise[T]]
  type PolicyOptionVariants[T] = PolicyOptions[T] | DecoratedPolicyOptions[T]
}
