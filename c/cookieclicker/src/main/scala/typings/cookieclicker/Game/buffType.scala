package typings.cookieclicker.Game

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait buffType extends js.Object {
  
  def func(time: Double): Buff = js.native
  def func(time: Double, arg1: js.UndefOr[scala.Nothing], arg2: js.UndefOr[scala.Nothing], arg3: Double): Buff = js.native
  def func(time: Double, arg1: js.UndefOr[scala.Nothing], arg2: Double): Buff = js.native
  def func(time: Double, arg1: js.UndefOr[scala.Nothing], arg2: Double, arg3: Double): Buff = js.native
  def func(time: Double, arg1: Double): Buff = js.native
  def func(time: Double, arg1: Double, arg2: js.UndefOr[scala.Nothing], arg3: Double): Buff = js.native
  def func(time: Double, arg1: Double, arg2: Double): Buff = js.native
  def func(time: Double, arg1: Double, arg2: Double, arg3: Double): Buff = js.native
  
  var id: Double = js.native
  
  var name: String = js.native
  
  var vanilla: PseudoBoolean = js.native
}
