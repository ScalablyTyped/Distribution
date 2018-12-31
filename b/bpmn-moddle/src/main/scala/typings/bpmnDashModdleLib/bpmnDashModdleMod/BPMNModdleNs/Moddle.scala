package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Moddle extends js.Object {
  def create(descriptor: js.Any): BaseElement = js.native
  def create(descriptor: js.Any, attrs: js.Any): BaseElement = js.native
  /**
    * Create an instance of the specified type.
    *
    * @example
    *
    * var foo = moddle.create('my:Foo');
    * var bar = moddle.create('my:Bar', { id: 'BAR_1' });
    *
    * @param  descriptor the type descriptor or name know to the model
    * @param  attrs   a number of attributes to initialize the model instance with
    * @return model instance
    */
  def create[T, K /* <: java.lang.String */](descriptor: K): /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any = js.native
  def create[T, K /* <: java.lang.String */](descriptor: K, attrs: js.Any): /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any = js.native
  /**
    * Creates an any-element type to be used within model instances.
    *
    * This can be used to create custom elements that lie outside the meta-model.
    * The created element contains all the meta-data required to serialize it
    * as part of meta-model elements.
    *
    * @example
    *
    * var foo = moddle.createAny('vendor:Foo', 'http://vendor', {
    *   value: 'bar'
    * });
    *
    * var container = moddle.create('my:Container', 'http://my', {
    *   any: [ foo ]
    * });
    *
    * // go ahead and serialize the stuff
    *
    *
    * @param  name  the name of the element
    * @param  nsUri the namespace uri of the element
    * @param  [properties] a map of properties to initialize the instance with
    * @return the any type instance
    */
  def createAny(name: java.lang.String, nsUri: java.lang.String, properties: js.Any): js.Any = js.native
  /**
    * Returns the descriptor for an element
    */
  def getElementDescriptor(element: js.Any): js.Any = js.native
  /**
    * Returns a registered package by uri or prefix
    *
    * @return the package
    */
  def getPackage(uriOrPrefix: js.Any): js.Any = js.native
  /**
    * Returns a snapshot of all known packages
    *
    * @return the package
    */
  def getPackages(): js.Any = js.native
  /**
    * Returns the descriptor of an elements named property
    */
  def getPropertyDescriptor(element: js.Any, property: js.Any): js.Any = js.native
  /**
    * Returns the type representing a given descriptor
    *
    * @example
    *
    * var Foo = moddle.getType('my:Foo');
    * var foo = new Foo({ 'id' : 'FOO_1' });
    *
    * @param  descriptor the type descriptor or name know to the model
    * @return the type representing the descriptor
    */
  def getType(descriptor: js.Any): js.Any = js.native
  /**
    * Returns a mapped type's descriptor
    */
  def getTypeDescriptor(`type`: java.lang.String): js.Any = js.native
  /**
    * Returns true if the given descriptor or instance
    * represents the given type.
    *
    * May be applied to this, if element is omitted.
    */
  def hasType(element: js.Any, `type`: java.lang.String): js.Any = js.native
}

