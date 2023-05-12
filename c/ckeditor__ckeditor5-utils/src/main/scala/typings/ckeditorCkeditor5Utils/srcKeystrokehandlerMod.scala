package typings.ckeditorCkeditor5Utils

import typings.ckeditorCkeditor5Utils.anon.Priority
import typings.ckeditorCkeditor5Utils.anon.ReadonlyKeystrokeInfo
import typings.ckeditorCkeditor5Utils.srcEmittermixinMod.Emitter
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcKeystrokehandlerMod {
  
  @JSImport("@ckeditor/ckeditor5-utils/src/keystrokehandler", JSImport.Default)
  @js.native
  /**
    * Creates an instance of the keystroke handler.
    */
  open class default ()
    extends StObject
       with KeystrokeHandler
  
  @js.native
  trait KeystrokeHandler extends StObject {
    
    /**
      * Listener used to listen to events for easier keystroke handler destruction.
      */
    /* private */ val _listener: Any = js.native
    
    /**
      * Destroys the keystroke handler.
      */
    def destroy(): Unit = js.native
    
    /**
      * Starts listening for `keydown` events from a given emitter.
      */
    def listenTo(emitter: Emitter): Unit = js.native
    def listenTo(emitter: HTMLElement): Unit = js.native
    def listenTo(emitter: Window): Unit = js.native
    
    /**
      * Triggers a keystroke handler for a specified key combination, if such a keystroke was {@link #set defined}.
      *
      * @param keyEvtData Key event data.
      * @returns Whether the keystroke was handled.
      */
    def press(keyEvtData: ReadonlyKeystrokeInfo): Boolean = js.native
    
    /**
      * Registers a handler for the specified keystroke.
      *
      * @param keystroke Keystroke defined in a format accepted by
      * the {@link module:utils/keyboard~parseKeystroke} function.
      * @param callback A function called with the
      * {@link module:engine/view/observer/keyobserver~KeyEventData key event data} object and
      * a helper function to call both `preventDefault()` and `stopPropagation()` on the underlying event.
      * @param options Additional options.
      * @param options.priority The priority of the keystroke
      * callback. The higher the priority value the sooner the callback will be executed. Keystrokes having the same priority
      * are called in the order they were added.
      */
    def set(
      keystroke: String,
      callback: js.Function2[/* ev */ KeyboardEvent, /* cancel */ js.Function0[Unit], Unit]
    ): Unit = js.native
    def set(
      keystroke: String,
      callback: js.Function2[/* ev */ KeyboardEvent, /* cancel */ js.Function0[Unit], Unit],
      options: Priority
    ): Unit = js.native
    def set(
      keystroke: js.Array[String | Double],
      callback: js.Function2[/* ev */ KeyboardEvent, /* cancel */ js.Function0[Unit], Unit]
    ): Unit = js.native
    def set(
      keystroke: js.Array[String | Double],
      callback: js.Function2[/* ev */ KeyboardEvent, /* cancel */ js.Function0[Unit], Unit],
      options: Priority
    ): Unit = js.native
    
    /**
      * Stops listening to `keydown` events from the given emitter.
      */
    def stopListening(): Unit = js.native
    def stopListening(emitter: Emitter): Unit = js.native
    def stopListening(emitter: HTMLElement): Unit = js.native
    def stopListening(emitter: Window): Unit = js.native
  }
}
