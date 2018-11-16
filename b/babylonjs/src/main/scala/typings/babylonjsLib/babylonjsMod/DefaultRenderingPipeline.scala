package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The default rendering pipeline can be added to a scene to apply common post processing effects such as anti-aliasing or depth of field.
     * See https://doc.babylonjs.com/how_to/using_default_rendering_pipeline
     */
@JSImport("babylonjs", "DefaultRenderingPipeline")
@js.native
class DefaultRenderingPipeline ()
  extends babylonjsLib.BABYLONNs.DefaultRenderingPipeline {
  /**
           * @constructor
           * @param name - The rendering pipeline name (default: "")
           * @param hdr - If high dynamic range textures should be used (default: true)
           * @param scene - The scene linked to this pipeline (default: the last created scene)
           * @param cameras - The array of cameras that the rendering pipeline will be attached to (default: scene.cameras)
           * @param automaticBuild - if false, you will have to manually call prepare() to update the pipeline (default: true)
           */
  def this(name: java.lang.String) = this()
  /**
           * @constructor
           * @param name - The rendering pipeline name (default: "")
           * @param hdr - If high dynamic range textures should be used (default: true)
           * @param scene - The scene linked to this pipeline (default: the last created scene)
           * @param cameras - The array of cameras that the rendering pipeline will be attached to (default: scene.cameras)
           * @param automaticBuild - if false, you will have to manually call prepare() to update the pipeline (default: true)
           */
  def this(name: java.lang.String, hdr: scala.Boolean) = this()
  /**
           * @constructor
           * @param name - The rendering pipeline name (default: "")
           * @param hdr - If high dynamic range textures should be used (default: true)
           * @param scene - The scene linked to this pipeline (default: the last created scene)
           * @param cameras - The array of cameras that the rendering pipeline will be attached to (default: scene.cameras)
           * @param automaticBuild - if false, you will have to manually call prepare() to update the pipeline (default: true)
           */
  def this(name: java.lang.String, hdr: scala.Boolean, scene: babylonjsLib.BABYLONNs.Scene) = this()
  /**
           * @constructor
           * @param name - The rendering pipeline name (default: "")
           * @param hdr - If high dynamic range textures should be used (default: true)
           * @param scene - The scene linked to this pipeline (default: the last created scene)
           * @param cameras - The array of cameras that the rendering pipeline will be attached to (default: scene.cameras)
           * @param automaticBuild - if false, you will have to manually call prepare() to update the pipeline (default: true)
           */
  def this(name: java.lang.String, hdr: scala.Boolean, scene: babylonjsLib.BABYLONNs.Scene, cameras: js.Array[babylonjsLib.BABYLONNs.Camera]) = this()
  /**
           * @constructor
           * @param name - The rendering pipeline name (default: "")
           * @param hdr - If high dynamic range textures should be used (default: true)
           * @param scene - The scene linked to this pipeline (default: the last created scene)
           * @param cameras - The array of cameras that the rendering pipeline will be attached to (default: scene.cameras)
           * @param automaticBuild - if false, you will have to manually call prepare() to update the pipeline (default: true)
           */
  def this(name: java.lang.String, hdr: scala.Boolean, scene: babylonjsLib.BABYLONNs.Scene, cameras: js.Array[babylonjsLib.BABYLONNs.Camera], automaticBuild: scala.Boolean) = this()
}

/**
     * The default rendering pipeline can be added to a scene to apply common post processing effects such as anti-aliasing or depth of field.
     * See https://doc.babylonjs.com/how_to/using_default_rendering_pipeline
     */
@JSImport("babylonjs", "DefaultRenderingPipeline")
@js.native
object DefaultRenderingPipeline extends js.Object {
  /**
           * Parse the serialized pipeline
           * @param source Source pipeline.
           * @param scene The scene to load the pipeline to.
           * @param rootUrl The URL of the serialized pipeline.
           * @returns An instantiated pipeline from the serialized object.
           */
  def Parse(source: js.Any, scene: babylonjsLib.BABYLONNs.Scene, rootUrl: java.lang.String): babylonjsLib.BABYLONNs.DefaultRenderingPipeline = js.native
}

