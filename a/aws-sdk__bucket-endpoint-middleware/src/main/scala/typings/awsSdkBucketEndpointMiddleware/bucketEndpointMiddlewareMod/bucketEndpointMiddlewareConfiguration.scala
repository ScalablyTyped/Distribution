package typings.awsSdkBucketEndpointMiddleware.bucketEndpointMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait bucketEndpointMiddlewareConfiguration extends js.Object {
  
  var forcePathStyle: js.UndefOr[Boolean] = js.native
  
  var preformedBucketEndpoint: js.UndefOr[Boolean] = js.native
  
  var useAccelerateEndpoint: js.UndefOr[Boolean] = js.native
  
  var useDualstackEndpoint: js.UndefOr[Boolean] = js.native
}
object bucketEndpointMiddlewareConfiguration {
  
  @scala.inline
  def apply(): bucketEndpointMiddlewareConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[bucketEndpointMiddlewareConfiguration]
  }
  
  @scala.inline
  implicit class bucketEndpointMiddlewareConfigurationOps[Self <: bucketEndpointMiddlewareConfiguration] (val x: Self) extends AnyVal {
    
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
    def setForcePathStyle(value: Boolean): Self = this.set("forcePathStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForcePathStyle: Self = this.set("forcePathStyle", js.undefined)
    
    @scala.inline
    def setPreformedBucketEndpoint(value: Boolean): Self = this.set("preformedBucketEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreformedBucketEndpoint: Self = this.set("preformedBucketEndpoint", js.undefined)
    
    @scala.inline
    def setUseAccelerateEndpoint(value: Boolean): Self = this.set("useAccelerateEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseAccelerateEndpoint: Self = this.set("useAccelerateEndpoint", js.undefined)
    
    @scala.inline
    def setUseDualstackEndpoint(value: Boolean): Self = this.set("useDualstackEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseDualstackEndpoint: Self = this.set("useDualstackEndpoint", js.undefined)
  }
}
