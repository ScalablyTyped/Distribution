package typings
package cypressLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see \`{@link http://api.jquery.com/jquery.ajax/#jqXHR }\`
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in 'abort' | 'getAllResponseHeaders' | 'getResponseHeader' | 'overrideMimeType' | 'readyState' | 'responseText' | 'setRequestHeader' | 'status' | 'statusText' ]: std.XMLHttpRequest[P]}
- Dropped {[ P in keyof std.Pick<std.XMLHttpRequest, 'responseXML'> ]:? std.Pick<std.XMLHttpRequest, 'responseXML'>[P]} */ @js.native
trait jqXHR[TResolve]
  extends PromiseBase[
      TResolve, 
      jqXHR[TResolve], 
      scala.Nothing, 
      cypressLib.JQueryNs.AjaxNs.SuccessTextStatus, 
      cypressLib.JQueryNs.AjaxNs.ErrorTextStatus, 
      scala.Nothing, 
      jqXHR[TResolve], 
      java.lang.String, 
      scala.Nothing, 
      scala.Nothing, 
      scala.Nothing, 
      scala.Nothing
    ] {
  var responseJSON: js.UndefOr[js.Any] = js.native
  def statusCode(map: cypressLib.JQueryNs.AjaxNs.StatusCodeCallbacks[_]): scala.Unit = js.native
}

