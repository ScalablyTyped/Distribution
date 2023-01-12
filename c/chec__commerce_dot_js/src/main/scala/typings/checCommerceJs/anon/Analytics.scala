package typings.checCommerceJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Analytics extends StObject {
  
  var analytics: Boolean
  
  var cover: Boolean
  
  var description: Boolean
  
  var logo: Boolean
}
object Analytics {
  
  inline def apply(analytics: Boolean, cover: Boolean, description: Boolean, logo: Boolean): Analytics = {
    val __obj = js.Dynamic.literal(analytics = analytics.asInstanceOf[js.Any], cover = cover.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], logo = logo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Analytics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Analytics] (val x: Self) extends AnyVal {
    
    inline def setAnalytics(value: Boolean): Self = StObject.set(x, "analytics", value.asInstanceOf[js.Any])
    
    inline def setCover(value: Boolean): Self = StObject.set(x, "cover", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Boolean): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setLogo(value: Boolean): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
  }
}
