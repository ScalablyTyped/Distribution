package typings.ckeditorCkeditor5Utils

import org.scalablytyped.runtime.Instantiable1
import typings.ckeditorCkeditor5Utils.anon.IdProperty
import typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.add
import typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.change
import typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.remove
import typings.std.Iterable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCollectionMod {
  
  @JSImport("@ckeditor/ckeditor5-utils/src/collection", JSImport.Default)
  @js.native
  /**
    * Creates a new Collection instance.
    *
    * You can pass a configuration object as the argument of the constructor:
    *
    * ```ts
    * const emptyCollection = new Collection<{ name: string }>( { idProperty: 'name' } );
    * emptyCollection.add( { name: 'John' } );
    * console.log( collection.get( 'John' ) ); // -> { name: 'John' }
    * ```
    *
    * The collection is empty by default. You can add new items using the {@link #add} method:
    *
    * ```ts
    * const collection = new Collection<{ id: string }>();
    *
    * collection.add( { id: 'John' } );
    * console.log( collection.get( 0 ) ); // -> { id: 'John' }
    * ```
    *
    * @label NO_ITEMS
    * @param options The options object.
    * @param options.idProperty The name of the property which is used to identify an item.
    * Items that do not have such a property will be assigned one when added to the collection.
    */
  open class default[T /* <: Record[String, Any] */] ()
    extends StObject
       with Collection[T] {
    /**
      * Creates a new Collection instance with specified initial items.
      *
      * ```ts
      * const collection = new Collection<{ id: string }>( [ { id: 'John' }, { id: 'Mike' } ] );
      *
      * console.log( collection.get( 0 ) ); // -> { id: 'John' }
      * console.log( collection.get( 1 ) ); // -> { id: 'Mike' }
      * console.log( collection.get( 'Mike' ) ); // -> { id: 'Mike' }
      * ```
      *
      * You can always pass a configuration object as the last argument of the constructor:
      *
      * ```ts
      * const nonEmptyCollection = new Collection<{ name: string }>( [ { name: 'John' } ], { idProperty: 'name' } );
      * nonEmptyCollection.add( { name: 'George' } );
      * console.log( collection.get( 'George' ) ); // -> { name: 'George' }
      * console.log( collection.get( 'John' ) ); // -> { name: 'John' }
      * ```
      *
      * @label INITIAL_ITEMS
      * @param initialItems The initial items of the collection.
      * @param options The options object.
      * @param options.idProperty The name of the property which is used to identify an item.
      * Items that do not have such a property will be assigned one when added to the collection.
      */
    def this(initialItems: js.Iterable[T]) = this()
    def this(options: IdProperty) = this()
    def this(initialItems: js.Iterable[T], options: IdProperty) = this()
  }
  
  @js.native
  trait Collection[T /* <: Record[String, Any] */]
    extends StObject
       with Iterable[T] {
    
    /**
      * A collection instance this collection is bound to as a result
      * of calling {@link #bindTo} method.
      */
    /* private */ var _bindToCollection: Any = js.native
    
    /**
      * A helper mapping external items of a bound collection ({@link #bindTo})
      * and actual items of this collection. It provides information
      * necessary to properly remove items bound to another collection.
      *
      * See {@link #_bindToInternalToExternalMap}.
      */
    /* private */ val _bindToExternalToInternalMap: Any = js.native
    
    /**
      * A helper mapping items of this collection to external items of a bound collection
      * ({@link #bindTo}). It provides information necessary to manage the bindings, e.g.
      * to avoid loops in two–way bindings.
      *
      * See {@link #_bindToExternalToInternalMap}.
      */
    /* private */ val _bindToInternalToExternalMap: Any = js.native
    
    /**
      * Returns an unique id property for a given `item`.
      *
      * The method will generate new id and assign it to the `item` if it doesn't have any.
      *
      * @param item Item to be added.
      */
    /* private */ var _getItemIdBeforeAdding: Any = js.native
    
    /**
      * The name of the property which is considered to identify an item.
      */
    /* private */ val _idProperty: Any = js.native
    
    /**
      * The internal map of items in the collection.
      */
    /* private */ val _itemMap: Any = js.native
    
    /**
      * The internal list of items in the collection.
      */
    /* private */ val _items: Any = js.native
    
    /**
      * Core {@link #remove} method implementation shared in other functions.
      *
      * In contrast this method **does not** fire the {@link #event:change} event.
      *
      * @param subject The item to remove, its id or index in the collection.
      * @returns Returns an array with the removed item and its index.
      * @fires remove
      */
    /* private */ var _remove: Any = js.native
    
    /**
      * Finalizes and activates a binding initiated by {@link #bindTo}.
      *
      * @param factory A function which produces collection items.
      */
    /* private */ var _setUpBindToBinding: Any = js.native
    
    /**
      * Stores indexes of skipped items from bound external collection.
      */
    /* private */ var _skippedIndexesFromExternal: Any = js.native
    
    /**
      * Adds an item into the collection.
      *
      * If the item does not have an id, then it will be automatically generated and set on the item.
      *
      * @param item
      * @param index The position of the item in the collection. The item
      * is pushed to the collection when `index` not specified.
      * @fires add
      * @fires change
      */
    def add(item: T): this.type = js.native
    def add(item: T, index: Double): this.type = js.native
    
    /**
      * Adds multiple items into the collection.
      *
      * Any item not containing an id will get an automatically generated one.
      *
      * @param items
      * @param index The position of the insertion. Items will be appended if no `index` is specified.
      * @fires add
      * @fires change
      */
    def addMany(items: js.Iterable[T]): this.type = js.native
    def addMany(items: js.Iterable[T], index: Double): this.type = js.native
    
    /**
      * Binds and synchronizes the collection with another one.
      *
      * The binding can be a simple factory:
      *
      * ```ts
      * class FactoryClass {
      * 	public label: string;
      *
      * 	constructor( data: { label: string } ) {
      * 		this.label = data.label;
      * 	}
      * }
      *
      * const source = new Collection<{ label: string }>( { idProperty: 'label' } );
      * const target = new Collection<FactoryClass>();
      *
      * target.bindTo( source ).as( FactoryClass );
      *
      * source.add( { label: 'foo' } );
      * source.add( { label: 'bar' } );
      *
      * console.log( target.length ); // 2
      * console.log( target.get( 1 ).label ); // 'bar'
      *
      * source.remove( 0 );
      * console.log( target.length ); // 1
      * console.log( target.get( 0 ).label ); // 'bar'
      * ```
      *
      * or the factory driven by a custom callback:
      *
      * ```ts
      * class FooClass {
      * 	public label: string;
      *
      * 	constructor( data: { label: string } ) {
      * 		this.label = data.label;
      * 	}
      * }
      *
      * class BarClass {
      * 	public label: string;
      *
      * 	constructor( data: { label: string } ) {
      * 		this.label = data.label;
      * 	}
      * }
      *
      * const source = new Collection<{ label: string }>( { idProperty: 'label' } );
      * const target = new Collection<FooClass | BarClass>();
      *
      * target.bindTo( source ).using( ( item ) => {
      * 	if ( item.label == 'foo' ) {
      * 		return new FooClass( item );
      * 	} else {
      * 		return new BarClass( item );
      * 	}
      * } );
      *
      * source.add( { label: 'foo' } );
      * source.add( { label: 'bar' } );
      *
      * console.log( target.length ); // 2
      * console.log( target.get( 0 ) instanceof FooClass ); // true
      * console.log( target.get( 1 ) instanceof BarClass ); // true
      * ```
      *
      * or the factory out of property name:
      *
      * ```ts
      * const source = new Collection<{ nested: { value: string } }>();
      * const target = new Collection<{ value: string }>();
      *
      * target.bindTo( source ).using( 'nested' );
      *
      * source.add( { nested: { value: 'foo' } } );
      * source.add( { nested: { value: 'bar' } } );
      *
      * console.log( target.length ); // 2
      * console.log( target.get( 0 ).value ); // 'foo'
      * console.log( target.get( 1 ).value ); // 'bar'
      * ```
      *
      * It's possible to skip specified items by returning null value:
      *
      * ```ts
      * const source = new Collection<{ hidden: boolean }>();
      * const target = new Collection<{ hidden: boolean }>();
      *
      * target.bindTo( source ).using( item => {
      * 	if ( item.hidden ) {
      * 		return null;
      * 	}
      *
      * 	return item;
      * } );
      *
      * source.add( { hidden: true } );
      * source.add( { hidden: false } );
      *
      * console.log( source.length ); // 2
      * console.log( target.length ); // 1
      * ```
      *
      * **Note**: {@link #clear} can be used to break the binding.
      *
      * @typeParam S The type of `externalCollection` element.
      * @param externalCollection A collection to be bound.
      * @returns The binding chain object.
      */
    def bindTo[S /* <: Record[String, Any] */](externalCollection: Collection[S]): CollectionBindToChain[S, T] = js.native
    
    /**
      * Removes all items from the collection and destroys the binding created using
      * {@link #bindTo}.
      *
      * @fires remove
      * @fires change
      */
    def clear(): Unit = js.native
    
    /**
      * Returns an array with items for which the `callback` returned a true value.
      *
      * @param callback
      * @param ctx Context in which the `callback` will be called.
      * @returns The array with matching items.
      */
    def filter(callback: js.Function2[/* item */ T, /* index */ Double, Boolean]): js.Array[T] = js.native
    def filter(callback: js.Function2[/* item */ T, /* index */ Double, Boolean], ctx: Any): js.Array[T] = js.native
    
    /**
      * Finds the first item in the collection for which the `callback` returns a true value.
      *
      * @param callback
      * @param ctx Context in which the `callback` will be called.
      * @returns The item for which `callback` returned a true value.
      */
    def find(callback: js.Function2[/* item */ T, /* index */ Double, Boolean]): js.UndefOr[T] = js.native
    def find(callback: js.Function2[/* item */ T, /* index */ Double, Boolean], ctx: Any): js.UndefOr[T] = js.native
    
    /**
      * Returns the first item from the collection or null when collection is empty.
      */
    def first: T | Null = js.native
    
    /**
      * Gets an item by its ID or index.
      *
      * @param idOrIndex The item ID or index in the collection.
      * @returns The requested item or `null` if such item does not exist.
      */
    def get(idOrIndex: String): T | Null = js.native
    def get(idOrIndex: Double): T | Null = js.native
    
    /**
      * Gets an index of an item in the collection.
      * When an item is not defined in the collection, the index will equal -1.
      *
      * @param itemOrId The item or its ID in the collection.
      * @returns The index of a given item.
      */
    def getIndex(itemOrId: T): Double = js.native
    def getIndex(itemOrId: String): Double = js.native
    
    /**
      * Returns a Boolean indicating whether the collection contains an item.
      *
      * @param itemOrId The item or its ID in the collection.
      * @returns `true` if the collection contains the item, `false` otherwise.
      */
    def has(itemOrId: T): Boolean = js.native
    def has(itemOrId: String): Boolean = js.native
    
    /**
      * Returns the last item from the collection or null when collection is empty.
      */
    def last: T | Null = js.native
    
    /**
      * The number of items available in the collection.
      */
    def length: Double = js.native
    
    /**
      * Executes the callback for each item in the collection and composes an array or values returned by this callback.
      *
      * @typeParam U The result type of the callback.
      * @param callback
      * @param ctx Context in which the `callback` will be called.
      * @returns The result of mapping.
      */
    def map[U](callback: js.Function2[/* item */ T, /* index */ Double, U]): js.Array[U] = js.native
    def map[U](callback: js.Function2[/* item */ T, /* index */ Double, U], ctx: Any): js.Array[U] = js.native
    
    /**
      * Removes an item from the collection.
      *
      * @param subject The item to remove, its ID or index in the collection.
      * @returns The removed item.
      * @fires remove
      * @fires change
      */
    def remove(subject: T): T = js.native
    def remove(subject: String): T = js.native
    def remove(subject: Double): T = js.native
  }
  
  trait CollectionAddEvent[T] extends StObject {
    
    var args: js.Tuple2[/* item */ T, /* index */ Double]
    
    var name: add
  }
  object CollectionAddEvent {
    
    inline def apply[T](args: js.Tuple2[/* item */ T, /* index */ Double]): CollectionAddEvent[T] = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = "add")
      __obj.asInstanceOf[CollectionAddEvent[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CollectionAddEvent[?], T] (val x: Self & CollectionAddEvent[T]) extends AnyVal {
      
      inline def setArgs(value: js.Tuple2[/* item */ T, /* index */ Double]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setName(value: add): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CollectionBindToChain[S, T] extends StObject {
    
    /**
      * Creates the class factory binding in which items of the source collection are passed to
      * the constructor of the specified class.
      *
      * @param Class The class constructor used to create instances in the factory.
      */
    def as(Class: Instantiable1[/* item */ S, T]): Unit = js.native
    
    /**
      * Creates a callback or a property binding.
      *
      * @param callbackOrProperty When the function is passed, it should return
      * the collection items. When the string is provided, the property value is used to create the bound collection items.
      */
    def `using`(callbackOrProperty: /* keyof S */ String): Unit = js.native
    def `using`(callbackOrProperty: js.Function1[/* item */ S, T | Null]): Unit = js.native
  }
  
  trait CollectionChangeEvent[T] extends StObject {
    
    var args: js.Array[/* data */ CollectionChangeEventData[T]]
    
    var name: change
  }
  object CollectionChangeEvent {
    
    inline def apply[T](args: js.Array[/* data */ CollectionChangeEventData[T]]): CollectionChangeEvent[T] = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = "change")
      __obj.asInstanceOf[CollectionChangeEvent[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CollectionChangeEvent[?], T] (val x: Self & CollectionChangeEvent[T]) extends AnyVal {
      
      inline def setArgs(value: js.Array[/* data */ CollectionChangeEventData[T]]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: (/* data */ CollectionChangeEventData[T])*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setName(value: change): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait CollectionChangeEventData[T] extends StObject {
    
    /**
      * A list of added items.
      */
    var added: js.Iterable[T]
    
    /**
      * An index where the addition or removal occurred.
      */
    var index: Double
    
    /**
      * A list of removed items.
      */
    var removed: js.Iterable[T]
  }
  object CollectionChangeEventData {
    
    inline def apply[T](added: js.Iterable[T], index: Double, removed: js.Iterable[T]): CollectionChangeEventData[T] = {
      val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollectionChangeEventData[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CollectionChangeEventData[?], T] (val x: Self & CollectionChangeEventData[T]) extends AnyVal {
      
      inline def setAdded(value: js.Iterable[T]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setRemoved(value: js.Iterable[T]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    }
  }
  
  trait CollectionRemoveEvent[T] extends StObject {
    
    var args: js.Tuple2[/* item */ T, /* index */ Double]
    
    var name: remove
  }
  object CollectionRemoveEvent {
    
    inline def apply[T](args: js.Tuple2[/* item */ T, /* index */ Double]): CollectionRemoveEvent[T] = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = "remove")
      __obj.asInstanceOf[CollectionRemoveEvent[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CollectionRemoveEvent[?], T] (val x: Self & CollectionRemoveEvent[T]) extends AnyVal {
      
      inline def setArgs(value: js.Tuple2[/* item */ T, /* index */ Double]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setName(value: remove): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
