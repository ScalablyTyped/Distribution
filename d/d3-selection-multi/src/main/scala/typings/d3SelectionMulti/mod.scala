package typings.d3SelectionMulti

import org.scalablytyped.runtime.StringDictionary
import typings.d3Selection.mod.BaseType
import typings.d3Selection.mod.ValueFn
import typings.d3SelectionMulti.d3SelectionMultiStrings.important
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type ValueMap[T /* <: BaseType */, Datum] = StringDictionary[
    Double | String | Boolean | Null | (ValueFn[T, Datum, Double | String | Boolean | Null])
  ]
  
  /* augmented module */
  object d3SelectionAugmentingMod {
    
    /**
      * A D3 Selection of elements.
      *
      * The first generic "GElement" refers to the type of the selected element(s).
      * The second generic "Datum" refers to the type of the datum of a selected element(s).
      * The third generic "PElement" refers to the type of the parent element(s) in the D3 selection.
      * The fourth generic "PDatum" refers to the type of the datum of the parent element(s).
      */
    @js.native
    trait Selection[GElement /* <: BaseType */, Datum, PElement /* <: BaseType */, PDatum] extends StObject {
      
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
  
  /* augmented module */
  object d3TransitionAugmentingMod {
    
    /**
      * A D3 Transition.
      *
      * The first generic "GElement" refers to the type of the selected element(s) in the Transition.
      * The second generic "Datum" refers to the type of the datum of a selected element(s) in the Transition.
      * The third generic "PElement" refers to the type of the parent element(s) in the D3 selection in the Transition.
      * The fourth generic "PDatum" refers to the type of the datum of the parent element(s) in the Transition.
      */
    @js.native
    trait Transition[GElement /* <: BaseType */, Datum, PElement /* <: BaseType */, PDatum] extends StObject {
      
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
}
