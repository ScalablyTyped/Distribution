package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AssetTaskState extends StObject
@JSGlobal("BABYLON.AssetTaskState")
@js.native
object AssetTaskState extends StObject {
  
  /**
    * Done
    */
  @js.native
  sealed trait DONE
    extends StObject
       with AssetTaskState
  
  /**
    * Error
    */
  @js.native
  sealed trait ERROR
    extends StObject
       with AssetTaskState
  
  /**
    * Initialization
    */
  @js.native
  sealed trait INIT
    extends StObject
       with AssetTaskState
  
  /**
    * Running
    */
  @js.native
  sealed trait RUNNING
    extends StObject
       with AssetTaskState
}
