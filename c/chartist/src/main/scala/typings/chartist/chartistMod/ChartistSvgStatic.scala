package typings.chartist.chartistMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartistSvgStatic
  extends Instantiable0[IChartistSvg]
     with Instantiable1[(/* name */ HTMLElement) | (/* name */ String), IChartistSvg]
     with Instantiable2[
      (/* name */ HTMLElement) | (/* name */ String), 
      /* attributes */ js.Object, 
      IChartistSvg
    ]
     with Instantiable3[
      (/* name */ HTMLElement) | (/* name */ String), 
      /* attributes */ js.Object, 
      /* className */ String, 
      IChartistSvg
    ]
     with Instantiable4[
      (/* name */ HTMLElement) | (/* name */ String), 
      /* attributes */ js.Object, 
      /* className */ String, 
      /* parent */ js.Object, 
      IChartistSvg
    ]
     with Instantiable5[
      (/* name */ HTMLElement) | (/* name */ String), 
      /* attributes */ js.Object, 
      /* className */ String, 
      /* parent */ js.Object, 
      /* insertFirst */ Boolean, 
      IChartistSvg
    ] {
  var Easing: ChartistEasingStatic = js.native
  /**
    * This method checks for support of a given SVG feature like Extensibility, SVG-animation or the like. Check http://www.w3.org/TR/SVG11/feature for a detailed list.
    */
  def isSupported(feature: String): Boolean = js.native
}

