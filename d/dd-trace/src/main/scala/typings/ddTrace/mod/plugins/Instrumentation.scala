package typings.ddTrace.mod.plugins

import typings.ddTrace.mod.Analyzable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
@js.native
trait Instrumentation
  extends Integration
     with Analyzable

object Instrumentation {
  @scala.inline
  def apply(): Instrumentation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instrumentation]
  }
}

