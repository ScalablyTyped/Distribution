package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpEndpointRequestConfiguration extends js.Object {
  
  /**
    * Describes the metadata sent to the HTTP endpoint destination.
    */
  var CommonAttributes: js.UndefOr[HttpEndpointCommonAttributesList] = js.native
  
  /**
    * Kinesis Data Firehose uses the content encoding to compress the body of a request before sending the request to the destination. For more information, see Content-Encoding in MDN Web Docs, the official Mozilla documentation.
    */
  var ContentEncoding: js.UndefOr[typings.awsSdk.firehoseMod.ContentEncoding] = js.native
}
object HttpEndpointRequestConfiguration {
  
  @scala.inline
  def apply(): HttpEndpointRequestConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpEndpointRequestConfiguration]
  }
  
  @scala.inline
  implicit class HttpEndpointRequestConfigurationOps[Self <: HttpEndpointRequestConfiguration] (val x: Self) extends AnyVal {
    
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
    def setCommonAttributesVarargs(value: HttpEndpointCommonAttribute*): Self = this.set("CommonAttributes", js.Array(value :_*))
    
    @scala.inline
    def setCommonAttributes(value: HttpEndpointCommonAttributesList): Self = this.set("CommonAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommonAttributes: Self = this.set("CommonAttributes", js.undefined)
    
    @scala.inline
    def setContentEncoding(value: ContentEncoding): Self = this.set("ContentEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentEncoding: Self = this.set("ContentEncoding", js.undefined)
  }
}
