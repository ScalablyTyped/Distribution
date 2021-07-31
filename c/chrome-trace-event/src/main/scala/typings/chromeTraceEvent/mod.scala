package typings.chromeTraceEvent

import org.scalablytyped.runtime.StringDictionary
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("chrome-trace-event", "Tracer")
  @js.native
  class Tracer () extends Readable {
    def this(opts: TracerOptions) = this()
    
    /* private */ def _flush(): js.Any = js.native
    
    var _objectMode: js.Any = js.native
    
    /** Node Stream internal APIs */
    var _push: js.Any = js.native
    
    /* private */ def _pushString(ev: js.Any): js.Any = js.native
    
    def begin(fields: Fields): Unit = js.native
    
    def child(fields: Fields): Tracer = js.native
    
    def completeEvent(fields: Fields): Unit = js.native
    
    def end(fields: Fields): Unit = js.native
    
    var events: js.Any = js.native
    
    var fields: js.Any = js.native
    
    var firstPush: js.Any = js.native
    
    /**
      * If in no streamMode in order to flush out the trace
      * you need to call flush.
      */
    def flush(): Unit = js.native
    
    def instantEvent(fields: Fields): Unit = js.native
    
    def mkEventFunc(ph: String): js.Function1[/* fields */ Fields, Unit] = js.native
    
    var noStream: js.Any = js.native
    
    var parent: js.Any = js.native
  }
  
  trait Event
    extends StObject
       with /* otherData */ StringDictionary[js.Any] {
    
    /** event phase */
    var ph: js.UndefOr[String] = js.undefined
    
    var pid: Double
    
    var tid: Double
    
    var ts: Double
  }
  object Event {
    
    @scala.inline
    def apply(pid: Double, tid: Double, ts: Double): Event = {
      val __obj = js.Dynamic.literal(pid = pid.asInstanceOf[js.Any], tid = tid.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPh(value: String): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhUndefined: Self = StObject.set(x, "ph", js.undefined)
      
      @scala.inline
      def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTid(value: Double): Self = StObject.set(x, "tid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
    }
  }
  
  trait Fields
    extends StObject
       with /* otherData */ StringDictionary[js.Any] {
    
    var args: js.UndefOr[js.Any] = js.undefined
    
    var cat: js.UndefOr[js.Any] = js.undefined
  }
  object Fields {
    
    @scala.inline
    def apply(): Fields = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fields]
    }
    
    @scala.inline
    implicit class FieldsMutableBuilder[Self <: Fields] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Any): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setCat(value: js.Any): Self = StObject.set(x, "cat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCatUndefined: Self = StObject.set(x, "cat", js.undefined)
    }
  }
  
  trait TracerOptions extends StObject {
    
    var fields: js.UndefOr[Fields | Null] = js.undefined
    
    var noStream: js.UndefOr[Boolean] = js.undefined
    
    var objectMode: js.UndefOr[Boolean | Null] = js.undefined
    
    var parent: js.UndefOr[Tracer | Null] = js.undefined
  }
  object TracerOptions {
    
    @scala.inline
    def apply(): TracerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TracerOptions]
    }
    
    @scala.inline
    implicit class TracerOptionsMutableBuilder[Self <: TracerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFields(value: Fields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsNull: Self = StObject.set(x, "fields", null)
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setNoStream(value: Boolean): Self = StObject.set(x, "noStream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoStreamUndefined: Self = StObject.set(x, "noStream", js.undefined)
      
      @scala.inline
      def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectModeNull: Self = StObject.set(x, "objectMode", null)
      
      @scala.inline
      def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
      
      @scala.inline
      def setParent(value: Tracer): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentNull: Self = StObject.set(x, "parent", null)
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    }
  }
}
