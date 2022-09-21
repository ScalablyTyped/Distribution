package typings.blocks

import typings.blocks.anon.Express
import typings.blocks.anon.History
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlocksStatic extends StObject {
  
  def apply(obj: Any): Any = js.native
  
  /**
    * Use blocks.Application and its MVC(Model-View-Collection) structure to create better architecture and maintainability for your application.
    */
  def Application(): App = js.native
  def Application(options: History): App = js.native
  
  /**
    * Changes the this binding to a function and optionally passes additional parameters to the function.
    * Returns the newly created function having the new this binding and optional arguments.
    * 
    * @param func The function for which to change the this binding and optionally add arguments
    * @param thisArg The new this binding context value
    * @param args Optional arguments that will be passed to the function
    */
  def bind(func: js.Function, thisArg: Any, args: Any*): js.Function = js.native
  
  /**
    * Clones value. If deepClone is set to true the value will be cloned recursively
    * 
    * @param value Value/object to be cloned
    */
  def clone(value: Any): Any = js.native
  /**
    * @param value Value/object to be cloned
    * @param deepClone By default false
    */
  def clone(value: Any, deepClone: Boolean): Any = js.native
  
  /**
    * Gets the context for a particular element. Searches all parents until it finds the context.
    * 
    * @param element The element from which to search for a context
    * 
    */
  def context(element: Any): Any = js.native
  
  /**
    * Gets the associated dataItem for a particlar element. Searches all parents until it finds the context
    * 
    * @param element The element from which to search for a dataItem
    */
  def dataItem(element: Any): Any = js.native
  
  /**
    * Iterates over the collection
    * 
    * @param collection The array or object to iterate over
    * @param callback The callback that will be executed for each element in the collection
    * @param thisArg Optional this context for the callback
    */
  def each(
    collection: Any,
    callback: js.Function3[/* value */ Any, /* index */ Any, /* collection */ Any, Unit]
  ): Unit = js.native
  def each(
    collection: Any,
    callback: js.Function3[/* value */ Any, /* index */ Any, /* collection */ Any, Unit],
    thisArg: Any
  ): Unit = js.native
  
  /**
    * Iterates over the collection from end to start
    * 
    * @param collection The array or object to iterate over
    * @param callback The callback that will be executed for each element in the collection
    * @param thisArg Optional this context for the callback
    */
  def eachRight(
    collection: Any,
    callback: js.Function3[/* value */ Any, /* index */ Any, /* collection */ Any, Unit]
  ): Unit = js.native
  def eachRight(
    collection: Any,
    callback: js.Function3[/* value */ Any, /* index */ Any, /* collection */ Any, Unit],
    thisArg: Any
  ): Unit = js.native
  
  /**
    * Determines if two values are deeply equal. Set deepEqual to false to stop recusively equality checking
    * 
    * @param a The first object to be campared
    * @param b The second object to be compared
    */
  def equals(a: Any, b: Any): Boolean = js.native
  /**
    * @param a The first object to be campared
    * @param b The second object to be compared
    * @param deepEqual Determines if the equality check will recursively check all child properties
    */
  def equals(a: Any, b: Any, deepEqual: Boolean): Boolean = js.native
  
  /**
    * Copies properties from all provided objects into the first object parameter
    */
  def extend(obj: js.Object, objects: Any*): Unit = js.native
  
  /**
    * Checks if a variable has the specified property. Uses hasOwnProperty internally
    * 
    * @param obj The object to call hasOwnPrototype for
    * @param key The key to check if exists in the object
    */
  def has(obj: Any, key: String): Boolean = js.native
  
  /**
    * Determines if a specific value is the specified type
    * 
    * @param value The value
    * @param type The type
    */
  def is(value: Any, `type`: String): Boolean = js.native
  
  /**
    * Determines if a value is an array.
    * Returns false for array like objects (for example arguments object).
    * 
    * @param value The value to check if it is an array
    */
  def isArray(value: Any): Boolean = js.native
  
  /**
    * Determines if a the specified value is a boolean.
    * Whether the value is a boolean or not.
    *
    * @param value The value to be checked if it is a boolean
    */
  def isBoolean(value: Any): Boolean = js.native
  
  /**
    * Determines if the specified value is a HTML element.
    * Returns whether the value is a HTML element.
    * 
    * @param value The value to check if it is a HTML element
    */
  def isElement(value: Any): Boolean = js.native
  
  /**
    * Determines if the specified value is a HTML elements collection.
    * Returns whether the value is elements collection.
    * 
    * @param value The value to check if it is elements collection
    */
  def isElements(value: Any): Boolean = js.native
  
  /**
    * Determines if the specified value is an object.
    * Returns whether the value is an object.
    * 
    * @param obj The value to check for if it is an object
    */
  def isObject(obj: Any): Boolean = js.native
  
  /**
    * Determines if particular value is an blocks.observable
    * 
    * @param value The value to check if the value is observable
    */
  def isObservable(value: Any): Boolean = js.native
  
  /**
    * Determines if a value is a object created using {} or new Object.
    * Whether the value is a plain object or not.
    * 
    * @param obj The value that will be checked
    */
  def isPlainObject(obj: Any): Boolean = js.native
  
  /**
    * Represents a dummy empty function
    */
  def noop(): js.Function = js.native
  
  /**
    * Make observable property. You can specify initial value in parentheses.
    */
  def observable(): BlocksObservable = js.native
  def observable(value: js.Array[Any]): BlocksArray = js.native
  def observable(value: Any): BlocksObservable = js.native
  
  def optional(param: String): BlocksStatic = js.native
  def optional(param: String, defaultValue: Any): BlocksStatic = js.native
  
  /**
    * Performs a query operation on the DOM. Executes all data-query attributes
    * and renders the html result to the specified HTMLElement if not specified
    * uses document.body by default.
    * 
    * @param model The model that will be used to query the DOM.
    */
  def query(model: Any): Unit = js.native
  /**
    * @param model The model that will be used to query the DOM.
    * @param element Optional element on which to execute the query.
    */
  def query(model: Any, element: HTMLElement): Unit = js.native
  
  def range(start: Double, end: Double): BlocksStatic = js.native
  
  def route(route: String): BlocksStatic = js.native
  
  /**
    * Creates the server which will automatically handle server-side rendering.
    */
  def server(): Express = js.native
  /**
    * @param options Overrides default jsblocks options
    */
  def server(options: Server): Express = js.native
  
  /**
    * Converts a value to an array. Arguments object is converted to array and primitive values
    * are wrapped in an array.
    * Does nothing when value is already an array
    * 
    * @param value The value to be converted to an array
    */
  def toArray(value: Any): js.Array[Any] = js.native
  
  /**
    * Converts an integer or string to a unit. If the value could not be parsed to a number it is not converted
    * 
    * @param value The value to be converted to the specified unit
    */
  def toUnit(value: Any): Any = js.native
  /**
    * @param value The value to be converted to the specified unit
    * @param unit Optionally provide a unit to convert to. Default value is 'px'
    */
  def toUnit(value: Any, unit: String): Any = js.native
  
  /**
    * Determines the true type of an object.
    * Returns the type of the value as a string.
    * 
    * @param value The value for which to determine its type
    */
  def `type`(value: Any): String = js.native
  
  /**
    * Unwraps a jsblocks value to its raw representation.
    * Unwraps blocks.observable() and blocks() values
    * 
    * @param value The value that will be unwrapped
    */
  def unwrap(value: Any): Any = js.native
  
  /**
    * Gets the raw value of an observable or returns the value if the specified object is not an observable
    * 
    * @param value The value that could be any object observable or not
    */
  def unwrapObservable(value: Any): Any = js.native
}
