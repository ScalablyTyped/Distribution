package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SourcesOrder. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SourcesOrder")
@js.native
/**
  * Constructs a new SourcesOrder.
  * @param [properties] Properties to set
  */
class SourcesOrder ()
  extends StObject
     with ISourcesOrder {
  def this(properties: ISourcesOrder) = this()
  
  /** SourcesOrder seed. */
  @JSName("seed")
  var seed_SourcesOrder: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
  
  /**
    * Converts this SourcesOrder to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** SourcesOrder type. */
  @JSName("type")
  var type_SourcesOrder: SourcesOrderType = js.native
}
object SourcesOrder {
  
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SourcesOrder")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new SourcesOrder instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SourcesOrder instance
    */
  /* static member */
  inline def create(): SourcesOrder = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[SourcesOrder]
  inline def create(properties: ISourcesOrder): SourcesOrder = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[SourcesOrder]
  
  /**
    * Decodes a SourcesOrder message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SourcesOrder
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): SourcesOrder = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SourcesOrder]
  inline def decode(reader: Reader, length: Double): SourcesOrder = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SourcesOrder]
  inline def decode(reader: Uint8Array): SourcesOrder = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SourcesOrder]
  inline def decode(reader: Uint8Array, length: Double): SourcesOrder = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SourcesOrder]
  
  /**
    * Decodes a SourcesOrder message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SourcesOrder
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): SourcesOrder = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SourcesOrder]
  inline def decodeDelimited(reader: Uint8Array): SourcesOrder = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SourcesOrder]
  
  /**
    * Encodes the specified SourcesOrder message. Does not implicitly {@link io.cucumber.messages.SourcesOrder.verify|verify} messages.
    * @param message SourcesOrder message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ISourcesOrder): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ISourcesOrder, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified SourcesOrder message, length delimited. Does not implicitly {@link io.cucumber.messages.SourcesOrder.verify|verify} messages.
    * @param message SourcesOrder message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ISourcesOrder): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ISourcesOrder, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a SourcesOrder message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SourcesOrder
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[js.Any]): SourcesOrder = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[SourcesOrder]
  
  /**
    * Creates a plain object from a SourcesOrder message. Also converts values to other types if specified.
    * @param message SourcesOrder
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: SourcesOrder): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: SourcesOrder, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a SourcesOrder message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
