package typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CommandGenerateSnippet. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandGenerateSnippet")
@js.native
/**
  * Constructs a new CommandGenerateSnippet.
  * @param [properties] Properties to set
  */
open class CommandGenerateSnippet ()
  extends StObject
     with ICommandGenerateSnippet {
  def this(properties: ICommandGenerateSnippet) = this()
  
  /** CommandGenerateSnippet actionId. */
  @JSName("actionId")
  var actionId_CommandGenerateSnippet: String = js.native
  
  /** CommandGenerateSnippet generatedExpressions. */
  @JSName("generatedExpressions")
  var generatedExpressions_CommandGenerateSnippet: js.Array[IGeneratedExpression] = js.native
  
  /**
    * Converts this CommandGenerateSnippet to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object CommandGenerateSnippet {
  
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandGenerateSnippet")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new CommandGenerateSnippet instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CommandGenerateSnippet instance
    */
  /* static member */
  inline def create(): CommandGenerateSnippet = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CommandGenerateSnippet]
  inline def create(properties: ICommandGenerateSnippet): CommandGenerateSnippet = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[CommandGenerateSnippet]
  
  inline def decode(reader: js.typedarray.Uint8Array): CommandGenerateSnippet = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CommandGenerateSnippet]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): CommandGenerateSnippet = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CommandGenerateSnippet]
  /**
    * Decodes a CommandGenerateSnippet message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CommandGenerateSnippet
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): CommandGenerateSnippet = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CommandGenerateSnippet]
  inline def decode(reader: Reader, length: Double): CommandGenerateSnippet = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CommandGenerateSnippet]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): CommandGenerateSnippet = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CommandGenerateSnippet]
  /**
    * Decodes a CommandGenerateSnippet message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CommandGenerateSnippet
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): CommandGenerateSnippet = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CommandGenerateSnippet]
  
  /**
    * Encodes the specified CommandGenerateSnippet message. Does not implicitly {@link io.cucumber.messages.CommandGenerateSnippet.verify|verify} messages.
    * @param message CommandGenerateSnippet message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ICommandGenerateSnippet): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ICommandGenerateSnippet, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified CommandGenerateSnippet message, length delimited. Does not implicitly {@link io.cucumber.messages.CommandGenerateSnippet.verify|verify} messages.
    * @param message CommandGenerateSnippet message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ICommandGenerateSnippet): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ICommandGenerateSnippet, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a CommandGenerateSnippet message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CommandGenerateSnippet
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): CommandGenerateSnippet = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[CommandGenerateSnippet]
  
  /**
    * Creates a plain object from a CommandGenerateSnippet message. Also converts values to other types if specified.
    * @param message CommandGenerateSnippet
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: CommandGenerateSnippet): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: CommandGenerateSnippet, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a CommandGenerateSnippet message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
