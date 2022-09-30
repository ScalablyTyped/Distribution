package typings.babylonjs.global.BABYLON

import typings.babylonjs.babylonjsInts.`0`
import typings.babylonjs.babylonjsInts.`1000`
import typings.babylonjs.babylonjsInts.`2000`
import typings.babylonjs.babylonjsInts.`3000`
import typings.babylonjs.babylonjsInts.`4000`
import typings.babylonjs.babylonjsInts.`4001`
import typings.babylonjs.babylonjsInts.`4002`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ErrorCodes {
  
  /** Unexpected magic number found in GLTF file header. */
  @JSGlobal("BABYLON.ErrorCodes.GLTFLoaderUnexpectedMagicError")
  @js.native
  val GLTFLoaderUnexpectedMagicError: `2000` = js.native
  
  /** Load file error */
  @JSGlobal("BABYLON.ErrorCodes.LoadFileError")
  @js.native
  val LoadFileError: `4000` = js.native
  
  /** Invalid or empty mesh vertex positions. */
  @JSGlobal("BABYLON.ErrorCodes.MeshInvalidPositionsError")
  @js.native
  val MeshInvalidPositionsError: `0` = js.native
  
  /** Read file error */
  @JSGlobal("BABYLON.ErrorCodes.ReadFileError")
  @js.native
  val ReadFileError: `4002` = js.native
  
  /** Request file error */
  @JSGlobal("BABYLON.ErrorCodes.RequestFileError")
  @js.native
  val RequestFileError: `4001` = js.native
  
  /** SceneLoader generic error code. Ideally wraps the inner exception. */
  @JSGlobal("BABYLON.ErrorCodes.SceneLoaderError")
  @js.native
  val SceneLoaderError: `3000` = js.native
  
  /** Unsupported texture found. */
  @JSGlobal("BABYLON.ErrorCodes.UnsupportedTextureError")
  @js.native
  val UnsupportedTextureError: `1000` = js.native
}
