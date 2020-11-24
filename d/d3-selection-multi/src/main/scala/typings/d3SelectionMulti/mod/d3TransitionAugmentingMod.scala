package typings.d3SelectionMulti.mod

import typings.d3Selection.mod.BaseType
import typings.d3Selection.mod.ValueFn
import typings.d3SelectionMulti.d3SelectionMultiStrings.important
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("d3-transition", JSImport.Namespace)
@js.native
object d3TransitionAugmentingMod extends js.Object {
  
  /**
    * A D3 Transition.
    *
    * The first generic "GElement" refers to the type of the selected element(s) in the Transition.
    * The second generic "Datum" refers to the type of the datum of a selected element(s) in the Transition.
    * The third generic "PElement" refers to the type of the parent element(s) in the D3 selection in the Transition.
    * The fourth generic "PDatum" refers to the type of the datum of the parent element(s) in the Transition.
    */
  @js.native
  trait Transition[GElement /* <: BaseType */, Datum, PElement /* <: BaseType */, PDatum] extends js.Object {
    
    /**
      * Derive a map of attribute values to set.
      *
      * @param attrs A function returning a map of attributes and their values.
      */
    def attrs(attrs: ValueFn[GElement, Datum, ValueMap[GElement, Datum]]): this.type = js.native
    /**
      * Set multiple attribute values. The transition will animate from the present value to the new value. Attribute values may be constant or derived from each node and its bound data.
      *
      * @param attrs An object used as a map of attributes and their values.
      */
    def attrs(attrs: ValueMap[GElement, Datum]): this.type = js.native
    
    /**
      * Derive a map of style properties to be set.
      *
      * @param style A function returning a map of style properties and their values
      * @param priority The CSS priority (either "important" or undefined)
      */
    def styles(style: ValueFn[GElement, Datum, ValueMap[GElement, Datum]]): this.type = js.native
    /**
      * Set multiple style properties. The transition will animate from the present value to the new value. Attribute values may be constant or derived from each node and its bound data.
      *
      * @param style A map of style properties and their values
      * @param priority The CSS priority (either "important" or undefined)
      */
    def styles(style: ValueMap[GElement, Datum]): this.type = js.native
    @JSName("styles")
    def styles_important(style: ValueFn[GElement, Datum, ValueMap[GElement, Datum]], priority: important): this.type = js.native
    @JSName("styles")
    def styles_important(style: ValueMap[GElement, Datum], priority: important): this.type = js.native
  }
}
