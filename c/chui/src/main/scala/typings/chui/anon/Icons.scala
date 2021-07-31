package typings.chui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Icons extends StObject {
  
  var icons: js.UndefOr[js.Array[String]] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var labels: js.Array[String]
  
  var selected: js.UndefOr[Double] = js.undefined
  
  var tabs: Double
}
object Icons {
  
  @scala.inline
  def apply(labels: js.Array[String], tabs: Double): Icons = {
    val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icons]
  }
  
  @scala.inline
  implicit class IconsMutableBuilder[Self <: Icons] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIcons(value: js.Array[String]): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    @scala.inline
    def setIconsVarargs(value: String*): Self = StObject.set(x, "icons", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    @scala.inline
    def setSelected(value: Double): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setTabs(value: Double): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
  }
}
