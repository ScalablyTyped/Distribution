package typings.cesium.mod

import typings.cesium.anon.AllowPicking
import typings.cesium.anon.Asynchronous
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Model")
@js.native
class Model () extends StObject {
  def this(options: AllowPicking) = this()
  
  var activeAnimations: ModelAnimationCollection = js.native
  
  val allowPicking: Boolean = js.native
  
  def applyArticulations(): Unit = js.native
  
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
  
  def destroy(): Unit = js.native
  
  var distanceDisplayCondition: DistanceDisplayCondition = js.native
  
  def getMaterial(name: String): ModelMaterial = js.native
  
  def getMesh(name: String): ModelMesh = js.native
  
  def getNode(name: String): ModelNode = js.native
  
  val gltf: js.Any = js.native
  
  var heightReference: HeightReference = js.native
  
  var id: js.Any = js.native
  
  var imageBasedLightingFactor: Cartesian2 = js.native
  
  val incrementallyLoadTextures: Boolean = js.native
  
  def isDestroyed(): Boolean = js.native
  
  var lightColor: Cartesian3 = js.native
  
  var luminanceAtZenith: Double = js.native
  
  var maximumScale: Double = js.native
  
  var minimumPixelSize: Double = js.native
  
  var modelMatrix: Matrix4 = js.native
  
  val pendingTextureLoads: Double = js.native
  
  val ready: Boolean = js.native
  
  val readyPromise: js.Promise[Model] = js.native
  
  var scale: Double = js.native
  
  def setArticulationStage(articulationStageKey: String, value: Double): Unit = js.native
  
  var shadows: ShadowMode = js.native
  
  var show: Boolean = js.native
  
  var silhouetteColor: Color = js.native
  
  var silhouetteSize: Double = js.native
  
  var specularEnvironmentMaps: String = js.native
  
  var sphericalHarmonicCoefficients: js.Array[Cartesian3] = js.native
  
  def update(): Unit = js.native
}
object Model {
  
  @JSImport("cesium", "Model")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def fromGltf(options: Asynchronous): Model = ^.asInstanceOf[js.Dynamic].applyDynamic("fromGltf")(options.asInstanceOf[js.Any]).asInstanceOf[Model]
  
  /* static member */
  inline def siluhouetteSupported(scene: Scene): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("siluhouetteSupported")(scene.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
