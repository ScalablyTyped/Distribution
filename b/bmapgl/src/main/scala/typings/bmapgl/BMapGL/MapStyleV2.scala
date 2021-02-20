package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.bmapgl.anon.StyleJson
  - typings.bmapgl.anon.StyleId
*/
trait MapStyleV2 extends StObject
object MapStyleV2 {
  
  @scala.inline
  def StyleId(styleId: String): typings.bmapgl.anon.StyleId = {
    val __obj = js.Dynamic.literal(styleId = styleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.bmapgl.anon.StyleId]
  }
  
  @scala.inline
  def StyleJson(styleJson: js.Array[MapStyleItem]): typings.bmapgl.anon.StyleJson = {
    val __obj = js.Dynamic.literal(styleJson = styleJson.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.bmapgl.anon.StyleJson]
  }
}
