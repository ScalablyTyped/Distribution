package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Class used to store 3D textures containing user data
     */
@JSGlobal("BABYLON.RawTexture3D")
@js.native
class RawTexture3D protected () extends Texture {
  /**
           * Create a new RawTexture3D
           * @param data defines the data of the texture
           * @param width defines the width of the texture
           * @param height defines the height of the texture
           * @param depth defines the depth of the texture
           * @param format defines the texture format to use
           * @param scene defines the hosting scene
           * @param generateMipMaps defines a boolean indicating if mip levels should be generated (true by default)
           * @param invertY defines if texture must be stored with Y axis inverted
           * @param samplingMode defines the sampling mode to use (BABYLON.Texture.TRILINEAR_SAMPLINGMODE by default)
           * @param textureType defines the texture Type (Engine.TEXTURETYPE_UNSIGNED_INT, Engine.TEXTURETYPE_FLOAT...)
           */
  def this(data: stdLib.ArrayBufferView, width: scala.Double, height: scala.Double, depth: scala.Double, /** Gets or sets the texture format to use */
  format: scala.Double, scene: Scene) = this()
  /**
           * Create a new RawTexture3D
           * @param data defines the data of the texture
           * @param width defines the width of the texture
           * @param height defines the height of the texture
           * @param depth defines the depth of the texture
           * @param format defines the texture format to use
           * @param scene defines the hosting scene
           * @param generateMipMaps defines a boolean indicating if mip levels should be generated (true by default)
           * @param invertY defines if texture must be stored with Y axis inverted
           * @param samplingMode defines the sampling mode to use (BABYLON.Texture.TRILINEAR_SAMPLINGMODE by default)
           * @param textureType defines the texture Type (Engine.TEXTURETYPE_UNSIGNED_INT, Engine.TEXTURETYPE_FLOAT...)
           */
  def this(data: stdLib.ArrayBufferView, width: scala.Double, height: scala.Double, depth: scala.Double, /** Gets or sets the texture format to use */
  format: scala.Double, scene: Scene, generateMipMaps: scala.Boolean) = this()
  /**
           * Create a new RawTexture3D
           * @param data defines the data of the texture
           * @param width defines the width of the texture
           * @param height defines the height of the texture
           * @param depth defines the depth of the texture
           * @param format defines the texture format to use
           * @param scene defines the hosting scene
           * @param generateMipMaps defines a boolean indicating if mip levels should be generated (true by default)
           * @param invertY defines if texture must be stored with Y axis inverted
           * @param samplingMode defines the sampling mode to use (BABYLON.Texture.TRILINEAR_SAMPLINGMODE by default)
           * @param textureType defines the texture Type (Engine.TEXTURETYPE_UNSIGNED_INT, Engine.TEXTURETYPE_FLOAT...)
           */
  def this(data: stdLib.ArrayBufferView, width: scala.Double, height: scala.Double, depth: scala.Double, /** Gets or sets the texture format to use */
  format: scala.Double, scene: Scene, generateMipMaps: scala.Boolean, invertY: scala.Boolean) = this()
  /**
           * Create a new RawTexture3D
           * @param data defines the data of the texture
           * @param width defines the width of the texture
           * @param height defines the height of the texture
           * @param depth defines the depth of the texture
           * @param format defines the texture format to use
           * @param scene defines the hosting scene
           * @param generateMipMaps defines a boolean indicating if mip levels should be generated (true by default)
           * @param invertY defines if texture must be stored with Y axis inverted
           * @param samplingMode defines the sampling mode to use (BABYLON.Texture.TRILINEAR_SAMPLINGMODE by default)
           * @param textureType defines the texture Type (Engine.TEXTURETYPE_UNSIGNED_INT, Engine.TEXTURETYPE_FLOAT...)
           */
  def this(data: stdLib.ArrayBufferView, width: scala.Double, height: scala.Double, depth: scala.Double, /** Gets or sets the texture format to use */
  format: scala.Double, scene: Scene, generateMipMaps: scala.Boolean, invertY: scala.Boolean, samplingMode: scala.Double) = this()
  /**
           * Create a new RawTexture3D
           * @param data defines the data of the texture
           * @param width defines the width of the texture
           * @param height defines the height of the texture
           * @param depth defines the depth of the texture
           * @param format defines the texture format to use
           * @param scene defines the hosting scene
           * @param generateMipMaps defines a boolean indicating if mip levels should be generated (true by default)
           * @param invertY defines if texture must be stored with Y axis inverted
           * @param samplingMode defines the sampling mode to use (BABYLON.Texture.TRILINEAR_SAMPLINGMODE by default)
           * @param textureType defines the texture Type (Engine.TEXTURETYPE_UNSIGNED_INT, Engine.TEXTURETYPE_FLOAT...)
           */
  def this(data: stdLib.ArrayBufferView, width: scala.Double, height: scala.Double, depth: scala.Double, /** Gets or sets the texture format to use */
  format: scala.Double, scene: Scene, generateMipMaps: scala.Boolean, invertY: scala.Boolean, samplingMode: scala.Double, textureType: scala.Double) = this()
  var _engine: js.Any = js.native
  /** Gets or sets the texture format to use */
  var format: scala.Double = js.native
  /**
           * Update the texture with new data
           * @param data defines the data to store in the texture
           */
  def update(data: stdLib.ArrayBufferView): scala.Unit = js.native
}

