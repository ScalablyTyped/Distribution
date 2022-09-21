package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.CompilationMessageType")
@js.native
object CompilationMessageType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.babylonjs.BABYLON.CompilationMessageType & String] = js.native
  
  /* "error" */ val Error: typings.babylonjs.BABYLON.CompilationMessageType.Error & String = js.native
  
  /* "info" */ val Info: typings.babylonjs.BABYLON.CompilationMessageType.Info & String = js.native
  
  /* "warning" */ val Warning: typings.babylonjs.BABYLON.CompilationMessageType.Warning & String = js.native
}
