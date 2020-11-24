package typings.ckeditor.CKEDITOR.plugins.imagebase

import typings.ckeditor.CKEDITOR.plugins.widget.definition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait imageWidgetDefinition extends definition {
  
  var features: js.Array[String] = js.native
  
  @JSName("upcast")
  var upcast_imageWidgetDefinition: String = js.native
}
object imageWidgetDefinition {
  
  @scala.inline
  def apply(features: js.Array[String], upcast: String): imageWidgetDefinition = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any], upcast = upcast.asInstanceOf[js.Any])
    __obj.asInstanceOf[imageWidgetDefinition]
  }
  
  @scala.inline
  implicit class imageWidgetDefinitionOps[Self <: imageWidgetDefinition] (val x: Self) extends AnyVal {
    
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
    def setFeaturesVarargs(value: String*): Self = this.set("features", js.Array(value :_*))
    
    @scala.inline
    def setFeatures(value: js.Array[String]): Self = this.set("features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpcast(value: String): Self = this.set("upcast", value.asInstanceOf[js.Any])
  }
}
