package typings.cesium.mod

import typings.cesium.anon.BaseScreenSpaceError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Cesium3DTileset")
@js.native
class Cesium3DTileset protected () extends js.Object {
  def this(Cesium3DTilesetItem: BaseScreenSpaceError) = this()
  
  var allTilesLoaded: Event[js.Array[_]] = js.native
  
  val asset: js.Any = js.native
  
  val baseScreenSpaceError: Double = js.native
  
  val boundingSphere: BoundingSphere = js.native
  
  val classificationType: ClassificationType = js.native
  
  var clippingPlanes: ClippingPlane = js.native
  
  var colorBlendAmount: Double = js.native
  
  var colorBlendMode: Cesium3DTileColorBlendMode = js.native
  
  var cullRequestsWhileMovingMultiplier: Double = js.native
  
  var debugColorizeTiles: Boolean = js.native
  
  var debugFreezeFrame: Boolean = js.native
  
  var debugShowBoundingVolume: Boolean = js.native
  
  var debugShowContentBoundingVolume: Boolean = js.native
  
  var debugShowGeometricError: Boolean = js.native
  
  var debugShowMemoryUsage: Boolean = js.native
  
  var debugShowUrl: Boolean = js.native
  
  var debugShowViewerRequestVolume: Boolean = js.native
  
  var debugWireframe: Boolean = js.native
  
  def destroy(): Unit = js.native
  
  var dynamicScreenSpaceError: Boolean = js.native
  
  var dynamicScreenSpaceErrorDensity: Double = js.native
  
  var dynamicScreenSpaceErrorFactor: Double = js.native
  
  var dynamicScreenSpaceErrorHeightFalloff: Double = js.native
  
  val ellipsoid: Ellipsoid = js.native
  
  val extras: js.Any = js.native
  
  var foveatedConeSize: Double = js.native
  
  var foveatedInterpolationCallback: js.Any = js.native
  
  var foveatedMinimumScreenSpaceErrorRelaxation: Double = js.native
  
  var foveatedScreenSpaceError: Boolean = js.native
  
  var foveatedTimeDelay: Double = js.native
  
  def hasExtension(extensionName: String): Boolean = js.native
  
  var imageBasedLightingFactor: Cartesian2 = js.native
  
  var immediatelyLoadDesiredLevelOfDetail: Boolean = js.native
  
  var initialTilesLoaded: Event[js.Array[_]] = js.native
  
  def isDestroyed(): Boolean = js.native
  
  var lightColor: Cartesian3 = js.native
  
  var loadProgress: Event[js.Array[_]] = js.native
  
  var loadSiblings: Boolean = js.native
  
  var luminanceAtZenith: Double = js.native
  
  def makeStyleDirty(): Unit = js.native
  
  var maximumMemoryUsage: Double = js.native
  
  var maximumScreenSpaceError: Double = js.native
  
  var modelMatrix: Matrix4 = js.native
  
  var pointCloudShading: PointCloudShading = js.native
  
  var preferLeaves: Boolean = js.native
  
  var preloadFlightDestinations: Boolean = js.native
  
  var preloadWhenHidden: Boolean = js.native
  
  var progressiveResolutionHeightFraction: Double = js.native
  
  val properties: js.Any = js.native
  
  val ready: Boolean = js.native
  
  val readyPromise: js.Promise[Cesium3DTileset] = js.native
  
  val root: Cesium3DTileset = js.native
  
  var shadow: ShadowMode = js.native
  
  var show: Boolean = js.native
  
  /**
    * Optimization option.
    * Determines if level of detail skipping should be applied during the traversal.
    * @default false
    */
  var skipLevelOfDetail: Boolean = js.native
  
  var skipLevels: Double = js.native
  
  var skipScreenSpaceErrorFactor: Double = js.native
  
  var specularEnvironmentMaps: String = js.native
  
  var sphericalHarmonicCoefficients: js.Array[Cartesian3] = js.native
  
  var style: Cesium3DTileStyle = js.native
  
  var tileFailed: Event[js.Array[_]] = js.native
  
  var tileLoad: Event[js.Array[_]] = js.native
  
  var tileUnloaded: Event[js.Array[_]] = js.native
  
  var tileVisible: Event[js.Array[_]] = js.native
  
  val tilesLoaded: Boolean = js.native
  
  val timeSinceLoad: Double = js.native
  
  val totalMemoryUsageInBytes: Double = js.native
  
  def trimLoadedTiles(): Unit = js.native
  
  val url: String = js.native
}
/* static members */
@JSImport("cesium", "Cesium3DTileset")
@js.native
object Cesium3DTileset extends js.Object {
  
  def loadJson(tilesetUrl: String): js.Promise[_] = js.native
  def loadJson(tilesetUrl: Resource): js.Promise[_] = js.native
}
