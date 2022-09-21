package typings.cytoscape.mod

import org.scalablytyped.runtime.StringDictionary
import typings.cytoscape.anon.Typeofcytoscape
import typings.cytoscape.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply(): Core = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Core]
inline def apply(options: CytoscapeOptions): Core = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Core]
inline def apply(`type`: String, name: String): Any = (^.asInstanceOf[js.Dynamic].apply(`type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def apply(`type`: String, name: String, registrant: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(`type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], registrant.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Register imported extension into cytoscape
  * @param module Entry point for the extension, got by module = require('cy-ext')
  * or by import module from 'cy-ext'
  * http://js.cytoscape.org/#extensions
  */
inline def use(module: Ext): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(module.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * Surpress Cytoscape internal warnings globally with a flag.
  * @param condition If true, all Cytoscape warnings are surpressed.
  * https://js.cytoscape.org/#core/initialisation
  */
inline def warnings(condition: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warnings")(condition.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * http://js.cytoscape.org/#collection/style
  */
type ClassName = String

/** A space-separated list of class names or an array */
type ClassNames = String | js.Array[ClassName]

/**
  * The output is a collection of node and edge elements OR single element.
  */
/* Rewritten from type alias, can be one of: 
  - typings.cytoscape.mod.Collection[
typings.cytoscape.mod.SingularElementReturnValue, 
typings.cytoscape.mod.SingularElementArgument]
  - typings.cytoscape.mod.EdgeCollection
  - typings.cytoscape.mod.NodeCollection
  - typings.cytoscape.mod.SingularElementArgument
*/
type CollectionArgument = _CollectionArgument | (Collection[SingularElementReturnValue, SingularElementArgument])

/**
  * Get a new collection, resulting from the collection without some specified elements.
  * http://js.cytoscape.org/#eles.difference
  * @param eles The elements that will not be in the resultant collection.
  *             Elements from the calling collection matching this selector will not be in the resultant collection.
  */
type CollectionBuildingDifferenceFunc = js.Function1[/* eles */ CollectionArgument | Selector, CollectionReturnValue]

/**
  * Get the elements in both this collection and another specified collection.
  * http://js.cytoscape.org/#eles.intersection
  * @param eles The elements to intersect with.
  *             A selector representing the elements to intersect with.
  *             All elements in the graph matching the selector are used as the passed collection.
  */
type CollectionBuildingIntersectionFunc = js.Function1[/* eles */ CollectionArgument | Selector, CollectionReturnValue]

/**
  * http://js.cytoscape.org/#collection/building--filtering
  */
/**
  * Get a new collection, resulting from adding the collection with another one
  *
  * @param eles The elements or array of elements to add or elements in the graph matching the selector.
  * http://js.cytoscape.org/#eles.union
  */
type CollectionBuildingUnionFunc = js.Function1[
/* eles */ CollectionArgument | js.Array[CollectionArgument] | Selector, 
CollectionReturnValue]

type CollectionReturnValue = (Collection[SingularElementReturnValue, SingularElementArgument]) & EdgeCollection & NodeCollection & SingularElementReturnValue

/**
  * Get the elements that are in the calling collection or the passed collection but not in both.
  * http://js.cytoscape.org/#eles.symmetricDifference
  * @param eles The elements to apply the symmetric difference with.
  *             A selector representing the elements to apply the symmetric difference with.
  *             All elements in the graph matching the selector are used as the passed collection.
  */
type CollectionSymmetricDifferenceFunc = js.Function1[/* eles */ CollectionArgument | Selector, CollectionReturnValue]

type CssStyleDeclaration = Any

type ElementCollectionFunction = js.Function3[/* ele */ NodeSingular, /* ix */ Double, /* eles */ CollectionArgument, Position]

/**
  * @param ele The element being iterated over for which the function should return a position to set.
  * @param ix The index of the element when iterating over the elements in the collection.
  */
type ElementPositionFunction = js.Function2[/* ele */ NodeSingular, /* ix */ Double, Position]

type EventHandler = js.Function2[/* event */ EventObject, /* extraParams */ js.UndefOr[Any], Unit]

/**
  * A space separated list of event names.
  * http://js.cytoscape.org/#cy.promiseOn
  */
type EventNames = String

/**
  * Cytoscape extension type
  * Definition of an extension would be in following form:
  * @example
  * declare module 'cytoscape-ext' {
  *  const ext: cytoscape.Ext;
  *  export = ext;
  * }
  */
type Ext = js.Function1[/* cy */ Typeofcytoscape, Unit]

type LayoutHandler = js.Function1[/* e */ LayoutEventObject, Unit]

/**
  * http://js.cytoscape.org/#collection/traversing
  */
type MinumumSpanningTree = Any

type NodePositionFunction = js.Function1[/* nodeid */ String, Position]

/**
  * http://js.cytoscape.org/#layouts/preset
  */
type NodePositionMap = StringDictionary[Position]

/**
  * Usually temp or nonserialisable data can be stored.
  * http://js.cytoscape.org/#notation/elements-json
  * http://js.cytoscape.org/#cy.scratch
  * http://js.cytoscape.org/#ele.scratch
  */
type Scratchpad = Any

/**
  * The handler returns true when it finds the desired node, and it returns false to cancel the search.
  * v - The current node.
  * e - The edge connecting the previous node to the current node.
  * u - The previous node.
  * i - The index indicating this node is the ith visited node.
  * depth - How many edge hops away this node is from the root nodes.
  */
type SearchVisitFunction = js.Function5[
/* v */ NodeSingular, 
/* e */ js.UndefOr[EdgeSingular], 
/* u */ js.UndefOr[NodeSingular], 
/* i */ Double, 
/* depth */ Double, 
Boolean | Unit]

/**
  * A selector functions similar to a CSS selector on DOM elements,
  * but selectors in Cytoscape.js instead work on
  * collections of graph elements.
  * Note that wherever a selector may be specified
  * as the argument to a function,
  * a eles.filter()-style filter function may be
  * used in place of the selector.
  *
  * See http://js.cytoscape.org/#selectors for
  * details about writing selectors.
  * Selectors are an island grammar.
  */
type Selector = String

// function(a, b){ return a.data('weight') - b.data('weight') }
type SortingFunction = js.Function2[/* a */ SortableNode, /* b */ SortableNode, Double]

/**
  *
  * http://js.cytoscape.org/#collection/algorithms
  */
type WeightFn = js.Function1[/* edge */ EdgeCollection, Double]

type ZoomOptions = Double | (ZoomOptionsModel & ZoomOptionsLevel) | (ZoomOptionsRendered & ZoomOptionsLevel)
