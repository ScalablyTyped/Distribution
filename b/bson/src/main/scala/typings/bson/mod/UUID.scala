package typings.bson.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bson", "UUID")
@js.native
/**
  * Create a UUID type
  *
  * When the argument to the constructor is omitted a random v4 UUID will be generated.
  *
  * @param input - Can be a 32 or 36 character hex string (dashes excluded/included) or a 16 byte binary Buffer.
  */
open class UUID () extends Binary {
  def this(input: String) = this()
  def this(input: js.typedarray.Uint8Array) = this()
  def this(input: UUID) = this()
  
  /**
    * Compares the equality of this UUID with `otherID`.
    *
    * @param otherId - UUID instance to compare against.
    */
  def equals(otherId: String): Boolean = js.native
  def equals(otherId: js.typedarray.Uint8Array): Boolean = js.native
  def equals(otherId: UUID): Boolean = js.native
  
  /**
    * The UUID bytes
    * @readonly
    */
  def id: js.typedarray.Uint8Array = js.native
  def id_=(value: js.typedarray.Uint8Array): Unit = js.native
  
  /**
    * Creates a Binary instance from the current UUID.
    */
  def toBinary(): Binary = js.native
  
  /**
    * Returns the UUID id as a 32 or 36 character hex string representation, excluding/including dashes (defaults to 36 character dash separated)
    * @param includeDashes - should the string exclude dash-separators.
    */
  def toHexString(): String = js.native
  def toHexString(includeDashes: Boolean): String = js.native
}
/* static members */
object UUID {
  
  @JSImport("bson", "UUID")
  @js.native
  val ^ : js.Any = js.native
  
  /** @deprecated Hex string is no longer cached, this control will be removed in a future major release */
  @JSImport("bson", "UUID.cacheHexString")
  @js.native
  def cacheHexString: Boolean = js.native
  inline def cacheHexString_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cacheHexString")(x.asInstanceOf[js.Any])
  
  /** Creates an UUID from a base64 string representation of an UUID. */
  inline def createFromBase64(base64: String): UUID = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromBase64")(base64.asInstanceOf[js.Any]).asInstanceOf[UUID]
  
  /**
    * Creates an UUID from a hex string representation of an UUID.
    * @param hexString - 32 or 36 character hex string (dashes excluded/included).
    */
  inline def createFromHexString(hexString: String): UUID = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromHexString")(hexString.asInstanceOf[js.Any]).asInstanceOf[UUID]
  
  /**
    * Generates a populated buffer containing a v4 uuid
    */
  inline def generate(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[js.typedarray.Uint8Array]
  
  /**
    * Checks if a value is a valid bson UUID
    * @param input - UUID, string or Buffer to validate.
    */
  inline def isValid(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValid(input: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValid(input: Binary): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValid(input: UUID): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
