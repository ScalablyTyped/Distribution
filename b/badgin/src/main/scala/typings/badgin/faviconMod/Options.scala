package typings.badgin.faviconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var backgroundColor: String = js.native
  
  var color: String = js.native
  
  var horizontalMargin: Double = js.native
  
  var horizontalPadding: Double = js.native
  
  var indicator: String = js.native
  
  var radius: Double = js.native
  
  var size: Double = js.native
  
  var verticalMargin: Double = js.native
  
  var verticalPadding: Double = js.native
}
object Options {
  
  @scala.inline
  def apply(
    backgroundColor: String,
    color: String,
    horizontalMargin: Double,
    horizontalPadding: Double,
    indicator: String,
    radius: Double,
    size: Double,
    verticalMargin: Double,
    verticalPadding: Double
  ): Options = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], horizontalMargin = horizontalMargin.asInstanceOf[js.Any], horizontalPadding = horizontalPadding.asInstanceOf[js.Any], indicator = indicator.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], verticalMargin = verticalMargin.asInstanceOf[js.Any], verticalPadding = verticalPadding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalMargin(value: Double): Self = this.set("horizontalMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalPadding(value: Double): Self = this.set("horizontalPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicator(value: String): Self = this.set("indicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalMargin(value: Double): Self = this.set("verticalMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalPadding(value: Double): Self = this.set("verticalPadding", value.asInstanceOf[js.Any])
  }
}
