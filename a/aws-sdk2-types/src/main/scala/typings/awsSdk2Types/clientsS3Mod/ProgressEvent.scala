package typings.awsSdk2Types.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressEvent extends StObject {
  
  /**
    * The Progress event details.
    */
  var Details: js.UndefOr[Progress] = js.undefined
}
object ProgressEvent {
  
  inline def apply(): ProgressEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProgressEvent] (val x: Self) extends AnyVal {
    
    inline def setDetails(value: Progress): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "Details", js.undefined)
  }
}
