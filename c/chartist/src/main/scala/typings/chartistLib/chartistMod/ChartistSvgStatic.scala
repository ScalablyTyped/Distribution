package typings
package chartistLib.chartistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartistSvgStatic
  extends org.scalablytyped.runtime.Instantiable1[(/* name */ stdLib.HTMLElement) | (/* name */ java.lang.String), IChartistSvg]
     with org.scalablytyped.runtime.Instantiable4[
      (/* name */ stdLib.HTMLElement) | (/* name */ java.lang.String), 
      /* attributes */ js.Object, 
      /* className */ java.lang.String, 
      /* parent */ js.Object, 
      IChartistSvg
    ]
     with org.scalablytyped.runtime.Instantiable3[
      (/* name */ stdLib.HTMLElement) | (/* name */ java.lang.String), 
      /* attributes */ js.Object, 
      /* className */ java.lang.String, 
      IChartistSvg
    ]
     with org.scalablytyped.runtime.Instantiable2[
      (/* name */ stdLib.HTMLElement) | (/* name */ java.lang.String), 
      /* attributes */ js.Object, 
      IChartistSvg
    ]
     with org.scalablytyped.runtime.Instantiable5[
      (/* name */ stdLib.HTMLElement) | (/* name */ java.lang.String), 
      /* attributes */ js.Object, 
      /* className */ java.lang.String, 
      /* parent */ js.Object, 
      /* insertFirst */ scala.Boolean, 
      IChartistSvg
    ]
     with org.scalablytyped.runtime.Instantiable0[IChartistSvg] {
  var Easing: ChartistEasingStatic = js.native
  /**
    * This method checks for support of a given SVG feature like Extensibility, SVG-animation or the like. Check http://www.w3.org/TR/SVG11/feature for a detailed list.
    */
  def isSupported(feature: java.lang.String): scala.Boolean = js.native
}

