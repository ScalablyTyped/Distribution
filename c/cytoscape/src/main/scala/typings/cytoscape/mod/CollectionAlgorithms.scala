package typings.cytoscape.mod

import typings.cytoscape.anon.Components
import typings.cytoscape.anon.ComponentsCut
import typings.cytoscape.anon.Cut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#eles.closenessCentralityNormalized
  * trivial
  */
trait CollectionAlgorithms extends js.Object {
  /**
    * Perform the A* search algorithm on the elements in the collection.
    * This finds the shortest path from the root node to the goal node.
    * http://js.cytoscape.org/#eles.aStar
    */
  def aStar(options: SearchAStarOptions): SearchAStarResult
  /**
    * Perform the Bellman-Ford search algorithm on the elements in the collection.
    * This finds the shortest path from the starting node to all other nodes in the collection.
    * http://js.cytoscape.org/#eles.bellmanFord
    */
  def bellmanFord(options: SearchBellmanFordOptions): SearchBellmanFordResult
  /**
    * Considering only the elements in the calling collection,
    * calculate the betweenness centrality of the nodes.
    * http://js.cytoscape.org/#eles.betweennessCentrality
    */
  def betweennessCentrality(options: SearchBetweennessOptions): SearchBetweennessResult
  def bfs(options: SearchFirstOptions): SearchFirstResult
  /**
    * Perform a breadth-first search within the elements in the collection.
    * @param options
    * http://js.cytoscape.org/#eles.breadthFirstSearch
    * @alias bfs
    */
  def breadthFirstSearch(options: SearchFirstOptions): SearchFirstResult
  /**
    * Considering only the elements in the calling collection,
    * calculate the closeness centrality of the specified root node.
    * http://js.cytoscape.org/#eles.closenessCentrality
    */
  def closenessCentrality(options: SearchClosenessCentralityOptions): Double
  /**
    * Considering only the elements in the calling collection,
    * calculate the closeness centrality of the nodes.
    * http://js.cytoscape.org/#eles.closenessCentralityNormalized
    */
  def closenessCentralityNormalized(options: SearchClosenessCentralityNormalizedOptions): SearchDegreeCentralityNormalizedResultDirected | SearchDegreeCentralityNormalizedResultUndirected
  /**
    * Considering only the elements in the calling collection,
    * calculate the degree centrality of the specified root node.
    * http://js.cytoscape.org/#eles.degreeCentrality
    */
  def degreeCentrality(options: SearchDegreeCentralityOptions): SearchDegreeCentralityResultDirected | SearchDegreeCentralityResultUndirected
  /**
    * Considering only the elements in the calling collection,
    * calculate the normalised degree centrality of the nodes.
    * http://js.cytoscape.org/#eles.degreeCentralityNormalized
    */
  def degreeCentralityNormalized(options: SearchDegreeCentralityNormalizedOptions): SearchDegreeCentralityNormalizedResultDirected | SearchDegreeCentralityNormalizedResultUndirected
  /**
    * Perform a depth-first search within the elements in the collection.
    * http://js.cytoscape.org/#eles.depthFirstSearch
    * @alias dfs
    */
  def depthFirstSearch(options: SearchFirstOptions): SearchFirstResult
  def dfs(options: SearchFirstOptions): SearchFirstResult
  /**
    * Perform Dijkstra's algorithm on the elements in the collection.
    * This finds the shortest paths to all other nodes in the collection from the root node.
    * http://js.cytoscape.org/#eles.dijkstra
    */
  def dijkstra(options: SearchDijkstraOptions): SearchDijkstraResult
  /**
    * Perform the Floyd Warshall search algorithm on the elements in the collection.
    * This finds the shortest path between all pairs of nodes.
    * http://js.cytoscape.org/#eles.floydWarshall
    */
  def floydWarshall(options: SearchFloydWarshallOptions): SearchFloydWarshallResult
  /**
    * finds the biconnected components in an undirected graph,
    * as well as their respective cut vertices, using an algorithm due to Hopcroft and Tarjan.
    * http://js.cytoscape.org/#eles.hopcroftTarjanBiconnected
    */
  def hopcroftTarjanBiconnected(): Cut
  /**
    * Finds the biconnected components in an undirected graph,
    * as well as their respective cut vertices, using an algorithm due to Hopcroft and Tarjan.
    * http://js.cytoscape.org/#eles.hopcroftTarjanBiconnected
    */
  def hopcroftTarjanBiconnectedComponents(): Cut
  /**
    * Finds the biconnected components in an undirected graph,
    * as well as their respective cut vertices, using an algorithm due to Hopcroft and Tarjan.
    * http://js.cytoscape.org/#eles.hopcroftTarjanBiconnected
    */
  def htb(): Cut
  /**
    * Finds the biconnected components in an undirected graph,
    * as well as their respective cut vertices, using an algorithm due to Hopcroft and Tarjan.
    * http://js.cytoscape.org/#eles.hopcroftTarjanBiconnected
    */
  def htbc(): Cut
  /**
    * Finds the minimum cut in a graph using the Karger-Stein algorithm.
    * The optimal result is found with a high probability, but without guarantee.
    * http://js.cytoscape.org/#eles.kargerStein
    */
  def kargerStein(): Components
  /**
    * Perform Kruskal's algorithm on the elements in the collection,
    * returning the minimum spanning tree, assuming undirected edges.
    * http://js.cytoscape.org/#eles.kruskal
    */
  def kruskal(handler: js.Function1[/* edge */ EdgeCollection, Double]): CollectionReturnValue
  /**
    * Rank the nodes in the collection using the Page Rank algorithm.
    * http://js.cytoscape.org/#eles.pageRank
    */
  def pageRank(options: SearchPageRankOptions): SearchPageRankResult
  /**
    * Finds the strongly connected components of a directed graph using Tarjan's algorithm.
    * http://js.cytoscape.org/#eles.tarjanStronglyConnected
    */
  def tarjanStronglyConnected(): ComponentsCut
  /**
    * Finds the strongly connected components of a directed graph using Tarjan's algorithm.
    * http://js.cytoscape.org/#eles.tarjanStronglyConnected
    */
  def tarjanStronglyConnectedComponents(): ComponentsCut
  /**
    * Finds the strongly connected components of a directed graph using Tarjan's algorithm.
    * http://js.cytoscape.org/#eles.tarjanStronglyConnected
    */
  def tsc(): ComponentsCut
  /**
    * Finds the strongly connected components of a directed graph using Tarjan's algorithm.
    * http://js.cytoscape.org/#eles.tarjanStronglyConnected
    */
  def tscc(): ComponentsCut
}

object CollectionAlgorithms {
  @scala.inline
  def apply(
    aStar: SearchAStarOptions => SearchAStarResult,
    bellmanFord: SearchBellmanFordOptions => SearchBellmanFordResult,
    betweennessCentrality: SearchBetweennessOptions => SearchBetweennessResult,
    bfs: SearchFirstOptions => SearchFirstResult,
    breadthFirstSearch: SearchFirstOptions => SearchFirstResult,
    closenessCentrality: SearchClosenessCentralityOptions => Double,
    closenessCentralityNormalized: SearchClosenessCentralityNormalizedOptions => SearchDegreeCentralityNormalizedResultDirected | SearchDegreeCentralityNormalizedResultUndirected,
    degreeCentrality: SearchDegreeCentralityOptions => SearchDegreeCentralityResultDirected | SearchDegreeCentralityResultUndirected,
    degreeCentralityNormalized: SearchDegreeCentralityNormalizedOptions => SearchDegreeCentralityNormalizedResultDirected | SearchDegreeCentralityNormalizedResultUndirected,
    depthFirstSearch: SearchFirstOptions => SearchFirstResult,
    dfs: SearchFirstOptions => SearchFirstResult,
    dijkstra: SearchDijkstraOptions => SearchDijkstraResult,
    floydWarshall: SearchFloydWarshallOptions => SearchFloydWarshallResult,
    hopcroftTarjanBiconnected: () => Cut,
    hopcroftTarjanBiconnectedComponents: () => Cut,
    htb: () => Cut,
    htbc: () => Cut,
    kargerStein: () => Components,
    kruskal: js.Function1[/* edge */ EdgeCollection, Double] => CollectionReturnValue,
    pageRank: SearchPageRankOptions => SearchPageRankResult,
    tarjanStronglyConnected: () => ComponentsCut,
    tarjanStronglyConnectedComponents: () => ComponentsCut,
    tsc: () => ComponentsCut,
    tscc: () => ComponentsCut
  ): CollectionAlgorithms = {
    val __obj = js.Dynamic.literal(aStar = js.Any.fromFunction1(aStar), bellmanFord = js.Any.fromFunction1(bellmanFord), betweennessCentrality = js.Any.fromFunction1(betweennessCentrality), bfs = js.Any.fromFunction1(bfs), breadthFirstSearch = js.Any.fromFunction1(breadthFirstSearch), closenessCentrality = js.Any.fromFunction1(closenessCentrality), closenessCentralityNormalized = js.Any.fromFunction1(closenessCentralityNormalized), degreeCentrality = js.Any.fromFunction1(degreeCentrality), degreeCentralityNormalized = js.Any.fromFunction1(degreeCentralityNormalized), depthFirstSearch = js.Any.fromFunction1(depthFirstSearch), dfs = js.Any.fromFunction1(dfs), dijkstra = js.Any.fromFunction1(dijkstra), floydWarshall = js.Any.fromFunction1(floydWarshall), hopcroftTarjanBiconnected = js.Any.fromFunction0(hopcroftTarjanBiconnected), hopcroftTarjanBiconnectedComponents = js.Any.fromFunction0(hopcroftTarjanBiconnectedComponents), htb = js.Any.fromFunction0(htb), htbc = js.Any.fromFunction0(htbc), kargerStein = js.Any.fromFunction0(kargerStein), kruskal = js.Any.fromFunction1(kruskal), pageRank = js.Any.fromFunction1(pageRank), tarjanStronglyConnected = js.Any.fromFunction0(tarjanStronglyConnected), tarjanStronglyConnectedComponents = js.Any.fromFunction0(tarjanStronglyConnectedComponents), tsc = js.Any.fromFunction0(tsc), tscc = js.Any.fromFunction0(tscc))
    __obj.asInstanceOf[CollectionAlgorithms]
  }
}

