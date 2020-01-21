package typings.awsSdkTypes.middlewareMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandlerOptions extends js.Object {
  /**
    * A number that specifies how early in a given step of the middleware stack
    * a handler should be executed. Higher numeric priorities will be executed
    * earlier.
    *
    * Middleware registered at the same step and with the same priority may be
    * executed in any order.
    *
    * @default 0
    */
  var priority: js.UndefOr[Double] = js.undefined
  /**
    * Handlers are ordered using a "step" that describes the stage of command
    * execution at which the handler will be executed. The available steps are:
    *
    * - initialize: The input is being prepared. Examples of typical
    *      initialization tasks include injecting default options computing
    *      derived parameters.
    * - serialize: The input is complete and ready to be serialized. Examples
    *      of typical serialization tasks include input validation and building
    *      an HTTP request from user input.
    * - build: The input has been serialized into an HTTP request, but that
    *      request may require further modification. Any request alterations
    *      will be applied to all retries. Examples of typical build tasks
    *      include injecting HTTP headers that describe a stable aspect of the
    *      request, such as `Content-Length` or a body checksum.
    * - finalize: The request is being prepared to be sent over the wire. The
    *      request in this stage should already be semantically complete and
    *      should therefore only be altered as match the recipient's
    *      expectations. Examples of typical finalization tasks include request
    *      signing and injecting hop-by-hop headers.
    *
    *      Unlike initialization and build handlers, which are executed once
    *      per operation execution, finalization handlers will be executed for
    *      each HTTP request sent.
    *
    * @default 'initialize'
    */
  var step: js.UndefOr[Step] = js.undefined
  /**
    * A map of strings to any that identify the general purpose or important
    * characteristics of a given handler.
    */
  var tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object HandlerOptions {
  @scala.inline
  def apply(priority: Int | Double = null, step: Step = null, tags: StringDictionary[js.Any] = null): HandlerOptions = {
    val __obj = js.Dynamic.literal()
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandlerOptions]
  }
}

