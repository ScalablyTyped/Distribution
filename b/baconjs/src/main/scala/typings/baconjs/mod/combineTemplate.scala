package typings.baconjs.mod

import typings.baconjs.combinetemplateMod.CombinedTemplate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs", "combineTemplate")
@js.native
object combineTemplate extends js.Object {
  
  def apply[T](template: T): typings.baconjs.observableMod.Property[CombinedTemplate[T]] = js.native
}
