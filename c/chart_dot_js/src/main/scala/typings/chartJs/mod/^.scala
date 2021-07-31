package typings.chartJs.mod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.std.ArrayLike
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("chart.js", JSImport.Namespace)
@js.native
class ^ protected ()
  extends StObject
     with Chart {
  def this(context: String, options: ChartConfiguration) = this()
  def this(context: ArrayLike[CanvasRenderingContext2D | HTMLCanvasElement], options: ChartConfiguration) = this()
  def this(context: CanvasRenderingContext2D, options: ChartConfiguration) = this()
  def this(context: HTMLCanvasElement, options: ChartConfiguration) = this()
}
@JSImport("chart.js", JSImport.Namespace)
@js.native
object ^
  extends StObject
     with TopLevel[
      js.Object & (Instantiable2[
        /* context */ String | CanvasRenderingContext2D | HTMLCanvasElement | (ArrayLike[CanvasRenderingContext2D | HTMLCanvasElement]), 
        /* options */ ChartConfiguration, 
        Chart
      ])
    ]
