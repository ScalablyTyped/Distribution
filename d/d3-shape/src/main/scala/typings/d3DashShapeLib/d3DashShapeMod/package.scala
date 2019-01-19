package typings
package d3DashShapeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object d3DashShapeMod {
  type CurveFactory = /**
    * Returns a curve generator which renders to the specified context.
    *
    * @param context A rendering context.
    */
  js.Function1[
    /* context */ d3DashShapeLib.d3DashShapeMod.Global.CanvasRenderingContext2D | d3DashPathLib.d3DashPathMod.Path, 
    CurveGenerator
  ]
  type CurveFactoryLineOnly = /**
    * Returns a "lines only" curve generator which renders to the specified context.
    *
    * @param context A rendering context.
    */
  js.Function1[
    /* context */ d3DashShapeLib.d3DashShapeMod.Global.CanvasRenderingContext2D | d3DashPathLib.d3DashPathMod.Path, 
    CurveGeneratorLineOnly
  ]
  type RadialArea[Datum] = AreaRadial[Datum]
  type RadialLine[Datum] = LineRadial[Datum]
  type RadialLink[This, LinkDatum, NodeDatum] = LinkRadial[This, LinkDatum, NodeDatum]
}
