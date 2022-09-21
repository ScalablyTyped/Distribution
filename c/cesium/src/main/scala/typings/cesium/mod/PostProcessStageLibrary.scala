package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PostProcessStageLibrary {
  
  @JSImport("cesium", "PostProcessStageLibrary")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a post-process stage that renders the input texture with black and white gradations.
    * <p>
    * This stage has one uniform value, <code>gradations</code>, which scales the luminance of each pixel.
    * </p>
    * @returns A post-process stage that renders the input texture with black and white gradations.
    */
  inline def createBlackAndWhiteStage(): PostProcessStage = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlackAndWhiteStage")().asInstanceOf[PostProcessStage]
  
  /**
    * Creates a post-process stage that applies a Gaussian blur to the input texture. This stage is usually applied in conjunction with another stage.
    * <p>
    * This stage has the following uniforms: <code>delta</code>, <code>sigma</code>, and <code>stepSize</code>.
    * </p>
    * <p>
    * <code>delta</code> and <code>sigma</code> are used to compute the weights of a Gaussian filter. The equation is <code>exp((-0.5 * delta * delta) / (sigma * sigma))</code>.
    * The default value for <code>delta</code> is <code>1.0</code>. The default value for <code>sigma</code> is <code>2.0</code>.
    * <code>stepSize</code> is the distance to the next texel. The default is <code>1.0</code>.
    * </p>
    * @returns A post-process stage that applies a Gaussian blur to the input texture.
    */
  inline def createBlurStage(): PostProcessStageComposite = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlurStage")().asInstanceOf[PostProcessStageComposite]
  
  /**
    * Creates a post-process stage that saturates the input texture.
    * <p>
    * This stage has one uniform value, <code>brightness</code>, which scales the saturation of each pixel.
    * </p>
    * @returns A post-process stage that saturates the input texture.
    */
  inline def createBrightnessStage(): PostProcessStage = ^.asInstanceOf[js.Dynamic].applyDynamic("createBrightnessStage")().asInstanceOf[PostProcessStage]
  
  /**
    * Creates a post-process stage that applies a depth of field effect.
    * <p>
    * Depth of field simulates camera focus. Objects in the scene that are in focus
    * will be clear whereas objects not in focus will be blurred.
    * </p>
    * <p>
    * This stage has the following uniforms: <code>focalDistance</code>, <code>delta</code>, <code>sigma</code>, and <code>stepSize</code>.
    * </p>
    * <p>
    * <code>focalDistance</code> is the distance in meters from the camera to set the camera focus.
    * </p>
    * <p>
    * <code>delta</code>, <code>sigma</code>, and <code>stepSize</code> are the same properties as {@link PostProcessStageLibrary#createBlurStage}.
    * The blur is applied to the areas out of focus.
    * </p>
    * @returns A post-process stage that applies a depth of field effect.
    */
  inline def createDepthOfFieldStage(): PostProcessStageComposite = ^.asInstanceOf[js.Dynamic].applyDynamic("createDepthOfFieldStage")().asInstanceOf[PostProcessStageComposite]
  
  /**
    * Creates a post-process stage that detects edges.
    * <p>
    * Writes the color to the output texture with alpha set to 1.0 when it is on an edge.
    * </p>
    * <p>
    * This stage has the following uniforms: <code>color</code> and <code>length</code>
    * </p>
    * <ul>
    * <li><code>color</code> is the color of the highlighted edge. The default is {@link Color#BLACK}.</li>
    * <li><code>length</code> is the length of the edges in pixels. The default is <code>0.5</code>.</li>
    * </ul>
    * <p>
    * This stage is not supported in 2D.
    * </p>
    * @example
    * // multiple silhouette effects
    * const yellowEdge = Cesium.PostProcessLibrary.createEdgeDetectionStage();
    * yellowEdge.uniforms.color = Cesium.Color.YELLOW;
    * yellowEdge.selected = [feature0];
    *
    * const greenEdge = Cesium.PostProcessLibrary.createEdgeDetectionStage();
    * greenEdge.uniforms.color = Cesium.Color.LIME;
    * greenEdge.selected = [feature1];
    *
    * // draw edges around feature0 and feature1
    * postProcessStages.add(Cesium.PostProcessLibrary.createSilhouetteStage([yellowEdge, greenEdge]);
    * @returns A post-process stage that applies an edge detection effect.
    */
  inline def createEdgeDetectionStage(): PostProcessStage = ^.asInstanceOf[js.Dynamic].applyDynamic("createEdgeDetectionStage")().asInstanceOf[PostProcessStage]
  
  /**
    * Creates a post-process stage that applies an effect simulating light flaring a camera lens.
    * <p>
    * This stage has the following uniforms: <code>dirtTexture</code>, <code>starTexture</code>, <code>intensity</code>, <code>distortion</code>, <code>ghostDispersal</code>,
    * <code>haloWidth</code>, <code>dirtAmount</code>, and <code>earthRadius</code>.
    * <ul>
    * <li><code>dirtTexture</code> is a texture sampled to simulate dirt on the lens.</li>
    * <li><code>starTexture</code> is the texture sampled for the star pattern of the flare.</li>
    * <li><code>intensity</code> is a scalar multiplied by the result of the lens flare. The default value is <code>2.0</code>.</li>
    * <li><code>distortion</code> is a scalar value that affects the chromatic effect distortion. The default value is <code>10.0</code>.</li>
    * <li><code>ghostDispersal</code> is a scalar indicating how far the halo effect is from the center of the texture. The default value is <code>0.4</code>.</li>
    * <li><code>haloWidth</code> is a scalar representing the width of the halo  from the ghost dispersal. The default value is <code>0.4</code>.</li>
    * <li><code>dirtAmount</code> is a scalar representing the amount of dirt on the lens. The default value is <code>0.4</code>.</li>
    * <li><code>earthRadius</code> is the maximum radius of the earth. The default value is <code>Ellipsoid.WGS84.maximumRadius</code>.</li>
    * </ul>
    * </p>
    * @returns A post-process stage for applying a lens flare effect.
    */
  inline def createLensFlareStage(): PostProcessStage = ^.asInstanceOf[js.Dynamic].applyDynamic("createLensFlareStage")().asInstanceOf[PostProcessStage]
  
  /**
    * Creates a post-process stage that adds a night vision effect to the input texture.
    * @returns A post-process stage that adds a night vision effect to the input texture.
    */
  inline def createNightVisionStage(): PostProcessStage = ^.asInstanceOf[js.Dynamic].applyDynamic("createNightVisionStage")().asInstanceOf[PostProcessStage]
  
  /**
    * Creates a post-process stage that applies a silhouette effect.
    * <p>
    * A silhouette effect composites the color from the edge detection pass with input color texture.
    * </p>
    * <p>
    * This stage has the following uniforms when <code>edgeDetectionStages</code> is <code>undefined</code>: <code>color</code> and <code>length</code>
    * </p>
    * <p>
    * <code>color</code> is the color of the highlighted edge. The default is {@link Color#BLACK}.
    * <code>length</code> is the length of the edges in pixels. The default is <code>0.5</code>.
    * </p>
    * @param [edgeDetectionStages] - An array of edge detection post process stages.
    * @returns A post-process stage that applies a silhouette effect.
    */
  inline def createSilhouetteStage(): PostProcessStageComposite = ^.asInstanceOf[js.Dynamic].applyDynamic("createSilhouetteStage")().asInstanceOf[PostProcessStageComposite]
  inline def createSilhouetteStage(edgeDetectionStages: js.Array[PostProcessStage]): PostProcessStageComposite = ^.asInstanceOf[js.Dynamic].applyDynamic("createSilhouetteStage")(edgeDetectionStages.asInstanceOf[js.Any]).asInstanceOf[PostProcessStageComposite]
  
  /**
    * Whether or not an ambient occlusion stage is supported.
    * <p>
    * This stage requires the WEBGL_depth_texture extension.
    * </p>
    * @param scene - The scene.
    * @returns Whether this post process stage is supported.
    */
  inline def isAmbientOcclusionSupported(scene: Scene): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAmbientOcclusionSupported")(scene.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Whether or not a depth of field stage is supported.
    * <p>
    * This stage requires the WEBGL_depth_texture extension.
    * </p>
    * @param scene - The scene.
    * @returns Whether this post process stage is supported.
    */
  inline def isDepthOfFieldSupported(scene: Scene): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDepthOfFieldSupported")(scene.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Whether or not an edge detection stage is supported.
    * <p>
    * This stage requires the WEBGL_depth_texture extension.
    * </p>
    * @param scene - The scene.
    * @returns Whether this post process stage is supported.
    */
  inline def isEdgeDetectionSupported(scene: Scene): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEdgeDetectionSupported")(scene.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Whether or not a silhouette stage is supported.
    * <p>
    * This stage requires the WEBGL_depth_texture extension.
    * </p>
    * @param scene - The scene.
    * @returns Whether this post process stage is supported.
    */
  inline def isSilhouetteSupported(scene: Scene): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSilhouetteSupported")(scene.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
