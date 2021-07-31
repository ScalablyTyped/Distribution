package typings.cookieclicker.Game

import typings.cookieclicker.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.cookieclicker.Game.BaselessArt
  - typings.cookieclicker.Game.BaseArt
*/
trait Art extends StObject
object Art {
  
  @scala.inline
  def BaseArt(base: String): typings.cookieclicker.Game.BaseArt = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cookieclicker.Game.BaseArt]
  }
  
  @scala.inline
  def BaselessArt(
    bg: String | (js.Function2[/* building */ GameObject, /* ctx */ CanvasRenderingContext2D, Unit]),
    pic: String | (js.Function2[/* building */ GameObject, /* i */ Double, String])
  ): typings.cookieclicker.Game.BaselessArt = {
    val __obj = js.Dynamic.literal(bg = bg.asInstanceOf[js.Any], pic = pic.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cookieclicker.Game.BaselessArt]
  }
}
