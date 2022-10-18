package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "EquiRectangularCubeTextureAssetTask")
@js.native
open class EquiRectangularCubeTextureAssetTask protected ()
  extends typings.babylonjs.legacyLegacyMod.EquiRectangularCubeTextureAssetTask {
  /**
    * Creates a new EquiRectangularCubeTextureAssetTask object
    * @param name defines the name of the task
    * @param url defines the location of the file to load
    * @param size defines the desired size (the more it increases the longer the generation will be)
    * If the size is omitted this implies you are using a preprocessed cubemap.
    * @param noMipmap defines if mipmaps should not be generated (default is false)
    * @param gammaSpace specifies if the texture will be used in gamma or linear space
    * (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space)
    * (default is true)
    */
  def this(
    /**
    * Defines the name of the task
    */
  name: String,
    /**
    * Defines the location of the file to load
    */
  url: String,
    /**
    * Defines the desired size (the more it increases the longer the generation will be)
    */
  size: Double
  ) = this()
  def this(
    /**
    * Defines the name of the task
    */
  name: String,
    /**
    * Defines the location of the file to load
    */
  url: String,
    /**
    * Defines the desired size (the more it increases the longer the generation will be)
    */
  size: Double,
    /**
    * Defines if mipmaps should not be generated (default is false)
    */
  noMipmap: Boolean
  ) = this()
  def this(
    /**
    * Defines the name of the task
    */
  name: String,
    /**
    * Defines the location of the file to load
    */
  url: String,
    /**
    * Defines the desired size (the more it increases the longer the generation will be)
    */
  size: Double,
    /**
    * Defines if mipmaps should not be generated (default is false)
    */
  noMipmap: Boolean,
    /**
    * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space,
    * but the standard material would require them in Gamma space) (default is true)
    */
  gammaSpace: Boolean
  ) = this()
  def this(
    /**
    * Defines the name of the task
    */
  name: String,
    /**
    * Defines the location of the file to load
    */
  url: String,
    /**
    * Defines the desired size (the more it increases the longer the generation will be)
    */
  size: Double,
    /**
    * Defines if mipmaps should not be generated (default is false)
    */
  noMipmap: Unit,
    /**
    * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space,
    * but the standard material would require them in Gamma space) (default is true)
    */
  gammaSpace: Boolean
  ) = this()
}
