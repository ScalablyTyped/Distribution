package typings.c3.anon

import typings.c3.mod.ChartInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Onclick extends StObject {
  
  /**
    * Set click event handler to the legend item.
    * @param id The ID of the legend item.
    */
  var onclick: js.UndefOr[js.ThisFunction1[/* this */ ChartInternal, /* id */ String, Unit]] = js.native
  
  /**
    * Set mouseout event handler to the legend item.
    * @param id The ID of the legend item.
    */
  var onmouseout: js.UndefOr[js.ThisFunction1[/* this */ ChartInternal, /* id */ String, Unit]] = js.native
  
  /**
    * Set mouseover event handler to the legend item.
    * @param id The ID of the legend item.
    */
  var onmouseover: js.UndefOr[js.ThisFunction1[/* this */ ChartInternal, /* id */ String, Unit]] = js.native
  
  /**
    * Tile settings for legend color display.
    */
  var tile: js.UndefOr[Height] = js.native
}
object Onclick {
  
  @scala.inline
  def apply(): Onclick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Onclick]
  }
  
  @scala.inline
  implicit class OnclickMutableBuilder[Self <: Onclick] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnclick(value: js.ThisFunction1[/* this */ ChartInternal, /* id */ String, Unit]): Self = StObject.set(x, "onclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
    
    @scala.inline
    def setOnmouseout(value: js.ThisFunction1[/* this */ ChartInternal, /* id */ String, Unit]): Self = StObject.set(x, "onmouseout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnmouseoutUndefined: Self = StObject.set(x, "onmouseout", js.undefined)
    
    @scala.inline
    def setOnmouseover(value: js.ThisFunction1[/* this */ ChartInternal, /* id */ String, Unit]): Self = StObject.set(x, "onmouseover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnmouseoverUndefined: Self = StObject.set(x, "onmouseover", js.undefined)
    
    @scala.inline
    def setTile(value: Height): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileUndefined: Self = StObject.set(x, "tile", js.undefined)
  }
}
