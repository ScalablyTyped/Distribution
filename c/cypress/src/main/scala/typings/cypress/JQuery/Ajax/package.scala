package typings.cypress.JQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Ajax {
  type CompleteCallback[TContext] = js.ThisFunction2[
    /* this */ TContext, 
    /* jqXHR */ typings.cypress.JQuery.jqXHR[js.Any], 
    /* textStatus */ typings.cypress.JQuery.Ajax.TextStatus, 
    scala.Unit
  ]
  type ErrorCallback[TContext] = js.ThisFunction3[
    /* this */ TContext, 
    /* jqXHR */ typings.cypress.JQuery.jqXHR[js.Any], 
    /* textStatus */ typings.cypress.JQuery.Ajax.ErrorTextStatus, 
    /* errorThrown */ java.lang.String, 
    scala.Unit
  ]
  type SuccessCallback[TContext] = js.ThisFunction3[
    /* this */ TContext, 
    /* data */ js.Any, 
    /* textStatus */ typings.cypress.JQuery.Ajax.SuccessTextStatus, 
    /* jqXHR */ typings.cypress.JQuery.jqXHR[js.Any], 
    scala.Unit
  ]
}
