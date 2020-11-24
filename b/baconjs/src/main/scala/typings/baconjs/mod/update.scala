package typings.baconjs.mod

import typings.baconjs.updateMod.UpdatePattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs", "update")
@js.native
object update extends js.Object {
  
  def apply[Out](initial: Out, patterns: UpdatePattern[Out]*): typings.baconjs.observableMod.Property[Out] = js.native
}
