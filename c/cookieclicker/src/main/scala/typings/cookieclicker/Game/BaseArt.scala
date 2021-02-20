package typings.cookieclicker.Game

import typings.cookieclicker.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseArt extends Art {
  
  var base: String = js.native
  
  var bg: js.UndefOr[
    String | (js.Function2[/* building */ GameObject, /* ctx */ CanvasRenderingContext2D, Unit])
  ] = js.native
  
  var frames: js.UndefOr[Double] = js.native
  
  var h: js.UndefOr[Double] = js.native
  
  var pic: js.UndefOr[String | (js.Function2[/* building */ GameObject, /* i */ Double, String])] = js.native
  
  var rows: js.UndefOr[Double] = js.native
  
  var w: js.UndefOr[Double] = js.native
  
  var x: js.UndefOr[Double] = js.native
  
  var xV: js.UndefOr[Double] = js.native
  
  var y: js.UndefOr[Double] = js.native
  
  var yV: js.UndefOr[Double] = js.native
}
object BaseArt {
  
  @scala.inline
  def apply(base: String): BaseArt = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseArt]
  }
  
  @scala.inline
  implicit class BaseArtMutableBuilder[Self <: BaseArt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBg(
      value: String | (js.Function2[/* building */ GameObject, /* ctx */ CanvasRenderingContext2D, Unit])
    ): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgFunction2(value: (/* building */ GameObject, /* ctx */ CanvasRenderingContext2D) => Unit): Self = StObject.set(x, "bg", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
    
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
    def setPicUndefined: Self = StObject.set(x, "pic", js.undefined)
    
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
