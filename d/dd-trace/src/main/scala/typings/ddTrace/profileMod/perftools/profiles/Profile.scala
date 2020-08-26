package typings.ddTrace.profileMod.perftools.profiles

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Profile. */
@JSImport("dd-trace/protobuf/profile", "perftools.profiles.Profile")
@js.native
/**
  * Constructs a new Profile.
  * @param [properties] Properties to set
  */
class Profile () extends IProfile {
  def this(properties: IProfile) = this()
  /** Profile comment. */
  @JSName("comment")
  var comment_Profile: js.Array[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ _)
  ] = js.native
  /** Profile defaultSampleType. */
  @JSName("defaultSampleType")
  var defaultSampleType_Profile: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
  /** Profile dropFrames. */
  @JSName("dropFrames")
  var dropFrames_Profile: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
  /** Profile durationNanos. */
  @JSName("durationNanos")
  var durationNanos_Profile: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
  /** Profile function. */
  @JSName("function")
  var function_Profile: js.Array[IFunction] = js.native
  /** Profile keepFrames. */
  @JSName("keepFrames")
  var keepFrames_Profile: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
  /** Profile location. */
  @JSName("location")
  var location_Profile: js.Array[ILocation] = js.native
  /** Profile mapping. */
  @JSName("mapping")
  var mapping_Profile: js.Array[IMapping] = js.native
  /** Profile period. */
  @JSName("period")
  var period_Profile: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
  /** Profile sampleType. */
  @JSName("sampleType")
  var sampleType_Profile: js.Array[IValueType] = js.native
  /** Profile sample. */
  @JSName("sample")
  var sample_Profile: js.Array[ISample] = js.native
  /** Profile stringTable. */
  @JSName("stringTable")
  var stringTable_Profile: js.Array[String] = js.native
  /** Profile timeNanos. */
  @JSName("timeNanos")
  var timeNanos_Profile: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
  /**
    * Converts this Profile to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dd-trace/protobuf/profile", "perftools.profiles.Profile")
@js.native
object Profile extends js.Object {
  /**
    * Creates a new Profile instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Profile instance
    */
  def create(): Profile = js.native
  def create(properties: IProfile): Profile = js.native
  /**
    * Decodes a Profile message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Profile
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Profile = js.native
  def decode(reader: Reader, length: Double): Profile = js.native
  def decode(reader: Uint8Array): Profile = js.native
  def decode(reader: Uint8Array, length: Double): Profile = js.native
  /**
    * Decodes a Profile message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Profile
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Profile = js.native
  def decodeDelimited(reader: Uint8Array): Profile = js.native
  /**
    * Encodes the specified Profile message. Does not implicitly {@link perftools.profiles.Profile.verify|verify} messages.
    * @param message Profile message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IProfile): Writer = js.native
  def encode(message: IProfile, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Profile message, length delimited. Does not implicitly {@link perftools.profiles.Profile.verify|verify} messages.
    * @param message Profile message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IProfile): Writer = js.native
  def encodeDelimited(message: IProfile, writer: Writer): Writer = js.native
  /**
    * Creates a Profile message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Profile
    */
  def fromObject(`object`: StringDictionary[js.Any]): Profile = js.native
  /**
    * Creates a plain object from a Profile message. Also converts values to other types if specified.
    * @param message Profile
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Profile): StringDictionary[js.Any] = js.native
  def toObject(message: Profile, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a Profile message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

