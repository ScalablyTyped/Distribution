package typings.awsSdk.ioteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableActionConfiguration extends StObject {
  
  /**
    * The note that you can leave when you disable the alarm.
    */
  var note: js.UndefOr[Note] = js.undefined
}
object DisableActionConfiguration {
  
  inline def apply(): DisableActionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableActionConfiguration]
  }
  
  extension [Self <: DisableActionConfiguration](x: Self) {
    
    inline def setNote(value: Note): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
  }
}
