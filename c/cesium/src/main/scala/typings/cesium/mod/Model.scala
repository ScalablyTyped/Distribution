package typings.cesium.mod

import typings.cesium.AnonAllowPicking
import typings.cesium.AnonAsynchronous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Model")
@js.native
class Model () extends js.Object {
  def this(options: AnonAllowPicking) = this()
  var activeAnimations: ModelAnimationCollection = js.native
  val allowPicking: Boolean = js.native
  val asynchronous: Boolean = js.native
  val basePath: String = js.native
  val boundingSphere: BoundingSphere = js.native
  var clampAnimations: Boolean = js.native
  var clippingPlanes: ClippingPlaneCollection = js.native
  var color: Color = js.native
  var colorBlendAmount: Double = js.native
  var colorBlendMode: ColorBlendMode = js.native
  var credit: Credit = js.native
  var debugShowBoundingVolume: Boolean = js.native
  var debugWireframe: Boolean = js.native
  var distanceDisplayCondition: DistanceDisplayCondition = js.native
  val gltf: js.Any = js.native
  var heightReference: HeightReference = js.native
  var id: js.Any = js.native
  var imageBasedLightingFactor: Cartesian2 = js.native
  val incrementallyLoadTextures: Boolean = js.native
  var lightColor: Cartesian3 = js.native
  var luminanceAtZenith: Double = js.native
  var maximumScale: Double = js.native
  var minimumPixelSize: Double = js.native
  var modelMatrix: Matrix4 = js.native
  val pendingTextureLoads: Double = js.native
  val ready: Boolean = js.native
  val readyPromise: js.Promise[Model] = js.native
  var scale: Double = js.native
  var shadows: ShadowMode = js.native
  var show: Boolean = js.native
  var silhouetteColor: Color = js.native
  var silhouetteSize: Double = js.native
  var specularEnvironmentMaps: String = js.native
  var sphericalHarmonicCoefficients: js.Array[Cartesian3] = js.native
  def applyArticulations(): Unit = js.native
  def destroy(): Unit = js.native
  def getMaterial(name: String): ModelMaterial = js.native
  def getMesh(name: String): ModelMesh = js.native
  def getNode(name: String): ModelNode = js.native
  def isDestroyed(): Boolean = js.native
  def setArticulationStage(articulationStageKey: String, value: Double): Unit = js.native
  def update(): Unit = js.native
}

/* static members */
@JSImport("cesium", "Model")
@js.native
object Model extends js.Object {
  def fromGltf(options: AnonAsynchronous): Model = js.native
  def siluhouetteSupported(scene: Scene): Boolean = js.native
}

