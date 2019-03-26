package typings
package cypressLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TransportNs {
  type SuccessCallback = js.Function4[
    /* status */ scala.Double, 
    /* statusText */ cypressLib.JQueryNs.AjaxNs.TextStatus, 
    /* responses */ js.UndefOr[cypressLib.JQueryNs.PlainObject[js.Any]], 
    /* headers */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
}
