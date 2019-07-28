package typings.d3DashShape

import typings.d3DashPath.d3DashPathMod.Path
import typings.d3DashShape.d3DashShapeMod.Global.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object d3DashShapeMod {
  type CurveFactory = /**
    * Returns a curve generator which renders to the specified context.
    *
    * @param context A rendering context.
    */
  js.Function1[/* context */ CanvasRenderingContext2D | Path, CurveGenerator]
  type CurveFactoryLineOnly = /**
    * Returns a "lines only" curve generator which renders to the specified context.
    *
    * @param context A rendering context.
    */
  js.Function1[/* context */ CanvasRenderingContext2D | Path, CurveGeneratorLineOnly]
  type RadialArea[Datum] = AreaRadial[Datum]
  type RadialLine[Datum] = LineRadial[Datum]
  type RadialLink[This, LinkDatum, NodeDatum] = LinkRadial[This, LinkDatum, NodeDatum]
}
