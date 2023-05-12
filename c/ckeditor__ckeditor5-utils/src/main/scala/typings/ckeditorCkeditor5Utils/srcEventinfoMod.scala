package typings.ckeditorCkeditor5Utils

import typings.ckeditorCkeditor5Utils.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcEventinfoMod {
  
  @JSImport("@ckeditor/ckeditor5-utils/src/eventinfo", JSImport.Default)
  @js.native
  open class default[TName /* <: String */, TReturn] protected ()
    extends StObject
       with EventInfo[TName, TReturn] {
    /**
      * @param source The emitter.
      * @param name The event name.
      */
    def this(source: js.Object, name: TName) = this()
    
    /**
      * The event name.
      */
    /* CompleteClass */
    override val name: TName = js.native
    
    /**
      * Removes the current callback from future interactions of this event.
      */
    /* CompleteClass */
    override def off(): Unit = js.native
    /**
      * Removes the current callback from future interactions of this event.
      */
    /* CompleteClass */
    @JSName("off")
    override val off_Original: Call = js.native
    
    /**
      * Path this event has followed. See {@link module:utils/emittermixin~Emitter#delegate}.
      */
    /* CompleteClass */
    var path: js.Array[js.Object] = js.native
    
    /**
      * The object that fired the event.
      */
    /* CompleteClass */
    override val source: js.Object = js.native
    
    /**
      * Stops the event emitter to call further callbacks for this event interaction.
      */
    /* CompleteClass */
    override def stop(): Unit = js.native
    /**
      * Stops the event emitter to call further callbacks for this event interaction.
      */
    /* CompleteClass */
    @JSName("stop")
    override val stop_Original: Call = js.native
  }
  
  trait EventInfo[TName /* <: String */, TReturn] extends StObject {
    
    /**
      * The event name.
      */
    val name: TName
    
    /**
      * Removes the current callback from future interactions of this event.
      */
    def off(): Unit
    /**
      * Removes the current callback from future interactions of this event.
      */
    @JSName("off")
    val off_Original: Call
    
    /**
      * Path this event has followed. See {@link module:utils/emittermixin~Emitter#delegate}.
      */
    var path: js.Array[js.Object]
    
    /**
      * The value which will be returned by {@link module:utils/emittermixin~Emitter#fire}.
      *
      * It's `undefined` by default and can be changed by an event listener:
      *
      * ```ts
      * dataController.fire( 'getSelectedContent', ( evt ) => {
      * 	// This listener will make `dataController.fire( 'getSelectedContent' )`
      * 	// always return an empty DocumentFragment.
      * 	evt.return = new DocumentFragment();
      *
      * 	// Make sure no other listeners are executed.
      * 	evt.stop();
      * } );
      * ```
      */
    var `return`: js.UndefOr[TReturn] = js.undefined
    
    /**
      * The object that fired the event.
      */
    val source: js.Object
    
    /**
      * Stops the event emitter to call further callbacks for this event interaction.
      */
    def stop(): Unit
    /**
      * Stops the event emitter to call further callbacks for this event interaction.
      */
    @JSName("stop")
    val stop_Original: Call
  }
  object EventInfo {
    
    inline def apply[TName /* <: String */, TReturn](name: TName, off: Call, path: js.Array[js.Object], source: js.Object, stop: Call): EventInfo[TName, TReturn] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], off = off.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventInfo[TName, TReturn]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventInfo[?, ?], TName /* <: String */, TReturn] (val x: Self & (EventInfo[TName, TReturn])) extends AnyVal {
      
      inline def setName(value: TName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOff(value: Call): Self = StObject.set(x, "off", value.asInstanceOf[js.Any])
      
      inline def setPath(value: js.Array[js.Object]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: js.Object*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setReturn(value: TReturn): Self = StObject.set(x, "return", value.asInstanceOf[js.Any])
      
      inline def setReturnUndefined: Self = StObject.set(x, "return", js.undefined)
      
      inline def setSource(value: js.Object): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setStop(value: Call): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
    }
  }
}
