package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecuteCodeAction
  extends StObject
     with Action {
  
  /**
    * The callback function to run.
    */
  def func(evt: ActionEvent): Unit = js.native
}
