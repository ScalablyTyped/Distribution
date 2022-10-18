package typings.backbone.mod

import typings.backbone.backboneBooleans.`false`
import typings.jquery.JQueryXHR
import typings.std.Partial
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * E - Extensions to the model constructor options. You can accept additional constructor options
  * by listing them in the E parameter.
  */
@JSImport("backbone", "Model")
@js.native
open class Model[T /* <: ObjectHash */, S, E] () extends StObject {
  def this(attributes: T) = this()
  def this(attributes: T, options: CombinedModelConstructorOptions[E, Model[Any, ModelSetOptions, Any]]) = this()
  def this(attributes: Unit, options: CombinedModelConstructorOptions[E, Model[Any, ModelSetOptions, Any]]) = this()
  
  /* private */ var _changing: Boolean = js.native
  
  /* private */ var _pending: Boolean = js.native
  
  /* private */ var _previousAttributes: Partial[T] = js.native
  
  /* private */ def _validate(attributes: Partial[T], options: Any): Boolean = js.native
  
  var attributes: Partial[T] = js.native
  
  def chain(): Any = js.native
  
  var changed: Partial[T] = js.native
  
  /**
    * Return an object containing all the attributes that have changed, or
    * false if there are no changed attributes. Useful for determining what
    * parts of a view need to be updated and/or what attributes need to be
    * persisted to the server. Unset attributes will be set to undefined.
    * You can also pass an attributes object to diff against the model,
    * determining if there *would be* a change.
    */
  def changedAttributes(): Partial[T] | `false` = js.native
  def changedAttributes(attributes: Partial[T]): Partial[T] | `false` = js.native
  
  var cid: String = js.native
  
  var cidPrefix: String = js.native
  
  def clear(): this.type = js.native
  def clear(options: Silenceable): this.type = js.native
  
  var collection: Collection[this.type] = js.native
  
  /**
    * Default attributes for the model. It can be an object hash or a method returning an object hash.
    * For assigning an object hash, do it like this: this.defaults = <any>{ attribute: value, ... };
    * That works only if you set it in the constructor or the initialize method.
    */
  def defaults(): Partial[T] = js.native
  
  def destroy(): JQueryXHR | `false` = js.native
  def destroy(options: ModelDestroyOptions): JQueryXHR | `false` = js.native
  
  def escape(attribute: StringKey[T]): String = js.native
  
  def fetch(): JQueryXHR = js.native
  def fetch(options: ModelFetchOptions): JQueryXHR = js.native
  
  /**
    * For strongly-typed access to attributes, use the `get` method only privately in public getter properties.
    * @example
    * get name(): string {
    *    return super.get("name");
    * }
    */
  def get[A /* <: StringKey[T] */](attributeName: A): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[A] */ js.Any
  ] = js.native
  
  def has(attribute: StringKey[T]): Boolean = js.native
  
  def hasChanged(): Boolean = js.native
  def hasChanged(attribute: StringKey[T]): Boolean = js.native
  
  var id: String | Double = js.native
  
  var idAttribute: String = js.native
  
  def initialize(): Unit = js.native
  def initialize(attributes: T): Unit = js.native
  def initialize(attributes: T, options: CombinedModelConstructorOptions[E, this.type]): Unit = js.native
  def initialize(attributes: Unit, options: CombinedModelConstructorOptions[E, this.type]): Unit = js.native
  
  def invert(): Any = js.native
  
  def isEmpty(): Boolean = js.native
  
  def isNew(): Boolean = js.native
  
  def isValid(): Boolean = js.native
  def isValid(options: Any): Boolean = js.native
  
  // mixins from underscore
  def keys(): js.Array[String] = js.native
  
  def matches(attrs: Any): Boolean = js.native
  
  def omit(fn: js.Function3[/* value */ Any, /* key */ Any, /* object */ Any, Any]): Partial[T] = js.native
  def omit[A /* <: StringKey[T] */](keys: A*): Partial[Omit[T, A]] = js.native
  def omit[A /* <: StringKey[T] */](keys: js.Array[A]): Partial[Omit[T, A]] = js.native
  
  def pairs(): js.Array[Any] = js.native
  
  def pick(fn: js.Function3[/* value */ Any, /* key */ Any, /* object */ Any, Any]): Partial[T] = js.native
  def pick[A /* <: StringKey[T] */](keys: A*): Partial[Pick[T, A]] = js.native
  def pick[A /* <: StringKey[T] */](keys: js.Array[A]): Partial[Pick[T, A]] = js.native
  
  /**
    * For use with models as ES classes. If you define a preinitialize
    * method, it will be invoked when the Model is first created, before
    * any instantiation logic is run for the Model.
    * @see https://backbonejs.org/#Model-preinitialize
    */
  def preinitialize(): Unit = js.native
  def preinitialize(attributes: T): Unit = js.native
  def preinitialize(attributes: T, options: CombinedModelConstructorOptions[E, this.type]): Unit = js.native
  def preinitialize(attributes: Unit, options: CombinedModelConstructorOptions[E, this.type]): Unit = js.native
  
  def previous[A /* <: StringKey[T] */](attribute: A): js.UndefOr[
    (/* import warning: importer.ImportType#apply Failed type conversion: T[A] */ js.Any) | Null
  ] = js.native
  
  def previousAttributes(): Partial[T] = js.native
  
  def save(): JQueryXHR = js.native
  def save(attributes: Null, options: ModelSaveOptions): JQueryXHR = js.native
  def save(attributes: Unit, options: ModelSaveOptions): JQueryXHR = js.native
  def save(attributes: Partial[T]): JQueryXHR = js.native
  def save(attributes: Partial[T], options: ModelSaveOptions): JQueryXHR = js.native
  
  def set(attributeName: Partial[T]): this.type = js.native
  def set(attributeName: Partial[T], options: S): this.type = js.native
  def set[A /* <: StringKey[T] */](attributeName: A | Partial[T], value: S, options: S): this.type = js.native
  def set[A /* <: StringKey[T] */](
    attributeName: A | Partial[T],
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[A] */ js.Any
  ): this.type = js.native
  def set[A /* <: StringKey[T] */](
    attributeName: A | Partial[T],
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[A] */ js.Any,
    options: S
  ): this.type = js.native
  def set[A /* <: StringKey[T] */](attributeName: A | Partial[T], value: Unit, options: S): this.type = js.native
  /**
    * For strongly-typed assignment of attributes, use the `set` method only privately in public setter properties.
    * @example
    * set name(value: string) {
    *    super.set("name", value);
    * }
    */
  @JSName("set")
  def set_A[A /* <: StringKey[T] */](attributeName: A | Partial[T]): this.type = js.native
  @JSName("set")
  def set_A[A /* <: StringKey[T] */](attributeName: A | Partial[T], value: S): this.type = js.native
  
  def unset(attribute: StringKey[T]): this.type = js.native
  def unset(attribute: StringKey[T], options: Silenceable): this.type = js.native
  
  /**
    * Returns the relative URL where the model's resource would be located on the server.
    */
  def url(): String = js.native
  
  var urlRoot: Result[String] = js.native
  
  def validate(attributes: Partial[T]): Any = js.native
  def validate(attributes: Partial[T], options: Any): Any = js.native
  
  var validationError: Any = js.native
  
  def values(): js.Array[Any] = js.native
}
object Model {
  
  @JSImport("backbone", "Model")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Do not use, prefer TypeScript's extend functionality.
    */
  /* static member */
  inline def extend(properties: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(properties.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def extend(properties: Any, classProperties: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(properties.asInstanceOf[js.Any], classProperties.asInstanceOf[js.Any])).asInstanceOf[Any]
}
