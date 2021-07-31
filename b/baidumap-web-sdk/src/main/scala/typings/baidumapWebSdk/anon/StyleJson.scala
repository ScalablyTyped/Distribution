package typings.baidumapWebSdk.anon

import typings.baidumapWebSdk.BMap.MapStyleItem
import typings.baidumapWebSdk.BMap.MapStyleV2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleJson
  extends StObject
     with MapStyleV2 {
  
  var styleJson: js.Array[MapStyleItem]
}
object StyleJson {
  
  @scala.inline
  def apply(styleJson: js.Array[MapStyleItem]): StyleJson = {
    val __obj = js.Dynamic.literal(styleJson = styleJson.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleJson]
  }
  
  @scala.inline
  implicit class StyleJsonMutableBuilder[Self <: StyleJson] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyleJson(value: js.Array[MapStyleItem]): Self = StObject.set(x, "styleJson", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleJsonVarargs(value: MapStyleItem*): Self = StObject.set(x, "styleJson", js.Array(value :_*))
  }
}
