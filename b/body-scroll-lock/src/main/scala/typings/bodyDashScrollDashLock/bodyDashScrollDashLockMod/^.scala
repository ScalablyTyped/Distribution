package typings.bodyDashScrollDashLock.bodyDashScrollDashLockMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("body-scroll-lock", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def clearAllBodyScrollLocks(): Unit = js.native
  def disableBodyScroll(targetElement: HTMLElement): Unit = js.native
  def disableBodyScroll(targetElement: HTMLElement, options: BodyScrollOptions): Unit = js.native
  def enableBodyScroll(targetElement: HTMLElement): Unit = js.native
}

