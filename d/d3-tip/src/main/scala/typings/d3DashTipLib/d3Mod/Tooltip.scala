package typings
package d3DashTipLib.d3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tooltip extends js.Object {
  def attr(name: java.lang.String): java.lang.String = js.native
  def attr(name: java.lang.String, value: d3DashArrayLib.d3DashArrayMod.Primitive): Tooltip = js.native
  def attr[Datum](
    name: java.lang.String,
    value: js.Function3[
      /* datum */ Datum, 
      /* index */ scala.Double, 
      /* outerIndex */ scala.Double, 
      d3DashArrayLib.d3DashArrayMod.Primitive
    ]
  ): Tooltip = js.native
  def attr[Datum](
    obj: ScalablyTyped.runtime.StringDictionary[
      d3DashArrayLib.d3DashArrayMod.Primitive | (js.Function3[
        /* datum */ Datum, 
        /* index */ scala.Double, 
        /* outerIndex */ scala.Double, 
        d3DashArrayLib.d3DashArrayMod.Primitive
      ])
    ]
  ): Tooltip = js.native
  def destroy(): Tooltip = js.native
  def direction(): TooltipDirection = js.native
  def direction(direction: TooltipDirection): Tooltip = js.native
  def direction[Datum](
    func: js.Function3[
      /* datum */ Datum, 
      /* index */ scala.Double, 
      /* outerIndex */ scala.Double, 
      TooltipDirection
    ]
  ): Tooltip = js.native
  def hide(): Tooltip = js.native
  def html(): java.lang.String = js.native
  def html(content: java.lang.String): Tooltip = js.native
  def html[Datum](
    func: js.Function3[
      /* datum */ Datum, 
      /* index */ scala.Double, 
      /* outerIndex */ scala.Double, 
      java.lang.String
    ]
  ): Tooltip = js.native
  def offset(): js.Tuple2[scala.Double, scala.Double] = js.native
  def offset(tuple: js.Tuple2[scala.Double, scala.Double]): Tooltip = js.native
  def offset[Datum](
    func: js.Function3[
      /* datum */ Datum, 
      /* index */ scala.Double, 
      /* outerIndex */ scala.Double, 
      js.Tuple2[scala.Double, scala.Double]
    ]
  ): Tooltip = js.native
  def rootElement(): stdLib.HTMLElement = js.native
  def rootElement(element: stdLib.HTMLElement): Tooltip = js.native
  def rootElement[Datum](
    func: js.Function3[
      /* datum */ Datum, 
      /* index */ scala.Double, 
      /* outerIndex */ scala.Double, 
      stdLib.HTMLElement
    ]
  ): Tooltip = js.native
  def show(): Tooltip = js.native
  def show(target: stdLib.SVGElement): Tooltip = js.native
  def show[Datum](data: js.Array[Datum]): Tooltip = js.native
  def show[Datum](data: js.Array[Datum], target: stdLib.SVGElement): Tooltip = js.native
  def style(name: java.lang.String): java.lang.String = js.native
  def style(name: java.lang.String, value: d3DashArrayLib.d3DashArrayMod.Primitive): Tooltip = js.native
  def style(name: java.lang.String, value: d3DashArrayLib.d3DashArrayMod.Primitive, priority: java.lang.String): Tooltip = js.native
  def style[Datum](
    name: java.lang.String,
    value: js.Function3[
      /* datum */ Datum, 
      /* index */ scala.Double, 
      /* outerIndex */ scala.Double, 
      d3DashArrayLib.d3DashArrayMod.Primitive
    ]
  ): Tooltip = js.native
  def style[Datum](
    name: java.lang.String,
    value: js.Function3[
      /* datum */ Datum, 
      /* index */ scala.Double, 
      /* outerIndex */ scala.Double, 
      d3DashArrayLib.d3DashArrayMod.Primitive
    ],
    priority: java.lang.String
  ): Tooltip = js.native
  def style[Datum](
    obj: ScalablyTyped.runtime.StringDictionary[
      d3DashArrayLib.d3DashArrayMod.Primitive | (js.Function3[
        /* datum */ Datum, 
        /* index */ scala.Double, 
        /* outerIndex */ scala.Double, 
        d3DashArrayLib.d3DashArrayMod.Primitive
      ])
    ]
  ): Tooltip = js.native
  def style[Datum](
    obj: ScalablyTyped.runtime.StringDictionary[
      d3DashArrayLib.d3DashArrayMod.Primitive | (js.Function3[
        /* datum */ Datum, 
        /* index */ scala.Double, 
        /* outerIndex */ scala.Double, 
        d3DashArrayLib.d3DashArrayMod.Primitive
      ])
    ],
    priority: java.lang.String
  ): Tooltip = js.native
}

