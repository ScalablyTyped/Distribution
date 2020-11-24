package typings.bootstrapMaxlength.BootstrapMaxlength

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Possible options for the position of the counter. (passed to $.fn.css)
  */
@js.native
trait PlacementOptions extends js.Object {
  
  /**
    * The bottom position of the counter (Number of pixels, or a px or percent string)
    */
  var bottom: js.UndefOr[Number | String] = js.native
  
  /**
    * The left position of the counter (Number of pixels, or a px or percent string)
    */
  var left: js.UndefOr[Number | String] = js.native
  
  /**
    * The positioning to use. For example 'relative', 'absolute'
    */
  var position: js.UndefOr[String] = js.native
  
  /**
    * The right position of the counter (Number of pixels, or a px or percent string)
    */
  var right: js.UndefOr[Number | String] = js.native
  
  /**
    * The top position of the counter (Number of pixels, or a px or percent string)
    */
  var top: js.UndefOr[Number | String] = js.native
}
object PlacementOptions {
  
  @scala.inline
  def apply(): PlacementOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementOptions]
  }
  
  @scala.inline
  implicit class PlacementOptionsOps[Self <: PlacementOptions] (val x: Self) extends AnyVal {
    
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
    def setBottom(value: Number | String): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    
    @scala.inline
    def setLeft(value: Number | String): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setRight(value: Number | String): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    
    @scala.inline
    def setTop(value: Number | String): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
  }
}
