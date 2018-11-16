package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This is the default material used in Babylon. It is the best trade off between quality
     * and performances.
     * @see http://doc.babylonjs.com/babylon101/materials
     */
@JSImport("babylonjs", "StandardMaterial")
@js.native
class StandardMaterial protected ()
  extends babylonjsLib.BABYLONNs.StandardMaterial {
  /**
           * Instantiates a new standard material.
           * This is the default material used in Babylon. It is the best trade off between quality
           * and performances.
           * @see http://doc.babylonjs.com/babylon101/materials
           * @param name Define the name of the material in the scene
           * @param scene Define the scene the material belong to
           */
  def this(name: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene) = this()
}

/**
     * This is the default material used in Babylon. It is the best trade off between quality
     * and performances.
     * @see http://doc.babylonjs.com/babylon101/materials
     */
@JSImport("babylonjs", "StandardMaterial")
@js.native
object StandardMaterial extends js.Object {
  /**
           * Are ambient textures enabled in the application.
           */
  var AmbientTextureEnabled: scala.Boolean = js.native
  /**
           * Are bump textures enabled in the application.
           */
  var BumpTextureEnabled: scala.Boolean = js.native
  /**
           * Are color grading textures enabled in the application.
           */
  var ColorGradingTextureEnabled: scala.Boolean = js.native
  /**
           * Are diffuse textures enabled in the application.
           */
  var DiffuseTextureEnabled: scala.Boolean = js.native
  /**
           * Are emissive textures enabled in the application.
           */
  var EmissiveTextureEnabled: scala.Boolean = js.native
  /**
           * Are fresnels enabled in the application.
           */
  var FresnelEnabled: scala.Boolean = js.native
  /**
           * Are lightmap textures enabled in the application.
           */
  var LightmapTextureEnabled: scala.Boolean = js.native
  /**
           * Are opacity textures enabled in the application.
           */
  var OpacityTextureEnabled: scala.Boolean = js.native
  /**
           * Are reflection textures enabled in the application.
           */
  var ReflectionTextureEnabled: scala.Boolean = js.native
  /**
           * Are refraction textures enabled in the application.
           */
  var RefractionTextureEnabled: scala.Boolean = js.native
  /**
           * Are specular textures enabled in the application.
           */
  var SpecularTextureEnabled: scala.Boolean = js.native
  var _AmbientTextureEnabled: js.Any = js.native
  var _BumpTextureEnabled: js.Any = js.native
  var _ColorGradingTextureEnabled: js.Any = js.native
  var _DiffuseTextureEnabled: js.Any = js.native
  var _EmissiveTextureEnabled: js.Any = js.native
  var _FresnelEnabled: js.Any = js.native
  var _LightmapTextureEnabled: js.Any = js.native
  var _OpacityTextureEnabled: js.Any = js.native
  var _ReflectionTextureEnabled: js.Any = js.native
  var _RefractionTextureEnabled: js.Any = js.native
  var _SpecularTextureEnabled: js.Any = js.native
  /**
           * Creates a standard material from parsed material data
           * @param source defines the JSON represnetation of the material
           * @param scene defines the hosting scene
           * @param rootUrl defines the root URL to use to load textures and relative dependencies
           * @returns a new material
           */
  def Parse(source: js.Any, scene: babylonjsLib.BABYLONNs.Scene, rootUrl: java.lang.String): babylonjsLib.BABYLONNs.StandardMaterial = js.native
}

