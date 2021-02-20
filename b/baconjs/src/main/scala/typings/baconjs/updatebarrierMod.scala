package typings.baconjs

import typings.baconjs.anon.FnCallObsSubscribeSink
import typings.baconjs.eventMod.Event
import typings.baconjs.typesMod.Subscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updatebarrierMod {
  
  object default {
    
    @JSImport("baconjs/types/internal/updatebarrier", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baconjs/types/internal/updatebarrier", "default.afterTransaction")
    @js.native
    def afterTransaction: js.Function2[/* obs */ Observable, /* f */ Call, Unit] = js.native
    @JSImport("baconjs/types/internal/updatebarrier", "default.afterTransaction")
    @js.native
    def afterTransaction(obs: Observable, f: Call): Unit = js.native
    @scala.inline
    def afterTransaction_=(x: js.Function2[/* obs */ Observable, /* f */ Call, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("afterTransaction")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/internal/updatebarrier", "default.currentEventId")
    @js.native
    def currentEventId(): js.UndefOr[Double] = js.native
    @JSImport("baconjs/types/internal/updatebarrier", "default.currentEventId")
    @js.native
    def currentEventId_Fdefault: js.Function0[js.UndefOr[Double]] = js.native
    
    @scala.inline
    def currentEventId_Fdefault_=(x: js.Function0[js.UndefOr[Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentEventId")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/internal/updatebarrier", "default.hasWaiters")
    @js.native
    def hasWaiters(): Boolean = js.native
    @JSImport("baconjs/types/internal/updatebarrier", "default.hasWaiters")
    @js.native
    def hasWaiters_Fdefault: js.Function0[Boolean] = js.native
    
    @scala.inline
    def hasWaiters_Fdefault_=(x: js.Function0[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hasWaiters")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/internal/updatebarrier", "default.inTransaction")
    @js.native
    def inTransaction: js.Function4[
        /* event */ js.UndefOr[Event[js.Any]], 
        /* context */ js.Any, 
        /* f */ js.Function, 
        /* args */ js.Array[js.Any], 
        js.Any
      ] = js.native
    @JSImport("baconjs/types/internal/updatebarrier", "default.inTransaction")
    @js.native
    def inTransaction(event: js.UndefOr[scala.Nothing], context: js.Any, f: js.Function, args: js.Array[_]): js.Any = js.native
    @JSImport("baconjs/types/internal/updatebarrier", "default.inTransaction")
    @js.native
    def inTransaction(event: Event[_], context: js.Any, f: js.Function, args: js.Array[_]): js.Any = js.native
    @scala.inline
    def inTransaction_=(
      x: js.Function4[
          /* event */ js.UndefOr[Event[js.Any]], 
          /* context */ js.Any, 
          /* f */ js.Function, 
          /* args */ js.Array[js.Any], 
          js.Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inTransaction")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/internal/updatebarrier", "default.isInTransaction")
    @js.native
    def isInTransaction(): Boolean = js.native
    @JSImport("baconjs/types/internal/updatebarrier", "default.isInTransaction")
    @js.native
    def isInTransaction_Fdefault: js.Function0[Boolean] = js.native
    
    @scala.inline
    def isInTransaction_Fdefault_=(x: js.Function0[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInTransaction")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/internal/updatebarrier", "default.soonButNotYet")
    @js.native
    def soonButNotYet: js.Function2[/* obs */ Observable, /* f */ Call, Unit] = js.native
    @JSImport("baconjs/types/internal/updatebarrier", "default.soonButNotYet")
    @js.native
    def soonButNotYet(obs: Observable, f: Call): Unit = js.native
    @scala.inline
    def soonButNotYet_=(x: js.Function2[/* obs */ Observable, /* f */ Call, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("soonButNotYet")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/internal/updatebarrier", "default.toString")
    @js.native
    def toString_(): String = js.native
    @JSImport("baconjs/types/internal/updatebarrier", "default.toString")
    @js.native
    def toString__Fdefault: js.Function0[String] = js.native
    
    @scala.inline
    def toString__Fdefault_=(x: js.Function0[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toString")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/internal/updatebarrier", "default.whenDoneWith")
    @js.native
    def whenDoneWith: js.Function2[/* obs */ Observable, /* f */ Call, js.Any] = js.native
    @JSImport("baconjs/types/internal/updatebarrier", "default.whenDoneWith")
    @js.native
    def whenDoneWith(obs: Observable, f: Call): js.Any = js.native
    @scala.inline
    def whenDoneWith_=(x: js.Function2[/* obs */ Observable, /* f */ Call, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("whenDoneWith")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/internal/updatebarrier", "default.wrappedSubscribe")
    @js.native
    def wrappedSubscribe: FnCallObsSubscribeSink = js.native
    @JSImport("baconjs/types/internal/updatebarrier", "default.wrappedSubscribe")
    @js.native
    def wrappedSubscribe[V](obs: Observable, subscribe: Subscribe[V], sink: EventSink[V]): js.Function0[Unit] = js.native
    @scala.inline
    def wrappedSubscribe_=(x: FnCallObsSubscribeSink): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrappedSubscribe")(x.asInstanceOf[js.Any])
  }
  
  type Call = js.Function0[js.Any]
  
  type EventSink[V] = Sink[Event[V]]
  
  @js.native
  trait Observable extends StObject {
    
    var id: Double = js.native
    
    def internalDeps(): js.Array[Observable] = js.native
  }
  object Observable {
    
    @scala.inline
    def apply(id: Double, internalDeps: () => js.Array[Observable]): Observable = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], internalDeps = js.Any.fromFunction0(internalDeps))
      __obj.asInstanceOf[Observable]
    }
    
    @scala.inline
    implicit class ObservableMutableBuilder[Self <: Observable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternalDeps(value: () => js.Array[Observable]): Self = StObject.set(x, "internalDeps", js.Any.fromFunction0(value))
    }
  }
  
  type Sink[V] = js.Function1[/* value */ V, js.Any]
}
