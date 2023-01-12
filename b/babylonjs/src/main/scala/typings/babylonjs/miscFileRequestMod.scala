package typings.babylonjs

import typings.babylonjs.miscObservableMod.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscFileRequestMod {
  
  trait IFileRequest extends StObject {
    
    /**
      * Aborts the request for a file.
      */
    def abort(): Unit
    
    /**
      * Raised when the request is complete (success or error).
      */
    var onCompleteObservable: Observable[IFileRequest]
  }
  object IFileRequest {
    
    inline def apply(abort: () => Unit, onCompleteObservable: Observable[IFileRequest]): IFileRequest = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), onCompleteObservable = onCompleteObservable.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFileRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFileRequest] (val x: Self) extends AnyVal {
      
      inline def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
      
      inline def setOnCompleteObservable(value: Observable[IFileRequest]): Self = StObject.set(x, "onCompleteObservable", value.asInstanceOf[js.Any])
    }
  }
}
