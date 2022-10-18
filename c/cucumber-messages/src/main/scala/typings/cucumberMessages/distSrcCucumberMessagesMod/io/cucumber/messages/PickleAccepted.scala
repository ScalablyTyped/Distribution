package typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a PickleAccepted. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleAccepted")
@js.native
/**
  * Constructs a new PickleAccepted.
  * @param [properties] Properties to set
  */
open class PickleAccepted ()
  extends StObject
     with IPickleAccepted {
  def this(properties: IPickleAccepted) = this()
  
  /** PickleAccepted pickleId. */
  @JSName("pickleId")
  var pickleId_PickleAccepted: String = js.native
  
  /**
    * Converts this PickleAccepted to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object PickleAccepted {
  
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleAccepted")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new PickleAccepted instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PickleAccepted instance
    */
  /* static member */
  inline def create(): PickleAccepted = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[PickleAccepted]
  inline def create(properties: IPickleAccepted): PickleAccepted = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[PickleAccepted]
  
  inline def decode(reader: js.typedarray.Uint8Array): PickleAccepted = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PickleAccepted]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): PickleAccepted = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PickleAccepted]
  /**
    * Decodes a PickleAccepted message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PickleAccepted
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): PickleAccepted = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PickleAccepted]
  inline def decode(reader: Reader, length: Double): PickleAccepted = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PickleAccepted]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): PickleAccepted = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PickleAccepted]
  /**
    * Decodes a PickleAccepted message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PickleAccepted
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): PickleAccepted = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PickleAccepted]
  
  /**
    * Encodes the specified PickleAccepted message. Does not implicitly {@link io.cucumber.messages.PickleAccepted.verify|verify} messages.
    * @param message PickleAccepted message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IPickleAccepted): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IPickleAccepted, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified PickleAccepted message, length delimited. Does not implicitly {@link io.cucumber.messages.PickleAccepted.verify|verify} messages.
    * @param message PickleAccepted message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IPickleAccepted): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IPickleAccepted, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a PickleAccepted message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PickleAccepted
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): PickleAccepted = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[PickleAccepted]
  
  /**
    * Creates a plain object from a PickleAccepted message. Also converts values to other types if specified.
    * @param message PickleAccepted
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: PickleAccepted): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: PickleAccepted, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a PickleAccepted message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
