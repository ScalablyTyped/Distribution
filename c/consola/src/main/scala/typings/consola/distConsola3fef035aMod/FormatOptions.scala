package typings.consola.distConsola3fef035aMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see https://nodejs.org/api/util.html#util_util_inspect_object_showhidden_depth_colors
  */
trait FormatOptions
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var colors: js.UndefOr[Boolean] = js.undefined
  
  var columns: js.UndefOr[Double] = js.undefined
  
  var compact: js.UndefOr[Boolean | Double] = js.undefined
  
  var date: js.UndefOr[Boolean] = js.undefined
}
object FormatOptions {
  
  inline def apply(): FormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormatOptions] (val x: Self) extends AnyVal {
    
    inline def setColors(value: Boolean): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setCompact(value: Boolean | Double): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
    
    inline def setDate(value: Boolean): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
  }
}
