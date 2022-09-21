package typings.cheetJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Done extends StObject {
    
    /**
      * A callback to execute each time the sequence is correctly pressed.
      *
      * @param str - The string representation of the sequence that completed.
      * @param seq - An array of key names representing the sequence that completed.
      */
    var done: js.UndefOr[js.Function2[/* str */ String, /* seq */ js.Array[String], Unit]] = js.undefined
    
    /**
      * A callback to execute each time a sequence's progress is broken.
      *
      * @param str - The string representation of the sequence that completed.
      * @param seq - An array of key names representing the sequence that completed.
      */
    var fail: js.UndefOr[js.Function2[/* str */ String, /* seq */ js.Array[String], Unit]] = js.undefined
    
    /**
      * A callback to execute each time a correct key in the sequence is pressed in order.
      *
      * @param str - The string representation of the sequence that is in progress.
      * @param key - The name of the key that was just pressed.
      * @param num - A number representing the current progress of the sequence. (starts at 0)
      * @param seq - An array of key names representing the sequence that is in progress.
      */
    var next: js.UndefOr[
        js.Function4[/* str */ String, /* key */ String, /* num */ Double, /* seq */ js.Array[String], Unit]
      ] = js.undefined
  }
  object Done {
    
    inline def apply(): Done = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Done]
    }
    
    extension [Self <: Done](x: Self) {
      
      inline def setDone(value: (/* str */ String, /* seq */ js.Array[String]) => Unit): Self = StObject.set(x, "done", js.Any.fromFunction2(value))
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setFail(value: (/* str */ String, /* seq */ js.Array[String]) => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction2(value))
      
      inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
      
      inline def setNext(value: (/* str */ String, /* key */ String, /* num */ Double, /* seq */ js.Array[String]) => Unit): Self = StObject.set(x, "next", js.Any.fromFunction4(value))
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    }
  }
}
