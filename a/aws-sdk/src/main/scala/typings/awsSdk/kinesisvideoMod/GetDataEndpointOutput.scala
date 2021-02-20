package typings.awsSdk.kinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDataEndpointOutput extends StObject {
  
  /**
    * The endpoint value. To read data from the stream or to write data to it, specify this endpoint in your application.
    */
  var DataEndpoint: js.UndefOr[typings.awsSdk.kinesisvideoMod.DataEndpoint] = js.native
}
object GetDataEndpointOutput {
  
  @scala.inline
  def apply(): GetDataEndpointOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDataEndpointOutput]
  }
  
  @scala.inline
  implicit class GetDataEndpointOutputMutableBuilder[Self <: GetDataEndpointOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataEndpoint(value: DataEndpoint): Self = StObject.set(x, "DataEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataEndpointUndefined: Self = StObject.set(x, "DataEndpoint", js.undefined)
  }
}
