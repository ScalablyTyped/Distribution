package typings.baidumapWebSdk.anon

import typings.baidumapWebSdk.BMap.MapStyleV2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleId
  extends StObject
     with MapStyleV2 {
  
  var styleId: String
}
object StyleId {
  
  inline def apply(styleId: String): StyleId = {
    val __obj = js.Dynamic.literal(styleId = styleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StyleId] (val x: Self) extends AnyVal {
    
    inline def setStyleId(value: String): Self = StObject.set(x, "styleId", value.asInstanceOf[js.Any])
  }
}
