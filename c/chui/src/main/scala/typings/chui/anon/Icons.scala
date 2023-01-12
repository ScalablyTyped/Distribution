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
  
  inline def apply(labels: js.Array[String], tabs: Double): Icons = {
    val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icons]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Icons] (val x: Self) extends AnyVal {
    
    inline def setIcons(value: js.Array[String]): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    inline def setIconsVarargs(value: String*): Self = StObject.set(x, "icons", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setSelected(value: Double): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setTabs(value: Double): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
  }
}
