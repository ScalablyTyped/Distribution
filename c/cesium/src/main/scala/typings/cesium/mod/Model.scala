package typings.cesium.mod

import typings.cesium.anon.Asynchronous
import typings.cesium.anon.ClampAnimations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Model")
@js.native
open class Model protected () extends StObject {
  def this(options: ClampAnimations) = this()
  
  /**
    * The currently playing glTF animations.
    */
  val activeAnimations: ModelAnimationCollection = js.native
  
  /**
    * Applies any modified articulation stages to the matrix of each node that
    * participates in any articulation. Note that this will overwrite any node
    * transformations on participating nodes.
    */
  def applyArticulations(): Unit = js.native
  
  /**
    * Whether to cull back-facing geometry. When true, back face culling is
    * determined by the material's doubleSided property; when false, back face
    * culling is disabled. Back faces are not culled if {@link Model#color}
    * is translucent or {@link Model#silhouetteSize} is greater than 0.0.
    */
  var backFaceCulling: Boolean = js.native
  
  /**
    * Gets the model's bounding sphere in world space. This does not take into account
    * glTF animations, skins, or morph targets. It also does not account for
    * {@link Model#minimumPixelSize}.
    */
  val boundingSphere: BoundingSphere = js.native
  
  /**
    * Determines if the model's animations should hold a pose over frames where no keyframes are specified.
    */
  var clampAnimations: Boolean = js.native
  
  /**
    * Gets the model's classification type. This determines whether terrain,
    * 3D Tiles, or both will be classified by this model.
    * <p>
    * Additionally, there are a few requirements/limitations:
    * <ul>
    *     <li>The glTF cannot contain morph targets, skins, or animations.</li>
    *     <li>The glTF cannot contain the <code>EXT_mesh_gpu_instancing</code> extension.</li>
    *     <li>Only meshes with TRIANGLES can be used to classify other assets.</li>
    *     <li>The position attribute is required.</li>
    *     <li>If feature IDs and an index buffer are both present, all indices with the same feature id must occupy contiguous sections of the index buffer.</li>
    *     <li>If feature IDs are present without an index buffer, all positions with the same feature id must occupy contiguous sections of the position buffer.</li>
    * </ul>
    * </p>
    */
  val classificationType: ClassificationType = js.native
  
  /**
    * The {@link ClippingPlaneCollection} used to selectively disable rendering the model.
    */
  var clippingPlanes: ClippingPlaneCollection = js.native
  
  /**
    * The color to blend with the model's rendered color.
    */
  var color: Color = js.native
  
  /**
    * Value used to determine the color strength when the <code>colorBlendMode</code> is <code>MIX</code>. A value of 0.0 results in the model's rendered color while a value of 1.0 results in a solid color, with any value in-between resulting in a mix of the two.
    */
  var colorBlendAmount: Double = js.native
  
  /**
    * Defines how the color blends with the model.
    */
  var colorBlendMode: Cesium3DTileColorBlendMode | ColorBlendMode = js.native
  
  /**
    * Gets the credit that will be displayed for the model.
    */
  val credit: Credit = js.native
  
  /**
    * The model's custom shader, if it exists. Using custom shaders with a {@link Cesium3DTileStyle}
    * may lead to undefined behavior.
    */
  var customShader: CustomShader = js.native
  
  /**
    * This property is for debugging only; it is not for production use nor is it optimized.
    * <p>
    * Draws the bounding sphere for each draw command in the model.
    * </p>
    */
  var debugShowBoundingVolume: Boolean = js.native
  
  /**
    * This property is for debugging only; it is not for production use nor is it optimized.
    * <p>
    * Draws the model in wireframe.
    * </p>
    */
  var debugWireframe: Boolean = js.native
  
  /**
    * Destroys the WebGL resources held by this object.  Destroying an object allows for deterministic
    * release of WebGL resources, instead of relying on the garbage collector to destroy this object.
    * <br /><br />
    * Once an object is destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.  Therefore,
    * assign the return value (<code>undefined</code>) to the object as done in the example.
    * @example
    * model = model && model.destroy();
    */
  def destroy(): Unit = js.native
  
  /**
    * Gets or sets the distance display condition, which specifies at what distance
    * from the camera this model will be displayed.
    */
  var distanceDisplayCondition: DistanceDisplayCondition = js.native
  
  /**
    * Label of the feature ID set to use for picking and styling.
    * <p>
    * For EXT_mesh_features, this is the feature ID's label property, or
    * "featureId_N" (where N is the index in the featureIds array) when not
    * specified. EXT_feature_metadata did not have a label field, so such
    * feature ID sets are always labeled "featureId_N" where N is the index in
    * the list of all feature Ids, where feature ID attributes are listed before
    * feature ID textures.
    * </p>
    * <p>
    * If featureIdLabel is set to an integer N, it is converted to
    * the string "featureId_N" automatically. If both per-primitive and
    * per-instance feature IDs are present, the instance feature IDs take
    * priority.
    * </p>
    */
  var featureIdLabel: String = js.native
  
  /**
    * Returns the node with the given <code>name</code> in the glTF. This is used to
    * modify a node's transform for user-defined animation.
    * @example
    * // Apply non-uniform scale to node "Hand"
    * const node = model.getNode("Hand");
    * node.matrix = Cesium.Matrix4.fromScale(new Cesium.Cartesian3(5.0, 1.0, 1.0), node.matrix);
    * @param name - The name of the node in the glTF.
    * @returns The node, or <code>undefined</code> if no node with the <code>name</code> exists.
    */
  def getNode(name: String): ModelNode = js.native
  
  /**
    * The height reference of the model, which determines how the model is drawn
    * relative to terrain.
    */
  var heightReference: HeightReference = js.native
  
  /**
    * A user-defined object that is returned when the model is picked.
    */
  var id: Any = js.native
  
  /**
    * The properties for managing image-based lighting on this model.
    */
  var imageBasedLighting: ImageBasedLighting = js.native
  
  /**
    * Label of the instance feature ID set used for picking and styling.
    * <p>
    * If instanceFeatureIdLabel is set to an integer N, it is converted to
    * the string "instanceFeatureId_N" automatically.
    * If both per-primitive and per-instance feature IDs are present, the
    * instance feature IDs take priority.
    * </p>
    */
  var instanceFeatureIdLabel: String = js.native
  
  /**
    * Returns true if this object was destroyed; otherwise, false.
    * <br /><br />
    * If this object was destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.
    * @returns <code>true</code> if this object was destroyed; otherwise, <code>false</code>.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * The light color when shading the model. When <code>undefined</code> the scene's light color is used instead.
    * <p>
    * Disabling additional light sources by setting
    * <code>model.imageBasedLighting.imageBasedLightingFactor = new Cartesian2(0.0, 0.0)</code>
    * will make the model much darker. Here, increasing the intensity of the light source will make the model brighter.
    * </p>
    */
  var lightColor: Cartesian3 = js.native
  
  /**
    * Marks the model's {@link Model#style} as dirty, which forces all features
    * to re-evaluate the style in the next frame the model is visible.
    */
  def makeStyleDirty(): Unit = js.native
  
  /**
    * The maximum scale size for a model. This can be used to give
    * an upper limit to the {@link Model#minimumPixelSize}, ensuring that the model
    * is never an unreasonable scale.
    */
  var maximumScale: Double = js.native
  
  /**
    * The approximate minimum pixel size of the model regardless of zoom.
    * This can be used to ensure that a model is visible even when the viewer
    * zooms out.  When <code>0.0</code>, no minimum size is enforced.
    */
  var minimumPixelSize: Double = js.native
  
  /**
    * The 4x4 transformation matrix that transforms the model from model to world coordinates.
    * When this is the identity matrix, the model is drawn in world coordinates, i.e., Earth's Cartesian WGS84 coordinates.
    * Local reference frames can be used by providing a different transformation matrix, like that returned
    * by {@link Transforms.eastNorthUpToFixedFrame}.
    * @example
    * const origin = Cesium.Cartesian3.fromDegrees(-95.0, 40.0, 200000.0);
    * m.modelMatrix = Cesium.Transforms.eastNorthUpToFixedFrame(origin);
    */
  var modelMatrix: Matrix4 = js.native
  
  /**
    * The color to use when rendering outlines.
    */
  var outlineColor: Color = js.native
  
  /**
    * Point cloud shading settings for controlling point cloud attenuation
    * and lighting. For 3D Tiles, this is inherited from the
    * {@link Cesium3DTileset}.
    */
  var pointCloudShading: PointCloudShading = js.native
  
  /**
    * When <code>true</code>, this model is ready to render, i.e., the external binary, image,
    * and shader files were downloaded and the WebGL resources were created.  This is set to
    * <code>true</code> right before {@link Model#readyPromise} is resolved.
    */
  val ready: Boolean = js.native
  
  /**
    * Gets the promise that will be resolved when this model is ready to render, i.e. when the external resources
    * have been downloaded and the WebGL resources are created.
    * <p>
    * This promise is resolved at the end of the frame before the first frame the model is rendered in.
    * </p>
    */
  val readyPromise: js.Promise[Model] = js.native
  
  /**
    * A uniform scale applied to this model before the {@link Model#modelMatrix}.
    * Values greater than <code>1.0</code> increase the size of the model; values
    * less than <code>1.0</code> decrease.
    */
  var scale: Double = js.native
  
  /**
    * Sets the current value of an articulation stage.  After setting one or
    * multiple stage values, call Model.applyArticulations() to
    * cause the node matrices to be recalculated.
    * @example
    * // Sets the value of the stage named "MoveX" belonging to the articulation named "SampleArticulation"
    * model.setArticulationStage("SampleArticulation MoveX", 50.0);
    * @param articulationStageKey - The name of the articulation, a space, and the name of the stage.
    * @param value - The numeric value of this stage of the articulation.
    */
  def setArticulationStage(articulationStageKey: String, value: Double): Unit = js.native
  
  /**
    * Determines whether the model casts or receives shadows from light sources.
    */
  var shadows: ShadowMode = js.native
  
  /**
    * Whether or not to render the model.
    */
  var show: Boolean = js.native
  
  /**
    * Gets or sets whether the credits of the model will be displayed
    * on the screen.
    */
  var showCreditsOnScreen: Boolean = js.native
  
  /**
    * Whether to display the outline for models using the
    * {@link https://github.com/KhronosGroup/glTF/tree/master/extensions/2.0/Vendor/CESIUM_primitive_outline|CESIUM_primitive_outline} extension.
    * When true, outlines are displayed. When false, outlines are not displayed.
    */
  var showOutline: Boolean = js.native
  
  /**
    * The silhouette color.
    */
  var silhouetteColor: Color = js.native
  
  /**
    * The size of the silhouette in pixels.
    */
  var silhouetteSize: Double = js.native
  
  /**
    * The {@link SplitDirection} to apply to this model.
    */
  var splitDirection: SplitDirection = js.native
  
  /**
    * The style to apply to the features in the model. Cannot be applied if a {@link CustomShader} is also applied.
    */
  var style: Cesium3DTileStyle = js.native
  
  /**
    * Called when {@link Viewer} or {@link CesiumWidget} render the scene to
    * get the draw commands needed to render this primitive.
    * <p>
    * Do not call this function directly.  This is documented just to
    * list the exceptions that may be propagated when the scene is rendered:
    * </p>
    */
  def update(): Unit = js.native
}
/* static members */
object Model {
  
  @JSImport("cesium", "Model")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * <p>
    * Creates a model from a glTF asset.  When the model is ready to render, i.e., when the external binary, image,
    * and shader files are downloaded and the WebGL resources are created, the {@link Model#readyPromise} is resolved.
    * </p>
    * <p>
    * The model can be a traditional glTF asset with a .gltf extension or a Binary glTF using the .glb extension.
    * @param options - Object with the following properties:
    * @param options.url - The url to the .gltf or .glb file.
    * @param [options.basePath = ''] - The base path that paths in the glTF JSON are relative to.
    * @param [options.show = true] - Whether or not to render the model.
    * @param [options.modelMatrix = Matrix4.IDENTITY] - The 4x4 transformation matrix that transforms the model from model to world coordinates.
    * @param [options.scale = 1.0] - A uniform scale applied to this model.
    * @param [options.minimumPixelSize = 0.0] - The approximate minimum pixel size of the model regardless of zoom.
    * @param [options.maximumScale] - The maximum scale size of a model. An upper limit for minimumPixelSize.
    * @param [options.id] - A user-defined object to return when the model is picked with {@link Scene#pick}.
    * @param [options.allowPicking = true] - When <code>true</code>, each primitive is pickable with {@link Scene#pick}.
    * @param [options.incrementallyLoadTextures = true] - Determine if textures may continue to stream in after the model is loaded.
    * @param [options.asynchronous = true] - Determines if model WebGL resource creation will be spread out over several frames or block until completion once all glTF files are loaded.
    * @param [options.clampAnimations = true] - Determines if the model's animations should hold a pose over frames where no keyframes are specified.
    * @param [options.shadows = ShadowMode.ENABLED] - Determines whether the model casts or receives shadows from light sources.
    * @param [options.releaseGltfJson = false] - When true, the glTF JSON is released once the glTF is loaded. This is is especially useful for cases like 3D Tiles, where each .gltf model is unique and caching the glTF JSON is not effective.
    * @param [options.debugShowBoundingVolume = false] - For debugging only. Draws the bounding sphere for each draw command in the model.
    * @param [options.enableDebugWireframe = false] - For debugging only. This must be set to true for debugWireframe to work in WebGL1. This cannot be set after the model has loaded.
    * @param [options.debugWireframe = false] - For debugging only. Draws the model in wireframe. Will only work for WebGL1 if enableDebugWireframe is set to true.
    * @param [options.cull = true] - Whether or not to cull the model using frustum/horizon culling. If the model is part of a 3D Tiles tileset, this property will always be false, since the 3D Tiles culling system is used.
    * @param [options.opaquePass = Pass.OPAQUE] - The pass to use in the {@link DrawCommand} for the opaque portions of the model.
    * @param [options.upAxis = Axis.Y] - The up-axis of the glTF model.
    * @param [options.forwardAxis = Axis.Z] - The forward-axis of the glTF model.
    * @param [options.customShader] - A custom shader. This will add user-defined GLSL code to the vertex and fragment shaders. Using custom shaders with a {@link Cesium3DTileStyle} may lead to undefined behavior.
    * @param [options.content] - The tile content this model belongs to. This property will be undefined if model is not loaded as part of a tileset.
    * @param [options.heightReference = HeightReference.NONE] - Determines how the model is drawn relative to terrain.
    * @param [options.scene] - Must be passed in for models that use the height reference property.
    * @param [options.distanceDisplayCondition] - The condition specifying at what distance from the camera that this model will be displayed.
    * @param [options.color] - A color that blends with the model's rendered color.
    * @param [options.colorBlendMode = ColorBlendMode.HIGHLIGHT] - Defines how the color blends with the model.
    * @param [options.colorBlendAmount = 0.5] - Value used to determine the color strength when the <code>colorBlendMode</code> is <code>MIX</code>. A value of 0.0 results in the model's rendered color while a value of 1.0 results in a solid color, with any value in-between resulting in a mix of the two.
    * @param [options.silhouetteColor = Color.RED] - The silhouette color. If more than 256 models have silhouettes enabled, there is a small chance that overlapping models will have minor artifacts.
    * @param [options.silhouetteSize = 0.0] - The size of the silhouette in pixels.
    * @param [options.enableShowOutline = true] - Whether to enable outlines for models using the {@link https://github.com/KhronosGroup/glTF/tree/master/extensions/2.0/Vendor/CESIUM_primitive_outline|CESIUM_primitive_outline} extension. This can be set false to avoid post-processing geometry at load time. When false, the showOutlines and outlineColor options are ignored.
    * @param [options.showOutline = true] - Whether to display the outline for models using the {@link https://github.com/KhronosGroup/glTF/tree/master/extensions/2.0/Vendor/CESIUM_primitive_outline|CESIUM_primitive_outline} extension. When true, outlines are displayed. When false, outlines are not displayed.
    * @param [options.outlineColor = Color.BLACK] - The color to use when rendering outlines.
    * @param [options.clippingPlanes] - The {@link ClippingPlaneCollection} used to selectively disable rendering the model.
    * @param [options.lightColor] - The light color when shading the model. When <code>undefined</code> the scene's light color is used instead.
    * @param [options.imageBasedLighting] - The properties for managing image-based lighting on this model.
    * @param [options.backFaceCulling = true] - Whether to cull back-facing geometry. When true, back face culling is determined by the material's doubleSided property; when false, back face culling is disabled. Back faces are not culled if the model's color is translucent.
    * @param [options.credit] - A credit for the data source, which is displayed on the canvas.
    * @param [options.showCreditsOnScreen = false] - Whether to display the credits of this model on screen.
    * @param [options.splitDirection = SplitDirection.NONE] - The {@link SplitDirection} split to apply to this model.
    * @param [options.projectTo2D = false] - Whether to accurately project the model's positions in 2D. If this is true, the model will be projected accurately to 2D, but it will use more memory to do so. If this is false, the model will use less memory and will still render in 2D / CV mode, but its positions may be inaccurate. This disables minimumPixelSize and prevents future modification to the model matrix. This also cannot be set after the model has loaded.
    * @param [options.featureIdLabel = "featureId_0"] - Label of the feature ID set to use for picking and styling. For EXT_mesh_features, this is the feature ID's label property, or "featureId_N" (where N is the index in the featureIds array) when not specified. EXT_feature_metadata did not have a label field, so such feature ID sets are always labeled "featureId_N" where N is the index in the list of all feature Ids, where feature ID attributes are listed before feature ID textures. If featureIdLabel is an integer N, it is converted to the string "featureId_N" automatically. If both per-primitive and per-instance feature IDs are present, the instance feature IDs take priority.
    * @param [options.instanceFeatureIdLabel = "instanceFeatureId_0"] - Label of the instance feature ID set used for picking and styling. If instanceFeatureIdLabel is set to an integer N, it is converted to the string "instanceFeatureId_N" automatically. If both per-primitive and per-instance feature IDs are present, the instance feature IDs take priority.
    * @param [options.pointCloudShading] - Options for constructing a {@link PointCloudShading} object to control point attenuation and lighting.
    * @param [options.classificationType] - Determines whether terrain, 3D Tiles or both will be classified by this model. This cannot be set after the model has loaded.
    * @returns The newly created model.
    */
  inline def fromGltf(options: Asynchronous): Model = ^.asInstanceOf[js.Dynamic].applyDynamic("fromGltf")(options.asInstanceOf[js.Any]).asInstanceOf[Model]
}
