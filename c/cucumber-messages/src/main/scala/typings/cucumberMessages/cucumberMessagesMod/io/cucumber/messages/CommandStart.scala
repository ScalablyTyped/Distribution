package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CommandStart. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandStart")
@js.native
/**
  * Constructs a new CommandStart.
  * @param [properties] Properties to set
  */
class CommandStart ()
  extends StObject
     with ICommandStart {
  def this(properties: ICommandStart) = this()
  
  /** CommandStart baseDirectory. */
  @JSName("baseDirectory")
  var baseDirectory_CommandStart: String = js.native
  
  /**
    * Converts this CommandStart to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object CommandStart {
  
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandStart")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new CommandStart instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CommandStart instance
    */
  /* static member */
  inline def create(): CommandStart = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CommandStart]
  inline def create(properties: ICommandStart): CommandStart = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[CommandStart]
  
  /**
    * Decodes a CommandStart message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CommandStart
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): CommandStart = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CommandStart]
  inline def decode(reader: Reader, length: Double): CommandStart = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CommandStart]
  inline def decode(reader: Uint8Array): CommandStart = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CommandStart]
  inline def decode(reader: Uint8Array, length: Double): CommandStart = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CommandStart]
  
  /**
    * Decodes a CommandStart message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CommandStart
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): CommandStart = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CommandStart]
  inline def decodeDelimited(reader: Uint8Array): CommandStart = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CommandStart]
  
  /**
    * Encodes the specified CommandStart message. Does not implicitly {@link io.cucumber.messages.CommandStart.verify|verify} messages.
    * @param message CommandStart message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ICommandStart): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ICommandStart, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified CommandStart message, length delimited. Does not implicitly {@link io.cucumber.messages.CommandStart.verify|verify} messages.
    * @param message CommandStart message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ICommandStart): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ICommandStart, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a CommandStart message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CommandStart
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[js.Any]): CommandStart = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[CommandStart]
  
  /**
    * Creates a plain object from a CommandStart message. Also converts values to other types if specified.
    * @param message CommandStart
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: CommandStart): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: CommandStart, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a CommandStart message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
