package typings.bson.mod

import typings.bson.bsonStrings.ObjectID
import typings.buffer.mod.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A class representation of the BSON ObjectId type.
  * @public
  * @category BSONType
  */
@js.native
trait ObjectId extends StObject {
  
  var _bsontype: ObjectID = js.native
  
  /**
    * Compares the equality of this ObjectId with `otherID`.
    *
    * @param otherId - ObjectId instance to compare against.
    */
  def equals(otherId: String): Boolean = js.native
  def equals(otherId: ObjectId): Boolean = js.native
  def equals(otherId: ObjectIdLike): Boolean = js.native
  
  /**
    * The generation time of this ObjectId instance
    * @deprecated Please use getTimestamp / createFromTime which returns an int32 epoch
    */
  def generationTime: scala.Double = js.native
  def generationTime_=(value: scala.Double): Unit = js.native
  
  /** Returns the generation date (accurate up to the second) that this ID was generated. */
  def getTimestamp(): js.Date = js.native
  
  /**
    * The ObjectId bytes
    * @readonly
    */
  def id: Buffer = js.native
  def id_=(value: Buffer): Unit = js.native
  
  /* Excluded from this release type: toExtendedJSON */
  /* Excluded from this release type: fromExtendedJSON */
  def inspect(): String = js.native
  
  /** Returns the ObjectId id as a 24 character hex string representation */
  def toHexString(): String = js.native
  
  /** Converts to its JSON the 24 character hex string representation. */
  def toJSON(): String = js.native
  
  def toString(format: String): String = js.native
}
