package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an UriToLinesMapping. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.UriToLinesMapping")
@js.native
/**
  * Constructs a new UriToLinesMapping.
  * @param [properties] Properties to set
  */
class UriToLinesMapping ()
  extends StObject
     with IUriToLinesMapping {
  def this(properties: IUriToLinesMapping) = this()
  
  /** UriToLinesMapping absolutePath. */
  @JSName("absolutePath")
  var absolutePath_UriToLinesMapping: String = js.native
  
  /** UriToLinesMapping lines. */
  @JSName("lines")
  var lines_UriToLinesMapping: js.Array[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
  ] = js.native
  
  /**
    * Converts this UriToLinesMapping to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object UriToLinesMapping {
  
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.UriToLinesMapping")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new UriToLinesMapping instance using the specified properties.
    * @param [properties] Properties to set
    * @returns UriToLinesMapping instance
    */
  /* static member */
  inline def create(): UriToLinesMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[UriToLinesMapping]
  inline def create(properties: IUriToLinesMapping): UriToLinesMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[UriToLinesMapping]
  
  /**
    * Decodes an UriToLinesMapping message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns UriToLinesMapping
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): UriToLinesMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[UriToLinesMapping]
  inline def decode(reader: Reader, length: Double): UriToLinesMapping = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[UriToLinesMapping]
  inline def decode(reader: Uint8Array): UriToLinesMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[UriToLinesMapping]
  inline def decode(reader: Uint8Array, length: Double): UriToLinesMapping = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[UriToLinesMapping]
  
  /**
    * Decodes an UriToLinesMapping message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns UriToLinesMapping
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): UriToLinesMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[UriToLinesMapping]
  inline def decodeDelimited(reader: Uint8Array): UriToLinesMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[UriToLinesMapping]
  
  /**
    * Encodes the specified UriToLinesMapping message. Does not implicitly {@link io.cucumber.messages.UriToLinesMapping.verify|verify} messages.
    * @param message UriToLinesMapping message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IUriToLinesMapping): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IUriToLinesMapping, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified UriToLinesMapping message, length delimited. Does not implicitly {@link io.cucumber.messages.UriToLinesMapping.verify|verify} messages.
    * @param message UriToLinesMapping message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IUriToLinesMapping): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IUriToLinesMapping, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an UriToLinesMapping message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns UriToLinesMapping
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[js.Any]): UriToLinesMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[UriToLinesMapping]
  
  /**
    * Creates a plain object from an UriToLinesMapping message. Also converts values to other types if specified.
    * @param message UriToLinesMapping
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: UriToLinesMapping): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: UriToLinesMapping, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies an UriToLinesMapping message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
