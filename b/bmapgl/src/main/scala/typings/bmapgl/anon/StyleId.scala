package typings.bmapgl.anon

import typings.bmapgl.BMapGL.MapStyleV2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleId extends MapStyleV2 {
  
  var styleId: String = js.native
}
object StyleId {
  
  @scala.inline
  def apply(styleId: String): StyleId = {
    val __obj = js.Dynamic.literal(styleId = styleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleId]
  }
  
  @scala.inline
  implicit class StyleIdMutableBuilder[Self <: StyleId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyleId(value: String): Self = StObject.set(x, "styleId", value.asInstanceOf[js.Any])
  }
}
