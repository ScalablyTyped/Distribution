package typings.azureCoreHttpCompat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransferProgressEvent extends StObject {
  
  /**
    * The number of bytes loaded so far.
    */
  var loadedBytes: Double
}
object TransferProgressEvent {
  
  inline def apply(loadedBytes: Double): TransferProgressEvent = {
    val __obj = js.Dynamic.literal(loadedBytes = loadedBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferProgressEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransferProgressEvent] (val x: Self) extends AnyVal {
    
    inline def setLoadedBytes(value: Double): Self = StObject.set(x, "loadedBytes", value.asInstanceOf[js.Any])
  }
}
