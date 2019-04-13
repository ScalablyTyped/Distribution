package typings
package backboneLib.backboneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone", "Model")
@js.native
class Model () extends js.Object {
  def this(attributes: js.Any) = this()
  def this(attributes: js.Any, options: js.Any) = this()
  var _changing: scala.Boolean = js.native
  var _pending: scala.Boolean = js.native
  var _previousAttributes: js.Any = js.native
  var attributes: js.Any = js.native
  var changed: js.Array[_] = js.native
  var cid: java.lang.String = js.native
  var cidPrefix: java.lang.String = js.native
  var collection: Collection[_] = js.native
  var id: js.Any = js.native
  var idAttribute: java.lang.String = js.native
  var urlRoot: js.Any = js.native
  var validationError: js.Any = js.native
  /* private */ def _validate(attributes: js.Any, options: js.Any): scala.Boolean = js.native
  def chain(): js.Any = js.native
  /**
    * Return an object containing all the attributes that have changed, or
    * false if there are no changed attributes. Useful for determining what
    * parts of a view need to be updated and/or what attributes need to be
    * persisted to the server. Unset attributes will be set to undefined.
    * You can also pass an attributes object to diff against the model,
    * determining if there *would be* a change. */
  def changedAttributes(): js.Any = js.native
  def changedAttributes(attributes: js.Any): js.Any = js.native
  def clear(): js.Any = js.native
  def clear(options: Silenceable): js.Any = js.native
  /**
    * Default attributes for the model. It can be an object hash or a method returning an object hash.
    * For assigning an object hash, do it like this: this.defaults = <any>{ attribute: value, ... };
    * That works only if you set it in the constructor or the initialize method.
    **/
  def defaults(): ObjectHash = js.native
  def destroy(): js.Any = js.native
  def destroy(options: ModelDestroyOptions): js.Any = js.native
  def escape(attribute: java.lang.String): java.lang.String = js.native
  def fetch(): jqueryLib.JQueryXHR = js.native
  def fetch(options: ModelFetchOptions): jqueryLib.JQueryXHR = js.native
  /**
    * For strongly-typed access to attributes, use the `get` method only privately in public getter properties.
    * @example
    * get name(): string {
    *    return super.get("name");
    * }
    **/
  /*private*/ def get(attributeName: java.lang.String): js.Any = js.native
  def has(attribute: java.lang.String): scala.Boolean = js.native
  def hasChanged(): scala.Boolean = js.native
  def hasChanged(attribute: java.lang.String): scala.Boolean = js.native
  def initialize(): scala.Unit = js.native
  def initialize(attributes: js.Any): scala.Unit = js.native
  def initialize(attributes: js.Any, options: js.Any): scala.Unit = js.native
  def invert(): js.Any = js.native
  def isEmpty(): scala.Boolean = js.native
  def isNew(): scala.Boolean = js.native
  def isValid(): scala.Boolean = js.native
  def isValid(options: js.Any): scala.Boolean = js.native
  // mixins from underscore
  def keys(): js.Array[java.lang.String] = js.native
  def matches(attrs: js.Any): scala.Boolean = js.native
  def omit(fn: js.Function3[/* value */ js.Any, /* key */ js.Any, /* object */ js.Any, _]): js.Any = js.native
  def omit(keys: java.lang.String*): js.Any = js.native
  def omit(keys: js.Array[java.lang.String]): js.Any = js.native
  def pairs(): js.Array[_] = js.native
  def pick(fn: js.Function3[/* value */ js.Any, /* key */ js.Any, /* object */ js.Any, _]): js.Any = js.native
  def pick(keys: java.lang.String*): js.Any = js.native
  def pick(keys: js.Array[java.lang.String]): js.Any = js.native
  def previous(attribute: java.lang.String): js.Any = js.native
  def previousAttributes(): js.Array[_] = js.native
  def save(): js.Any = js.native
  def save(attributes: js.Any): js.Any = js.native
  def save(attributes: js.Any, options: ModelSaveOptions): js.Any = js.native
  /**
    * For strongly-typed assignment of attributes, use the `set` method only privately in public setter properties.
    * @example
    * set name(value: string) {
    *    super.set("name", value);
    * }
    **/
  /*private*/ def set(attributeName: java.lang.String, value: js.Any): Model = js.native
  def set(attributeName: java.lang.String, value: js.Any, options: ModelSetOptions): Model = js.native
  def set(obj: js.Any): Model = js.native
  def set(obj: js.Any, options: ModelSetOptions): Model = js.native
  def unset(attribute: java.lang.String): Model = js.native
  def unset(attribute: java.lang.String, options: Silenceable): Model = js.native
  /**
    * Returns the relative URL where the model's resource would be located on the server.
    * @memberof Model
    */
  def url(): java.lang.String = js.native
  def validate(attributes: js.Any): js.Any = js.native
  def validate(attributes: js.Any, options: js.Any): js.Any = js.native
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

