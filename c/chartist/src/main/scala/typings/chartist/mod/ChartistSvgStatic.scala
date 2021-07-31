package typings.chartist.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartistSvgStatic
  extends StObject
     with Instantiable0[IChartistSvg]
     with Instantiable1[(/* name */ HTMLElement) | (/* name */ String), IChartistSvg]
     with Instantiable2[
      (/* name */ HTMLElement) | (/* name */ String) | (/* name */ Unit), 
      /* attributes */ js.Object, 
      IChartistSvg
    ]
     with Instantiable3[
      (/* name */ HTMLElement) | (/* name */ String) | (/* name */ Unit), 
      (/* attributes */ js.Object) | (/* attributes */ Unit), 
      /* className */ String, 
      IChartistSvg
    ]
     with Instantiable4[
      (/* name */ HTMLElement) | (/* name */ String) | (/* name */ Unit), 
      (/* attributes */ js.Object) | (/* attributes */ Unit), 
      (/* className */ String) | (/* className */ Unit), 
      /* parent */ js.Object, 
      IChartistSvg
    ]
     with Instantiable5[
      (/* name */ HTMLElement) | (/* name */ String) | (/* name */ Unit), 
      (/* attributes */ js.Object) | (/* attributes */ Unit), 
      (/* className */ String) | (/* className */ Unit), 
      (/* parent */ js.Object) | (/* parent */ Unit), 
      /* insertFirst */ Boolean, 
      IChartistSvg
    ] {
  
  var Easing: ChartistEasingStatic = js.native
  
  /**
    * This method checks for support of a given SVG feature like Extensibility, SVG-animation or the like. Check http://www.w3.org/TR/SVG11/feature for a detailed list.
    */
  def isSupported(feature: String): Boolean = js.native
}
