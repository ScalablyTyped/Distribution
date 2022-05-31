package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HDRCubeTextureAssetTask
  extends StObject
     with AbstractAssetTask
     with ITextureAssetTask[HDRCubeTexture] {
  
  /**
    * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
    */
  var gammaSpace: Boolean = js.native
  
  /**
    * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
    */
  var generateHarmonics: Boolean = js.native
  
  /**
    * Defines if mipmaps should not be generated (default is false)
    */
  var noMipmap: Boolean = js.native
  
  /**
    * Callback called when the task is successful
    */
  def onError(task: HDRCubeTextureAssetTask): Unit = js.native
  def onError(task: HDRCubeTextureAssetTask, message: String): Unit = js.native
  def onError(task: HDRCubeTextureAssetTask, message: String, exception: js.Any): Unit = js.native
  def onError(task: HDRCubeTextureAssetTask, message: Unit, exception: js.Any): Unit = js.native
  
  /**
    * Callback called when the task is successful
    */
  def onSuccess(task: HDRCubeTextureAssetTask): Unit = js.native
  
  /**
    * Internal Use Only
    */
  var reserved: Boolean = js.native
  
  /**
    * Defines the desired size (the more it increases the longer the generation will be)
    */
  var size: Double = js.native
  
  /**
    * Defines the location of the file to load
    */
  var url: String = js.native
}
