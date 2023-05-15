package typings.cbor

import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibObjectRecorderMod {
  
  /**
    * Record objects that pass by in a stream.  If the same object is used more
    * than once, it can be value-shared using shared values.
    *
    * @see {@link http://cbor.schmorp.de/value-sharing}
    */
  @JSImport("cbor/types/lib/objectRecorder", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with ObjectRecorder {
    
    /**
      * Determine if wrapping a tag 28 or 29 around an object that has been
      * reused is appropriate.  This method stores state for which objects have
      * been seen.
      *
      * @param {object} obj Any object about to be serialized.
      * @returns {number} If recording: -1 for first use, index for second use.
      *   If not recording, -1 for never-duplicated, -2 for first use, index for
      *   subsequent uses.
      * @throws {Error} Recording does not match playback.
      */
    /* CompleteClass */
    override def check(obj: js.Object): Double = js.native
    
    /**
      * Clear all of the objects that have been seen.  Revert to recording mode.
      */
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    var count: Double = js.native
    
    /* CompleteClass */
    var map: WeakMap[js.Object, Any] = js.native
    
    /* CompleteClass */
    var recording: Boolean = js.native
    
    /**
      * Stop recording.
      */
    /* CompleteClass */
    override def stop(): Unit = js.native
  }
  
  @JSImport("cbor/types/lib/objectRecorder", "FIRST")
  @js.native
  val FIRST: Double = js.native
  
  @JSImport("cbor/types/lib/objectRecorder", "NEVER")
  @js.native
  val NEVER: Double = js.native
  
  /**
    * Record objects that pass by in a stream.  If the same object is used more
    * than once, it can be value-shared using shared values.
    *
    * @see {@link http://cbor.schmorp.de/value-sharing}
    */
  trait ObjectRecorder extends StObject {
    
    /**
      * Determine if wrapping a tag 28 or 29 around an object that has been
      * reused is appropriate.  This method stores state for which objects have
      * been seen.
      *
      * @param {object} obj Any object about to be serialized.
      * @returns {number} If recording: -1 for first use, index for second use.
      *   If not recording, -1 for never-duplicated, -2 for first use, index for
      *   subsequent uses.
      * @throws {Error} Recording does not match playback.
      */
    def check(obj: js.Object): Double
    
    /**
      * Clear all of the objects that have been seen.  Revert to recording mode.
      */
    def clear(): Unit
    
    var count: Double
    
    var map: WeakMap[js.Object, Any]
    
    var recording: Boolean
    
    /**
      * Stop recording.
      */
    def stop(): Unit
  }
  object ObjectRecorder {
    
    inline def apply(
      check: js.Object => Double,
      clear: () => Unit,
      count: Double,
      map: WeakMap[js.Object, Any],
      recording: Boolean,
      stop: () => Unit
    ): ObjectRecorder = {
      val __obj = js.Dynamic.literal(check = js.Any.fromFunction1(check), clear = js.Any.fromFunction0(clear), count = count.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], recording = recording.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[ObjectRecorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObjectRecorder] (val x: Self) extends AnyVal {
      
      inline def setCheck(value: js.Object => Double): Self = StObject.set(x, "check", js.Any.fromFunction1(value))
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setMap(value: WeakMap[js.Object, Any]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setRecording(value: Boolean): Self = StObject.set(x, "recording", value.asInstanceOf[js.Any])
      
      inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
}
