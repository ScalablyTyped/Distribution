package typings.babylonjs.global.BABYLON

import typings.babylonjs.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.EngineView")
@js.native
open class EngineView ()
  extends StObject
     with typings.babylonjs.BABYLON.EngineView {
  
  /** Indicates if the view is enabled (true by default) */
  /* CompleteClass */
  var enabled: Boolean = js.native
  
  /**
    * A randomly generated unique id
    */
  /* CompleteClass */
  override val id: String = js.native
  
  /** Defines the canvas where to render the view */
  /* CompleteClass */
  var target: HTMLCanvasElement = js.native
}
