package typings.cypress.JQueryNs

import typings.cypress.JQueryNs.AjaxNs.ErrorTextStatus
import typings.cypress.JQueryNs.AjaxNs.SuccessTextStatus
import typings.cypress.JQueryNs.AjaxNs.TextStatus
import typings.cypress.JQueryNs.DeferredNs.Callback3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jqXHRNs {
  type AlwaysCallback[TResolve, TjqXHR] = Callback3[TResolve | TjqXHR, TextStatus, TjqXHR | String]
  type DoneCallback[TResolve, TjqXHR] = Callback3[TResolve, SuccessTextStatus, TjqXHR]
  type FailCallback[TjqXHR] = Callback3[TjqXHR, ErrorTextStatus, String]
}
