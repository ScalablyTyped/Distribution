package typings.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.IStepMatchArgument
import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.StepMatchArgument.IGroup
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a single argument extracted from a step match and passed to a step definition.
  * This is used for the following purposes:
  * - Construct an argument to pass to a step definition (possibly through a parameter type transform)
  * - Highlight the matched parameter in rich formatters such as the HTML formatter
  *
  * This message closely matches the `Argument` class in the `cucumber-expressions` library.
  */
@JSImport("cucumber-messages", "messages.StepMatchArgument")
@js.native
/**
  * Constructs a new StepMatchArgument.
  * @param [properties] Properties to set
  */
open class StepMatchArgument ()
  extends typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.StepMatchArgument {
  def this(properties: IStepMatchArgument) = this()
}
object StepMatchArgument {
  
  @JSImport("cucumber-messages", "messages.StepMatchArgument")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents a Group. */
  @JSImport("cucumber-messages", "messages.StepMatchArgument.Group")
  @js.native
  /**
    * Constructs a new Group.
    * @param [properties] Properties to set
    */
  open class Group ()
    extends typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group {
    def this(properties: IGroup) = this()
  }
  object Group {
    
    @JSImport("cucumber-messages", "messages.StepMatchArgument.Group")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Group instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Group instance
      */
    /* static member */
    inline def create(): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group]
    inline def create(properties: IGroup): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group]
    
    inline def decode(reader: js.typedarray.Uint8Array): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group]
    /**
      * Decodes a Group message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Group
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group]
    inline def decode(reader: Reader, length: Double): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group]
    /**
      * Decodes a Group message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Group
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group]
    
    /**
      * Encodes the specified Group message. Does not implicitly {@link io.cucumber.messages.StepMatchArgument.Group.verify|verify} messages.
      * @param message Group message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IGroup): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IGroup, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Group message, length delimited. Does not implicitly {@link io.cucumber.messages.StepMatchArgument.Group.verify|verify} messages.
      * @param message Group message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IGroup): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IGroup, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a Group message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Group
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group]
    
    /**
      * Creates a plain object from a Group message. Also converts values to other types if specified.
      * @param message Group
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(
      message: typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group
    ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(
      message: typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group,
      options: IConversionOptions
    ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a Group message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /**
    * Creates a new StepMatchArgument instance using the specified properties.
    * @param [properties] Properties to set
    * @returns StepMatchArgument instance
    */
  /* static member */
  inline def create(): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.StepMatchArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.StepMatchArgument]
  inline def create(properties: IStepMatchArgument): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.StepMatchArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.StepMatchArgument]
  
  inline def decode(reader: js.typedarray.Uint8Array): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.StepMatchArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.StepMatchArgument]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.StepMatchArgument = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.StepMatchArgument]
  /**
    * Decodes a StepMatchArgument message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns StepMatchArgument
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.StepMatchArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.StepMatchArgument]
  inline def decode(reader: Reader, length: Double): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.StepMatchArgument = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.StepMatchArgument]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.StepMatchArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.StepMatchArgument]
  /**
    * Decodes a StepMatchArgument message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns StepMatchArgument
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.StepMatchArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.StepMatchArgument]
  
  /**
    * Encodes the specified StepMatchArgument message. Does not implicitly {@link io.cucumber.messages.StepMatchArgument.verify|verify} messages.
    * @param message StepMatchArgument message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IStepMatchArgument): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IStepMatchArgument, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified StepMatchArgument message, length delimited. Does not implicitly {@link io.cucumber.messages.StepMatchArgument.verify|verify} messages.
    * @param message StepMatchArgument message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IStepMatchArgument): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IStepMatchArgument, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a StepMatchArgument message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns StepMatchArgument
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.StepMatchArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.StepMatchArgument]
  
  /**
    * Creates a plain object from a StepMatchArgument message. Also converts values to other types if specified.
    * @param message StepMatchArgument
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(
    message: typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.StepMatchArgument
  ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(
    message: typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.StepMatchArgument,
    options: IConversionOptions
  ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a StepMatchArgument message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
