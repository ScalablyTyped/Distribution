package typings.backbone.mod

import typings.jquery.JQueryXHR
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * E - Extensions to the model constructor options. You can accept additional constructor options
  * by listing them in the E parameter.
  */
@JSImport("backbone", "Model")
@js.native
class Model[T, S, E] () extends js.Object {
  def this(attributes: T) = this()
  def this(attributes: T, options: CombinedModelConstructorOptions[E, Model[_, ModelSetOptions, js.Object]]) = this()
  def this(
    attributes: js.UndefOr[scala.Nothing],
    options: CombinedModelConstructorOptions[E, Model[_, ModelSetOptions, js.Object]]
  ) = this()
  
  var _changing: Boolean = js.native
  
  var _pending: Boolean = js.native
  
  var _previousAttributes: js.Any = js.native
  
  /* private */ def _validate(attributes: js.Any, options: js.Any): Boolean = js.native
  
  var attributes: js.Any = js.native
  
  def chain(): js.Any = js.native
  
  var changed: js.Array[_] = js.native
  
  /**
    * Return an object containing all the attributes that have changed, or
    * false if there are no changed attributes. Useful for determining what
    * parts of a view need to be updated and/or what attributes need to be
    * persisted to the server. Unset attributes will be set to undefined.
    * You can also pass an attributes object to diff against the model,
    * determining if there *would be* a change. */
  def changedAttributes(): js.Any = js.native
  def changedAttributes(attributes: js.Any): js.Any = js.native
  
  var cid: String = js.native
  
  var cidPrefix: String = js.native
  
  def clear(): js.Any = js.native
  def clear(options: Silenceable): js.Any = js.native
  
  var collection: Collection[this.type] = js.native
  
  /**
    * Default attributes for the model. It can be an object hash or a method returning an object hash.
    * For assigning an object hash, do it like this: this.defaults = <any>{ attribute: value, ... };
    * That works only if you set it in the constructor or the initialize method.
    **/
  def defaults(): ObjectHash = js.native
  
  def destroy(): js.Any = js.native
  def destroy(options: ModelDestroyOptions): js.Any = js.native
  
  def escape(attribute: String): String = js.native
  
  def fetch(): JQueryXHR = js.native
  def fetch(options: ModelFetchOptions): JQueryXHR = js.native
  
  /**
    * For strongly-typed access to attributes, use the `get` method only privately in public getter properties.
    * @example
    * get name(): string {
    *    return super.get("name");
    * }
    **/
  def get[a /* <: /* keyof T */ String */](attributeName: a): /* import warning: importer.ImportType#apply Failed type conversion: T[a] */ js.Any = js.native
  
  def has(attribute: String): Boolean = js.native
  
  def hasChanged(): Boolean = js.native
  def hasChanged(attribute: String): Boolean = js.native
  
  var id: js.Any = js.native
  
  var idAttribute: String = js.native
  
  def initialize(): Unit = js.native
  def initialize(attributes: T): Unit = js.native
  def initialize(attributes: T, options: CombinedModelConstructorOptions[E, this.type]): Unit = js.native
  def initialize(attributes: js.UndefOr[scala.Nothing], options: CombinedModelConstructorOptions[E, this.type]): Unit = js.native
  
  def invert(): js.Any = js.native
  
  def isEmpty(): Boolean = js.native
  
  def isNew(): Boolean = js.native
  
  def isValid(): Boolean = js.native
  def isValid(options: js.Any): Boolean = js.native
  
  // mixins from underscore
  def keys(): js.Array[String] = js.native
  
  def matches(attrs: js.Any): Boolean = js.native
  
  def omit(fn: js.Function3[/* value */ js.Any, /* key */ js.Any, /* object */ js.Any, _]): js.Any = js.native
  def omit(keys: String*): js.Any = js.native
  def omit(keys: js.Array[String]): js.Any = js.native
  
  def pairs(): js.Array[_] = js.native
  
  def pick(fn: js.Function3[/* value */ js.Any, /* key */ js.Any, /* object */ js.Any, _]): js.Any = js.native
  def pick(keys: String*): js.Any = js.native
  def pick(keys: js.Array[String]): js.Any = js.native
  
  /**
    * For use with models as ES classes. If you define a preinitialize
    * method, it will be invoked when the Model is first created, before
    * any instantiation logic is run for the Model.
    * @see https://backbonejs.org/#Model-preinitialize
    */
  def preinitialize(): Unit = js.native
  def preinitialize(attributes: T): Unit = js.native
  def preinitialize(attributes: T, options: CombinedModelConstructorOptions[E, this.type]): Unit = js.native
  def preinitialize(attributes: js.UndefOr[scala.Nothing], options: CombinedModelConstructorOptions[E, this.type]): Unit = js.native
  
  def previous(attribute: String): js.Any = js.native
  
  def previousAttributes(): js.Any = js.native
  
  def save(): js.Any = js.native
  def save(attributes: js.UndefOr[scala.Nothing], options: ModelSaveOptions): js.Any = js.native
  def save(attributes: js.Any): js.Any = js.native
  def save(attributes: js.Any, options: ModelSaveOptions): js.Any = js.native
  
  def set(attributeName: Partial[T]): Model[_, ModelSetOptions, js.Object] = js.native
  def set(attributeName: Partial[T], options: S): Model[_, ModelSetOptions, js.Object] = js.native
  /**
    * For strongly-typed assignment of attributes, use the `set` method only privately in public setter properties.
    * @example
    * set name(value: string) {
    *    super.set("name", value);
    * }
    **/
  def set[a /* <: /* keyof T */ String */](attributeName: a): Model[_, ModelSetOptions, js.Object] = js.native
  def set[a /* <: /* keyof T */ String */](attributeName: a, value: S): Model[_, ModelSetOptions, js.Object] = js.native
  def set[a /* <: /* keyof T */ String */](attributeName: a, value: S, options: S): Model[_, ModelSetOptions, js.Object] = js.native
  def set[a /* <: /* keyof T */ String */](attributeName: a, value: js.UndefOr[scala.Nothing], options: S): Model[_, ModelSetOptions, js.Object] = js.native
  def set[a /* <: /* keyof T */ String */](
    attributeName: a,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[a] */ js.Any
  ): Model[_, ModelSetOptions, js.Object] = js.native
  def set[a /* <: /* keyof T */ String */](
    attributeName: a,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[a] */ js.Any,
    options: S
  ): Model[_, ModelSetOptions, js.Object] = js.native
  def set[a /* <: /* keyof T */ String */](attributeName: Partial[T], value: S, options: S): Model[_, ModelSetOptions, js.Object] = js.native
  def set[a /* <: /* keyof T */ String */](attributeName: Partial[T], value: js.UndefOr[scala.Nothing], options: S): Model[_, ModelSetOptions, js.Object] = js.native
  def set[a /* <: /* keyof T */ String */](
    attributeName: Partial[T],
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[a] */ js.Any
  ): Model[_, ModelSetOptions, js.Object] = js.native
  def set[a /* <: /* keyof T */ String */](
    attributeName: Partial[T],
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[a] */ js.Any,
    options: S
  ): Model[_, ModelSetOptions, js.Object] = js.native
  @JSName("set")
  def set_a_String[a /* <: /* keyof T */ String */](attributeName: Partial[T]): Model[_, ModelSetOptions, js.Object] = js.native
  @JSName("set")
  def set_a_String[a /* <: /* keyof T */ String */](attributeName: Partial[T], value: S): Model[_, ModelSetOptions, js.Object] = js.native
  
  def unset(attribute: String): Model[_, ModelSetOptions, js.Object] = js.native
  def unset(attribute: String, options: Silenceable): Model[_, ModelSetOptions, js.Object] = js.native
  
  /**
    * Returns the relative URL where the model's resource would be located on the server.
    */
  def url(): String = js.native
  
  var urlRoot: js.Any = js.native
  
  def validate(attributes: js.Any): js.Any = js.native
  def validate(attributes: js.Any, options: js.Any): js.Any = js.native
  
  var validationError: js.Any = js.native
  
  def values(): js.Array[_] = js.native
}
/* static members */
@JSImport("backbone", "Model")
@js.native
object Model extends js.Object {
  
  /**
    * Do not use, prefer TypeScript's extend functionality.
    **/
  def extend(properties: js.Any): js.Any = js.native
  def extend(properties: js.Any, classProperties: js.Any): js.Any = js.native
}
