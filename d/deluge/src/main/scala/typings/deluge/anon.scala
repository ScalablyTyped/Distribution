package typings.deluge

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait State extends StObject {
    
    var state: js.Array[js.Tuple2[String, Double]]
    
    var tracker_host: js.Array[js.Tuple2[String, Double]]
  }
  object State {
    
    @scala.inline
    def apply(state: js.Array[js.Tuple2[String, Double]], tracker_host: js.Array[js.Tuple2[String, Double]]): State = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], tracker_host = tracker_host.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setState(value: js.Array[js.Tuple2[String, Double]]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateVarargs(value: (js.Tuple2[String, Double])*): Self = StObject.set(x, "state", js.Array(value :_*))
      
      @scala.inline
      def setTracker_host(value: js.Array[js.Tuple2[String, Double]]): Self = StObject.set(x, "tracker_host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTracker_hostVarargs(value: (js.Tuple2[String, Double])*): Self = StObject.set(x, "tracker_host", js.Array(value :_*))
    }
  }
}
