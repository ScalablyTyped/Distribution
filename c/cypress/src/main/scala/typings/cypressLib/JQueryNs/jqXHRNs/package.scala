package typings
package cypressLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jqXHRNs {
  type AlwaysCallback[TResolve, TjqXHR] = cypressLib.JQueryNs.DeferredNs.Callback3[TResolve | TjqXHR, cypressLib.JQueryNs.AjaxNs.TextStatus, TjqXHR | java.lang.String]
  type DoneCallback[TResolve, TjqXHR] = cypressLib.JQueryNs.DeferredNs.Callback3[TResolve, cypressLib.JQueryNs.AjaxNs.SuccessTextStatus, TjqXHR]
  type FailCallback[TjqXHR] = cypressLib.JQueryNs.DeferredNs.Callback3[TjqXHR, cypressLib.JQueryNs.AjaxNs.ErrorTextStatus, java.lang.String]
}
