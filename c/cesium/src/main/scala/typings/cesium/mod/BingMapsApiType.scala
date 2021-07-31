package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BingMapsApiType extends StObject {
  
  var defaultKey: String
  
  def getKey(providedKey: String): String
}
object BingMapsApiType {
  
  @scala.inline
  def apply(defaultKey: String, getKey: String => String): BingMapsApiType = {
    val __obj = js.Dynamic.literal(defaultKey = defaultKey.asInstanceOf[js.Any], getKey = js.Any.fromFunction1(getKey))
    __obj.asInstanceOf[BingMapsApiType]
  }
  
  @scala.inline
  implicit class BingMapsApiTypeMutableBuilder[Self <: BingMapsApiType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultKey(value: String): Self = StObject.set(x, "defaultKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetKey(value: String => String): Self = StObject.set(x, "getKey", js.Any.fromFunction1(value))
  }
}
