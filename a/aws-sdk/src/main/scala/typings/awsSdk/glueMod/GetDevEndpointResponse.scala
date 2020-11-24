package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDevEndpointResponse extends js.Object {
  
  /**
    * A DevEndpoint definition.
    */
  var DevEndpoint: js.UndefOr[typings.awsSdk.glueMod.DevEndpoint] = js.native
}
object GetDevEndpointResponse {
  
  @scala.inline
  def apply(): GetDevEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDevEndpointResponse]
  }
  
  @scala.inline
  implicit class GetDevEndpointResponseOps[Self <: GetDevEndpointResponse] (val x: Self) extends AnyVal {
    
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
    def setDevEndpoint(value: DevEndpoint): Self = this.set("DevEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevEndpoint: Self = this.set("DevEndpoint", js.undefined)
  }
}
