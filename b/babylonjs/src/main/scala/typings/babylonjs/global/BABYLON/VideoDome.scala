package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Behavior
import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.VideoDome")
@js.native
class VideoDome ()
  extends StObject
     with typings.babylonjs.BABYLON.VideoDome {
  
  /**
    * Attach a behavior
    * @param behavior defines the behavior to attach
    * @returns the current host
    */
  /* CompleteClass */
  override def addBehavior(behavior: Behavior[typings.babylonjs.BABYLON.Node]): typings.babylonjs.BABYLON.Node = js.native
  
  /**
    * Gets a behavior using its name to search
    * @param name defines the name to search
    * @returns the behavior or null if not found
    */
  /* CompleteClass */
  override def getBehaviorByName(name: String): Nullable[Behavior[typings.babylonjs.BABYLON.Node]] = js.native
  
  /**
    * Remove a behavior from the current object
    * @param behavior defines the behavior to detach
    * @returns the current host
    */
  /* CompleteClass */
  override def removeBehavior(behavior: Behavior[typings.babylonjs.BABYLON.Node]): typings.babylonjs.BABYLON.Node = js.native
}
/* static members */
object VideoDome {
  
  /**
    * Define the video source as a Monoscopic panoramic 360 video.
    */
  @JSGlobal("BABYLON.VideoDome.MODE_MONOSCOPIC")
  @js.native
  val MODE_MONOSCOPIC: Double = js.native
  
  /**
    * Define the video source as a Stereoscopic Side by Side panoramic 360 video.
    */
  @JSGlobal("BABYLON.VideoDome.MODE_SIDEBYSIDE")
  @js.native
  val MODE_SIDEBYSIDE: Double = js.native
  
  /**
    * Define the video source as a Stereoscopic TopBottom/OverUnder panoramic 360 video.
    */
  @JSGlobal("BABYLON.VideoDome.MODE_TOPBOTTOM")
  @js.native
  val MODE_TOPBOTTOM: Double = js.native
}
