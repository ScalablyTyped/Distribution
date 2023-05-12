package typings.bson.mod

import typings.bson.bsonStrings.base64
import typings.bson.bsonStrings.hex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bson", "ObjectId")
@js.native
/* Excluded from this release type: [kId] */
/* Excluded from this release type: __id */
/**
  * Create an ObjectId type
  *
  * @param inputId - Can be a 24 character hex string, 12 byte binary Buffer, or a number.
  */
open class ObjectId () extends BSONValue {
  def this(inputId: String) = this()
  def this(inputId: js.typedarray.Uint8Array) = this()
  def this(inputId: scala.Double) = this()
  def this(inputId: ObjectId) = this()
  def this(inputId: ObjectIdLike) = this()
  
  /**
    * Compares the equality of this ObjectId with `otherID`.
    *
    * @param otherId - ObjectId instance to compare against.
    */
  def equals(otherId: String): Boolean = js.native
  def equals(otherId: ObjectId): Boolean = js.native
  def equals(otherId: ObjectIdLike): Boolean = js.native
  
  /** Returns the generation date (accurate up to the second) that this ID was generated. */
  def getTimestamp(): js.Date = js.native
  
  /**
    * The ObjectId bytes
    * @readonly
    */
  def id: js.typedarray.Uint8Array = js.native
  def id_=(value: js.typedarray.Uint8Array): Unit = js.native
  
  /** Returns the ObjectId id as a 24 character hex string representation */
  def toHexString(): String = js.native
  
  /** Converts to its JSON the 24 character hex string representation. */
  def toJSON(): String = js.native
  
  def toString(encoding: hex | base64): String = js.native
}
/* static members */
object ObjectId {
  
  @JSImport("bson", "ObjectId")
  @js.native
  val ^ : js.Any = js.native
  
  /* Excluded from this release type: index */
  @JSImport("bson", "ObjectId.cacheHexString")
  @js.native
  def cacheHexString: Boolean = js.native
  inline def cacheHexString_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cacheHexString")(x.asInstanceOf[js.Any])
  
  /** Creates an ObjectId instance from a base64 string */
  inline def createFromBase64(base64: String): ObjectId = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromBase64")(base64.asInstanceOf[js.Any]).asInstanceOf[ObjectId]
  
  /**
    * Creates an ObjectId from a hex string representation of an ObjectId.
    *
    * @param hexString - create a ObjectId from a passed in 24 character hexstring.
    */
  inline def createFromHexString(hexString: String): ObjectId = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromHexString")(hexString.asInstanceOf[js.Any]).asInstanceOf[ObjectId]
  
  /* Excluded from this release type: createPk */
  /**
    * Creates an ObjectId from a second based number, with the rest of the ObjectId zeroed out. Used for comparisons or sorting the ObjectId.
    *
    * @param time - an integer number representing a number of seconds.
    */
  inline def createFromTime(time: scala.Double): ObjectId = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromTime")(time.asInstanceOf[js.Any]).asInstanceOf[ObjectId]
  
  /* Excluded from this release type: getInc */
  /**
    * Generate a 12 byte id buffer used in ObjectId's
    *
    * @param time - pass in a second based timestamp.
    */
  inline def generate(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[js.typedarray.Uint8Array]
  inline def generate(time: scala.Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(time.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  /**
    * Checks if a value is a valid bson ObjectId
    *
    * @param id - ObjectId instance to validate.
    */
  inline def isValid(id: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValid(id: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValid(id: scala.Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValid(id: ObjectId): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValid(id: ObjectIdLike): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
