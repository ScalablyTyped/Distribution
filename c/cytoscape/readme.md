```
// Type definitions for Cytoscape.js 3.4
// Project: http://js.cytoscape.org/
// Definitions by:  Fabian Schmidt and Fred Eisele <https://github.com/phreed>
//                  Shenghan Gao <https://github.com/wy193777>
//                  Yuri Pereira Constante <https://github.com/ypconstante>
//                  Jan-Niclas Struewer <https://github.com/janniclas>
//                  Cerberuser <https://github.com/cerberuser>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
//
// Translation from Objects in help to Typescript interface.
// http://js.cytoscape.org/#notation/functions
// TypeScript Version: 2.3
/**
 * cy   --> Cy.Core
 *  the core
 *
 * eles --> Cy.Collection
 *  a collection of one or more elements (nodes and edges)
 *
 * ele  --> Cy.Singular
 *  a collection of a single element (node or edge)
 *
 * node --> Cy.NodeSingular
 *  a collection of a single node
 *
 * nodes -> Cy.NodeCollection
 *  a collection of one or more nodes
 *
 * edge --> Cy.EdgeSingular
 *  a collection of a single edge
 *
 * edges -> Cy.EdgeCollection
 *  a collection of one or more edges
 *
 * The library makes a distinction between input and output parameters
 *  due to the dynamic behaviour of the Cytoscape library.
 *
 * For a input parameter it will always expect:
 *  - Cy.Collection
 *      The input can be any element (node and edge) collection.
 *  - Cy.NodeCollection
 *      The input must be a node collection.
 *  - Cy.EdgeCollection
 *      The input must be a edge collection.
 *  - Cy.Singular
 *      The input must be a single element.
 *  - Cy.NodeSingular
 *      The inut must be a single node.
 *  - Cy.EdgeSingular
 *      The input must be a single edge.
 *
 * For a output of a function it will always give:
 *  - Cy.CollectionElements
 *      The output is a collection of node and edge elements OR single element.
 *  - Cy.EdgeCollection
 *      The output is a collection of edge elements OR single edge.
 *  - Cy.NodeCollection
 *      The output is a collection of node elements OR single node.
 *
 * A number of interfaces contain nothing as they server to collect interfaces.
 *
 */
```