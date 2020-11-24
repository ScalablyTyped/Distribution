package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetDevEndpointsRequest extends js.Object {
  
  /**
    * The list of DevEndpoint names, which might be the names returned from the ListDevEndpoint operation.
    */
  var DevEndpointNames: typings.awsSdk.glueMod.DevEndpointNames = js.native
}
object BatchGetDevEndpointsRequest {
  
  @scala.inline
  def apply(DevEndpointNames: DevEndpointNames): BatchGetDevEndpointsRequest = {
    val __obj = js.Dynamic.literal(DevEndpointNames = DevEndpointNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetDevEndpointsRequest]
  }
  
  @scala.inline
  implicit class BatchGetDevEndpointsRequestOps[Self <: BatchGetDevEndpointsRequest] (val x: Self) extends AnyVal {
    
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
    def setDevEndpointNamesVarargs(value: GenericString*): Self = this.set("DevEndpointNames", js.Array(value :_*))
    
    @scala.inline
    def setDevEndpointNames(value: DevEndpointNames): Self = this.set("DevEndpointNames", value.asInstanceOf[js.Any])
  }
}
