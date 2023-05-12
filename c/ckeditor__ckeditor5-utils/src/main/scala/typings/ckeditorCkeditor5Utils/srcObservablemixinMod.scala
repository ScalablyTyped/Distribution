package typings.ckeditorCkeditor5Utils

import typings.ckeditorCkeditor5Utils.anon.InstantiableObservable
import typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.change
import typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.set
import typings.ckeditorCkeditor5Utils.srcEmittermixinMod.Emitter
import typings.ckeditorCkeditor5Utils.srcMixMod.Constructor
import typings.ckeditorCkeditor5Utils.srcMixMod.Mixed
import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObservablemixinMod {
  
  @JSImport("@ckeditor/ckeditor5-utils/src/observablemixin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): InstantiableObservable = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[InstantiableObservable]
  inline def default[Base /* <: Constructor[Emitter] */](base: Base): Mixed[Base, Observable] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(base.asInstanceOf[js.Any]).asInstanceOf[Mixed[Base, Observable]]
  
  trait DecoratedMethodEvent[TObservable /* <: Observable & (/* import warning: importer.ImportType#apply Failed type conversion: {[ N in TName ]: (args : ...any): any} */ js.Any) */, TName /* <: /* keyof TObservable */ String */] extends StObject {
    
    var args: js.Array[
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: TObservable[TName] */ js.Any
        ]
      ]
    
    var name: TName
    
    var `return`: ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: TObservable[TName] */ js.Any
      ]
  }
  object DecoratedMethodEvent {
    
    inline def apply[TObservable /* <: Observable & (/* import warning: importer.ImportType#apply Failed type conversion: {[ N in TName ]: (args : ...any): any} */ js.Any) */, TName /* <: /* keyof TObservable */ String */](
      args: js.Array[
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: TObservable[TName] */ js.Any
          ]
        ],
      name: TName,
      `return`: ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: TObservable[TName] */ js.Any
        ]
    ): DecoratedMethodEvent[TObservable, TName] = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("return")(`return`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecoratedMethodEvent[TObservable, TName]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DecoratedMethodEvent[?, ?], TObservable /* <: Observable & (/* import warning: importer.ImportType#apply Failed type conversion: {[ N in TName ]: (args : ...any): any} */ js.Any) */, TName /* <: /* keyof TObservable */ String */] (val x: Self & (DecoratedMethodEvent[TObservable, TName])) extends AnyVal {
      
      inline def setArgs(
        value: js.Array[
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: TObservable[TName] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(
        value: (Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: TObservable[TName] */ js.Any
            ])*
      ): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setName(value: TName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setReturn(
        value: ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: TObservable[TName] */ js.Any
            ]
      ): Self = StObject.set(x, "return", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DualBindChain[TKey1 /* <: String */, TVal1, TKey2 /* <: String */, TVal2] extends StObject {
    
    def to[O /* <: Observable & (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in TKey1 ]: TVal1} */ js.Any) */](observable: O): Unit = js.native
    def to[O /* <: Observable & (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in K1 ]: TVal1} */ js.Any) */, K1 /* <: /* keyof O */ String */, K2 /* <: /* keyof O */ String */](observable: O, key1: K1, key2: K2): Unit = js.native
  }
  
  trait MultiBindChain extends StObject {
    
    def to[O /* <: Observable */](observable: O, properties: (/* keyof O */ String)*): Unit
  }
  object MultiBindChain {
    
    inline def apply(to: (Any, /* keyof O */ /* repeated */ String) => Unit): MultiBindChain = {
      val __obj = js.Dynamic.literal(to = js.Any.fromFunction2(to))
      __obj.asInstanceOf[MultiBindChain]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultiBindChain] (val x: Self) extends AnyVal {
      
      inline def setTo(value: (Any, /* keyof O */ /* repeated */ String) => Unit): Self = StObject.set(x, "to", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Observable
    extends StObject
       with Emitter {
    
    /**
      * Binds {@link #set observable properties} to other objects implementing the
      * {@link module:utils/observablemixin~Observable} interface.
      *
      * Read more in the {@glink framework/deep-dive/observables#property-bindings dedicated} guide
      * covering the topic of property bindings with some additional examples.
      *
      * Consider two objects: a `button` and an associated `command` (both `Observable`).
      *
      * A simple property binding could be as follows:
      *
      * ```ts
      * button.bind( 'isEnabled' ).to( command, 'isEnabled' );
      * ```
      *
      * or even shorter:
      *
      * ```ts
      * button.bind( 'isEnabled' ).to( command );
      * ```
      *
      * which works in the following way:
      *
      * * `button.isEnabled` **instantly equals** `command.isEnabled`,
      * * whenever `command.isEnabled` changes, `button.isEnabled` will immediately reflect its value.
      *
      * **Note**: To release the binding, use {@link module:utils/observablemixin~Observable#unbind}.
      *
      * You can also "rename" the property in the binding by specifying the new name in the `to()` chain:
      *
      * ```ts
      * button.bind( 'isEnabled' ).to( command, 'isWorking' );
      * ```
      *
      * It is possible to bind more than one property at a time to shorten the code:
      *
      * ```ts
      * button.bind( 'isEnabled', 'value' ).to( command );
      * ```
      *
      * which corresponds to:
      *
      * ```ts
      * button.bind( 'isEnabled' ).to( command );
      * button.bind( 'value' ).to( command );
      * ```
      *
      * The binding can include more than one observable, combining multiple data sources in a custom callback:
      *
      * ```ts
      * button.bind( 'isEnabled' ).to( command, 'isEnabled', ui, 'isVisible',
      * 	( isCommandEnabled, isUIVisible ) => isCommandEnabled && isUIVisible );
      * ```
      *
      * Using a custom callback allows processing the value before passing it to the target property:
      *
      * ```ts
      * button.bind( 'isEnabled' ).to( command, 'value', value => value === 'heading1' );
      * ```
      *
      * It is also possible to bind to the same property in an array of observables.
      * To bind a `button` to multiple commands (also `Observables`) so that each and every one of them
      * must be enabled for the button to become enabled, use the following code:
      *
      * ```ts
      * button.bind( 'isEnabled' ).toMany( [ commandA, commandB, commandC ], 'isEnabled',
      * 	( isAEnabled, isBEnabled, isCEnabled ) => isAEnabled && isBEnabled && isCEnabled );
      * ```
      *
      * @label MANY_BIND
      * @param bindProperties Observable properties that will be bound to other observable(s).
      * @returns The bind chain with the `to()` and `toMany()` methods.
      */
    def bind(bindProperties: (/* keyof this */ String)*): MultiBindChain = js.native
    /**
      * Binds {@link #set observable properties} to other objects implementing the
      * {@link module:utils/observablemixin~Observable} interface.
      *
      * Read more in the {@glink framework/deep-dive/observables#property-bindings dedicated} guide
      * covering the topic of property bindings with some additional examples.
      *
      * Consider two objects: a `button` and an associated `command` (both `Observable`).
      *
      * A simple property binding could be as follows:
      *
      * ```ts
      * button.bind( 'isEnabled' ).to( command, 'isEnabled' );
      * ```
      *
      * or even shorter:
      *
      * ```ts
      * button.bind( 'isEnabled' ).to( command );
      * ```
      *
      * which works in the following way:
      *
      * * `button.isEnabled` **instantly equals** `command.isEnabled`,
      * * whenever `command.isEnabled` changes, `button.isEnabled` will immediately reflect its value.
      *
      * **Note**: To release the binding, use {@link module:utils/observablemixin~Observable#unbind}.
      *
      * You can also "rename" the property in the binding by specifying the new name in the `to()` chain:
      *
      * ```ts
      * button.bind( 'isEnabled' ).to( command, 'isWorking' );
      * ```
      *
      * It is possible to bind more than one property at a time to shorten the code:
      *
      * ```ts
      * button.bind( 'isEnabled', 'value' ).to( command );
      * ```
      *
      * which corresponds to:
      *
      * ```ts
      * button.bind( 'isEnabled' ).to( command );
      * button.bind( 'value' ).to( command );
      * ```
      *
      * The binding can include more than one observable, combining multiple data sources in a custom callback:
      *
      * ```ts
      * button.bind( 'isEnabled' ).to( command, 'isEnabled', ui, 'isVisible',
      * 	( isCommandEnabled, isUIVisible ) => isCommandEnabled && isUIVisible );
      * ```
      *
      * Using a custom callback allows processing the value before passing it to the target property:
      *
      * ```ts
      * button.bind( 'isEnabled' ).to( command, 'value', value => value === 'heading1' );
      * ```
      *
      * It is also possible to bind to the same property in an array of observables.
      * To bind a `button` to multiple commands (also `Observables`) so that each and every one of them
      * must be enabled for the button to become enabled, use the following code:
      *
      * ```ts
      * button.bind( 'isEnabled' ).toMany( [ commandA, commandB, commandC ], 'isEnabled',
      * 	( isAEnabled, isBEnabled, isCEnabled ) => isAEnabled && isBEnabled && isCEnabled );
      * ```
      *
      * @label SINGLE_BIND
      * @param bindProperty Observable property that will be bound to other observable(s).
      * @returns The bind chain with the `to()` and `toMany()` methods.
      */
    def bind[K /* <: /* keyof this */ String */](bindProperty: K): SingleBindChain[
        K, 
        /* import warning: importer.ImportType#apply Failed type conversion: this[K] */ js.Any
      ] = js.native
    /**
      * Binds {@link #set observable properties} to other objects implementing the
      * {@link module:utils/observablemixin~Observable} interface.
      *
      * Read more in the {@glink framework/deep-dive/observables#property-bindings dedicated} guide
      * covering the topic of property bindings with some additional examples.
      *
      * Consider two objects: a `button` and an associated `command` (both `Observable`).
      *
      * A simple property binding could be as follows:
      *
      * ```ts
      * button.bind( 'isEnabled' ).to( command, 'isEnabled' );
      * ```
      *
      * or even shorter:
      *
      * ```ts
      * button.bind( 'isEnabled' ).to( command );
      * ```
      *
      * which works in the following way:
      *
      * * `button.isEnabled` **instantly equals** `command.isEnabled`,
      * * whenever `command.isEnabled` changes, `button.isEnabled` will immediately reflect its value.
      *
      * **Note**: To release the binding, use {@link module:utils/observablemixin~Observable#unbind}.
      *
      * You can also "rename" the property in the binding by specifying the new name in the `to()` chain:
      *
      * ```ts
      * button.bind( 'isEnabled' ).to( command, 'isWorking' );
      * ```
      *
      * It is possible to bind more than one property at a time to shorten the code:
      *
      * ```ts
      * button.bind( 'isEnabled', 'value' ).to( command );
      * ```
      *
      * which corresponds to:
      *
      * ```ts
      * button.bind( 'isEnabled' ).to( command );
      * button.bind( 'value' ).to( command );
      * ```
      *
      * The binding can include more than one observable, combining multiple data sources in a custom callback:
      *
      * ```ts
      * button.bind( 'isEnabled' ).to( command, 'isEnabled', ui, 'isVisible',
      * 	( isCommandEnabled, isUIVisible ) => isCommandEnabled && isUIVisible );
      * ```
      *
      * Using a custom callback allows processing the value before passing it to the target property:
      *
      * ```ts
      * button.bind( 'isEnabled' ).to( command, 'value', value => value === 'heading1' );
      * ```
      *
      * It is also possible to bind to the same property in an array of observables.
      * To bind a `button` to multiple commands (also `Observables`) so that each and every one of them
      * must be enabled for the button to become enabled, use the following code:
      *
      * ```ts
      * button.bind( 'isEnabled' ).toMany( [ commandA, commandB, commandC ], 'isEnabled',
      * 	( isAEnabled, isBEnabled, isCEnabled ) => isAEnabled && isBEnabled && isCEnabled );
      * ```
      *
      * @label DUAL_BIND
      * @param bindProperty1 Observable property that will be bound to other observable(s).
      * @param bindProperty2 Observable property that will be bound to other observable(s).
      * @returns The bind chain with the `to()` and `toMany()` methods.
      */
    def bind[K1 /* <: /* keyof this */ String */, K2 /* <: /* keyof this */ String */](bindProperty1: K1, bindProperty2: K2): DualBindChain[
        K1, 
        /* import warning: importer.ImportType#apply Failed type conversion: this[K1] */ js.Any, 
        K2, 
        /* import warning: importer.ImportType#apply Failed type conversion: this[K2] */ js.Any
      ] = js.native
    
    /**
      * Turns the given methods of this object into event-based ones. This means that the new method will fire an event
      * (named after the method) and the original action will be plugged as a listener to that event.
      *
      * Read more in the {@glink framework/deep-dive/observables#decorating-object-methods dedicated} guide
      * covering the topic of decorating methods with some additional examples.
      *
      * Decorating the method does not change its behavior (it only adds an event),
      * but it allows to modify it later on by listening to the method's event.
      *
      * For example, to cancel the method execution the event can be {@link module:utils/eventinfo~EventInfo#stop stopped}:
      *
      * ```ts
      * class Foo extends ObservableMixin() {
      * 	constructor() {
      * 		super();
      * 		this.decorate( 'method' );
      * 	}
      *
      * 	method() {
      * 		console.log( 'called!' );
      * 	}
      * }
      *
      * const foo = new Foo();
      * foo.on( 'method', ( evt ) => {
      * 	evt.stop();
      * }, { priority: 'high' } );
      *
      * foo.method(); // Nothing is logged.
      * ```
      *
      *
      * **Note**: The high {@link module:utils/priorities~PriorityString priority} listener
      * has been used to execute this particular callback before the one which calls the original method
      * (which uses the "normal" priority).
      *
      * It is also possible to change the returned value:
      *
      * ```ts
      * foo.on( 'method', ( evt ) => {
      * 	evt.return = 'Foo!';
      * } );
      *
      * foo.method(); // -> 'Foo'
      * ```
      *
      * Finally, it is possible to access and modify the arguments the method is called with:
      *
      * ```ts
      * method( a, b ) {
      * 	console.log( `${ a }, ${ b }`  );
      * }
      *
      * // ...
      *
      * foo.on( 'method', ( evt, args ) => {
      * 	args[ 0 ] = 3;
      *
      * 	console.log( args[ 1 ] ); // -> 2
      * }, { priority: 'high' } );
      *
      * foo.method( 1, 2 ); // -> '3, 2'
      * ```
      *
      * @param methodName Name of the method to decorate.
      */
    def decorate(methodName: /* keyof this */ String): Unit = js.native
    
    /**
      * Creates and sets the value of an observable properties of this object. Such a property becomes a part
      * of the state and is observable.
      *
      * It accepts a single object literal containing key/value pairs with properties to be set.
      *
      * This method throws the `observable-set-cannot-override` error if the observable instance already
      * has a property with the given property name. This prevents from mistakenly overriding existing
      * properties and methods, but means that `foo.set( 'bar', 1 )` may be slightly slower than `foo.bar = 1`.
      *
      * In TypeScript, those properties should be declared in class using `declare` keyword. In example:
      *
      * ```ts
      * public declare myProp1: number;
      * public declare myProp2: string;
      *
      * constructor() {
      * 	this.set( {
      * 		'myProp1: 2,
      * 		'myProp2: 'foo'
      * 	} );
      * }
      * ```
      * @label OBJECT
      * @param values An object with `name=>value` pairs.
      */
    def set(
      values: /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in keyof this ]:? unknown} */ js.Any
    ): Unit = js.native
    /**
      * Creates and sets the value of an observable property of this object. Such a property becomes a part
      * of the state and is observable.
      *
      * This method throws the `observable-set-cannot-override` error if the observable instance already
      * has a property with the given property name. This prevents from mistakenly overriding existing
      * properties and methods, but means that `foo.set( 'bar', 1 )` may be slightly slower than `foo.bar = 1`.
      *
      * In TypeScript, those properties should be declared in class using `declare` keyword. In example:
      *
      * ```ts
      * public declare myProp: number;
      *
      * constructor() {
      * 	this.set( 'myProp', 2 );
      * }
      * ```
      *
      * @label KEY_VALUE
      * @param name The property's name.
      * @param value The property's value.
      */
    def set[K /* <: /* keyof this */ String */](
      name: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: this[K] */ js.Any
    ): Unit = js.native
    
    /**
      * Removes the binding created with {@link #bind}.
      *
      * ```ts
      * // Removes the binding for the 'a' property.
      * A.unbind( 'a' );
      *
      * // Removes bindings for all properties.
      * A.unbind();
      * ```
      *
      * @param unbindProperties Observable properties to be unbound. All the bindings will
      * be released if no properties are provided.
      */
    def unbind(unbindProperties: (/* keyof this */ String)*): Unit = js.native
  }
  
  trait ObservableChangeEvent[TValue] extends StObject {
    
    var args: js.Tuple3[/* name */ String, /* value */ TValue, /* oldValue */ TValue]
    
    var name: change | (/* template literal string: change:${string} */ String)
  }
  object ObservableChangeEvent {
    
    inline def apply[TValue](
      args: js.Tuple3[/* name */ String, /* value */ TValue, /* oldValue */ TValue],
      name: change | (/* template literal string: change:${string} */ String)
    ): ObservableChangeEvent[TValue] = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObservableChangeEvent[TValue]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObservableChangeEvent[?], TValue] (val x: Self & ObservableChangeEvent[TValue]) extends AnyVal {
      
      inline def setArgs(value: js.Tuple3[/* name */ String, /* value */ TValue, /* oldValue */ TValue]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setName(value: change | (/* template literal string: change:${string} */ String)): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ObservableSetEvent[TValue] extends StObject {
    
    var args: js.Tuple3[/* name */ String, /* value */ TValue, /* oldValue */ TValue]
    
    var name: set | (/* template literal string: set:${string} */ String)
    
    var `return`: TValue
  }
  object ObservableSetEvent {
    
    inline def apply[TValue](
      args: js.Tuple3[/* name */ String, /* value */ TValue, /* oldValue */ TValue],
      name: set | (/* template literal string: set:${string} */ String),
      `return`: TValue
    ): ObservableSetEvent[TValue] = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("return")(`return`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObservableSetEvent[TValue]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObservableSetEvent[?], TValue] (val x: Self & ObservableSetEvent[TValue]) extends AnyVal {
      
      inline def setArgs(value: js.Tuple3[/* name */ String, /* value */ TValue, /* oldValue */ TValue]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setName(value: set | (/* template literal string: set:${string} */ String)): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setReturn(value: TValue): Self = StObject.set(x, "return", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SingleBindChain[TKey /* <: String */, TVal] extends StObject {
    
    def to[O /* <: Observable & (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in TKey ]: TVal} */ js.Any) */](observable: O): Unit = js.native
    def to[O /* <: Observable & (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in TKey ]: any} */ js.Any) */](
      observable: O,
      callback: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: O[TKey] */ /* value */ js.Any, 
          TVal
        ]
    ): Unit = js.native
    def to[O1 /* <: Observable & (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in TKey ]: any} */ js.Any) */, O2 /* <: Observable & (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in TKey ]: any} */ js.Any) */](
      observable1: O1,
      observable2: O2,
      callback: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: O1[TKey] */ /* value1 */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: O2[TKey] */ /* value2 */ js.Any, 
          TVal
        ]
    ): Unit = js.native
    def to[O /* <: Observable & (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in K ]: TVal} */ js.Any) */, K /* <: /* keyof O */ String */](observable: O, key: K): Unit = js.native
    def to[O /* <: Observable */, K /* <: /* keyof O */ String */](
      observable: O,
      key: K,
      callback: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: O[K] */ /* value */ js.Any, 
          TVal
        ]
    ): Unit = js.native
    def to[O1 /* <: Observable & (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in TKey ]: any} */ js.Any) */, O2 /* <: Observable & (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in TKey ]: any} */ js.Any) */, O3 /* <: Observable & (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in TKey ]: any} */ js.Any) */](
      observable1: O1,
      observable2: O2,
      observable3: O3,
      callback: js.Function3[
          /* import warning: importer.ImportType#apply Failed type conversion: O1[TKey] */ /* value1 */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: O2[TKey] */ /* value2 */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: O3[TKey] */ /* value3 */ js.Any, 
          TVal
        ]
    ): Unit = js.native
    def to[O1 /* <: Observable */, K1 /* <: /* keyof O1 */ String */, O2 /* <: Observable */, K2 /* <: /* keyof O2 */ String */](
      observable1: O1,
      key1: K1,
      observable2: O2,
      key2: K2,
      callback: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: O1[K1] */ /* value1 */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: O2[K2] */ /* value2 */ js.Any, 
          TVal
        ]
    ): Unit = js.native
    def to[O1 /* <: Observable & (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in TKey ]: any} */ js.Any) */, O2 /* <: Observable & (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in TKey ]: any} */ js.Any) */, O3 /* <: Observable & (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in TKey ]: any} */ js.Any) */, O4 /* <: Observable & (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in TKey ]: any} */ js.Any) */](
      observable1: O1,
      observable2: O2,
      observable3: O3,
      observable4: O4,
      callback: js.Function4[
          /* import warning: importer.ImportType#apply Failed type conversion: O1[TKey] */ /* value1 */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: O2[TKey] */ /* value2 */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: O3[TKey] */ /* value3 */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: O4[TKey] */ /* value4 */ js.Any, 
          TVal
        ]
    ): Unit = js.native
    def to[O1 /* <: Observable */, K1 /* <: /* keyof O1 */ String */, O2 /* <: Observable */, K2 /* <: /* keyof O2 */ String */, O3 /* <: Observable */, K3 /* <: /* keyof O3 */ String */](
      observable1: O1,
      key1: K1,
      observable2: O2,
      key2: K2,
      observable3: O3,
      key3: K3,
      callback: js.Function3[
          /* import warning: importer.ImportType#apply Failed type conversion: O1[K1] */ /* value1 */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: O2[K2] */ /* value2 */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: O3[K3] */ /* value3 */ js.Any, 
          TVal
        ]
    ): Unit = js.native
    def to[O1 /* <: Observable */, K1 /* <: /* keyof O1 */ String */, O2 /* <: Observable */, K2 /* <: /* keyof O2 */ String */, O3 /* <: Observable */, K3 /* <: /* keyof O3 */ String */, O4 /* <: Observable */, K4 /* <: /* keyof O4 */ String */](
      observable1: O1,
      key1: K1,
      observable2: O2,
      key2: K2,
      observable3: O3,
      key3: K3,
      observable4: O4,
      key4: K4,
      callback: js.Function4[
          /* import warning: importer.ImportType#apply Failed type conversion: O1[K1] */ /* value1 */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: O2[K2] */ /* value2 */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: O3[K3] */ /* value3 */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: O4[K4] */ /* value4 */ js.Any, 
          TVal
        ]
    ): Unit = js.native
    
    def toMany[O /* <: Observable */, K /* <: /* keyof O */ String */](
      observables: js.Array[O],
      key: K,
      callback: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: O[K] */ /* repeated */ js.Any, 
          TVal
        ]
    ): Unit = js.native
  }
}
