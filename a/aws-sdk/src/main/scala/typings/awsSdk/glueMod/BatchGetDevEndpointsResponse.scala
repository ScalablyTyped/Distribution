package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetDevEndpointsResponse extends js.Object {
  
  /**
    * A list of DevEndpoint definitions.
    */
  var DevEndpoints: js.UndefOr[DevEndpointList] = js.native
  
  /**
    * A list of DevEndpoints not found.
    */
  var DevEndpointsNotFound: js.UndefOr[DevEndpointNames] = js.native
}
object BatchGetDevEndpointsResponse {
  
  @scala.inline
  def apply(): BatchGetDevEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetDevEndpointsResponse]
  }
  
  @scala.inline
  implicit class BatchGetDevEndpointsResponseOps[Self <: BatchGetDevEndpointsResponse] (val x: Self) extends AnyVal {
    
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
    def setDevEndpointsVarargs(value: DevEndpoint*): Self = this.set("DevEndpoints", js.Array(value :_*))
    
    @scala.inline
    def setDevEndpoints(value: DevEndpointList): Self = this.set("DevEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevEndpoints: Self = this.set("DevEndpoints", js.undefined)
    
    @scala.inline
    def setDevEndpointsNotFoundVarargs(value: GenericString*): Self = this.set("DevEndpointsNotFound", js.Array(value :_*))
    
    @scala.inline
    def setDevEndpointsNotFound(value: DevEndpointNames): Self = this.set("DevEndpointsNotFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevEndpointsNotFound: Self = this.set("DevEndpointsNotFound", js.undefined)
  }
}
