package typings.c3.mod

import typings.c3.anon.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XAxisConfiguration
  extends StObject
     with AxisConfiguration {
  
  /**
    * Set category names on category axis.
    * This must be an array that includes category names in string. If category names are included in the date by `data.x` option, this is not required.
    */
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Set default extent for subchart and zoom. This can be an array or function that returns an array.
    */
  var extent: js.UndefOr[js.Array[Double] | js.Function0[js.Array[Double]]] = js.undefined
  
  /**
    * Set height of x axis.
    * The height of x axis can be set manually by this option. If you need more space for x axis, please use this option for that. The unit is pixel.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Set label on X axis.
    */
  var label: js.UndefOr[String | Position] = js.undefined
  
  /**
    * Set how to treat the timezone of x values.
    * If `true` (default), treat x value as localtime. If `false`, convert to UTC internally.
    */
  var localtime: js.UndefOr[Boolean] = js.undefined
  
  var selection: js.UndefOr[Any] = js.undefined
  
  var tick: js.UndefOr[XTickConfiguration] = js.undefined
  
  /**
    * Set type of x axis.
    * Defaults to `"indexed"`.
    */
  var `type`: js.UndefOr[XAxisType] = js.undefined
}
object XAxisConfiguration {
  
  inline def apply(): XAxisConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XAxisConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XAxisConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setExtent(value: js.Array[Double] | js.Function0[js.Array[Double]]): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setExtentFunction0(value: () => js.Array[Double]): Self = StObject.set(x, "extent", js.Any.fromFunction0(value))
    
    inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    inline def setExtentVarargs(value: Double*): Self = StObject.set(x, "extent", js.Array(value*))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLabel(value: String | Position): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLocaltime(value: Boolean): Self = StObject.set(x, "localtime", value.asInstanceOf[js.Any])
    
    inline def setLocaltimeUndefined: Self = StObject.set(x, "localtime", js.undefined)
    
    inline def setSelection(value: Any): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
    
    inline def setTick(value: XTickConfiguration): Self = StObject.set(x, "tick", value.asInstanceOf[js.Any])
    
    inline def setTickUndefined: Self = StObject.set(x, "tick", js.undefined)
    
    inline def setType(value: XAxisType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
