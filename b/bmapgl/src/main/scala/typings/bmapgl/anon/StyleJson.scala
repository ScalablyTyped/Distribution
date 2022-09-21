package typings.bmapgl.anon

import typings.bmapgl.BMapGL.MapStyleItem
import typings.bmapgl.BMapGL.MapStyleV2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleJson
  extends StObject
     with MapStyleV2 {
  
  var styleJson: js.Array[MapStyleItem]
}
object StyleJson {
  
  inline def apply(styleJson: js.Array[MapStyleItem]): StyleJson = {
    val __obj = js.Dynamic.literal(styleJson = styleJson.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleJson]
  }
  
  extension [Self <: StyleJson](x: Self) {
    
    inline def setStyleJson(value: js.Array[MapStyleItem]): Self = StObject.set(x, "styleJson", value.asInstanceOf[js.Any])
    
    inline def setStyleJsonVarargs(value: MapStyleItem*): Self = StObject.set(x, "styleJson", js.Array(value*))
  }
}
