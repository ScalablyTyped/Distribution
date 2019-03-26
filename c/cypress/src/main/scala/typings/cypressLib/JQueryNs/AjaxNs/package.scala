package typings
package cypressLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AjaxNs {
  type CompleteCallback[TContext] = js.ThisFunction2[
    /* this */ TContext, 
    /* jqXHR */ cypressLib.JQueryNs.jqXHR[js.Any], 
    /* textStatus */ TextStatus, 
    scala.Unit
  ]
  type ErrorCallback[TContext] = js.ThisFunction3[
    /* this */ TContext, 
    /* jqXHR */ cypressLib.JQueryNs.jqXHR[js.Any], 
    /* textStatus */ ErrorTextStatus, 
    /* errorThrown */ java.lang.String, 
    scala.Unit
  ]
  type SuccessCallback[TContext] = js.ThisFunction3[
    /* this */ TContext, 
    /* data */ js.Any, 
    /* textStatus */ SuccessTextStatus, 
    /* jqXHR */ cypressLib.JQueryNs.jqXHR[js.Any], 
    scala.Unit
  ]
}
