package typings.d3Shape

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  type CurveFactory = /**
    * Returns a curve generator which renders to the specified context.
    *
    * @param context A rendering context.
    */
  js.Function1[
    /* context */ typings.std.CanvasRenderingContext2D | typings.d3Path.mod.Path_, 
    typings.d3Shape.mod.CurveGenerator
  ]
  type CurveFactoryLineOnly = /**
    * Returns a "lines only" curve generator which renders to the specified context.
    *
    * @param context A rendering context.
    */
  js.Function1[
    /* context */ typings.std.CanvasRenderingContext2D | typings.d3Path.mod.Path_, 
    typings.d3Shape.mod.CurveGeneratorLineOnly
  ]
  type RadialArea_[Datum] = typings.d3Shape.mod.AreaRadial_[Datum]
  type RadialLine_[Datum] = typings.d3Shape.mod.LineRadial_[Datum]
  type RadialLink[This, LinkDatum, NodeDatum] = typings.d3Shape.mod.LinkRadial_[This, LinkDatum, NodeDatum]
}
