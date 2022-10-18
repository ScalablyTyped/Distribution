package typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a PickleRejected. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleRejected")
@js.native
/**
  * Constructs a new PickleRejected.
  * @param [properties] Properties to set
  */
open class PickleRejected ()
  extends StObject
     with IPickleRejected {
  def this(properties: IPickleRejected) = this()
  
  /** PickleRejected pickleId. */
  @JSName("pickleId")
  var pickleId_PickleRejected: String = js.native
  
  /**
    * Converts this PickleRejected to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object PickleRejected {
  
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleRejected")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new PickleRejected instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PickleRejected instance
    */
  /* static member */
  inline def create(): PickleRejected = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[PickleRejected]
  inline def create(properties: IPickleRejected): PickleRejected = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[PickleRejected]
  
  inline def decode(reader: js.typedarray.Uint8Array): PickleRejected = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PickleRejected]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): PickleRejected = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PickleRejected]
  /**
    * Decodes a PickleRejected message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PickleRejected
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): PickleRejected = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PickleRejected]
  inline def decode(reader: Reader, length: Double): PickleRejected = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PickleRejected]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): PickleRejected = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PickleRejected]
  /**
    * Decodes a PickleRejected message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PickleRejected
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): PickleRejected = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PickleRejected]
  
  /**
    * Encodes the specified PickleRejected message. Does not implicitly {@link io.cucumber.messages.PickleRejected.verify|verify} messages.
    * @param message PickleRejected message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IPickleRejected): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IPickleRejected, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified PickleRejected message, length delimited. Does not implicitly {@link io.cucumber.messages.PickleRejected.verify|verify} messages.
    * @param message PickleRejected message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IPickleRejected): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IPickleRejected, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a PickleRejected message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PickleRejected
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): PickleRejected = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[PickleRejected]
  
  /**
    * Creates a plain object from a PickleRejected message. Also converts values to other types if specified.
    * @param message PickleRejected
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: PickleRejected): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: PickleRejected, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a PickleRejected message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
