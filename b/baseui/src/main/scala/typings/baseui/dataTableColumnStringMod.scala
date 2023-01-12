package typings.baseui

import typings.baseui.dataTableTypesMod.ColumnOptions
import typings.baseui.dataTableTypesMod.SharedColumnOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataTableColumnStringMod {
  
  @JSImport("baseui/data-table/column-string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: Options): StringColumn = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[StringColumn]
  
  trait FilterParameters extends StObject {
    
    var description: String
    
    var exclude: Boolean
  }
  object FilterParameters {
    
    inline def apply(description: String, exclude: Boolean): FilterParameters = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], exclude = exclude.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FilterParameters] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setExclude(value: Boolean): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options
    extends StObject
       with SharedColumnOptions[String] {
    
    var lineClamp: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(mapDataToValue: Any => String, title: String): Options = {
      val __obj = js.Dynamic.literal(mapDataToValue = js.Any.fromFunction1(mapDataToValue), title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setLineClamp(value: Double): Self = StObject.set(x, "lineClamp", value.asInstanceOf[js.Any])
      
      inline def setLineClampUndefined: Self = StObject.set(x, "lineClamp", js.undefined)
    }
  }
  
  type StringColumn = ColumnOptions[String, FilterParameters]
}
