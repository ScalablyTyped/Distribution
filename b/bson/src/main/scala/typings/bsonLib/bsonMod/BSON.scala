package typings
package bsonLib.bsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bson", "BSON")
@js.native
class BSON () extends js.Object {
  /**
       * Calculate the bson size for a passed in Javascript object.
       *
       * @param {Object} object the Javascript object to calculate the BSON byte size for.
       * @param {CalculateObjectSizeOptions} Options
       * @return {Number} returns the number of bytes the BSON object will take up.
       */
  def calculateObjectSize(`object`: js.Any): scala.Double = js.native
  /**
       * Calculate the bson size for a passed in Javascript object.
       *
       * @param {Object} object the Javascript object to calculate the BSON byte size for.
       * @param {CalculateObjectSizeOptions} Options
       * @return {Number} returns the number of bytes the BSON object will take up.
       */
  def calculateObjectSize(`object`: js.Any, options: CalculateObjectSizeOptions): scala.Double = js.native
  /**
       * Deserialize data as BSON.
       * 
       * @param buffer The buffer containing the serialized set of BSON documents.
       * @param options Deserialize options.
       * @returns The deserialized Javascript Object.
       */
  def deserialize(buffer: nodeLib.Buffer): js.Any = js.native
  /**
       * Deserialize data as BSON.
       * 
       * @param buffer The buffer containing the serialized set of BSON documents.
       * @param options Deserialize options.
       * @returns The deserialized Javascript Object.
       */
  def deserialize(buffer: nodeLib.Buffer, options: DeserializeOptions): js.Any = js.native
  /**
       * Deserialize stream data as BSON documents.
       * 
       * @param data The buffer containing the serialized set of BSON documents.
       * @param startIndex The start index in the data Buffer where the deserialization is to start.
       * @param numberOfDocuments Number of documents to deserialize
       * @param documents An array where to store the deserialized documents
       * @param docStartIndex The index in the documents array from where to start inserting documents
       * @param options Additional options used for the deserialization
       * @returns The next index in the buffer after deserialization of the `numberOfDocuments`
       */
  def deserializeStream(
    data: nodeLib.Buffer,
    startIndex: scala.Double,
    numberOfDocuments: scala.Double,
    documents: js.Array[_],
    docStartIndex: scala.Double
  ): scala.Double = js.native
  /**
       * Deserialize stream data as BSON documents.
       * 
       * @param data The buffer containing the serialized set of BSON documents.
       * @param startIndex The start index in the data Buffer where the deserialization is to start.
       * @param numberOfDocuments Number of documents to deserialize
       * @param documents An array where to store the deserialized documents
       * @param docStartIndex The index in the documents array from where to start inserting documents
       * @param options Additional options used for the deserialization
       * @returns The next index in the buffer after deserialization of the `numberOfDocuments`
       */
  def deserializeStream(
    data: nodeLib.Buffer,
    startIndex: scala.Double,
    numberOfDocuments: scala.Double,
    documents: js.Array[_],
    docStartIndex: scala.Double,
    options: DeserializeOptions
  ): scala.Double = js.native
  /**
       * Serialize a Javascript object.
       * 
       * @param object The Javascript object to serialize.
       * @param options Serialize options.
       * @return The Buffer object containing the serialized object.
       */
  def serialize(`object`: js.Any): nodeLib.Buffer = js.native
  /**
       * Serialize a Javascript object.
       * 
       * @param object The Javascript object to serialize.
       * @param options Serialize options.
       * @return The Buffer object containing the serialized object.
       */
  def serialize(`object`: js.Any, options: SerializeOptions): nodeLib.Buffer = js.native
  /**
       * Serialize a Javascript object using a predefined Buffer and index into the buffer, useful when pre-allocating the space for serialization.
       * 
       * @param object The Javascript object to serialize.
       * @param buffer The Buffer you pre-allocated to store the serialized BSON object.
       * @param options Serialize options.
       * @returns The index pointing to the last written byte in the buffer
       */
  def serializeWithBufferAndIndex(`object`: js.Any, buffer: nodeLib.Buffer): scala.Double = js.native
  /**
       * Serialize a Javascript object using a predefined Buffer and index into the buffer, useful when pre-allocating the space for serialization.
       * 
       * @param object The Javascript object to serialize.
       * @param buffer The Buffer you pre-allocated to store the serialized BSON object.
       * @param options Serialize options.
       * @returns The index pointing to the last written byte in the buffer
       */
  def serializeWithBufferAndIndex(`object`: js.Any, buffer: nodeLib.Buffer, options: SerializeWithBufferAndIndexOptions): scala.Double = js.native
}

