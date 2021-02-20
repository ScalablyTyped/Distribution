package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFileRequest extends StObject {
  
  /**
    * Aborts the request for a file.
    */
  def abort(): Unit = js.native
  
  /**
    * Raised when the request is complete (success or error).
    */
  var onCompleteObservable: Observable[IFileRequest] = js.native
}
object IFileRequest {
  
  @scala.inline
  def apply(abort: () => Unit, onCompleteObservable: Observable[IFileRequest]): IFileRequest = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), onCompleteObservable = onCompleteObservable.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileRequest]
  }
  
  @scala.inline
  implicit class IFileRequestMutableBuilder[Self <: IFileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnCompleteObservable(value: Observable[IFileRequest]): Self = StObject.set(x, "onCompleteObservable", value.asInstanceOf[js.Any])
  }
}
