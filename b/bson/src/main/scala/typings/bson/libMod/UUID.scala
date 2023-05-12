package typings.bson.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bson/lib", "UUID")
@js.native
/**
  * Create a UUID type
  *
  * When the argument to the constructor is omitted a random v4 UUID will be generated.
  *
  * @param input - Can be a 32 or 36 character hex string (dashes excluded/included) or a 16 byte binary Buffer.
  */
open class UUID ()
  extends typings.bson.libBsonMod.UUID {
  def this(input: String) = this()
  def this(input: js.typedarray.Uint8Array) = this()
  def this(input: typings.bson.libBinaryMod.UUID) = this()
}
/* static members */
object UUID {
  
  @JSImport("bson/lib", "UUID")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  inline def bytesFromString(representation: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesFromString")(representation.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  /** @deprecated Hex string is no longer cached, this control will be removed in a future major release */
  @JSImport("bson/lib", "UUID.cacheHexString")
  @js.native
  def cacheHexString: Boolean = js.native
  inline def cacheHexString_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cacheHexString")(x.asInstanceOf[js.Any])
  
  /** Creates an UUID from a base64 string representation of an UUID. */
  inline def createFromBase64(base64: String): typings.bson.libBinaryMod.UUID = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromBase64")(base64.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libBinaryMod.UUID]
  
  /**
    * Creates an UUID from a hex string representation of an UUID.
    * @param hexString - 32 or 36 character hex string (dashes excluded/included).
    */
  inline def createFromHexString(hexString: String): typings.bson.libBinaryMod.UUID = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromHexString")(hexString.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libBinaryMod.UUID]
  
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
  inline def isValid(input: typings.bson.libBinaryMod.Binary): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValid(input: typings.bson.libBinaryMod.UUID): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * @internal
    *
    * Validates a string to be a hex digit sequence with or without dashes.
    * The canonical hyphenated representation of a uuid is hex in 8-4-4-4-12 groups.
    */
  inline def isValidUUIDString(representation: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidUUIDString")(representation.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
