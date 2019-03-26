package typings
package cypressLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Mouse extends js.Object

// Provided for convenience for use with jQuery.Event.which
// tslint:disable-next-line:no-const-enum
@JSGlobal("JQuery.Mouse")
@js.native
object Mouse extends js.Object {
  @js.native
  sealed trait Left
    extends cypressLib.JQueryNs.Mouse
  
  @js.native
  sealed trait Middle
    extends cypressLib.JQueryNs.Mouse
  
  @js.native
  sealed trait None
    extends cypressLib.JQueryNs.Mouse
  
  @js.native
  sealed trait Right
    extends cypressLib.JQueryNs.Mouse
  
  /* 1 */ val Left: Left with scala.Double = js.native
  /* 2 */ val Middle: Middle with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 3 */ val Right: Right with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[cypressLib.JQueryNs.Mouse with scala.Double] = js.native
}

