package typings.chartJs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.chartJs.adaptersMod.TimeUnit
import typings.chartJs.chartJsStrings.isoWeek
import typings.chartJs.mod.ChartType
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<chart.js.chart.js/types/adapters.DateAdapter> */
trait PartialDateAdapter extends StObject {
  
  var add: js.UndefOr[
    js.Function3[/* timestamp */ Double, /* amount */ Double, /* unit */ TimeUnit, Double]
  ] = js.undefined
  
  var diff: js.UndefOr[js.Function3[/* a */ Double, /* b */ Double, /* unit */ TimeUnit, Double]] = js.undefined
  
  var endOf: js.UndefOr[js.Function2[/* timestamp */ Double, /* unit */ TimeUnit | isoWeek, Double]] = js.undefined
  
  var format: js.UndefOr[js.Function2[/* timestamp */ Double, /* format */ TimeUnit, String]] = js.undefined
  
  var formats: js.UndefOr[js.Function0[StringDictionary[String]]] = js.undefined
  
  var init: js.UndefOr[
    js.Function1[/* chartOptions */ typings.chartJs.mod.ChartOptions[ChartType], Unit]
  ] = js.undefined
  
  var options: js.UndefOr[Any] = js.undefined
  
  var `override`: js.UndefOr[js.Function1[/* members */ Partial[this.type], Unit]] = js.undefined
  
  var parse: js.UndefOr[js.Function2[/* value */ Any, /* format */ js.UndefOr[TimeUnit], Double | Null]] = js.undefined
  
  var startOf: js.UndefOr[
    js.Function3[
      /* timestamp */ Double, 
      /* unit */ TimeUnit | isoWeek, 
      /* weekday */ js.UndefOr[Double], 
      Double
    ]
  ] = js.undefined
}
object PartialDateAdapter {
  
  inline def apply(): PartialDateAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDateAdapter]
  }
  
  extension [Self <: PartialDateAdapter](x: Self) {
    
    inline def setAdd(value: (/* timestamp */ Double, /* amount */ Double, /* unit */ TimeUnit) => Double): Self = StObject.set(x, "add", js.Any.fromFunction3(value))
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setDiff(value: (/* a */ Double, /* b */ Double, /* unit */ TimeUnit) => Double): Self = StObject.set(x, "diff", js.Any.fromFunction3(value))
    
    inline def setDiffUndefined: Self = StObject.set(x, "diff", js.undefined)
    
    inline def setEndOf(value: (/* timestamp */ Double, /* unit */ TimeUnit | isoWeek) => Double): Self = StObject.set(x, "endOf", js.Any.fromFunction2(value))
    
    inline def setEndOfUndefined: Self = StObject.set(x, "endOf", js.undefined)
    
    inline def setFormat(value: (/* timestamp */ Double, /* format */ TimeUnit) => String): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFormats(value: () => StringDictionary[String]): Self = StObject.set(x, "formats", js.Any.fromFunction0(value))
    
    inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
    
    inline def setInit(value: /* chartOptions */ typings.chartJs.mod.ChartOptions[ChartType] => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOverride(value: /* members */ Partial[PartialDateAdapter] => Unit): Self = StObject.set(x, "override", js.Any.fromFunction1(value))
    
    inline def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
    
    inline def setParse(value: (/* value */ Any, /* format */ js.UndefOr[TimeUnit]) => Double | Null): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
    
    inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
    
    inline def setStartOf(
      value: (/* timestamp */ Double, /* unit */ TimeUnit | isoWeek, /* weekday */ js.UndefOr[Double]) => Double
    ): Self = StObject.set(x, "startOf", js.Any.fromFunction3(value))
    
    inline def setStartOfUndefined: Self = StObject.set(x, "startOf", js.undefined)
  }
}
