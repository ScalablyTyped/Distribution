package typings.cornerstoneCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageLoadObject extends StObject {
  
  /** A function to cancel the image load request */
  var cancelFn: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** The Promise tracking the loading of this image */
  var promise: js.Promise[Image]
}
object ImageLoadObject {
  
  inline def apply(promise: js.Promise[Image]): ImageLoadObject = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageLoadObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageLoadObject] (val x: Self) extends AnyVal {
    
    inline def setCancelFn(value: () => Unit): Self = StObject.set(x, "cancelFn", js.Any.fromFunction0(value))
    
    inline def setCancelFnUndefined: Self = StObject.set(x, "cancelFn", js.undefined)
    
    inline def setPromise(value: js.Promise[Image]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
  }
}
