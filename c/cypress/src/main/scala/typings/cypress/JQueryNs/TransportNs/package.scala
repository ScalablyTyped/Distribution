package typings.cypress.JQueryNs

import typings.cypress.JQueryNs.AjaxNs.TextStatus
import typings.cypress.JQueryNs.PlainObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TransportNs {
  type SuccessCallback = js.Function4[
    /* status */ Double, 
    /* statusText */ TextStatus, 
    /* responses */ js.UndefOr[PlainObject[js.Any]], 
    /* headers */ js.UndefOr[String], 
    Unit
  ]
}
