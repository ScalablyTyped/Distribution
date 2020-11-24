package typings.awsSdkConfigResolver.endpointsConfigMod

import typings.awsSdkTypes.httpMod.Endpoint
import typings.awsSdkTypes.utilMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointsInputConfig extends js.Object {
  
  /**
    * The fully qualified endpoint of the webservice. This is only required when using a custom endpoint (for example, when using a local version of S3).
    */
  var endpoint: js.UndefOr[String | Endpoint | Provider[Endpoint]] = js.native
  
  /**
    * Whether TLS is enabled for requests.
    */
  var tls: js.UndefOr[Boolean] = js.native
}
object EndpointsInputConfig {
  
  @scala.inline
  def apply(): EndpointsInputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointsInputConfig]
  }
  
  @scala.inline
  implicit class EndpointsInputConfigOps[Self <: EndpointsInputConfig] (val x: Self) extends AnyVal {
    
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
    def setEndpointFunction0(value: () => js.Promise[Endpoint]): Self = this.set("endpoint", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEndpoint(value: String | Endpoint | Provider[Endpoint]): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    
    @scala.inline
    def setTls(value: Boolean): Self = this.set("tls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTls: Self = this.set("tls", js.undefined)
  }
}
