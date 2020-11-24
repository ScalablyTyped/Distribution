package typings.awsSdkTypes.middlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HandlerOptions extends js.Object {
  
  /**
    * A unique name to refer to a middleware
    */
  var name: js.UndefOr[String] = js.native
  
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
    * - finalizeRequest: The request is being prepared to be sent over the wire. The
    *      request in this stage should already be semantically complete and
    *      should therefore only be altered as match the recipient's
    *      expectations. Examples of typical finalization tasks include request
    *      signing and injecting hop-by-hop headers.
    * - deserialize: The response has arrived, the middleware here will deserialize
    *      the raw response object to structured response
    *
    *      Unlike initialization and build handlers, which are executed once
    *      per operation execution, finalization and deserialize handlers will be
    *      executed foreach HTTP request sent.
    *
    * @default 'initialize'
    */
  var step: js.UndefOr[Step] = js.native
  
  /**
    * A list of strings to any that identify the general purpose or important
    * characteristics of a given handler.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
}
object HandlerOptions {
  
  @scala.inline
  def apply(): HandlerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandlerOptions]
  }
  
  @scala.inline
  implicit class HandlerOptionsOps[Self <: HandlerOptions] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setStep(value: Step): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
