package typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An attachment represents any kind of data associated with a line in a
  * [Source](#io.cucumber.messages.Source) file. It can be used for:
  *
  * * Syntax errors during parse time
  * * Screenshots captured and attached during execution
  * * Logs captured and attached during execution
  *
  * It is not to be used for runtime errors raised/thrown during execution. This
  * is captured in `TestResult`.
  */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Attachment")
@js.native
/**
  * Constructs a new Attachment.
  * @param [properties] Properties to set
  */
open class Attachment ()
  extends StObject
     with IAttachment {
  def this(properties: IAttachment) = this()
  
  /** Attachment data. */
  @JSName("data")
  var data_Attachment: String = js.native
  
  /** Attachment testCaseStartedId. */
  @JSName("testCaseStartedId")
  var testCaseStartedId_Attachment: String = js.native
  
  /** Attachment testStepId. */
  @JSName("testStepId")
  var testStepId_Attachment: String = js.native
  
  /**
    * Converts this Attachment to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object Attachment {
  
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Attachment")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Attachment instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Attachment instance
    */
  /* static member */
  inline def create(): Attachment = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Attachment]
  inline def create(properties: IAttachment): Attachment = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Attachment]
  
  inline def decode(reader: js.typedarray.Uint8Array): Attachment = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Attachment]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): Attachment = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Attachment]
  /**
    * Decodes an Attachment message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Attachment
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): Attachment = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Attachment]
  inline def decode(reader: Reader, length: Double): Attachment = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Attachment]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): Attachment = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Attachment]
  /**
    * Decodes an Attachment message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Attachment
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): Attachment = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Attachment]
  
  /**
    * Encodes the specified Attachment message. Does not implicitly {@link io.cucumber.messages.Attachment.verify|verify} messages.
    * @param message Attachment message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IAttachment): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IAttachment, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Attachment message, length delimited. Does not implicitly {@link io.cucumber.messages.Attachment.verify|verify} messages.
    * @param message Attachment message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IAttachment): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IAttachment, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an Attachment message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Attachment
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): Attachment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Attachment]
  
  /**
    * Creates a plain object from an Attachment message. Also converts values to other types if specified.
    * @param message Attachment
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: Attachment): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: Attachment, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies an Attachment message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
