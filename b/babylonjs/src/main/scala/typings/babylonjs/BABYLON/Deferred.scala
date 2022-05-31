package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deferred[T] extends StObject {
  
  /* private */ var _reject: js.Any = js.native
  
  /* private */ var _resolve: js.Any = js.native
  
  /**
    * The promise associated with this deferred object.
    */
  val promise: js.Promise[T] = js.native
  
  /**
    * The reject method of the promise associated with this deferred object.
    */
  def reject: js.Function1[/* reason */ js.UndefOr[js.Any], Unit] = js.native
  
  /**
    * The resolve method of the promise associated with this deferred object.
    */
  def resolve: js.Function1[/* value */ js.UndefOr[T | js.Thenable[T]], Unit] = js.native
}
