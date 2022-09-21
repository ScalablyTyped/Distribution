package typings.protobufjsEQaYEpP4.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport(".protobufjs-eQaYEpP4", "OneOf")
@js.native
open class OneOf protected () extends ReflectionObject {
  /**
    * Constructs a new oneof instance.
    * @param name Oneof name
    * @param [fieldNames] Field names
    * @param [options] Declared options
    * @param [comment] Comment associated with this field
    */
  def this(name: String) = this()
  def this(name: String, fieldNames: js.Array[String]) = this()
  def this(name: String, fieldNames: StringDictionary[Any]) = this()
  def this(name: String, fieldNames: js.Array[String], options: StringDictionary[Any]) = this()
  def this(name: String, fieldNames: StringDictionary[Any], options: StringDictionary[Any]) = this()
  def this(name: String, fieldNames: Unit, options: StringDictionary[Any]) = this()
  def this(name: String, fieldNames: js.Array[String], options: StringDictionary[Any], comment: String) = this()
  def this(name: String, fieldNames: js.Array[String], options: Unit, comment: String) = this()
  def this(name: String, fieldNames: StringDictionary[Any], options: StringDictionary[Any], comment: String) = this()
  def this(name: String, fieldNames: StringDictionary[Any], options: Unit, comment: String) = this()
  def this(name: String, fieldNames: Unit, options: StringDictionary[Any], comment: String) = this()
  def this(name: String, fieldNames: Unit, options: Unit, comment: String) = this()
  
  /**
    * Adds a field to this oneof and removes it from its current parent, if any.
    * @param field Field to add
    * @returns `this`
    */
  def add(field: Field): OneOf = js.native
  
  /** Fields that belong to this oneof as an array for iteration. */
  val fieldsArray: js.Array[Field] = js.native
  
  /** Field names that belong to this oneof. */
  var oneof: js.Array[String] = js.native
  
  /**
    * Removes a field from this oneof and puts it back to the oneof's parent.
    * @param field Field to remove
    * @returns `this`
    */
  def remove(field: Field): OneOf = js.native
  
  def toJSON(toJSONOptions: IToJSONOptions): IOneOf = js.native
}
/* static members */
object OneOf {
  
  @JSImport(".protobufjs-eQaYEpP4", "OneOf")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * OneOf decorator (TypeScript).
    * @param fieldNames Field names
    * @returns Decorator function
    */
  inline def d[T /* <: String */](fieldNames: String*): OneOfDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldNames.asInstanceOf[Seq[js.Any]]*).asInstanceOf[OneOfDecorator]
  
  /**
    * Constructs a oneof from a oneof descriptor.
    * @param name Oneof name
    * @param json Oneof descriptor
    * @returns Created oneof
    * @throws {TypeError} If arguments are invalid
    */
  inline def fromJSON(name: String, json: IOneOf): OneOf = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(name.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[OneOf]
}
