package typings.bmapgl.anon

import typings.bmapgl.BMapGL.MapStyleV2
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
  
  extension [Self <: StyleId](x: Self) {
    
    inline def setStyleId(value: String): Self = StObject.set(x, "styleId", value.asInstanceOf[js.Any])
  }
}
