package typings.baconjs.baconjsMod

import typings.baconjs.typesUpdateMod.UpdatePattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "update")
@js.native
object update extends js.Object {
  def apply[Out](initial: Out, patterns: UpdatePattern[Out]*): typings.baconjs.typesObservableMod.Property[Out] = js.native
}

