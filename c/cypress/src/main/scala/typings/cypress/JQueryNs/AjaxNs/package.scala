package typings.cypress.JQueryNs

import typings.cypress.JQueryNs.jqXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AjaxNs {
  type CompleteCallback[TContext] = js.ThisFunction2[/* this */ TContext, /* jqXHR */ jqXHR[js.Any], /* textStatus */ TextStatus, Unit]
  type ErrorCallback[TContext] = js.ThisFunction3[
    /* this */ TContext, 
    /* jqXHR */ jqXHR[js.Any], 
    /* textStatus */ ErrorTextStatus, 
    /* errorThrown */ String, 
    Unit
  ]
  type SuccessCallback[TContext] = js.ThisFunction3[
    /* this */ TContext, 
    /* data */ js.Any, 
    /* textStatus */ SuccessTextStatus, 
    /* jqXHR */ jqXHR[js.Any], 
    Unit
  ]
}
