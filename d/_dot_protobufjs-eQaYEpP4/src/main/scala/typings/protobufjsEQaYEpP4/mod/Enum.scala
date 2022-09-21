package typings.protobufjsEQaYEpP4.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport(".protobufjs-eQaYEpP4", "Enum")
@js.native
open class Enum protected () extends ReflectionObject {
  /**
    * Constructs a new enum instance.
    * @param name Unique name within its namespace
    * @param [values] Enum values as an object, by name
    * @param [options] Declared options
    * @param [comment] The comment for this enum
    * @param [comments] The value comments for this enum
    */
  def this(name: String) = this()
  def this(name: String, values: StringDictionary[Double]) = this()
  def this(name: String, values: StringDictionary[Double], options: StringDictionary[Any]) = this()
  def this(name: String, values: Unit, options: StringDictionary[Any]) = this()
  def this(name: String, values: StringDictionary[Double], options: StringDictionary[Any], comment: String) = this()
  def this(name: String, values: StringDictionary[Double], options: Unit, comment: String) = this()
  def this(name: String, values: Unit, options: StringDictionary[Any], comment: String) = this()
  def this(name: String, values: Unit, options: Unit, comment: String) = this()
  def this(
    name: String,
    values: StringDictionary[Double],
    options: StringDictionary[Any],
    comment: String,
    comments: StringDictionary[String]
  ) = this()
  def this(
    name: String,
    values: StringDictionary[Double],
    options: StringDictionary[Any],
    comment: Unit,
    comments: StringDictionary[String]
  ) = this()
  def this(
    name: String,
    values: StringDictionary[Double],
    options: Unit,
    comment: String,
    comments: StringDictionary[String]
  ) = this()
  def this(
    name: String,
    values: StringDictionary[Double],
    options: Unit,
    comment: Unit,
    comments: StringDictionary[String]
  ) = this()
  def this(
    name: String,
    values: Unit,
    options: StringDictionary[Any],
    comment: String,
    comments: StringDictionary[String]
  ) = this()
  def this(
    name: String,
    values: Unit,
    options: StringDictionary[Any],
    comment: Unit,
    comments: StringDictionary[String]
  ) = this()
  def this(name: String, values: Unit, options: Unit, comment: String, comments: StringDictionary[String]) = this()
  def this(name: String, values: Unit, options: Unit, comment: Unit, comments: StringDictionary[String]) = this()
  
  /**
    * Adds a value to this enum.
    * @param name Value name
    * @param id Value id
    * @param [comment] Comment, if any
    * @returns `this`
    * @throws {TypeError} If arguments are invalid
    * @throws {Error} If there is already a value with this name or id
    */
  def add(name: String, id: Double): Enum = js.native
  def add(name: String, id: Double, comment: String): Enum = js.native
  
  /** Value comment texts, if any. */
  var comments: StringDictionary[String] = js.native
  
  /**
    * Tests if the specified id is reserved.
    * @param id Id to test
    * @returns `true` if reserved, otherwise `false`
    */
  def isReservedId(id: Double): Boolean = js.native
  
  /**
    * Tests if the specified name is reserved.
    * @param name Name to test
    * @returns `true` if reserved, otherwise `false`
    */
  def isReservedName(name: String): Boolean = js.native
  
  /**
    * Removes a value from this enum
    * @param name Value name
    * @returns `this`
    * @throws {TypeError} If arguments are invalid
    * @throws {Error} If `name` is not a name of this enum
    */
  def remove(name: String): Enum = js.native
  
  /** Reserved ranges, if any. */
  var reserved: js.Array[js.Array[Double] | String] = js.native
  
  def toJSON(toJSONOptions: IToJSONOptions): IEnum = js.native
  
  /** Enum values by name. */
  var values: StringDictionary[Double] = js.native
  
  /** Enum values by id. */
  var valuesById: NumberDictionary[String] = js.native
}
/* static members */
object Enum {
  
  @JSImport(".protobufjs-eQaYEpP4", "Enum")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Constructs an enum from an enum descriptor.
    * @param name Enum name
    * @param json Enum descriptor
    * @returns Created enum
    * @throws {TypeError} If arguments are invalid
    */
  inline def fromJSON(name: String, json: IEnum): Enum = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(name.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[Enum]
}
