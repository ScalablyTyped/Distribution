package typings.densityClustering

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("density-clustering", "DBSCAN")
  @js.native
  open class DBSCAN () extends StObject {
    
    var noise: js.Array[Double] = js.native
    
    def run(dataset: js.Array[js.Array[Double]], neighborhoodRadius: Double, minPointsPerCluster: Double): js.Array[js.Array[Double]] = js.native
    def run(
      dataset: js.Array[js.Array[Double]],
      neighborhoodRadius: Double,
      minPointsPerCluster: Double,
      distanceFunction: js.Function2[/* p */ js.Array[Double], /* q */ js.Array[Double], Double]
    ): js.Array[js.Array[Double]] = js.native
  }
  
  @JSImport("density-clustering", "KMEANS")
  @js.native
  open class KMEANS () extends StObject {
    
    def run(dataset: js.Array[js.Array[Double]], numberOfClusters: Double): js.Array[js.Array[Double]] = js.native
  }
  
  @JSImport("density-clustering", "OPTICS")
  @js.native
  open class OPTICS () extends StObject {
    
    def getReachabilityPlot(): js.Array[js.Array[Double]] = js.native
    
    def run(dataset: js.Array[js.Array[Double]], neighborhoodRadius: Double, minPointsPerCluster: Double): js.Array[js.Array[Double]] = js.native
  }
}
