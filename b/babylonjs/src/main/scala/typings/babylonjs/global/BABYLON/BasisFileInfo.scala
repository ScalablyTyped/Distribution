package typings.babylonjs.global.BABYLON

import typings.babylonjs.anon.Levels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Info about the .basis files
  */
@JSGlobal("BABYLON.BasisFileInfo")
@js.native
open class BasisFileInfo ()
  extends StObject
     with typings.babylonjs.BABYLON.BasisFileInfo {
  
  /**
    * If the file has alpha
    */
  /* CompleteClass */
  var hasAlpha: Boolean = js.native
  
  /**
    * Info about each image of the basis file
    */
  /* CompleteClass */
  var images: js.Array[Levels] = js.native
}
