package typings
package catboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object catboxMod {
  type EnginePrototypeOrObject = EnginePrototype[js.Any] | ClientApi[js.Any]
  type GenerateFunc[T] = js.Function2[/* id */ Id, /* flags */ GenerateFuncFlags, js.Promise[T]]
  type Id = java.lang.String | catboxLib.Anon_Id
}
