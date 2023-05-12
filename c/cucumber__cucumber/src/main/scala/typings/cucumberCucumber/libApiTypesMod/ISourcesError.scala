package typings.cucumberCucumber.libApiTypesMod

import typings.cucumberCucumber.anon.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISourcesError extends StObject {
  
  var location: Column
  
  var message: String
  
  var uri: String
}
object ISourcesError {
  
  inline def apply(location: Column, message: String, uri: String): ISourcesError = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISourcesError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISourcesError] (val x: Self) extends AnyVal {
    
    inline def setLocation(value: Column): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
