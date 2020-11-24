package typings.baseui.anon

import typings.baseui.snackbarMod.DurationT
import typings.baseui.snackbarMod.SnackbarElementPropsT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dequeue extends js.Object {
  
  def dequeue(): js.Any = js.native
  
  def enqueue(elementProps: SnackbarElementPropsT): js.Any = js.native
  def enqueue(elementProps: SnackbarElementPropsT, duration: DurationT): js.Any = js.native
}
