package typings.chromeTraceEvent

import org.scalablytyped.runtime.StringDictionary
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("chrome-trace-event", "Tracer")
  @js.native
  open class Tracer () extends Readable {
    def this(opts: TracerOptions) = this()
    
    /* private */ var _flush: Any = js.native
    
    /* private */ var _objectMode: Any = js.native
    
    /** Node Stream internal APIs */
    /* private */ var _push: Any = js.native
    
    /* private */ var _pushString: Any = js.native
    
    def begin(fields: Fields): Unit = js.native
    
    def child(fields: Fields): Tracer = js.native
    
    def completeEvent(fields: Fields): Unit = js.native
    
    def end(fields: Fields): Unit = js.native
    
    /* private */ var events: Any = js.native
    
    /* private */ var fields: Any = js.native
    
    /* private */ var firstPush: Any = js.native
    
    /**
      * If in no streamMode in order to flush out the trace
      * you need to call flush.
      */
    def flush(): Unit = js.native
    
    def instantEvent(fields: Fields): Unit = js.native
    
    def mkEventFunc(ph: String): js.Function1[/* fields */ Fields, Unit] = js.native
    
    /* private */ var noStream: Any = js.native
    
    /* private */ var parent: Any = js.native
  }
  
  trait Event
    extends StObject
       with /* otherData */ StringDictionary[Any] {
    
    /** event phase */
    var ph: js.UndefOr[String] = js.undefined
    
    var pid: Double
    
    var tid: Double
    
    var ts: Double
  }
  object Event {
    
    inline def apply(pid: Double, tid: Double, ts: Double): Event = {
      val __obj = js.Dynamic.literal(pid = pid.asInstanceOf[js.Any], tid = tid.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      inline def setPh(value: String): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
      
      inline def setPhUndefined: Self = StObject.set(x, "ph", js.undefined)
      
      inline def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      inline def setTid(value: Double): Self = StObject.set(x, "tid", value.asInstanceOf[js.Any])
      
      inline def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
    }
  }
  
  trait Fields
    extends StObject
       with /* otherData */ StringDictionary[Any] {
    
    var args: js.UndefOr[Any] = js.undefined
    
    var cat: js.UndefOr[Any] = js.undefined
  }
  object Fields {
    
    inline def apply(): Fields = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fields]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Fields] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: Any): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setCat(value: Any): Self = StObject.set(x, "cat", value.asInstanceOf[js.Any])
      
      inline def setCatUndefined: Self = StObject.set(x, "cat", js.undefined)
    }
  }
  
  trait TracerOptions extends StObject {
    
    var fields: js.UndefOr[Fields | Null] = js.undefined
    
    var noStream: js.UndefOr[Boolean] = js.undefined
    
    var objectMode: js.UndefOr[Boolean | Null] = js.undefined
    
    var parent: js.UndefOr[Tracer | Null] = js.undefined
  }
  object TracerOptions {
    
    inline def apply(): TracerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TracerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TracerOptions] (val x: Self) extends AnyVal {
      
      inline def setFields(value: Fields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsNull: Self = StObject.set(x, "fields", null)
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setNoStream(value: Boolean): Self = StObject.set(x, "noStream", value.asInstanceOf[js.Any])
      
      inline def setNoStreamUndefined: Self = StObject.set(x, "noStream", js.undefined)
      
      inline def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      inline def setObjectModeNull: Self = StObject.set(x, "objectMode", null)
      
      inline def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
      
      inline def setParent(value: Tracer): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentNull: Self = StObject.set(x, "parent", null)
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    }
  }
}
