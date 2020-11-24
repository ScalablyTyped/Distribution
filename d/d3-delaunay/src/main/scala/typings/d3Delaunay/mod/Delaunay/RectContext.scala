package typings.d3Delaunay.mod.Delaunay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interface for the rect() method of the CanvasPathMethods API.
  */
@js.native
trait RectContext extends js.Object {
  
  /**
    * rect() method of the CanvasPathMethods API.
    */
  def rect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
}
object RectContext {
  
  @scala.inline
  def apply(rect: (Double, Double, Double, Double) => Unit): RectContext = {
    val __obj = js.Dynamic.literal(rect = js.Any.fromFunction4(rect))
    __obj.asInstanceOf[RectContext]
  }
  
  @scala.inline
  implicit class RectContextOps[Self <: RectContext] (val x: Self) extends AnyVal {
    
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
    def setRect(value: (Double, Double, Double, Double) => Unit): Self = this.set("rect", js.Any.fromFunction4(value))
  }
}
