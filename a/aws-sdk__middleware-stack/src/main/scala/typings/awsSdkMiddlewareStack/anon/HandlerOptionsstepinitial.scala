package typings.awsSdkMiddlewareStack.anon

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkMiddlewareStack.awsSdkMiddlewareStackStrings.initialize
import typings.awsSdkTypes.middlewareMod.Step
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @aws-sdk/types.@aws-sdk/types.HandlerOptions & {  step :'initialize' | undefined} */
@js.native
trait HandlerOptionsstepinitial extends js.Object {
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
  var priority: js.UndefOr[Double] = js.native
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
  var step: js.UndefOr[Step] with js.UndefOr[initialize] = js.native
  /**
    * A map of strings to any that identify the general purpose or important
    * characteristics of a given handler.
    */
  var tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object HandlerOptionsstepinitial {
  @scala.inline
  def apply(step: js.UndefOr[Step] with js.UndefOr[initialize]): HandlerOptionsstepinitial = {
    val __obj = js.Dynamic.literal(step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandlerOptionsstepinitial]
  }
  @scala.inline
  implicit class HandlerOptionsstepinitialOps[Self <: HandlerOptionsstepinitial] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStep(value: js.UndefOr[Step] with js.UndefOr[initialize]): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setTags(value: StringDictionary[js.Any]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

