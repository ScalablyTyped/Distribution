package typings.cypress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Abort extends StObject {
  
  var abort: js.Array[Any]
  
  var error: js.Array[Any]
  
  var load: js.Array[Any]
  
  var progress: js.Array[Any]
}
object Abort {
  
  inline def apply(abort: js.Array[Any], error: js.Array[Any], load: js.Array[Any], progress: js.Array[Any]): Abort = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[Abort]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Abort] (val x: Self) extends AnyVal {
    
    inline def setAbort(value: js.Array[Any]): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
    
    inline def setAbortVarargs(value: Any*): Self = StObject.set(x, "abort", js.Array(value*))
    
    inline def setError(value: js.Array[Any]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorVarargs(value: Any*): Self = StObject.set(x, "error", js.Array(value*))
    
    inline def setLoad(value: js.Array[Any]): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    inline def setLoadVarargs(value: Any*): Self = StObject.set(x, "load", js.Array(value*))
    
    inline def setProgress(value: js.Array[Any]): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressVarargs(value: Any*): Self = StObject.set(x, "progress", js.Array(value*))
  }
}
