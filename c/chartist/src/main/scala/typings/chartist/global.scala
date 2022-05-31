package typings.chartist

import org.scalablytyped.runtime.Shortcut
import typings.chartist.mod.ChartistStatic
import typings.chartist.mod.IBarChartOptions
import typings.chartist.mod.ICandleChartOptions
import typings.chartist.mod.IChartistBarChart
import typings.chartist.mod.IChartistCandleChart
import typings.chartist.mod.IChartistData
import typings.chartist.mod.IChartistLineChart
import typings.chartist.mod.IChartistPieChart
import typings.chartist.mod.IChartistSvg
import typings.chartist.mod.ILineChartOptions
import typings.chartist.mod.IPieChartOptions
import typings.chartist.mod.IResponsiveOptionTuple
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Chartist extends Shortcut {
    
    @JSGlobal("Chartist")
    @js.native
    val ^ : ChartistStatic = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Chartist.Bar")
    @js.native
    class Bar protected ()
      extends StObject
         with IChartistBarChart {
      def this(target: js.Any, data: IChartistData) = this()
      def this(target: js.Any, data: IChartistData, options: IBarChartOptions) = this()
      def this(
        target: js.Any,
        data: IChartistData,
        options: Unit,
        responsiveOptions: js.Array[IResponsiveOptionTuple[IBarChartOptions]]
      ) = this()
      def this(
        target: js.Any,
        data: IChartistData,
        options: IBarChartOptions,
        responsiveOptions: js.Array[IResponsiveOptionTuple[IBarChartOptions]]
      ) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Chartist.Candle")
    @js.native
    class Candle protected ()
      extends StObject
         with IChartistCandleChart {
      def this(target: js.Any, data: IChartistData) = this()
      def this(target: js.Any, data: IChartistData, options: ICandleChartOptions) = this()
      def this(
        target: js.Any,
        data: IChartistData,
        options: Unit,
        responsiveOptions: js.Array[IResponsiveOptionTuple[ICandleChartOptions]]
      ) = this()
      def this(
        target: js.Any,
        data: IChartistData,
        options: ICandleChartOptions,
        responsiveOptions: js.Array[IResponsiveOptionTuple[ICandleChartOptions]]
      ) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Chartist.Line")
    @js.native
    class Line protected ()
      extends StObject
         with IChartistLineChart {
      def this(target: js.Any, data: IChartistData) = this()
      def this(target: js.Any, data: IChartistData, options: ILineChartOptions) = this()
      def this(
        target: js.Any,
        data: IChartistData,
        options: Unit,
        responsiveOptions: js.Array[IResponsiveOptionTuple[ILineChartOptions]]
      ) = this()
      def this(
        target: js.Any,
        data: IChartistData,
        options: ILineChartOptions,
        responsiveOptions: js.Array[IResponsiveOptionTuple[ILineChartOptions]]
      ) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Chartist.Pie")
    @js.native
    class Pie protected ()
      extends StObject
         with IChartistPieChart {
      def this(target: js.Any, data: IChartistData) = this()
      def this(target: js.Any, data: IChartistData, options: IPieChartOptions) = this()
      def this(
        target: js.Any,
        data: IChartistData,
        options: Unit,
        responsiveOptions: js.Array[IResponsiveOptionTuple[IPieChartOptions]]
      ) = this()
      def this(
        target: js.Any,
        data: IChartistData,
        options: IPieChartOptions,
        responsiveOptions: js.Array[IResponsiveOptionTuple[IPieChartOptions]]
      ) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Chartist.Svg")
    @js.native
    class Svg ()
      extends StObject
         with IChartistSvg {
      def this(name: String) = this()
      def this(name: HTMLElement) = this()
      def this(name: String, attributes: js.Object) = this()
      def this(name: Unit, attributes: js.Object) = this()
      def this(name: HTMLElement, attributes: js.Object) = this()
      def this(name: String, attributes: js.Object, className: String) = this()
      def this(name: String, attributes: Unit, className: String) = this()
      def this(name: Unit, attributes: js.Object, className: String) = this()
      def this(name: Unit, attributes: Unit, className: String) = this()
      def this(name: HTMLElement, attributes: js.Object, className: String) = this()
      def this(name: HTMLElement, attributes: Unit, className: String) = this()
      def this(name: String, attributes: js.Object, className: String, parent: js.Object) = this()
      def this(name: String, attributes: js.Object, className: Unit, parent: js.Object) = this()
      def this(name: String, attributes: Unit, className: String, parent: js.Object) = this()
      def this(name: String, attributes: Unit, className: Unit, parent: js.Object) = this()
      def this(name: Unit, attributes: js.Object, className: String, parent: js.Object) = this()
      def this(name: Unit, attributes: js.Object, className: Unit, parent: js.Object) = this()
      def this(name: Unit, attributes: Unit, className: String, parent: js.Object) = this()
      def this(name: Unit, attributes: Unit, className: Unit, parent: js.Object) = this()
      def this(name: HTMLElement, attributes: js.Object, className: String, parent: js.Object) = this()
      def this(name: HTMLElement, attributes: js.Object, className: Unit, parent: js.Object) = this()
      def this(name: HTMLElement, attributes: Unit, className: String, parent: js.Object) = this()
      def this(name: HTMLElement, attributes: Unit, className: Unit, parent: js.Object) = this()
      def this(name: String, attributes: js.Object, className: String, parent: js.Object, insertFirst: Boolean) = this()
      def this(name: String, attributes: js.Object, className: String, parent: Unit, insertFirst: Boolean) = this()
      def this(name: String, attributes: js.Object, className: Unit, parent: js.Object, insertFirst: Boolean) = this()
      def this(name: String, attributes: js.Object, className: Unit, parent: Unit, insertFirst: Boolean) = this()
      def this(name: String, attributes: Unit, className: String, parent: js.Object, insertFirst: Boolean) = this()
      def this(name: String, attributes: Unit, className: String, parent: Unit, insertFirst: Boolean) = this()
      def this(name: String, attributes: Unit, className: Unit, parent: js.Object, insertFirst: Boolean) = this()
      def this(name: String, attributes: Unit, className: Unit, parent: Unit, insertFirst: Boolean) = this()
      def this(name: Unit, attributes: js.Object, className: String, parent: js.Object, insertFirst: Boolean) = this()
      def this(name: Unit, attributes: js.Object, className: String, parent: Unit, insertFirst: Boolean) = this()
      def this(name: Unit, attributes: js.Object, className: Unit, parent: js.Object, insertFirst: Boolean) = this()
      def this(name: Unit, attributes: js.Object, className: Unit, parent: Unit, insertFirst: Boolean) = this()
      def this(name: Unit, attributes: Unit, className: String, parent: js.Object, insertFirst: Boolean) = this()
      def this(name: Unit, attributes: Unit, className: String, parent: Unit, insertFirst: Boolean) = this()
      def this(name: Unit, attributes: Unit, className: Unit, parent: js.Object, insertFirst: Boolean) = this()
      def this(name: Unit, attributes: Unit, className: Unit, parent: Unit, insertFirst: Boolean) = this()
      def this(
        name: HTMLElement,
        attributes: js.Object,
        className: String,
        parent: js.Object,
        insertFirst: Boolean
      ) = this()
      def this(name: HTMLElement, attributes: js.Object, className: String, parent: Unit, insertFirst: Boolean) = this()
      def this(name: HTMLElement, attributes: js.Object, className: Unit, parent: js.Object, insertFirst: Boolean) = this()
      def this(name: HTMLElement, attributes: js.Object, className: Unit, parent: Unit, insertFirst: Boolean) = this()
      def this(name: HTMLElement, attributes: Unit, className: String, parent: js.Object, insertFirst: Boolean) = this()
      def this(name: HTMLElement, attributes: Unit, className: String, parent: Unit, insertFirst: Boolean) = this()
      def this(name: HTMLElement, attributes: Unit, className: Unit, parent: js.Object, insertFirst: Boolean) = this()
      def this(name: HTMLElement, attributes: Unit, className: Unit, parent: Unit, insertFirst: Boolean) = this()
    }
    
    type _To = ChartistStatic
    
    /* This means you don't have to write `^`, but can instead just say `Chartist.foo` */
    override def _to: ChartistStatic = ^
  }
}
