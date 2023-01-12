package typings.baseui

import typings.baseui.dataTableFilterShellMod.ExcludeKind
import typings.baseui.dataTableTypesMod.ColumnOptions
import typings.baseui.dataTableTypesMod.SharedColumnOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataTableColumnNumericalMod {
  
  @JSImport("baseui/data-table/column-numerical", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: Options): NumericalColumn = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[NumericalColumn]
  
  trait FilterParameters extends StObject {
    
    var description: String
    
    var exclude: Boolean
    
    var excludeKind: ExcludeKind
    
    var lowerValue: Double
    
    var upperValue: Double
  }
  object FilterParameters {
    
    inline def apply(
      description: String,
      exclude: Boolean,
      excludeKind: ExcludeKind,
      lowerValue: Double,
      upperValue: Double
    ): FilterParameters = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], exclude = exclude.asInstanceOf[js.Any], excludeKind = excludeKind.asInstanceOf[js.Any], lowerValue = lowerValue.asInstanceOf[js.Any], upperValue = upperValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FilterParameters] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setExclude(value: Boolean): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeKind(value: ExcludeKind): Self = StObject.set(x, "excludeKind", value.asInstanceOf[js.Any])
      
      inline def setLowerValue(value: Double): Self = StObject.set(x, "lowerValue", value.asInstanceOf[js.Any])
      
      inline def setUpperValue(value: Double): Self = StObject.set(x, "upperValue", value.asInstanceOf[js.Any])
    }
  }
  
  type NumericalColumn = ColumnOptions[Double, FilterParameters]
  
  type NumericalFormats = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof NUMERICAL_FORMATS.DEFAULT */ Any
  
  trait Options
    extends StObject
       with SharedColumnOptions[Double] {
    
    var format: js.UndefOr[NumericalFormats | (js.Function1[/* value */ Double, String])] = js.undefined
    
    var highlight: js.UndefOr[js.Function1[/* a */ Double, Boolean]] = js.undefined
    
    var precision: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(mapDataToValue: Any => Double, title: String): Options = {
      val __obj = js.Dynamic.literal(mapDataToValue = js.Any.fromFunction1(mapDataToValue), title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setFormat(value: NumericalFormats | (js.Function1[/* value */ Double, String])): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatFunction1(value: /* value */ Double => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHighlight(value: /* a */ Double => Boolean): Self = StObject.set(x, "highlight", js.Any.fromFunction1(value))
      
      inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    }
  }
}
