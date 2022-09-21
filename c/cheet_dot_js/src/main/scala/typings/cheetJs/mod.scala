package typings.cheetJs

import typings.cheetJs.anon.Done
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object cheet {
    
    inline def apply(sequence: String): Unit = ^.asInstanceOf[js.Dynamic].apply(sequence.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def apply(
      sequence: String,
      /**
      * A callback to execute each time the sequence is correctly pressed.
      *
      * @param str - The string representation of the sequence that completed.
      * @param seq - An array of key names representing the sequence that completed.
      */
    /* tslint:disable-next-line unified-signatures */
    done: js.Function2[/* str */ String, /* seq */ js.Array[String], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].apply(sequence.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(sequence: String, /* tslint:disable-next-line unified-signatures */
    handlers: Done): Unit = (^.asInstanceOf[js.Dynamic].apply(sequence.asInstanceOf[js.Any], handlers.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("cheet.js", "cheet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Disable a previously-mapped sequence.
      *
      * @param seq The same string you used to map the callback when using cheet(seq, ...).
      */
    inline def disable(sequence: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")(sequence.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Set a global callback that executes whenever any mapped sequence is completed successfully.
      *
      * @param cb - A callback to execute each time any sequence is correctly pressed.
      */
    inline def done(
      /**
      * A callback to execute each time the sequence is correctly pressed.
      *
      * @param str - The string representation of the sequence that completed.
      * @param seq - An array of key names representing the sequence that completed.
      */
    cb: js.Function2[/* str */ String, /* seq */ js.Array[String], Unit]
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("done")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Set a global callback that executes whenever any in-progress sequence is broken.
      *
      * @param cb - A callback to execute each time any sequence's progress is broken.
      */
    inline def fail(
      /**
      * A callback to execute each time a sequence's progress is broken.
      *
      * @param str - The string representation of the sequence that completed.
      * @param seq - An array of key names representing the sequence that completed.
      */
    cb: js.Function2[/* str */ String, /* seq */ js.Array[String], Unit]
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Set a global callback that executes whenever any mapped sequence progresses.
      *
      * @param cb - A callback to execute each time any correct key in the sequence is pressed in order.
      */
    inline def next(
      /**
      * A callback to execute each time a correct key in the sequence is pressed in order.
      *
      * @param str - The string representation of the sequence that is in progress.
      * @param key - The name of the key that was just pressed.
      * @param num - A number representing the current progress of the sequence. (starts at 0)
      * @param seq - An array of key names representing the sequence that is in progress.
      */
    cb: js.Function4[/* str */ String, /* key */ String, /* num */ Double, /* seq */ js.Array[String], Unit]
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("next")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Resets a sequence that may or may not be in progress.
      * This will not cause fail callbacks to fire, but will effectively cancel the sequence.
      *
      * @param seq The same string you used to map the callback when using cheet(seq, ...).
      */
    inline def reset(sequence: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")(sequence.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  type Handler = js.Function2[/* str */ String, /* seq */ js.Array[String], Unit]
  
  type NextHandler = js.Function4[/* str */ String, /* key */ String, /* num */ Double, /* seq */ js.Array[String], Unit]
}
