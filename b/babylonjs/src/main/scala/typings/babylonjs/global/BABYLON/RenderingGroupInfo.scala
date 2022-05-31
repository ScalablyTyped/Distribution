package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.RenderingGroupInfo")
@js.native
class RenderingGroupInfo ()
  extends StObject
     with typings.babylonjs.BABYLON.RenderingGroupInfo {
  
  /**
    * The camera currently used for the rendering pass
    */
  /* CompleteClass */
  var camera: Nullable[typings.babylonjs.BABYLON.Camera] = js.native
  
  /**
    * The ID of the renderingGroup being processed
    */
  /* CompleteClass */
  var renderingGroupId: Double = js.native
  
  /**
    * The Scene that being rendered
    */
  /* CompleteClass */
  var scene: typings.babylonjs.BABYLON.Scene = js.native
}
