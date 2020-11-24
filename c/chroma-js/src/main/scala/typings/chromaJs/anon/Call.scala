package typings.chromaJs.anon

import typings.chromaJs.mod.Color
import typings.chromaJs.mod.Scale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Call extends js.Object {
  
  def apply(t: Double): Color = js.native
  
  def scale(): Scale[Color] = js.native
}
