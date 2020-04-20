package typings.convict.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config[T] extends js.Object {
  /**
    * @returns the default value of the name property. name can use dot
    * notation to reference nested values
    */
  def default(): T | (/* import warning: importer.ImportType#apply Failed type conversion: T[string] */ js.Any) = js.native
  def default(name: String): T | (/* import warning: importer.ImportType#apply Failed type conversion: T[string] */ js.Any) = js.native
  def default[K /* <: /* keyof T */ String */](name: K): /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = js.native
  @JSName("default")
  def default_K_StringK2_AnyK3_Any[K /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][K2] */ js.Any */](name: K): /* import warning: importer.ImportType#apply Failed type conversion: T[K][K2][K3] */ js.Any = js.native
  @JSName("default")
  def default_K_StringK2_AnyK3_AnyK4_Any_Any[K /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][K2] */ js.Any */, K4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][K2][K3] */ js.Any */](name: String): /* import warning: importer.ImportType#apply Failed type conversion: T[K][K2][K3][K4] */ js.Any = js.native
  @JSName("default")
  def default_K_StringK2_Any_Any[K /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */](name: String): /* import warning: importer.ImportType#apply Failed type conversion: T[K][K2] */ js.Any = js.native
  @JSName("default")
  def default_K_String_Any[K /* <: /* keyof T */ String */](): /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = js.native
  /**
    * @returns the current value of the name property. name can use dot
    * notation to reference nested values
    */
  def get(): (/* import warning: importer.ImportType#apply Failed type conversion: T[string] */ js.Any) | T = js.native
  def get(name: String): (/* import warning: importer.ImportType#apply Failed type conversion: T[string] */ js.Any) | T = js.native
  def get[K /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][K2] */ js.Any */](name: K): /* import warning: importer.ImportType#apply Failed type conversion: T[K][K2][K3] */ js.Any = js.native
  /**
    * Exports all the properties (that is the keys and their current values) as a {JSON} {Object}
    * @returns A {JSON} compliant {Object}
    */
  def getProperties(): T = js.native
  /**
    * Exports the schema as a {JSON} {Object}
    * @returns A {JSON} compliant {Object}
    */
  def getSchema(): InternalSchema[T] = js.native
  /**
    * Exports the schema as a JSON string.
    * @returns A string representing the schema of this {Config}
    */
  def getSchemaString(): String = js.native
  @JSName("get")
  def get_K_StringK2_AnyK3_AnyK4_Any_Any[K /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][K2] */ js.Any */, K4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][K2][K3] */ js.Any */](name: String): /* import warning: importer.ImportType#apply Failed type conversion: T[K][K2][K3][K4] */ js.Any = js.native
  @JSName("get")
  def get_K_StringK2_Any_Any[K /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */](name: String): /* import warning: importer.ImportType#apply Failed type conversion: T[K][K2] */ js.Any = js.native
  /**
    * @returns true if the property name is defined, or false otherwise
    */
  def has(name: String): Boolean = js.native
  def has[K /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][K2] */ js.Any */](name: K): Boolean = js.native
  @JSName("has")
  def has_K_StringK2_Any[K /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */](name: String): Boolean = js.native
  @JSName("has")
  def has_K_StringK2_AnyK3_AnyK4_Any[K /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][K2] */ js.Any */, K4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][K2][K3] */ js.Any */](name: String): Boolean = js.native
  /**
    * Loads and merges a JavaScript object into config
    */
  def load[U](conf: U): Config[Overwrite[T, U]] = js.native
  /**
    * Loads and merges JSON configuration file(s) into config
    */
  def loadFile[U](files: String): Config[Overwrite[T, U]] = js.native
  def loadFile[U](files: js.Array[String]): Config[Overwrite[T, U]] = js.native
  /**
    * Sets the value of name to value. name can use dot notation to reference
    * nested values, e.g. "database.port". If objects in the chain don't yet
    * exist, they will be initialized to empty objects
    */
  def set(
    name: String,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[string] */ js.Any
  ): Config[T] = js.native
  def set[K /* <: /* keyof T */ String */, K2 /* <: (/* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any) | String */](
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[K][K2] */ js.Any
  ): Config[T] = js.native
  @JSName("set")
  def set_K_StringK2_AnyK3_AnyK4_UnionAnyString[K /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][K2] */ js.Any */, K4 /* <: (/* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][K2][K3] */ js.Any) | String */](
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[K][K2][K3][K4] */ js.Any
  ): Config[T] = js.native
  @JSName("set")
  def set_K_StringK2_AnyK3_UnionAnyString[K /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */, K3 /* <: (/* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][K2] */ js.Any) | String */](
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[K][K2][K3] */ js.Any
  ): Config[T] = js.native
  /**
    * Validates config against the schema used to initialize it
    */
  def validate(): Config[T] = js.native
  def validate(options: ValidateOptions): Config[T] = js.native
}

