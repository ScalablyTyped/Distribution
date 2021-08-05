package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpEndpointDescription extends StObject {
  
  /**
    * The name of the HTTP endpoint selected as the destination.
    */
  var Name: js.UndefOr[HttpEndpointName] = js.undefined
  
  /**
    * The URL of the HTTP endpoint selected as the destination.
    */
  var Url: js.UndefOr[HttpEndpointUrl] = js.undefined
}
object HttpEndpointDescription {
  
  inline def apply(): HttpEndpointDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpEndpointDescription]
  }
  
  extension [Self <: HttpEndpointDescription](x: Self) {
    
    inline def setName(value: HttpEndpointName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setUrl(value: HttpEndpointUrl): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
