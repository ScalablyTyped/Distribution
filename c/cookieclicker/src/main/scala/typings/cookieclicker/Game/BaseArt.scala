package typings.cookieclicker.Game

import typings.cookieclicker.CanvasRenderingContext2D
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
  implicit class BaseArtOps[Self <: BaseArt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBase(value: String): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgFunction2(value: (/* building */ GameObject, /* ctx */ CanvasRenderingContext2D) => Unit): Self = this.set("bg", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBg(
      value: String | (js.Function2[/* building */ GameObject, /* ctx */ CanvasRenderingContext2D, Unit])
    ): Self = this.set("bg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBg: Self = this.set("bg", js.undefined)
    
    @scala.inline
    def setFrames(value: Double): Self = this.set("frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrames: Self = this.set("frames", js.undefined)
    
    @scala.inline
    def setH(value: Double): Self = this.set("h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteH: Self = this.set("h", js.undefined)
    
    @scala.inline
    def setPicFunction2(value: (/* building */ GameObject, /* i */ Double) => String): Self = this.set("pic", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPic(value: String | (js.Function2[/* building */ GameObject, /* i */ Double, String])): Self = this.set("pic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePic: Self = this.set("pic", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setW(value: Double): Self = this.set("w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteW: Self = this.set("w", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setXV(value: Double): Self = this.set("xV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXV: Self = this.set("xV", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    
    @scala.inline
    def setYV(value: Double): Self = this.set("yV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYV: Self = this.set("yV", js.undefined)
  }
}
