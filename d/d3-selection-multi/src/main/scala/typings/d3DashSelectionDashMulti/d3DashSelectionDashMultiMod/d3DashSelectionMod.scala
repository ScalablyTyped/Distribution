package typings.d3DashSelectionDashMulti.d3DashSelectionDashMultiMod

import typings.d3DashSelection.d3DashSelectionMod.BaseType
import typings.d3DashSelection.d3DashSelectionMod.ValueFn
import typings.d3DashSelectionDashMulti.d3DashSelectionDashMultiStrings.important
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("d3-selection", JSImport.Namespace)
@js.native
object d3DashSelectionMod extends js.Object {
  /**
    * A D3 Selection of elements.
    *
    * The first generic "GElement" refers to the type of the selected element(s).
    * The second generic "Datum" refers to the type of the datum of a selected element(s).
    * The third generic "PElement" refers to the type of the parent element(s) in the D3 selection.
    * The fourth generic "PDatum" refers to the type of the datum of the parent element(s).
    */
  @js.native
  trait Selection[GElement /* <: BaseType */, Datum, PElement /* <: BaseType */, PDatum] extends js.Object {
    /**
      * Derive a map of attributes to be set on the selection.
      *
      * @param attrs A function that returns an object of attribute names and values to set.
      */
    def attrs(attrs: ValueFn[GElement, Datum, ValueMap[GElement, Datum]]): this.type = js.native
    /**
      * Set multiple attributes on the given selection. Attribute values may be constant or derived from each node and its bound data.
      *
      * @param attrs An object used as a map of attribute names to set
      */
    def attrs(attrs: ValueMap[GElement, Datum]): this.type = js.native
    /**
      * Derive a map of object properties to be set on the selection's node(s).
      *
      * @param props A function that returns an object of properties and their values.
      */
    def properties(props: ValueFn[GElement, Datum, ValueMap[GElement, Datum]]): this.type = js.native
    /**
      * Set multiple object properties directly on the selection's node(s). Property values may be constants or derived from each node and its bound data.
      *
      * @param props An object used as a map of object properties to be set.
      */
    def properties(props: ValueMap[GElement, Datum]): this.type = js.native
    /**
      * Derive a map of style properties to be set on the selection.
      *
      * @param style A function that returns an object of style properties and the values to be set.
      * @param priority The CSS priority (either "important" or undefined)
      */
    def styles(style: ValueFn[GElement, Datum, ValueMap[GElement, Datum]]): this.type = js.native
    /**
      * Set multiple CSS style properties on the given selection. Style properties may be constant or derived from each node and its bound data.
      *
      * @param style An object used as a map of style properties to set.
      * @param priority The CSS priority (either "important" or undefined).
      */
    def styles(style: ValueMap[GElement, Datum]): this.type = js.native
    @JSName("styles")
    def styles_important(style: ValueFn[GElement, Datum, ValueMap[GElement, Datum]], priority: important): this.type = js.native
    @JSName("styles")
    def styles_important(style: ValueMap[GElement, Datum], priority: important): this.type = js.native
  }
  
}

