package typings.debessmann

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("debessmann", "DM")
  @js.native
  class DM () extends StObject {
    
    def init(endpoint: String, authkey: String): Unit = js.native
    
    def send(data: Event): Unit = js.native
  }
  
  @JSImport("debessmann", "Event")
  @js.native
  class Event () extends StObject {
    
    var _id: EventId = js.native
    
    var headers: StringDictionary[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var metrics: js.UndefOr[StringDictionary[Double]] = js.native
    
    var payload: js.UndefOr[js.Any] = js.native
    
    var timestamp: js.UndefOr[String] = js.native
  }
  
  @JSImport("debessmann", "EventId")
  @js.native
  class EventId () extends StObject {
    
    var seq: Double = js.native
    
    var time: Date = js.native
  }
  
  object global {
    
    @js.native
    trait Window extends StObject {
      
      var dm: DM = js.native
    }
    object Window {
      
      @scala.inline
      def apply(dm: DM): Window = {
        val __obj = js.Dynamic.literal(dm = dm.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDm(value: DM): Self = StObject.set(x, "dm", value.asInstanceOf[js.Any])
      }
    }
  }
}
