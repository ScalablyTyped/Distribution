package typings.cesium

import typings.cesium.anon.Asynchronous
import typings.cesium.mod.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceSceneModelModelMod {
  
  @JSImport("cesium/Source/Scene/Model/Model", JSImport.Default)
  @js.native
  open class default () extends Model
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Scene/Model/Model", JSImport.Default)
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
}
