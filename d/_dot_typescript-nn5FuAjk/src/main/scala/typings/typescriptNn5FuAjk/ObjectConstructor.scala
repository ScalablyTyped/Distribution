package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.std.ThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectConstructor
  extends StObject
     with Instantiable0[Object]
     with Instantiable1[/* value */ Any, Object] {
  
  def apply(): Any = js.native
  def apply(value: Any): Any = js.native
  
  /**
    * Copy the values of all of the enumerable own properties from one or more source objects to a
    * target object. Returns the target object.
    * @param target The target object to copy to.
    * @param sources One or more source objects from which to copy properties
    */
  def assign(target: js.Object, sources: Any*): Any = js.native
  /**
    * Copy the values of all of the enumerable own properties from one or more source objects to a
    * target object. Returns the target object.
    * @param target The target object to copy to.
    * @param source The source object from which to copy properties.
    */
  def assign[T /* <: js.Object */, U](target: T, source: U): T & U = js.native
  /**
    * Copy the values of all of the enumerable own properties from one or more source objects to a
    * target object. Returns the target object.
    * @param target The target object to copy to.
    * @param source1 The first source object from which to copy properties.
    * @param source2 The second source object from which to copy properties.
    */
  def assign[T /* <: js.Object */, U, V](target: T, source1: U, source2: V): T & U & V = js.native
  /**
    * Copy the values of all of the enumerable own properties from one or more source objects to a
    * target object. Returns the target object.
    * @param target The target object to copy to.
    * @param source1 The first source object from which to copy properties.
    * @param source2 The second source object from which to copy properties.
    * @param source3 The third source object from which to copy properties.
    */
  def assign[T /* <: js.Object */, U, V, W](target: T, source1: U, source2: V, source3: W): T & U & V & W = js.native
  
  /**
    * Creates an object that has the specified prototype or that has null prototype.
    * @param o Object to use as a prototype. May be null.
    */
  def create(): Any = js.native
  def create(o: js.Object): Any = js.native
  /**
    * Creates an object that has the specified prototype, and that optionally contains specified properties.
    * @param o Object to use as a prototype. May be null
    * @param properties JavaScript object that contains one or more property descriptors.
    */
  def create(o: js.Object, properties: PropertyDescriptorMap & ThisType[Any]): Any = js.native
  def create(o: Null, properties: PropertyDescriptorMap & ThisType[Any]): Any = js.native
  
  /**
    * Adds one or more properties to an object, and/or modifies attributes of existing properties.
    * @param o Object on which to add or modify the properties. This can be a native JavaScript object or a DOM object.
    * @param properties JavaScript object that contains one or more descriptor objects. Each descriptor object describes a data property or an accessor property.
    */
  def defineProperties[T](o: T, properties: PropertyDescriptorMap & ThisType[Any]): T = js.native
  
  /**
    * Adds a property to an object, or modifies attributes of an existing property.
    * @param o Object on which to add or modify the property. This can be a native JavaScript object (that is, a user-defined object or a built in object) or a DOM object.
    * @param p The property name.
    * @param attributes Descriptor for the property. It can be for a data property or an accessor property.
    */
  def defineProperty[T](o: T, p: PropertyKey, attributes: PropertyDescriptor & ThisType[Any]): T = js.native
  
  /**
    * Returns an array of key/values of the enumerable properties of an object
    * @param o Object that contains the properties and methods. This can be an object that you created or an existing Document Object Model (DOM) object.
    */
  def entries(o: js.Object): Array[js.Tuple2[java.lang.String, Any]] = js.native
  /**
    * Returns an array of key/values of the enumerable properties of an object
    * @param o Object that contains the properties and methods. This can be an object that you created or an existing Document Object Model (DOM) object.
    */
  def entries[T](o: StringDictionary[T]): Array[js.Tuple2[java.lang.String, T]] = js.native
  def entries[T](o: ArrayLike[T]): Array[js.Tuple2[java.lang.String, T]] = js.native
  
  /**
    * Prevents the modification of existing property attributes and values, and prevents the addition of new properties.
    * @param a Object on which to lock the attributes.
    */
  def freeze[T](a: Array[T]): Array[T] = js.native
  /**
    * Prevents the modification of existing property attributes and values, and prevents the addition of new properties.
    * @param o Object on which to lock the attributes.
    */
  def freeze[T](o: T): Readonly[T] = js.native
  /**
    * Prevents the modification of existing property attributes and values, and prevents the addition of new properties.
    * @param f Object on which to lock the attributes.
    */
  @JSName("freeze")
  def freeze_T_Function_T[T /* <: Function */](f: T): T = js.native
  /**
    * Prevents the modification of existing property attributes and values, and prevents the addition of new properties.
    * @param o Object on which to lock the attributes.
    */
  @JSName("freeze")
  def `freeze_T_StringDictionaryUnionUNull<undefined>ObjectU_UnionStringBigIntDoubleBooleanSymbol`[T /* <: StringDictionary[js.UndefOr[U | Null | js.Object]] */, U /* <: java.lang.String | js.BigInt | Double | scala.Boolean | js.Symbol */](o: T): Readonly[T] = js.native
  
  /**
    * Returns an object created by key-value entries for properties and methods
    * @param entries An iterable object that contains key-value entries for properties and methods.
    */
  def fromEntries(entries: Iterable[Array[Any]]): Any = js.native
  /**
    * Returns an object created by key-value entries for properties and methods
    * @param entries An iterable object that contains key-value entries for properties and methods.
    */
  @JSName("fromEntries")
  def fromEntries_T_StringDictionary[T](entries: Iterable[js.Tuple2[PropertyKey, T]]): StringDictionary[T] = js.native
  
  /**
    * Gets the own property descriptor of the specified object.
    * An own property descriptor is one that is defined directly on the object and is not inherited from the object's prototype.
    * @param o Object that contains the property.
    * @param p Name of the property.
    */
  def getOwnPropertyDescriptor(o: Any, p: PropertyKey): js.UndefOr[PropertyDescriptor] = js.native
  
  /**
    * Returns an object containing all own property descriptors of an object
    * @param o Object that contains the properties and methods. This can be an object that you created or an existing Document Object Model (DOM) object.
    */
  def getOwnPropertyDescriptors[T](o: T): typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.ObjectConstructor & TopLevel[T] & StringDictionary[PropertyDescriptor] = js.native
  
  /**
    * Returns the names of the own properties of an object. The own properties of an object are those that are defined directly
    * on that object, and are not inherited from the object's prototype. The properties of an object include both fields (objects) and functions.
    * @param o Object that contains the own properties.
    */
  def getOwnPropertyNames(o: Any): Array[java.lang.String] = js.native
  
  /**
    * Returns an array of all symbol properties found directly on object o.
    * @param o Object to retrieve the symbols from.
    */
  def getOwnPropertySymbols(o: Any): Array[js.Symbol] = js.native
  
  /**
    * Returns the prototype of an object.
    * @param o The object that references the prototype.
    */
  def getPrototypeOf(o: Any): Any = js.native
  
  /**
    * Determines whether an object has a property with the specified name.
    * @param o An object.
    * @param v A property name.
    */
  def hasOwn(o: js.Object, v: PropertyKey): scala.Boolean = js.native
  
  /**
    * Returns true if the values are the same value, false otherwise.
    * @param value1 The first value.
    * @param value2 The second value.
    */
  def is(value1: Any, value2: Any): scala.Boolean = js.native
  
  /**
    * Returns a value that indicates whether new properties can be added to an object.
    * @param o Object to test.
    */
  def isExtensible(o: Any): scala.Boolean = js.native
  
  /**
    * Returns true if existing property attributes and values cannot be modified in an object, and new properties cannot be added to the object.
    * @param o Object to test.
    */
  def isFrozen(o: Any): scala.Boolean = js.native
  
  /**
    * Returns true if existing property attributes cannot be modified in an object and new properties cannot be added to the object.
    * @param o Object to test.
    */
  def isSealed(o: Any): scala.Boolean = js.native
  
  /**
    * Returns the names of the enumerable string properties and methods of an object.
    * @param o Object that contains the properties and methods. This can be an object that you created or an existing Document Object Model (DOM) object.
    */
  def keys(o: js.Object): Array[java.lang.String] = js.native
  
  /**
    * Prevents the addition of new properties to an object.
    * @param o Object to make non-extensible.
    */
  def preventExtensions[T](o: T): T = js.native
  
  /**
    * Prevents the modification of attributes of existing properties, and prevents the addition of new properties.
    * @param o Object on which to lock the attributes.
    */
  def seal[T](o: T): T = js.native
  
  /**
    * Sets the prototype of a specified object o to object proto or null. Returns the object o.
    * @param o The object to change its prototype.
    * @param proto The value of the new prototype or null.
    */
  def setPrototypeOf(o: Any): Any = js.native
  def setPrototypeOf(o: Any, proto: js.Object): Any = js.native
  
  /**
    * Returns an array of values of the enumerable properties of an object
    * @param o Object that contains the properties and methods. This can be an object that you created or an existing Document Object Model (DOM) object.
    */
  def values(o: js.Object): Array[Any] = js.native
  /**
    * Returns an array of values of the enumerable properties of an object
    * @param o Object that contains the properties and methods. This can be an object that you created or an existing Document Object Model (DOM) object.
    */
  def values[T](o: StringDictionary[T]): Array[T] = js.native
  def values[T](o: ArrayLike[T]): Array[T] = js.native
}
