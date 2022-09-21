package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.ObjectConstructor
import typings.typescriptNn5FuAjk.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Object")
@js.native
open class Object ()
  extends StObject
     with typings.typescriptNn5FuAjk.Object {
  def this(value: Any) = this()
  
  /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
  /* CompleteClass */
  var constructor: typings.typescriptNn5FuAjk.Function = js.native
  
  /**
    * Determines whether an object has a property with the specified name.
    * @param v A property name.
    */
  /* CompleteClass */
  override def hasOwnProperty(v: PropertyKey): scala.Boolean = js.native
  
  /**
    * Determines whether an object exists in another object's prototype chain.
    * @param v Another object whose prototype chain is to be checked.
    */
  /* CompleteClass */
  override def isPrototypeOf(v: typings.typescriptNn5FuAjk.Object): scala.Boolean = js.native
  
  /**
    * Determines whether a specified property is enumerable.
    * @param v A property name.
    */
  /* CompleteClass */
  override def propertyIsEnumerable(v: PropertyKey): scala.Boolean = js.native
}
object Object {
  
  /**
    * Provides functionality common to all JavaScript objects.
    */
  inline def apply: ObjectConstructor = js.Dynamic.global.selectDynamic("Object").asInstanceOf[ObjectConstructor]
}
