package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpEndpointDescription extends StObject {
  
  /**
    * The name of the HTTP endpoint selected as the destination.
    */
  var Name: js.UndefOr[HttpEndpointName] = js.native
  
  /**
    * The URL of the HTTP endpoint selected as the destination.
    */
  var Url: js.UndefOr[HttpEndpointUrl] = js.native
}
object HttpEndpointDescription {
  
  @scala.inline
  def apply(): HttpEndpointDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpEndpointDescription]
  }
  
  @scala.inline
  implicit class HttpEndpointDescriptionMutableBuilder[Self <: HttpEndpointDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: HttpEndpointName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setUrl(value: HttpEndpointUrl): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
