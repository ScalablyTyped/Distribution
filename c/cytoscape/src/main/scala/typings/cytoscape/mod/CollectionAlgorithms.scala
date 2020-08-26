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
@js.native
trait CollectionAlgorithms extends js.Object {
  /**
    * Perform the A* search algorithm on the elements in the collection.
    * This finds the shortest path from the root node to the goal node.
    * http://js.cytoscape.org/#eles.aStar
    */
  def aStar(options: SearchAStarOptions): SearchAStarResult = js.native
  /**
    * Perform the Bellman-Ford search algorithm on the elements in the collection.
    * This finds the shortest path from the starting node to all other nodes in the collection.
    * http://js.cytoscape.org/#eles.bellmanFord
    */
  def bellmanFord(options: SearchBellmanFordOptions): SearchBellmanFordResult = js.native
  /**
    * Considering only the elements in the calling collection,
    * calculate the betweenness centrality of the nodes.
    * http://js.cytoscape.org/#eles.betweennessCentrality
    */
  def betweennessCentrality(options: SearchBetweennessOptions): SearchBetweennessResult = js.native
  def bfs(options: SearchFirstOptions): SearchFirstResult = js.native
  /**
    * Perform a breadth-first search within the elements in the collection.
    * @param options
    * http://js.cytoscape.org/#eles.breadthFirstSearch
    * @alias bfs
    */
  def breadthFirstSearch(options: SearchFirstOptions): SearchFirstResult = js.native
  /**
    * Considering only the elements in the calling collection,
    * calculate the closeness centrality of the specified root node.
    * http://js.cytoscape.org/#eles.closenessCentrality
    */
  def closenessCentrality(options: SearchClosenessCentralityOptions): Double = js.native
  /**
    * Considering only the elements in the calling collection,
    * calculate the closeness centrality of the nodes.
    * http://js.cytoscape.org/#eles.closenessCentralityNormalized
    */
  def closenessCentralityNormalized(options: SearchClosenessCentralityNormalizedOptions): SearchDegreeCentralityNormalizedResultDirected | SearchDegreeCentralityNormalizedResultUndirected = js.native
  /**
    * Considering only the elements in the calling collection,
    * calculate the degree centrality of the specified root node.
    * http://js.cytoscape.org/#eles.degreeCentrality
    */
  def degreeCentrality(options: SearchDegreeCentralityOptions): SearchDegreeCentralityResultDirected | SearchDegreeCentralityResultUndirected = js.native
  /**
    * Considering only the elements in the calling collection,
    * calculate the normalised degree centrality of the nodes.
    * http://js.cytoscape.org/#eles.degreeCentralityNormalized
    */
  def degreeCentralityNormalized(options: SearchDegreeCentralityNormalizedOptions): SearchDegreeCentralityNormalizedResultDirected | SearchDegreeCentralityNormalizedResultUndirected = js.native
  /**
    * Perform a depth-first search within the elements in the collection.
    * http://js.cytoscape.org/#eles.depthFirstSearch
    * @alias dfs
    */
  def depthFirstSearch(options: SearchFirstOptions): SearchFirstResult = js.native
  def dfs(options: SearchFirstOptions): SearchFirstResult = js.native
  /**
    * Perform Dijkstra's algorithm on the elements in the collection.
    * This finds the shortest paths to all other nodes in the collection from the root node.
    * http://js.cytoscape.org/#eles.dijkstra
    */
  def dijkstra(options: SearchDijkstraOptions): SearchDijkstraResult = js.native
  /**
    * Perform the Floyd Warshall search algorithm on the elements in the collection.
    * This finds the shortest path between all pairs of nodes.
    * http://js.cytoscape.org/#eles.floydWarshall
    */
  def floydWarshall(options: SearchFloydWarshallOptions): SearchFloydWarshallResult = js.native
  /**
    * finds the biconnected components in an undirected graph,
    * as well as their respective cut vertices, using an algorithm due to Hopcroft and Tarjan.
    * http://js.cytoscape.org/#eles.hopcroftTarjanBiconnected
    */
  def hopcroftTarjanBiconnected(): Cut = js.native
  /**
    * Finds the biconnected components in an undirected graph,
    * as well as their respective cut vertices, using an algorithm due to Hopcroft and Tarjan.
    * http://js.cytoscape.org/#eles.hopcroftTarjanBiconnected
    */
  def hopcroftTarjanBiconnectedComponents(): Cut = js.native
  /**
    * Finds the biconnected components in an undirected graph,
    * as well as their respective cut vertices, using an algorithm due to Hopcroft and Tarjan.
    * http://js.cytoscape.org/#eles.hopcroftTarjanBiconnected
    */
  def htb(): Cut = js.native
  /**
    * Finds the biconnected components in an undirected graph,
    * as well as their respective cut vertices, using an algorithm due to Hopcroft and Tarjan.
    * http://js.cytoscape.org/#eles.hopcroftTarjanBiconnected
    */
  def htbc(): Cut = js.native
  /**
    * Finds the minimum cut in a graph using the Karger-Stein algorithm.
    * The optimal result is found with a high probability, but without guarantee.
    * http://js.cytoscape.org/#eles.kargerStein
    */
  def kargerStein(): Components = js.native
  /**
    * Perform Kruskal's algorithm on the elements in the collection,
    * returning the minimum spanning tree, assuming undirected edges.
    * http://js.cytoscape.org/#eles.kruskal
    */
  def kruskal(handler: js.Function1[/* edge */ EdgeCollection, Double]): CollectionReturnValue = js.native
  /**
    * Rank the nodes in the collection using the Page Rank algorithm.
    * http://js.cytoscape.org/#eles.pageRank
    */
  def pageRank(options: SearchPageRankOptions): SearchPageRankResult = js.native
  /**
    * Finds the strongly connected components of a directed graph using Tarjan's algorithm.
    * http://js.cytoscape.org/#eles.tarjanStronglyConnected
    */
  def tarjanStronglyConnected(): ComponentsCut = js.native
  /**
    * Finds the strongly connected components of a directed graph using Tarjan's algorithm.
    * http://js.cytoscape.org/#eles.tarjanStronglyConnected
    */
  def tarjanStronglyConnectedComponents(): ComponentsCut = js.native
  /**
    * Finds the strongly connected components of a directed graph using Tarjan's algorithm.
    * http://js.cytoscape.org/#eles.tarjanStronglyConnected
    */
  def tsc(): ComponentsCut = js.native
  /**
    * Finds the strongly connected components of a directed graph using Tarjan's algorithm.
    * http://js.cytoscape.org/#eles.tarjanStronglyConnected
    */
  def tscc(): ComponentsCut = js.native
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
  @scala.inline
  implicit class CollectionAlgorithmsOps[Self <: CollectionAlgorithms] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAStar(value: SearchAStarOptions => SearchAStarResult): Self = this.set("aStar", js.Any.fromFunction1(value))
    @scala.inline
    def setBellmanFord(value: SearchBellmanFordOptions => SearchBellmanFordResult): Self = this.set("bellmanFord", js.Any.fromFunction1(value))
    @scala.inline
    def setBetweennessCentrality(value: SearchBetweennessOptions => SearchBetweennessResult): Self = this.set("betweennessCentrality", js.Any.fromFunction1(value))
    @scala.inline
    def setBfs(value: SearchFirstOptions => SearchFirstResult): Self = this.set("bfs", js.Any.fromFunction1(value))
    @scala.inline
    def setBreadthFirstSearch(value: SearchFirstOptions => SearchFirstResult): Self = this.set("breadthFirstSearch", js.Any.fromFunction1(value))
    @scala.inline
    def setClosenessCentrality(value: SearchClosenessCentralityOptions => Double): Self = this.set("closenessCentrality", js.Any.fromFunction1(value))
    @scala.inline
    def setClosenessCentralityNormalized(
      value: SearchClosenessCentralityNormalizedOptions => SearchDegreeCentralityNormalizedResultDirected | SearchDegreeCentralityNormalizedResultUndirected
    ): Self = this.set("closenessCentralityNormalized", js.Any.fromFunction1(value))
    @scala.inline
    def setDegreeCentrality(
      value: SearchDegreeCentralityOptions => SearchDegreeCentralityResultDirected | SearchDegreeCentralityResultUndirected
    ): Self = this.set("degreeCentrality", js.Any.fromFunction1(value))
    @scala.inline
    def setDegreeCentralityNormalized(
      value: SearchDegreeCentralityNormalizedOptions => SearchDegreeCentralityNormalizedResultDirected | SearchDegreeCentralityNormalizedResultUndirected
    ): Self = this.set("degreeCentralityNormalized", js.Any.fromFunction1(value))
    @scala.inline
    def setDepthFirstSearch(value: SearchFirstOptions => SearchFirstResult): Self = this.set("depthFirstSearch", js.Any.fromFunction1(value))
    @scala.inline
    def setDfs(value: SearchFirstOptions => SearchFirstResult): Self = this.set("dfs", js.Any.fromFunction1(value))
    @scala.inline
    def setDijkstra(value: SearchDijkstraOptions => SearchDijkstraResult): Self = this.set("dijkstra", js.Any.fromFunction1(value))
    @scala.inline
    def setFloydWarshall(value: SearchFloydWarshallOptions => SearchFloydWarshallResult): Self = this.set("floydWarshall", js.Any.fromFunction1(value))
    @scala.inline
    def setHopcroftTarjanBiconnected(value: () => Cut): Self = this.set("hopcroftTarjanBiconnected", js.Any.fromFunction0(value))
    @scala.inline
    def setHopcroftTarjanBiconnectedComponents(value: () => Cut): Self = this.set("hopcroftTarjanBiconnectedComponents", js.Any.fromFunction0(value))
    @scala.inline
    def setHtb(value: () => Cut): Self = this.set("htb", js.Any.fromFunction0(value))
    @scala.inline
    def setHtbc(value: () => Cut): Self = this.set("htbc", js.Any.fromFunction0(value))
    @scala.inline
    def setKargerStein(value: () => Components): Self = this.set("kargerStein", js.Any.fromFunction0(value))
    @scala.inline
    def setKruskal(value: js.Function1[/* edge */ EdgeCollection, Double] => CollectionReturnValue): Self = this.set("kruskal", js.Any.fromFunction1(value))
    @scala.inline
    def setPageRank(value: SearchPageRankOptions => SearchPageRankResult): Self = this.set("pageRank", js.Any.fromFunction1(value))
    @scala.inline
    def setTarjanStronglyConnected(value: () => ComponentsCut): Self = this.set("tarjanStronglyConnected", js.Any.fromFunction0(value))
    @scala.inline
    def setTarjanStronglyConnectedComponents(value: () => ComponentsCut): Self = this.set("tarjanStronglyConnectedComponents", js.Any.fromFunction0(value))
    @scala.inline
    def setTsc(value: () => ComponentsCut): Self = this.set("tsc", js.Any.fromFunction0(value))
    @scala.inline
    def setTscc(value: () => ComponentsCut): Self = this.set("tscc", js.Any.fromFunction0(value))
  }
  
}

