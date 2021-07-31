package typings.cookieclicker.Game

import typings.cookieclicker.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaselessArt
  extends StObject
     with Art {
  
  var bg: String | (js.Function2[/* building */ GameObject, /* ctx */ CanvasRenderingContext2D, Unit])
  
  var frames: js.UndefOr[Double] = js.undefined
  
  var h: js.UndefOr[Double] = js.undefined
  
  var pic: String | (js.Function2[/* building */ GameObject, /* i */ Double, String])
  
  var rows: js.UndefOr[Double] = js.undefined
  
  var w: js.UndefOr[Double] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var xV: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
  
  var yV: js.UndefOr[Double] = js.undefined
}
object BaselessArt {
  
  @scala.inline
  def apply(
    bg: String | (js.Function2[/* building */ GameObject, /* ctx */ CanvasRenderingContext2D, Unit]),
    pic: String | (js.Function2[/* building */ GameObject, /* i */ Double, String])
  ): BaselessArt = {
    val __obj = js.Dynamic.literal(bg = bg.asInstanceOf[js.Any], pic = pic.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaselessArt]
  }
  
  @scala.inline
  implicit class BaselessArtMutableBuilder[Self <: BaselessArt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBg(
      value: String | (js.Function2[/* building */ GameObject, /* ctx */ CanvasRenderingContext2D, Unit])
    ): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgFunction2(value: (/* building */ GameObject, /* ctx */ CanvasRenderingContext2D) => Unit): Self = StObject.set(x, "bg", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFrames(value: Double): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramesUndefined: Self = StObject.set(x, "frames", js.undefined)
    
    @scala.inline
    def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHUndefined: Self = StObject.set(x, "h", js.undefined)
    
    @scala.inline
    def setPic(value: String | (js.Function2[/* building */ GameObject, /* i */ Double, String])): Self = StObject.set(x, "pic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicFunction2(value: (/* building */ GameObject, /* i */ Double) => String): Self = StObject.set(x, "pic", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWUndefined: Self = StObject.set(x, "w", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setXV(value: Double): Self = StObject.set(x, "xV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXVUndefined: Self = StObject.set(x, "xV", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    @scala.inline
    def setYV(value: Double): Self = StObject.set(x, "yV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYVUndefined: Self = StObject.set(x, "yV", js.undefined)
  }
}
