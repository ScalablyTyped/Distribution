package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EquiRectangularCubeTextureAssetTask
  extends AbstractAssetTask
     with ITextureAssetTask[EquiRectangularCubeTexture] {
  
  /**
    * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space,
    * but the standard material would require them in Gamma space) (default is true)
    */
  var gammaSpace: Boolean = js.native
  
  /**
    * Defines if mipmaps should not be generated (default is false)
    */
  var noMipmap: Boolean = js.native
  
  /**
    * Callback called when the task is successful
    */
  def onError(task: EquiRectangularCubeTextureAssetTask): Unit = js.native
  def onError(task: EquiRectangularCubeTextureAssetTask, message: js.UndefOr[scala.Nothing], exception: js.Any): Unit = js.native
  def onError(task: EquiRectangularCubeTextureAssetTask, message: String): Unit = js.native
  def onError(task: EquiRectangularCubeTextureAssetTask, message: String, exception: js.Any): Unit = js.native
  
  /**
    * Callback called when the task is successful
    */
  def onSuccess(task: EquiRectangularCubeTextureAssetTask): Unit = js.native
  
  /**
    * Defines the desired size (the more it increases the longer the generation will be)
    */
  var size: Double = js.native
  
  /**
    * Defines the location of the file to load
    */
  var url: String = js.native
}
