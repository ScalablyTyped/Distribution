package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.DebugLayer")
@js.native
/**
  * Instantiates a new debug layer.
  * The debug layer (aka Inspector) is the go to tool in order to better understand
  * what is happening in your scene
  * @see https://doc.babylonjs.com/features/playground_debuglayer
  * @param scene Defines the scene to inspect
  */
open class DebugLayer ()
  extends StObject
     with typings.babylonjs.BABYLON.DebugLayer {
  def this(scene: typings.babylonjs.BABYLON.Scene) = this()
}
/* static members */
object DebugLayer {
  
  @JSGlobal("BABYLON.DebugLayer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Define the url to get the inspector script from.
    * By default it uses the babylonjs CDN.
    * @ignoreNaming
    */
  @JSGlobal("BABYLON.DebugLayer.InspectorURL")
  @js.native
  def InspectorURL: String = js.native
  inline def InspectorURL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InspectorURL")(x.asInstanceOf[js.Any])
}
