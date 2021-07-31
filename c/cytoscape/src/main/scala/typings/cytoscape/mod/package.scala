package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def apply(): typings.cytoscape.mod.Core = typings.cytoscape.mod.^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.cytoscape.mod.Core]
@scala.inline
def apply(extensionName: java.lang.String, foo: java.lang.String, bar: js.Any): typings.cytoscape.mod.Core = (typings.cytoscape.mod.^.asInstanceOf[js.Dynamic].apply(extensionName.asInstanceOf[js.Any], foo.asInstanceOf[js.Any], bar.asInstanceOf[js.Any])).asInstanceOf[typings.cytoscape.mod.Core]
@scala.inline
def apply(options: typings.cytoscape.mod.CytoscapeOptions): typings.cytoscape.mod.Core = typings.cytoscape.mod.^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[typings.cytoscape.mod.Core]

/**
  * Register imported extension into cytoscape
  * @param module Entry point for the extension, got by module = require('cy-ext')
  * or by import module from 'cy-ext'
  * http://js.cytoscape.org/#extensions
  */
@scala.inline
def use(module: typings.cytoscape.mod.Ext): scala.Unit = typings.cytoscape.mod.^.asInstanceOf[js.Dynamic].applyDynamic("use")(module.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * Surpress Cytoscape internal warnings globally with a flag.
  * @param condition If true, all Cytoscape warnings are surpressed.
  * https://js.cytoscape.org/#core/initialisation
  */
@scala.inline
def warnings(condition: scala.Boolean): scala.Unit = typings.cytoscape.mod.^.asInstanceOf[js.Dynamic].applyDynamic("warnings")(condition.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * http://js.cytoscape.org/#collection/style
  */
type ClassName = java.lang.String

/** A space-separated list of class names or an array */
type ClassNames = java.lang.String | js.Array[typings.cytoscape.mod.ClassName]

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
type CollectionArgument = typings.cytoscape.mod._CollectionArgument | (typings.cytoscape.mod.Collection[
typings.cytoscape.mod.SingularElementReturnValue, 
typings.cytoscape.mod.SingularElementArgument])

/**
  * Get a new collection, resulting from the collection without some specified elements.
  * http://js.cytoscape.org/#eles.difference
  * @param eles The elements that will not be in the resultant collection.
  *             Elements from the calling collection matching this selector will not be in the resultant collection.
  */
type CollectionBuildingDifferenceFunc = js.Function1[
/* eles */ typings.cytoscape.mod.CollectionArgument | typings.cytoscape.mod.Selector, 
typings.cytoscape.mod.CollectionReturnValue]

/**
  * Get the elements in both this collection and another specified collection.
  * http://js.cytoscape.org/#eles.intersection
  * @param eles The elements to intersect with.
  *             A selector representing the elements to intersect with.
  *             All elements in the graph matching the selector are used as the passed collection.
  */
type CollectionBuildingIntersectionFunc = js.Function1[
/* eles */ typings.cytoscape.mod.CollectionArgument | typings.cytoscape.mod.Selector, 
typings.cytoscape.mod.CollectionReturnValue]

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
/* eles */ typings.cytoscape.mod.CollectionArgument | js.Array[typings.cytoscape.mod.CollectionArgument] | typings.cytoscape.mod.Selector, 
typings.cytoscape.mod.CollectionReturnValue]

type CollectionReturnValue = (typings.cytoscape.mod.Collection[
typings.cytoscape.mod.SingularElementReturnValue, 
typings.cytoscape.mod.SingularElementArgument]) & typings.cytoscape.mod.EdgeCollection & typings.cytoscape.mod.NodeCollection & typings.cytoscape.mod.SingularElementReturnValue

/**
  * Get the elements that are in the calling collection or the passed collection but not in both.
  * http://js.cytoscape.org/#eles.symmetricDifference
  * @param eles The elements to apply the symmetric difference with.
  *             A selector representing the elements to apply the symmetric difference with.
  *             All elements in the graph matching the selector are used as the passed collection.
  */
type CollectionSymmetricDifferenceFunc = js.Function1[
/* eles */ typings.cytoscape.mod.CollectionArgument | typings.cytoscape.mod.Selector, 
typings.cytoscape.mod.CollectionReturnValue]

type CssStyleDeclaration = js.Any

type ElementCollectionFunction = js.Function3[
/* ele */ typings.cytoscape.mod.NodeSingular, 
/* ix */ scala.Double, 
/* eles */ typings.cytoscape.mod.CollectionArgument, 
typings.cytoscape.mod.Position]

/**
  * @param ele The element being iterated over for which the function should return a position to set.
  * @param ix The index of the element when iterating over the elements in the collection.
  */
type ElementPositionFunction = js.Function2[
/* ele */ typings.cytoscape.mod.NodeSingular, 
/* ix */ scala.Double, 
typings.cytoscape.mod.Position]

type EventHandler = js.Function2[
/* event */ typings.cytoscape.mod.EventObject, 
/* extraParams */ js.UndefOr[js.Any], 
scala.Unit]

/**
  * A space separated list of event names.
  * http://js.cytoscape.org/#cy.promiseOn
  */
type EventNames = java.lang.String

/**
  * Cytoscape extension type
  * Definition of an extension would be in following form:
  * @example
  * declare module 'cytoscape-ext' {
  *  const ext: cytoscape.Ext;
  *  export = ext;
  * }
  */
type Ext = js.Function1[
/* cytoscape */ js.Function1[
  /* options */ js.UndefOr[typings.cytoscape.mod.CytoscapeOptions], 
  typings.cytoscape.mod.Core
], 
scala.Unit]

type LayoutHandler = js.Function1[/* e */ typings.cytoscape.mod.LayoutEventObject, scala.Unit]

/**
  * http://js.cytoscape.org/#collection/traversing
  */
type MinumumSpanningTree = js.Any

type NodePositionFunction = js.Function1[/* nodeid */ java.lang.String, typings.cytoscape.mod.Position]

/**
  * http://js.cytoscape.org/#layouts/preset
  */
type NodePositionMap = org.scalablytyped.runtime.StringDictionary[typings.cytoscape.mod.Position]

/**
  * Usually temp or nonserialisable data can be stored.
  * http://js.cytoscape.org/#notation/elements-json
  * http://js.cytoscape.org/#cy.scratch
  * http://js.cytoscape.org/#ele.scratch
  */
type Scratchpad = js.Any

/**
  * The handler returns true when it finds the desired node, and it returns false to cancel the search.
  * v - The current node.
  * e - The edge connecting the previous node to the current node.
  * u - The previous node.
  * i - The index indicating this node is the ith visited node.
  * depth - How many edge hops away this node is from the root nodes.
  */
type SearchVisitFunction = js.Function5[
/* v */ typings.cytoscape.mod.NodeSingular, 
/* e */ typings.cytoscape.mod.EdgeSingular, 
/* u */ typings.cytoscape.mod.NodeSingular, 
/* i */ scala.Double, 
/* depth */ scala.Double, 
scala.Boolean | scala.Unit]

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
type Selector = java.lang.String

// function(a, b){ return a.data('weight') - b.data('weight') }
type SortingFunction = js.Function2[
/* a */ typings.cytoscape.mod.SortableNode, 
/* b */ typings.cytoscape.mod.SortableNode, 
scala.Double]

/**
  *
  * http://js.cytoscape.org/#collection/algorithms
  */
type WeightFn = js.Function1[/* edge */ typings.cytoscape.mod.EdgeCollection, scala.Double]

type ZoomOptions = typings.cytoscape.mod.ZoomOptionsLevel & (typings.cytoscape.mod.ZoomOptionsModel | typings.cytoscape.mod.ZoomOptionsRendered)
