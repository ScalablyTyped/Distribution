package typings.badgin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<badgin.badgin/build/favicon.Options> */
@js.native
trait PartialOptions extends js.Object {
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var horizontalMargin: js.UndefOr[Double] = js.native
  
  var horizontalPadding: js.UndefOr[Double] = js.native
  
  var indicator: js.UndefOr[String] = js.native
  
  var radius: js.UndefOr[Double] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var verticalMargin: js.UndefOr[Double] = js.native
  
  var verticalPadding: js.UndefOr[Double] = js.native
}
object PartialOptions {
  
  @scala.inline
  def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  
  @scala.inline
  implicit class PartialOptionsOps[Self <: PartialOptions] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setHorizontalMargin(value: Double): Self = this.set("horizontalMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalMargin: Self = this.set("horizontalMargin", js.undefined)
    
    @scala.inline
    def setHorizontalPadding(value: Double): Self = this.set("horizontalPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalPadding: Self = this.set("horizontalPadding", js.undefined)
    
    @scala.inline
    def setIndicator(value: String): Self = this.set("indicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicator: Self = this.set("indicator", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setVerticalMargin(value: Double): Self = this.set("verticalMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalMargin: Self = this.set("verticalMargin", js.undefined)
    
    @scala.inline
    def setVerticalPadding(value: Double): Self = this.set("verticalPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalPadding: Self = this.set("verticalPadding", js.undefined)
  }
}
