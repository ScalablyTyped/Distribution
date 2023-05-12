package typings.cfcsCore

import typings.cfcsCore.declarationReactiveDecoratorsReactiveSubscribeMod.ReactiveSubscribe
import typings.cfcsCore.declarationReactiveTypesMod.ReactiveEventCallback
import typings.egjsComponent.declarationTypesMod.EventKey
import typings.egjsComponent.declarationTypesMod.EventTriggerParams
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationReactiveReactiveAdapterMod {
  
  trait ReactiveAdapter[Instance /* <: ReactiveSubscribe[Record[String, Any]] */, State /* <: Record[String, Any] */, Methods /* <: /* keyof std.Partial<Instance> */ String */, Props, Events /* <: Record[String, Any] */] extends StObject {
    
    /**
      * Occurs when a component is created.
      * If an instance is created and returned, the state specification can be omitted.
      */
    var created: js.UndefOr[js.Function1[/* props */ Props, js.UndefOr[Instance | Unit]]] = js.undefined
    
    /**
      * @descriptionYou can decide which props to pass when creating/destroying instances in the framework.
      * @deprecated
      */
    var data: js.UndefOr[js.Function0[Props]] = js.undefined
    
    /**
      * Occurs before the component is destroyed.
      */
    var destroy: js.UndefOr[js.Function2[/* instance */ Instance, /* props */ Props, Unit]] = js.undefined
    
    /**
      * If you want to use events, write the events property and a way to register/unregister events.
      */
    var events: js.UndefOr[js.Array[/* keyof Events */ String]] = js.undefined
    
    /**
      * Occurs after mount, state declaration, and observation in the component.
      */
    var init: js.UndefOr[js.Function2[/* instance */ Instance, /* props */ Props, Unit]] = js.undefined
    
    /**
      * If you want to use an instance's method, write the method names.
      * @default []
      */
    var methods: js.UndefOr[js.Array[Methods]] = js.undefined
    
    /**
      * Occurs when a component is mounted.
      */
    var mounted: js.UndefOr[
        js.Function2[
          /* props */ Props, 
          /* instance */ js.UndefOr[Instance | Null], 
          js.UndefOr[Instance | Unit]
        ]
      ] = js.undefined
    
    /**
      * If you want to use events, write the events property and a way to register/unregister events.
      * @deprecated
      */
    var off: js.UndefOr[
        js.Function3[
          /* instance */ Instance, 
          /* eventName */ EventKey[Events], 
          /* listener */ ReactiveEventCallback[Events, EventKey[Events]], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * If you want to use events, write the events property and a way to register/unregister events.
      */
    var on: js.UndefOr[
        js.Function3[
          /* instance */ Instance, 
          /* eventName */ EventKey[Events], 
          /* listener */ ReactiveEventCallback[Events, EventKey[Events]], 
          Unit | js.Function0[Unit]
        ]
      ] = js.undefined
    
    /**
      * You can decide which data to pass when creating/destroying instances in the framework.
      */
    var props: js.UndefOr[js.Function0[Props]] = js.undefined
    
    /**
      * You can use lifecycle hooks functions for setup.
      * You can omit created, mounted, and init.
      */
    var setup: js.UndefOr[
        js.Function1[
          /* setup */ ReactiveSetup[Instance, State, Methods, Props, Events], 
          js.UndefOr[Instance | Unit]
        ]
      ] = js.undefined
    
    /**
      * Specify if you want to use the framework's state. If an instance is created through created, it can be omitted.
      */
    var state: js.UndefOr[State] = js.undefined
  }
  object ReactiveAdapter {
    
    inline def apply[Instance /* <: ReactiveSubscribe[Record[String, Any]] */, State /* <: Record[String, Any] */, Methods /* <: /* keyof std.Partial<Instance> */ String */, Props, Events /* <: Record[String, Any] */](): ReactiveAdapter[Instance, State, Methods, Props, Events] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactiveAdapter[Instance, State, Methods, Props, Events]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReactiveAdapter[?, ?, ?, ?, ?], Instance /* <: ReactiveSubscribe[Record[String, Any]] */, State /* <: Record[String, Any] */, Methods /* <: /* keyof std.Partial<Instance> */ String */, Props, Events /* <: Record[String, Any] */] (val x: Self & (ReactiveAdapter[Instance, State, Methods, Props, Events])) extends AnyVal {
      
      inline def setCreated(value: /* props */ Props => js.UndefOr[Instance | Unit]): Self = StObject.set(x, "created", js.Any.fromFunction1(value))
      
      inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
      
      inline def setData(value: () => Props): Self = StObject.set(x, "data", js.Any.fromFunction0(value))
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDestroy(value: (/* instance */ Instance, /* props */ Props) => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction2(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setEvents(value: js.Array[/* keyof Events */ String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setEventsVarargs(value: (/* keyof Events */ String)*): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setInit(value: (/* instance */ Instance, /* props */ Props) => Unit): Self = StObject.set(x, "init", js.Any.fromFunction2(value))
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      inline def setMethods(value: js.Array[Methods]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      inline def setMethodsVarargs(value: Methods*): Self = StObject.set(x, "methods", js.Array(value*))
      
      inline def setMounted(
        value: (/* props */ Props, /* instance */ js.UndefOr[Instance | Null]) => js.UndefOr[Instance | Unit]
      ): Self = StObject.set(x, "mounted", js.Any.fromFunction2(value))
      
      inline def setMountedUndefined: Self = StObject.set(x, "mounted", js.undefined)
      
      inline def setOff(
        value: (/* instance */ Instance, /* eventName */ EventKey[Events], /* listener */ ReactiveEventCallback[Events, EventKey[Events]]) => Unit
      ): Self = StObject.set(x, "off", js.Any.fromFunction3(value))
      
      inline def setOffUndefined: Self = StObject.set(x, "off", js.undefined)
      
      inline def setOn(
        value: (/* instance */ Instance, /* eventName */ EventKey[Events], /* listener */ ReactiveEventCallback[Events, EventKey[Events]]) => Unit | js.Function0[Unit]
      ): Self = StObject.set(x, "on", js.Any.fromFunction3(value))
      
      inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      inline def setProps(value: () => Props): Self = StObject.set(x, "props", js.Any.fromFunction0(value))
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setSetup(
        value: /* setup */ ReactiveSetup[Instance, State, Methods, Props, Events] => js.UndefOr[Instance | Unit]
      ): Self = StObject.set(x, "setup", js.Any.fromFunction1(value))
      
      inline def setSetupUndefined: Self = StObject.set(x, "setup", js.undefined)
      
      inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  type ReactiveAdapterParam[Instance /* <: ReactiveSubscribe[Record[String, Any]] */, State /* <: Record[String, Any] */, Methods /* <: /* keyof std.Partial<Instance> */ String */, Props, Events /* <: Record[String, Any] */] = (ReactiveAdapter[Instance, State, Methods, Props, Events]) | (ReactiveSetupAdapter[Instance, State, Methods, Props, Events])
  
  trait ReactiveSetup[Instance /* <: ReactiveSubscribe[Record[String, Any]] */, State /* <: Record[String, Any] */, Methods /* <: /* keyof std.Partial<Instance> */ String */, Props, Events /* <: Record[String, Any] */] extends StObject {
    
    /**
      * Trigger events directly externally.
      */
    def emit[EventName /* <: EventKey[Events] */](
      eventName: EventName,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type EventTriggerParams<Events, EventName> is not an array type */ params: EventTriggerParams[Events, EventName]
    ): Unit
    
    /**
      * Get external props.
      */
    def getProps(): Props
    
    /**
      * Register events defined between Mounted and Init Lifecycle.
      */
    def on(
      callback: js.Function3[
          /* instance */ Instance, 
          /* eventName */ EventKey[Events], 
          /* listener */ ReactiveEventCallback[Events, EventKey[Events]], 
          Unit | js.Function0[Unit]
        ]
    ): Unit
    
    /**
      * Register hooks to occur in Destroy Lifecycle.
      */
    def onDestroy(callback: js.Function2[/* instance */ Instance, /* props */ Props, Unit]): Unit
    
    /**
      * Register hooks to occur in Init Lifecycle.
      */
    def onInit(callback: js.Function2[/* instance */ Instance, /* props */ Props, Unit]): Unit
    
    /**
      * Register hooks that will occur in Mounted Lifecycle.
      */
    def onMounted(
      callback: js.Function2[/* props */ Props, /* instance */ js.UndefOr[Instance | Null], Instance | Unit]
    ): Unit
    
    /**
      * Set the events to be exposed.
      */
    def setEvents(events: js.Array[/* keyof Events */ String]): Unit
    
    /**
      * Set the first Initial state.
      * Do not set the return value if it exists.
      */
    def setInitialState(state: State): Unit
    
    /**
      * Sets the functions to be exposed in the instance.
      */
    def setMethods(methods: js.Array[Methods]): Unit
  }
  object ReactiveSetup {
    
    inline def apply[Instance /* <: ReactiveSubscribe[Record[String, Any]] */, State /* <: Record[String, Any] */, Methods /* <: /* keyof std.Partial<Instance> */ String */, Props, Events /* <: Record[String, Any] */](
      emit: (Any, EventTriggerParams[Events, Any]) => Unit,
      getProps: () => Props,
      on: js.Function3[
          /* instance */ Instance, 
          /* eventName */ EventKey[Events], 
          /* listener */ ReactiveEventCallback[Events, EventKey[Events]], 
          Unit | js.Function0[Unit]
        ] => Unit,
      onDestroy: js.Function2[/* instance */ Instance, /* props */ Props, Unit] => Unit,
      onInit: js.Function2[/* instance */ Instance, /* props */ Props, Unit] => Unit,
      onMounted: js.Function2[/* props */ Props, /* instance */ js.UndefOr[Instance | Null], Instance | Unit] => Unit,
      setEvents: js.Array[/* keyof Events */ String] => Unit,
      setInitialState: State => Unit,
      setMethods: js.Array[Methods] => Unit
    ): ReactiveSetup[Instance, State, Methods, Props, Events] = {
      val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), getProps = js.Any.fromFunction0(getProps), on = js.Any.fromFunction1(on), onDestroy = js.Any.fromFunction1(onDestroy), onInit = js.Any.fromFunction1(onInit), onMounted = js.Any.fromFunction1(onMounted), setEvents = js.Any.fromFunction1(setEvents), setInitialState = js.Any.fromFunction1(setInitialState), setMethods = js.Any.fromFunction1(setMethods))
      __obj.asInstanceOf[ReactiveSetup[Instance, State, Methods, Props, Events]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReactiveSetup[?, ?, ?, ?, ?], Instance /* <: ReactiveSubscribe[Record[String, Any]] */, State /* <: Record[String, Any] */, Methods /* <: /* keyof std.Partial<Instance> */ String */, Props, Events /* <: Record[String, Any] */] (val x: Self & (ReactiveSetup[Instance, State, Methods, Props, Events])) extends AnyVal {
      
      inline def setEmit(value: (Any, EventTriggerParams[Events, Any]) => Unit): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
      
      inline def setGetProps(value: () => Props): Self = StObject.set(x, "getProps", js.Any.fromFunction0(value))
      
      inline def setOn(
        value: js.Function3[
              /* instance */ Instance, 
              /* eventName */ EventKey[Events], 
              /* listener */ ReactiveEventCallback[Events, EventKey[Events]], 
              Unit | js.Function0[Unit]
            ] => Unit
      ): Self = StObject.set(x, "on", js.Any.fromFunction1(value))
      
      inline def setOnDestroy(value: js.Function2[/* instance */ Instance, /* props */ Props, Unit] => Unit): Self = StObject.set(x, "onDestroy", js.Any.fromFunction1(value))
      
      inline def setOnInit(value: js.Function2[/* instance */ Instance, /* props */ Props, Unit] => Unit): Self = StObject.set(x, "onInit", js.Any.fromFunction1(value))
      
      inline def setOnMounted(
        value: js.Function2[/* props */ Props, /* instance */ js.UndefOr[Instance | Null], Instance | Unit] => Unit
      ): Self = StObject.set(x, "onMounted", js.Any.fromFunction1(value))
      
      inline def setSetEvents(value: js.Array[/* keyof Events */ String] => Unit): Self = StObject.set(x, "setEvents", js.Any.fromFunction1(value))
      
      inline def setSetInitialState(value: State => Unit): Self = StObject.set(x, "setInitialState", js.Any.fromFunction1(value))
      
      inline def setSetMethods(value: js.Array[Methods] => Unit): Self = StObject.set(x, "setMethods", js.Any.fromFunction1(value))
    }
  }
  
  type ReactiveSetupAdapter[Instance /* <: ReactiveSubscribe[Record[String, Any]] */, State /* <: Record[String, Any] */, Methods /* <: /* keyof std.Partial<Instance> */ String */, Props, Events /* <: Record[String, Any] */] = js.Function1[
    /* setup */ ReactiveSetup[Instance, State, Methods, Props, Events], 
    js.UndefOr[Instance | Unit]
  ]
}
