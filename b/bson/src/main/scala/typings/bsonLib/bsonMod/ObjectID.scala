package typings
package bsonLib.bsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bson", "ObjectID")
@js.native
/**
  * Create a new ObjectId instance
  * @param {(string|number|ObjectId)} id Can be a 24 byte hex string, 12 byte binary string or a Number.
  */
class ObjectID () extends ObjectId {
  def this(id: ObjectId) = this()
  def this(id: java.lang.String) = this()
  def this(id: scala.Double) = this()
}

@JSImport("bson", "ObjectId")
@js.native
/**
  * Create a new ObjectId instance
  * @param {(string|number|ObjectId)} id Can be a 24 byte hex string, 12 byte binary string or a Number.
  */
class ObjectId () extends js.Object {
  def this(id: ObjectId) = this()
  def this(id: java.lang.String) = this()
  def this(id: scala.Double) = this()
  /** The generation time of this ObjectId instance */
  var generationTime: scala.Double = js.native
  /**
    * Compares the equality of this ObjectId with `otherID`.
    * @param {ObjectId|string} otherID ObjectId instance to compare against.
    * @return {boolean} the result of comparing two ObjectId's
    */
  def equals(otherID: ObjectId): scala.Boolean = js.native
  def equals(otherID: java.lang.String): scala.Boolean = js.native
  /**
    * Returns the generation date (accurate up to the second) that this ID was generated.
    * @return {Date} the generation date
    */
  def getTimestamp(): stdLib.Date = js.native
  /**
    * Return the ObjectId id as a 24 byte hex string representation
    * @return {string} return the 24 byte hex string representation.
    */
  def toHexString(): java.lang.String = js.native
}

/* static members */
@JSImport("bson", "ObjectID")
@js.native
object ObjectID extends js.Object {
  /** If true cache the hex string representation of ObjectId */
  var cacheHexString: js.UndefOr[scala.Boolean] = js.native
  /**
    * Creates an ObjectId from a hex string representation of an ObjectId.
    * @param {string} hexString create a ObjectId from a passed in 24 byte hexstring.
    * @return {ObjectId} return the created ObjectId
    */
  def createFromHexString(hexString: java.lang.String): bsonLib.bsonMod.ObjectId = js.native
  /**
    * Creates an ObjectId from a second based number, with the rest of the ObjectId zeroed out. Used for comparisons or sorting the ObjectId.
    * @param {number} time an integer number representing a number of seconds.
    * @return {ObjectId} return the created ObjectId
    */
  def createFromTime(time: scala.Double): bsonLib.bsonMod.ObjectId = js.native
  /**
    * Generate a 12 byte id string used in ObjectId's
    * @param {number} time optional parameter allowing to pass in a second based timestamp.
    * @return {string} return the 12 byte id binary string.
    */
  def generate(): nodeLib.Buffer = js.native
  def generate(time: scala.Double): nodeLib.Buffer = js.native
  def isValid(id: bsonLib.bsonMod.ObjectId): scala.Boolean = js.native
  /**
    * Checks if a value is a valid bson ObjectId
    *
    * @return {boolean} return true if the value is a valid bson ObjectId, return false otherwise.
    */
  def isValid(id: java.lang.String): scala.Boolean = js.native
  def isValid(id: scala.Double): scala.Boolean = js.native
}

/* static members */
@JSImport("bson", "ObjectId")
@js.native
object ObjectId extends js.Object {
  /** If true cache the hex string representation of ObjectId */
  var cacheHexString: js.UndefOr[scala.Boolean] = js.native
  /**
    * Creates an ObjectId from a hex string representation of an ObjectId.
    * @param {string} hexString create a ObjectId from a passed in 24 byte hexstring.
    * @return {ObjectId} return the created ObjectId
    */
  def createFromHexString(hexString: java.lang.String): bsonLib.bsonMod.ObjectId = js.native
  /**
    * Creates an ObjectId from a second based number, with the rest of the ObjectId zeroed out. Used for comparisons or sorting the ObjectId.
    * @param {number} time an integer number representing a number of seconds.
    * @return {ObjectId} return the created ObjectId
    */
  def createFromTime(time: scala.Double): bsonLib.bsonMod.ObjectId = js.native
  /**
    * Generate a 12 byte id string used in ObjectId's
    * @param {number} time optional parameter allowing to pass in a second based timestamp.
    * @return {string} return the 12 byte id binary string.
    */
  def generate(): nodeLib.Buffer = js.native
  def generate(time: scala.Double): nodeLib.Buffer = js.native
  def isValid(id: bsonLib.bsonMod.ObjectId): scala.Boolean = js.native
  /**
    * Checks if a value is a valid bson ObjectId
    *
    * @return {boolean} return true if the value is a valid bson ObjectId, return false otherwise.
    */
  def isValid(id: java.lang.String): scala.Boolean = js.native
  def isValid(id: scala.Double): scala.Boolean = js.native
}

