package typings.cypress.JQuery

import typings.cypress.JQuery.Ajax.ErrorTextStatus
import typings.cypress.JQuery.Ajax.StatusCodeCallbacks
import typings.cypress.JQuery.Ajax.SuccessTextStatus
import typings.cypress.JQuery.Ajax.TextStatus
import typings.cypress.JQuery.Deferred.Callback3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see \`{@link https://api.jquery.com/jquery.ajax/#jqXHR }\`
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in 'abort' | 'getAllResponseHeaders' | 'getResponseHeader' | 'overrideMimeType' | 'readyState' | 'responseText' | 'setRequestHeader' | 'status' | 'statusText' ]: std.XMLHttpRequest[P]}
- Dropped {[ P in keyof std.Pick<std.XMLHttpRequest, 'responseXML'> ]:? std.Pick<std.XMLHttpRequest, 'responseXML'>[P]} */ @js.native
trait jqXHR[TResolve]
  extends PromiseBase[
      TResolve, 
      jqXHR[TResolve], 
      scala.Nothing, 
      SuccessTextStatus, 
      ErrorTextStatus, 
      scala.Nothing, 
      jqXHR[TResolve], 
      String, 
      scala.Nothing, 
      scala.Nothing, 
      scala.Nothing, 
      scala.Nothing
    ] {
  var responseJSON: js.UndefOr[js.Any] = js.native
  def abort(): Unit = js.native
  def abort(statusText: String): Unit = js.native
  def statusCode(map: StatusCodeCallbacks[_]): Unit = js.native
}

@JSGlobal("JQuery.jqXHR")
@js.native
object jqXHR extends js.Object {
  type AlwaysCallback[TResolve, TjqXHR] = Callback3[TResolve | TjqXHR, TextStatus, TjqXHR | String]
  type DoneCallback[TResolve, TjqXHR] = Callback3[TResolve, SuccessTextStatus, TjqXHR]
  type FailCallback[TjqXHR] = Callback3[TjqXHR, ErrorTextStatus, String]
}

