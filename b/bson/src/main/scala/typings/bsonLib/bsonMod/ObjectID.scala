package typings
package bsonLib.bsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bson", "ObjectID")
@js.native
/**
  * Create a new ObjectID instance
  * @param {(string|number|ObjectID)} id Can be a 24 byte hex string, 12 byte binary string or a Number.
  */
class ObjectID () extends js.Object {
  def this(id: ObjectID) = this()
  def this(id: java.lang.String) = this()
  def this(id: scala.Double) = this()
  /** The generation time of this ObjectID instance */
  var generationTime: scala.Double = js.native
  /**
    * Compares the equality of this ObjectID with `otherID`.
    * @param {ObjectID|string} otherID ObjectID instance to compare against.
    * @return {boolean} the result of comparing two ObjectID's
    */
  def equals(otherID: ObjectID): scala.Boolean = js.native
  def equals(otherID: java.lang.String): scala.Boolean = js.native
  /**
    * Generate a 12 byte id string used in ObjectID's
    * @param {number} time optional parameter allowing to pass in a second based timestamp.
    * @return {string} return the 12 byte id binary string.
    */
  def generate(): nodeLib.Buffer = js.native
  def generate(time: scala.Double): nodeLib.Buffer = js.native
  /**
    * Returns the generation date (accurate up to the second) that this ID was generated.
    * @return {Date} the generation date
    */
  def getTimestamp(): stdLib.Date = js.native
  /**
    * Return the ObjectID id as a 24 byte hex string representation
    * @return {string} return the 24 byte hex string representation.
    */
  def toHexString(): java.lang.String = js.native
}

@JSImport("bson", "ObjectId")
@js.native
/**
  * Create a new ObjectID instance
  * @param {(string|number|ObjectID)} id Can be a 24 byte hex string, 12 byte binary string or a Number.
  */
class ObjectId () extends ObjectID {
  def this(id: ObjectID) = this()
  def this(id: java.lang.String) = this()
  def this(id: scala.Double) = this()
}

@JSImport("bson", "ObjectID")
@js.native
object ObjectID extends js.Object {
  /** If true cache the hex string representation of ObjectID */
  var cacheHexString: js.UndefOr[scala.Boolean] = js.native
  /**
    * Creates an ObjectID from a hex string representation of an ObjectID.
    * @param {string} hexString create a ObjectID from a passed in 24 byte hexstring.
    * @return {ObjectID} return the created ObjectID
    */
  def createFromHexString(hexString: java.lang.String): bsonLib.bsonMod.ObjectID = js.native
  /**
    * Creates an ObjectID from a second based number, with the rest of the ObjectID zeroed out. Used for comparisons or sorting the ObjectID.
    * @param {number} time an integer number representing a number of seconds.
    * @return {ObjectID} return the created ObjectID
    */
  def createFromTime(time: scala.Double): bsonLib.bsonMod.ObjectID = js.native
  def isValid(id: bsonLib.bsonMod.ObjectID): scala.Boolean = js.native
  /**
    * Checks if a value is a valid bson ObjectID
    *
    * @return {boolean} return true if the value is a valid bson ObjectID, return false otherwise.
    */
  def isValid(id: java.lang.String): scala.Boolean = js.native
  def isValid(id: scala.Double): scala.Boolean = js.native
}

@JSImport("bson", "ObjectId")
@js.native
object ObjectId extends js.Object {
  /** If true cache the hex string representation of ObjectID */
  var cacheHexString: js.UndefOr[scala.Boolean] = js.native
  /**
    * Creates an ObjectID from a hex string representation of an ObjectID.
    * @param {string} hexString create a ObjectID from a passed in 24 byte hexstring.
    * @return {ObjectID} return the created ObjectID
    */
  def createFromHexString(hexString: java.lang.String): bsonLib.bsonMod.ObjectID = js.native
  /**
    * Creates an ObjectID from a second based number, with the rest of the ObjectID zeroed out. Used for comparisons or sorting the ObjectID.
    * @param {number} time an integer number representing a number of seconds.
    * @return {ObjectID} return the created ObjectID
    */
  def createFromTime(time: scala.Double): bsonLib.bsonMod.ObjectID = js.native
  def isValid(id: bsonLib.bsonMod.ObjectID): scala.Boolean = js.native
  /**
    * Checks if a value is a valid bson ObjectID
    *
    * @return {boolean} return true if the value is a valid bson ObjectID, return false otherwise.
    */
  def isValid(id: java.lang.String): scala.Boolean = js.native
  def isValid(id: scala.Double): scala.Boolean = js.native
}

