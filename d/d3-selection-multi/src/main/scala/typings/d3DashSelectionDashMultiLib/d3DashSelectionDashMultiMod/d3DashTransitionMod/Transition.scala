package typings
package d3DashSelectionDashMultiLib.d3DashSelectionDashMultiMod.d3DashTransitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A D3 Transition.
     *
     * The first generic "GElement" refers to the type of the selected element(s) in the Transition.
     * The second generic "Datum" refers to the type of the datum of a selected element(s) in the Transition.
     * The third generic "PElement" refers to the type of the parent element(s) in the D3 selection in the Transition.
     * The fourth generic "PDatum" refers to the type of the datum of the parent element(s) in the Transition.
     */
@js.native
trait Transition[GElement /* <: d3DashSelectionLib.d3DashSelectionMod.BaseType */, Datum, PElement /* <: d3DashSelectionLib.d3DashSelectionMod.BaseType */, PDatum] extends js.Object {
  /**
           * Set multiple attribute values. The transition will animate from the present value to the new value. Attribute values may be constant or derived from each node and its bound data.
           *
           * @param attrs An object used as a map of attributes and their values.
           */
  def attrs(attrs: d3DashSelectionDashMultiLib.d3DashSelectionDashMultiMod.ValueMap[GElement, Datum]): this.type = js.native
  /**
           * Derive a map of attribute values to set.
           *
           * @param attrs A function returning a map of attributes and their values.
           */
  def attrs(
    attrs: d3DashSelectionLib.d3DashSelectionMod.ValueFn[
      GElement, 
      Datum, 
      d3DashSelectionDashMultiLib.d3DashSelectionDashMultiMod.ValueMap[GElement, Datum]
    ]
  ): this.type = js.native
  /**
           * Set multiple style properties. The transition will animate from the present value to the new value. Attribute values may be constant or derived from each node and its bound data.
           *
           * @param style A map of style properties and their values
           * @param priority The CSS priority (either "important" or undefined)
           */
  def styles(style: d3DashSelectionDashMultiLib.d3DashSelectionDashMultiMod.ValueMap[GElement, Datum]): this.type = js.native
  /**
           * Derive a map of style properties to be set.
           *
           * @param style A function returning a map of style properties and their values
           * @param priority The CSS priority (either "important" or undefined)
           */
  def styles(
    style: d3DashSelectionLib.d3DashSelectionMod.ValueFn[
      GElement, 
      Datum, 
      d3DashSelectionDashMultiLib.d3DashSelectionDashMultiMod.ValueMap[GElement, Datum]
    ]
  ): this.type = js.native
  /**
           * Set multiple style properties. The transition will animate from the present value to the new value. Attribute values may be constant or derived from each node and its bound data.
           *
           * @param style A map of style properties and their values
           * @param priority The CSS priority (either "important" or undefined)
           */
  @JSName("styles")
  def styles_important(
    style: d3DashSelectionDashMultiLib.d3DashSelectionDashMultiMod.ValueMap[GElement, Datum],
    priority: d3DashSelectionDashMultiLib.d3DashSelectionDashMultiLibStrings.important
  ): this.type = js.native
  /**
           * Derive a map of style properties to be set.
           *
           * @param style A function returning a map of style properties and their values
           * @param priority The CSS priority (either "important" or undefined)
           */
  @JSName("styles")
  def styles_important(
    style: d3DashSelectionLib.d3DashSelectionMod.ValueFn[
      GElement, 
      Datum, 
      d3DashSelectionDashMultiLib.d3DashSelectionDashMultiMod.ValueMap[GElement, Datum]
    ],
    priority: d3DashSelectionDashMultiLib.d3DashSelectionDashMultiLibStrings.important
  ): this.type = js.native
}

