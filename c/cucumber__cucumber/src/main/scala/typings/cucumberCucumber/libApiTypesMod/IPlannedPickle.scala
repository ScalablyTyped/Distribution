package typings.cucumberCucumber.libApiTypesMod

import typings.cucumberCucumber.anon.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPlannedPickle extends StObject {
  
  var location: Column
  
  var name: String
  
  var uri: String
}
object IPlannedPickle {
  
  inline def apply(location: Column, name: String, uri: String): IPlannedPickle = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlannedPickle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPlannedPickle] (val x: Self) extends AnyVal {
    
    inline def setLocation(value: Column): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
