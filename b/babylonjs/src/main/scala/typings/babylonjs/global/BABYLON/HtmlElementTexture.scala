package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IHtmlElementTextureOptions
import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.HTMLCanvasElement
import typings.babylonjs.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.HtmlElementTexture")
@js.native
class HtmlElementTexture protected ()
  extends StObject
     with typings.babylonjs.BABYLON.HtmlElementTexture {
  def this(name: String, element: HTMLCanvasElement, options: IHtmlElementTextureOptions) = this()
  /**
    * Instantiates a HtmlElementTexture from the following parameters.
    *
    * @param name Defines the name of the texture
    * @param element Defines the video or canvas the texture is filled with
    * @param options Defines the other none mandatory texture creation options
    */
  def this(name: String, element: HTMLVideoElement, options: IHtmlElementTextureOptions) = this()
  
  /**
    * Array of animations
    */
  /* CompleteClass */
  var animations: Nullable[js.Array[typings.babylonjs.BABYLON.Animation]] = js.native
}
/* static members */
object HtmlElementTexture {
  
  @JSGlobal("BABYLON.HtmlElementTexture.DefaultOptions")
  @js.native
  val DefaultOptions: js.Any = js.native
}
