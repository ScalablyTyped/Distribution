package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result of transcoding a basis file
  */
@JSGlobal("BABYLON.TranscodeResult")
@js.native
open class TranscodeResult ()
  extends StObject
     with typings.babylonjs.BABYLON.TranscodeResult {
  
  /**
    * Info about the .basis file
    */
  /* CompleteClass */
  var fileInfo: typings.babylonjs.BABYLON.BasisFileInfo = js.native
  
  /**
    * Format to use when loading the file
    */
  /* CompleteClass */
  var format: Double = js.native
}
