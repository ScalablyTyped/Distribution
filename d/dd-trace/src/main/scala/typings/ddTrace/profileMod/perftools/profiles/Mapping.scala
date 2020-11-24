package typings.ddTrace.profileMod.perftools.profiles

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Mapping. */
@JSImport("dd-trace/protobuf/profile", "perftools.profiles.Mapping")
@js.native
/**
  * Constructs a new Mapping.
  * @param [properties] Properties to set
  */
class Mapping () extends IMapping {
  def this(properties: IMapping) = this()
  
  /** Mapping buildId. */
  @JSName("buildId")
  var buildId_Mapping: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
  
  /** Mapping fileOffset. */
  @JSName("fileOffset")
  var fileOffset_Mapping: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
  
  /** Mapping filename. */
  @JSName("filename")
  var filename_Mapping: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
  
  /** Mapping hasFilenames. */
  @JSName("hasFilenames")
  var hasFilenames_Mapping: Boolean = js.native
  
  /** Mapping hasFunctions. */
  @JSName("hasFunctions")
  var hasFunctions_Mapping: Boolean = js.native
  
  /** Mapping hasInlineFrames. */
  @JSName("hasInlineFrames")
  var hasInlineFrames_Mapping: Boolean = js.native
  
  /** Mapping hasLineNumbers. */
  @JSName("hasLineNumbers")
  var hasLineNumbers_Mapping: Boolean = js.native
  
  /** Mapping id. */
  @JSName("id")
  var id_Mapping: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
  
  /** Mapping memoryLimit. */
  @JSName("memoryLimit")
  var memoryLimit_Mapping: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
  
  /** Mapping memoryStart. */
  @JSName("memoryStart")
  var memoryStart_Mapping: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
  
  /**
    * Converts this Mapping to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
@JSImport("dd-trace/protobuf/profile", "perftools.profiles.Mapping")
@js.native
object Mapping extends js.Object {
  
  /**
    * Creates a new Mapping instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Mapping instance
    */
  def create(): Mapping = js.native
  def create(properties: IMapping): Mapping = js.native
  
  /**
    * Decodes a Mapping message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Mapping
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Mapping = js.native
  def decode(reader: Reader, length: Double): Mapping = js.native
  def decode(reader: Uint8Array): Mapping = js.native
  def decode(reader: Uint8Array, length: Double): Mapping = js.native
  
  /**
    * Decodes a Mapping message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Mapping
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Mapping = js.native
  def decodeDelimited(reader: Uint8Array): Mapping = js.native
  
  /**
    * Encodes the specified Mapping message. Does not implicitly {@link perftools.profiles.Mapping.verify|verify} messages.
    * @param message Mapping message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IMapping): Writer = js.native
  def encode(message: IMapping, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Mapping message, length delimited. Does not implicitly {@link perftools.profiles.Mapping.verify|verify} messages.
    * @param message Mapping message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IMapping): Writer = js.native
  def encodeDelimited(message: IMapping, writer: Writer): Writer = js.native
  
  /**
    * Creates a Mapping message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Mapping
    */
  def fromObject(`object`: StringDictionary[js.Any]): Mapping = js.native
  
  /**
    * Creates a plain object from a Mapping message. Also converts values to other types if specified.
    * @param message Mapping
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Mapping): StringDictionary[js.Any] = js.native
  def toObject(message: Mapping, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Mapping message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
