package typings.azureCoreClient.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Serializer extends StObject {
  
  /**
    * Deserialize the given object based on its metadata defined in the mapper.
    *
    * @param mapper - The mapper which defines the metadata of the serializable object.
    * @param responseBody - A valid Javascript entity to be deserialized.
    * @param objectName - Name of the deserialized object.
    * @param options - Controls behavior of XML parser and builder.
    * @returns A valid deserialized Javascript object.
    */
  def deserialize(mapper: Mapper, responseBody: Any, objectName: String): Any = js.native
  def deserialize(mapper: Mapper, responseBody: Any, objectName: String, options: SerializerOptions): Any = js.native
  
  /**
    * Whether the contents are XML or not.
    */
  val isXML: Boolean = js.native
  
  /**
    * The provided model mapper.
    */
  val modelMappers: StringDictionary[Any] = js.native
  
  /**
    * Serialize the given object based on its metadata defined in the mapper.
    *
    * @param mapper - The mapper which defines the metadata of the serializable object.
    * @param object - A valid Javascript object to be serialized.
    * @param objectName - Name of the serialized object.
    * @param options - additional options to deserialization.
    * @returns A valid serialized Javascript object.
    */
  def serialize(mapper: Mapper, `object`: Any): Any = js.native
  def serialize(mapper: Mapper, `object`: Any, objectName: String): Any = js.native
  def serialize(mapper: Mapper, `object`: Any, objectName: String, options: SerializerOptions): Any = js.native
  def serialize(mapper: Mapper, `object`: Any, objectName: Unit, options: SerializerOptions): Any = js.native
  
  /**
    * Validates constraints, if any. This function will throw if the provided value does not respect those constraints.
    * @param mapper - The definition of data models.
    * @param value - The value.
    * @param objectName - Name of the object. Used in the error messages.
    * @deprecated Removing the constraints validation on client side.
    */
  def validateConstraints(mapper: Mapper, value: Any, objectName: String): Unit = js.native
}
