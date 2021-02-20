package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Duration. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Duration")
@js.native
/**
  * Constructs a new Duration.
  * @param [properties] Properties to set
  */
class Duration () extends IDuration {
  def this(properties: IDuration) = this()
  
  /** Duration nanos. */
  @JSName("nanos")
  var nanos_Duration: Double = js.native
  
  /** Duration seconds. */
  @JSName("seconds")
  var seconds_Duration: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
  
  /**
    * Converts this Duration to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object Duration {
  
  /**
    * Creates a new Duration instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Duration instance
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Duration.create")
  @js.native
  def create(): Duration = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Duration.create")
  @js.native
  def create(properties: IDuration): Duration = js.native
  
  /**
    * Decodes a Duration message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Duration
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Duration.decode")
  @js.native
  def decode(reader: Reader): Duration = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Duration.decode")
  @js.native
  def decode(reader: Reader, length: Double): Duration = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Duration.decode")
  @js.native
  def decode(reader: Uint8Array): Duration = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Duration.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): Duration = js.native
  
  /**
    * Decodes a Duration message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Duration
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Duration.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): Duration = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Duration.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): Duration = js.native
  
  /**
    * Encodes the specified Duration message. Does not implicitly {@link io.cucumber.messages.Duration.verify|verify} messages.
    * @param message Duration message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Duration.encode")
  @js.native
  def encode(message: IDuration): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Duration.encode")
  @js.native
  def encode(message: IDuration, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Duration message, length delimited. Does not implicitly {@link io.cucumber.messages.Duration.verify|verify} messages.
    * @param message Duration message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Duration.encodeDelimited")
  @js.native
  def encodeDelimited(message: IDuration): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Duration.encodeDelimited")
  @js.native
  def encodeDelimited(message: IDuration, writer: Writer): Writer = js.native
  
  /**
    * Creates a Duration message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Duration
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Duration.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): Duration = js.native
  
  /**
    * Creates a plain object from a Duration message. Also converts values to other types if specified.
    * @param message Duration
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Duration.toObject")
  @js.native
  def toObject(message: Duration): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Duration.toObject")
  @js.native
  def toObject(message: Duration, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Duration message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Duration.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
