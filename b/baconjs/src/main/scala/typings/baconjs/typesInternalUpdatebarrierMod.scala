package typings.baconjs

import typings.baconjs.anon.FnCallObsSubscribeSink
import typings.baconjs.typesEventMod.Event
import typings.baconjs.typesTypesMod.Subscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInternalUpdatebarrierMod {
  
  object default {
    
    @JSImport("baconjs/types/internal/updatebarrier", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baconjs/types/internal/updatebarrier", "default.afterTransaction")
    @js.native
    def afterTransaction: js.Function2[/* obs */ Observable, /* f */ Call, Unit] = js.native
    inline def afterTransaction(obs: Observable, f: Call): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterTransaction")(obs.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def afterTransaction_=(x: js.Function2[/* obs */ Observable, /* f */ Call, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("afterTransaction")(x.asInstanceOf[js.Any])
    
    inline def currentEventId(): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("currentEventId")().asInstanceOf[js.UndefOr[Double]]
    @JSImport("baconjs/types/internal/updatebarrier", "default.currentEventId")
    @js.native
    def currentEventId_Fdefault: js.Function0[js.UndefOr[Double]] = js.native
    
    inline def currentEventId_Fdefault_=(x: js.Function0[js.UndefOr[Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentEventId")(x.asInstanceOf[js.Any])
    
    inline def hasWaiters(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasWaiters")().asInstanceOf[Boolean]
    @JSImport("baconjs/types/internal/updatebarrier", "default.hasWaiters")
    @js.native
    def hasWaiters_Fdefault: js.Function0[Boolean] = js.native
    
    inline def hasWaiters_Fdefault_=(x: js.Function0[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hasWaiters")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/internal/updatebarrier", "default.inTransaction")
    @js.native
    def inTransaction: js.Function4[
        /* event */ js.UndefOr[Event[Any]], 
        /* context */ Any, 
        /* f */ js.Function, 
        /* args */ js.Array[Any], 
        Any
      ] = js.native
    inline def inTransaction(event: Unit, context: Any, f: js.Function, args: js.Array[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("inTransaction")(event.asInstanceOf[js.Any], context.asInstanceOf[js.Any], f.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def inTransaction(event: Event[Any], context: Any, f: js.Function, args: js.Array[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("inTransaction")(event.asInstanceOf[js.Any], context.asInstanceOf[js.Any], f.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def inTransaction_=(
      x: js.Function4[
          /* event */ js.UndefOr[Event[Any]], 
          /* context */ Any, 
          /* f */ js.Function, 
          /* args */ js.Array[Any], 
          Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inTransaction")(x.asInstanceOf[js.Any])
    
    inline def isInTransaction(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInTransaction")().asInstanceOf[Boolean]
    @JSImport("baconjs/types/internal/updatebarrier", "default.isInTransaction")
    @js.native
    def isInTransaction_Fdefault: js.Function0[Boolean] = js.native
    
    inline def isInTransaction_Fdefault_=(x: js.Function0[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInTransaction")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/internal/updatebarrier", "default.soonButNotYet")
    @js.native
    def soonButNotYet: js.Function2[/* obs */ Observable, /* f */ Call, Unit] = js.native
    inline def soonButNotYet(obs: Observable, f: Call): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("soonButNotYet")(obs.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def soonButNotYet_=(x: js.Function2[/* obs */ Observable, /* f */ Call, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("soonButNotYet")(x.asInstanceOf[js.Any])
    
    inline def toString_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[String]
    
    @JSImport("baconjs/types/internal/updatebarrier", "default.toString")
    @js.native
    def toString__Fdefault: js.Function0[String] = js.native
    
    inline def toString__Fdefault_=(x: js.Function0[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toString")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/internal/updatebarrier", "default.whenDoneWith")
    @js.native
    def whenDoneWith: js.Function2[/* obs */ Observable, /* f */ Call, Any] = js.native
    inline def whenDoneWith(obs: Observable, f: Call): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("whenDoneWith")(obs.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def whenDoneWith_=(x: js.Function2[/* obs */ Observable, /* f */ Call, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("whenDoneWith")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/internal/updatebarrier", "default.wrappedSubscribe")
    @js.native
    def wrappedSubscribe: FnCallObsSubscribeSink = js.native
    inline def wrappedSubscribe[V](obs: Observable, subscribe: Subscribe[V], sink: EventSink[V]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrappedSubscribe")(obs.asInstanceOf[js.Any], subscribe.asInstanceOf[js.Any], sink.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def wrappedSubscribe_=(x: FnCallObsSubscribeSink): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrappedSubscribe")(x.asInstanceOf[js.Any])
  }
  
  type Call = js.Function0[Any]
  
  type EventSink[V] = Sink[Event[V]]
  
  trait Observable extends StObject {
    
    var id: Double
    
    def internalDeps(): js.Array[Observable]
  }
  object Observable {
    
    inline def apply(id: Double, internalDeps: () => js.Array[Observable]): Observable = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], internalDeps = js.Any.fromFunction0(internalDeps))
      __obj.asInstanceOf[Observable]
    }
    
    extension [Self <: Observable](x: Self) {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInternalDeps(value: () => js.Array[Observable]): Self = StObject.set(x, "internalDeps", js.Any.fromFunction0(value))
    }
  }
  
  type Sink[V] = js.Function1[/* value */ V, Any]
}
