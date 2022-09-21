package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.arrowkeysobserverMod.ArrowKeysObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ckeditorCkeditor5EngineSrcViewViewAugmentingMod {
  
  trait Observers extends StObject {
    
    var ArrowKeysObserver: typings.ckeditorCkeditor5Engine.arrowkeysobserverMod.ArrowKeysObserver
  }
  object Observers {
    
    inline def apply(ArrowKeysObserver: ArrowKeysObserver): Observers = {
      val __obj = js.Dynamic.literal(ArrowKeysObserver = ArrowKeysObserver.asInstanceOf[js.Any])
      __obj.asInstanceOf[Observers]
    }
    
    extension [Self <: Observers](x: Self) {
      
      inline def setArrowKeysObserver(value: ArrowKeysObserver): Self = StObject.set(x, "ArrowKeysObserver", value.asInstanceOf[js.Any])
    }
  }
}
