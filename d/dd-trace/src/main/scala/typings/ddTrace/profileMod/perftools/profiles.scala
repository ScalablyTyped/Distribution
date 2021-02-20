package typings.ddTrace.profileMod.perftools

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Namespace profiles. */
object profiles {
  
  /** Represents a Function. */
  @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Function")
  @js.native
  /**
    * Constructs a new Function.
    * @param [properties] Properties to set
    */
  class Function () extends IFunction {
    def this(properties: IFunction) = this()
    
    /** Function filename. */
    @JSName("filename")
    var filename_Function: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
    
    /** Function id. */
    @JSName("id")
    var id_Function: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
    
    /** Function name. */
    @JSName("name")
    var name_Function: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
    
    /** Function startLine. */
    @JSName("startLine")
    var startLine_Function: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
    
    /** Function systemName. */
    @JSName("systemName")
    var systemName_Function: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
    
    /**
      * Converts this Function to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
  }
  object Function {
    
    /**
      * Creates a new Function instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Function instance
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Function.create")
    @js.native
    def create(): Function = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Function.create")
    @js.native
    def create(properties: IFunction): Function = js.native
    
    /**
      * Decodes a Function message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Function
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Function.decode")
    @js.native
    def decode(reader: Reader): Function = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Function.decode")
    @js.native
    def decode(reader: Reader, length: Double): Function = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Function.decode")
    @js.native
    def decode(reader: Uint8Array): Function = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Function.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): Function = js.native
    
    /**
      * Decodes a Function message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Function
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Function.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): Function = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Function.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): Function = js.native
    
    /**
      * Encodes the specified Function message. Does not implicitly {@link perftools.profiles.Function.verify|verify} messages.
      * @param message Function message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Function.encode")
    @js.native
    def encode(message: IFunction): Writer = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Function.encode")
    @js.native
    def encode(message: IFunction, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Function message, length delimited. Does not implicitly {@link perftools.profiles.Function.verify|verify} messages.
      * @param message Function message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Function.encodeDelimited")
    @js.native
    def encodeDelimited(message: IFunction): Writer = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Function.encodeDelimited")
    @js.native
    def encodeDelimited(message: IFunction, writer: Writer): Writer = js.native
    
    /**
      * Creates a Function message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Function
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Function.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): Function = js.native
    
    /**
      * Creates a plain object from a Function message. Also converts values to other types if specified.
      * @param message Function
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Function.toObject")
    @js.native
    def toObject(message: Function): StringDictionary[js.Any] = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Function.toObject")
    @js.native
    def toObject(message: Function, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a Function message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Function.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents a Label. */
  @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Label")
  @js.native
  /**
    * Constructs a new Label.
    * @param [properties] Properties to set
    */
  class Label () extends ILabel {
    def this(properties: ILabel) = this()
    
    /** Label key. */
    @JSName("key")
    var key_Label: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
    
    /** Label numUnit. */
    @JSName("numUnit")
    var numUnit_Label: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
    
    /** Label num. */
    @JSName("num")
    var num_Label: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
    
    /** Label str. */
    @JSName("str")
    var str_Label: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
    
    /**
      * Converts this Label to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
  }
  object Label {
    
    /**
      * Creates a new Label instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Label instance
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Label.create")
    @js.native
    def create(): Label = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Label.create")
    @js.native
    def create(properties: ILabel): Label = js.native
    
    /**
      * Decodes a Label message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Label
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Label.decode")
    @js.native
    def decode(reader: Reader): Label = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Label.decode")
    @js.native
    def decode(reader: Reader, length: Double): Label = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Label.decode")
    @js.native
    def decode(reader: Uint8Array): Label = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Label.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): Label = js.native
    
    /**
      * Decodes a Label message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Label
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Label.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): Label = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Label.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): Label = js.native
    
    /**
      * Encodes the specified Label message. Does not implicitly {@link perftools.profiles.Label.verify|verify} messages.
      * @param message Label message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Label.encode")
    @js.native
    def encode(message: ILabel): Writer = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Label.encode")
    @js.native
    def encode(message: ILabel, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Label message, length delimited. Does not implicitly {@link perftools.profiles.Label.verify|verify} messages.
      * @param message Label message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Label.encodeDelimited")
    @js.native
    def encodeDelimited(message: ILabel): Writer = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Label.encodeDelimited")
    @js.native
    def encodeDelimited(message: ILabel, writer: Writer): Writer = js.native
    
    /**
      * Creates a Label message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Label
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Label.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): Label = js.native
    
    /**
      * Creates a plain object from a Label message. Also converts values to other types if specified.
      * @param message Label
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Label.toObject")
    @js.native
    def toObject(message: Label): StringDictionary[js.Any] = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Label.toObject")
    @js.native
    def toObject(message: Label, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a Label message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Label.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents a Line. */
  @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Line")
  @js.native
  /**
    * Constructs a new Line.
    * @param [properties] Properties to set
    */
  class Line () extends ILine {
    def this(properties: ILine) = this()
    
    /** Line functionId. */
    @JSName("functionId")
    var functionId_Line: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
    
    /** Line line. */
    @JSName("line")
    var line_Line: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
    
    /**
      * Converts this Line to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
  }
  object Line {
    
    /**
      * Creates a new Line instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Line instance
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Line.create")
    @js.native
    def create(): Line = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Line.create")
    @js.native
    def create(properties: ILine): Line = js.native
    
    /**
      * Decodes a Line message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Line
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Line.decode")
    @js.native
    def decode(reader: Reader): Line = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Line.decode")
    @js.native
    def decode(reader: Reader, length: Double): Line = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Line.decode")
    @js.native
    def decode(reader: Uint8Array): Line = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Line.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): Line = js.native
    
    /**
      * Decodes a Line message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Line
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Line.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): Line = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Line.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): Line = js.native
    
    /**
      * Encodes the specified Line message. Does not implicitly {@link perftools.profiles.Line.verify|verify} messages.
      * @param message Line message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Line.encode")
    @js.native
    def encode(message: ILine): Writer = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Line.encode")
    @js.native
    def encode(message: ILine, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Line message, length delimited. Does not implicitly {@link perftools.profiles.Line.verify|verify} messages.
      * @param message Line message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Line.encodeDelimited")
    @js.native
    def encodeDelimited(message: ILine): Writer = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Line.encodeDelimited")
    @js.native
    def encodeDelimited(message: ILine, writer: Writer): Writer = js.native
    
    /**
      * Creates a Line message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Line
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Line.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): Line = js.native
    
    /**
      * Creates a plain object from a Line message. Also converts values to other types if specified.
      * @param message Line
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Line.toObject")
    @js.native
    def toObject(message: Line): StringDictionary[js.Any] = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Line.toObject")
    @js.native
    def toObject(message: Line, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a Line message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Line.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents a Location. */
  @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Location")
  @js.native
  /**
    * Constructs a new Location.
    * @param [properties] Properties to set
    */
  class Location () extends ILocation {
    def this(properties: ILocation) = this()
    
    /** Location address. */
    @JSName("address")
    var address_Location: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
    
    /** Location id. */
    @JSName("id")
    var id_Location: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
    
    /** Location isFolded. */
    @JSName("isFolded")
    var isFolded_Location: Boolean = js.native
    
    /** Location line. */
    @JSName("line")
    var line_Location: js.Array[ILine] = js.native
    
    /** Location mappingId. */
    @JSName("mappingId")
    var mappingId_Location: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
    
    /**
      * Converts this Location to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
  }
  object Location {
    
    /**
      * Creates a new Location instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Location instance
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Location.create")
    @js.native
    def create(): Location = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Location.create")
    @js.native
    def create(properties: ILocation): Location = js.native
    
    /**
      * Decodes a Location message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Location
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Location.decode")
    @js.native
    def decode(reader: Reader): Location = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Location.decode")
    @js.native
    def decode(reader: Reader, length: Double): Location = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Location.decode")
    @js.native
    def decode(reader: Uint8Array): Location = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Location.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): Location = js.native
    
    /**
      * Decodes a Location message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Location
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Location.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): Location = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Location.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): Location = js.native
    
    /**
      * Encodes the specified Location message. Does not implicitly {@link perftools.profiles.Location.verify|verify} messages.
      * @param message Location message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Location.encode")
    @js.native
    def encode(message: ILocation): Writer = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Location.encode")
    @js.native
    def encode(message: ILocation, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Location message, length delimited. Does not implicitly {@link perftools.profiles.Location.verify|verify} messages.
      * @param message Location message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Location.encodeDelimited")
    @js.native
    def encodeDelimited(message: ILocation): Writer = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Location.encodeDelimited")
    @js.native
    def encodeDelimited(message: ILocation, writer: Writer): Writer = js.native
    
    /**
      * Creates a Location message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Location
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Location.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): Location = js.native
    
    /**
      * Creates a plain object from a Location message. Also converts values to other types if specified.
      * @param message Location
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Location.toObject")
    @js.native
    def toObject(message: Location): StringDictionary[js.Any] = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Location.toObject")
    @js.native
    def toObject(message: Location, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a Location message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Location.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
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
  object Mapping {
    
    /**
      * Creates a new Mapping instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Mapping instance
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Mapping.create")
    @js.native
    def create(): Mapping = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Mapping.create")
    @js.native
    def create(properties: IMapping): Mapping = js.native
    
    /**
      * Decodes a Mapping message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Mapping
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Mapping.decode")
    @js.native
    def decode(reader: Reader): Mapping = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Mapping.decode")
    @js.native
    def decode(reader: Reader, length: Double): Mapping = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Mapping.decode")
    @js.native
    def decode(reader: Uint8Array): Mapping = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Mapping.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): Mapping = js.native
    
    /**
      * Decodes a Mapping message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Mapping
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Mapping.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): Mapping = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Mapping.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): Mapping = js.native
    
    /**
      * Encodes the specified Mapping message. Does not implicitly {@link perftools.profiles.Mapping.verify|verify} messages.
      * @param message Mapping message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Mapping.encode")
    @js.native
    def encode(message: IMapping): Writer = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Mapping.encode")
    @js.native
    def encode(message: IMapping, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Mapping message, length delimited. Does not implicitly {@link perftools.profiles.Mapping.verify|verify} messages.
      * @param message Mapping message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Mapping.encodeDelimited")
    @js.native
    def encodeDelimited(message: IMapping): Writer = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Mapping.encodeDelimited")
    @js.native
    def encodeDelimited(message: IMapping, writer: Writer): Writer = js.native
    
    /**
      * Creates a Mapping message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Mapping
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Mapping.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): Mapping = js.native
    
    /**
      * Creates a plain object from a Mapping message. Also converts values to other types if specified.
      * @param message Mapping
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Mapping.toObject")
    @js.native
    def toObject(message: Mapping): StringDictionary[js.Any] = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Mapping.toObject")
    @js.native
    def toObject(message: Mapping, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a Mapping message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Mapping.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
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
  object Profile {
    
    /**
      * Creates a new Profile instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Profile instance
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Profile.create")
    @js.native
    def create(): Profile = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Profile.create")
    @js.native
    def create(properties: IProfile): Profile = js.native
    
    /**
      * Decodes a Profile message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Profile
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Profile.decode")
    @js.native
    def decode(reader: Reader): Profile = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Profile.decode")
    @js.native
    def decode(reader: Reader, length: Double): Profile = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Profile.decode")
    @js.native
    def decode(reader: Uint8Array): Profile = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Profile.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): Profile = js.native
    
    /**
      * Decodes a Profile message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Profile
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Profile.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): Profile = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Profile.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): Profile = js.native
    
    /**
      * Encodes the specified Profile message. Does not implicitly {@link perftools.profiles.Profile.verify|verify} messages.
      * @param message Profile message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Profile.encode")
    @js.native
    def encode(message: IProfile): Writer = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Profile.encode")
    @js.native
    def encode(message: IProfile, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Profile message, length delimited. Does not implicitly {@link perftools.profiles.Profile.verify|verify} messages.
      * @param message Profile message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Profile.encodeDelimited")
    @js.native
    def encodeDelimited(message: IProfile): Writer = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Profile.encodeDelimited")
    @js.native
    def encodeDelimited(message: IProfile, writer: Writer): Writer = js.native
    
    /**
      * Creates a Profile message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Profile
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Profile.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): Profile = js.native
    
    /**
      * Creates a plain object from a Profile message. Also converts values to other types if specified.
      * @param message Profile
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Profile.toObject")
    @js.native
    def toObject(message: Profile): StringDictionary[js.Any] = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Profile.toObject")
    @js.native
    def toObject(message: Profile, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a Profile message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Profile.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents a Sample. */
  @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Sample")
  @js.native
  /**
    * Constructs a new Sample.
    * @param [properties] Properties to set
    */
  class Sample () extends ISample {
    def this(properties: ISample) = this()
    
    /** Sample label. */
    @JSName("label")
    var label_Sample: js.Array[ILabel] = js.native
    
    /** Sample locationId. */
    @JSName("locationId")
    var locationId_Sample: js.Array[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ _)
      ] = js.native
    
    /**
      * Converts this Sample to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
    
    /** Sample value. */
    @JSName("value")
    var value_Sample: js.Array[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ _)
      ] = js.native
  }
  object Sample {
    
    /**
      * Creates a new Sample instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Sample instance
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Sample.create")
    @js.native
    def create(): Sample = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Sample.create")
    @js.native
    def create(properties: ISample): Sample = js.native
    
    /**
      * Decodes a Sample message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Sample
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Sample.decode")
    @js.native
    def decode(reader: Reader): Sample = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Sample.decode")
    @js.native
    def decode(reader: Reader, length: Double): Sample = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Sample.decode")
    @js.native
    def decode(reader: Uint8Array): Sample = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Sample.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): Sample = js.native
    
    /**
      * Decodes a Sample message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Sample
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Sample.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): Sample = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Sample.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): Sample = js.native
    
    /**
      * Encodes the specified Sample message. Does not implicitly {@link perftools.profiles.Sample.verify|verify} messages.
      * @param message Sample message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Sample.encode")
    @js.native
    def encode(message: ISample): Writer = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Sample.encode")
    @js.native
    def encode(message: ISample, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Sample message, length delimited. Does not implicitly {@link perftools.profiles.Sample.verify|verify} messages.
      * @param message Sample message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Sample.encodeDelimited")
    @js.native
    def encodeDelimited(message: ISample): Writer = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Sample.encodeDelimited")
    @js.native
    def encodeDelimited(message: ISample, writer: Writer): Writer = js.native
    
    /**
      * Creates a Sample message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Sample
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Sample.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): Sample = js.native
    
    /**
      * Creates a plain object from a Sample message. Also converts values to other types if specified.
      * @param message Sample
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Sample.toObject")
    @js.native
    def toObject(message: Sample): StringDictionary[js.Any] = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Sample.toObject")
    @js.native
    def toObject(message: Sample, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a Sample message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.Sample.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents a ValueType. */
  @JSImport("dd-trace/protobuf/profile", "perftools.profiles.ValueType")
  @js.native
  /**
    * Constructs a new ValueType.
    * @param [properties] Properties to set
    */
  class ValueType () extends IValueType {
    def this(properties: IValueType) = this()
    
    /**
      * Converts this ValueType to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
    
    /** ValueType type. */
    @JSName("type")
    var type_ValueType: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
    
    /** ValueType unit. */
    @JSName("unit")
    var unit_ValueType: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
  }
  object ValueType {
    
    /**
      * Creates a new ValueType instance using the specified properties.
      * @param [properties] Properties to set
      * @returns ValueType instance
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.ValueType.create")
    @js.native
    def create(): ValueType = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.ValueType.create")
    @js.native
    def create(properties: IValueType): ValueType = js.native
    
    /**
      * Decodes a ValueType message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns ValueType
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.ValueType.decode")
    @js.native
    def decode(reader: Reader): ValueType = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.ValueType.decode")
    @js.native
    def decode(reader: Reader, length: Double): ValueType = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.ValueType.decode")
    @js.native
    def decode(reader: Uint8Array): ValueType = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.ValueType.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): ValueType = js.native
    
    /**
      * Decodes a ValueType message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns ValueType
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.ValueType.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): ValueType = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.ValueType.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): ValueType = js.native
    
    /**
      * Encodes the specified ValueType message. Does not implicitly {@link perftools.profiles.ValueType.verify|verify} messages.
      * @param message ValueType message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.ValueType.encode")
    @js.native
    def encode(message: IValueType): Writer = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.ValueType.encode")
    @js.native
    def encode(message: IValueType, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified ValueType message, length delimited. Does not implicitly {@link perftools.profiles.ValueType.verify|verify} messages.
      * @param message ValueType message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.ValueType.encodeDelimited")
    @js.native
    def encodeDelimited(message: IValueType): Writer = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.ValueType.encodeDelimited")
    @js.native
    def encodeDelimited(message: IValueType, writer: Writer): Writer = js.native
    
    /**
      * Creates a ValueType message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns ValueType
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.ValueType.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): ValueType = js.native
    
    /**
      * Creates a plain object from a ValueType message. Also converts values to other types if specified.
      * @param message ValueType
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.ValueType.toObject")
    @js.native
    def toObject(message: ValueType): StringDictionary[js.Any] = js.native
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.ValueType.toObject")
    @js.native
    def toObject(message: ValueType, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a ValueType message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("dd-trace/protobuf/profile", "perftools.profiles.ValueType.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Properties of a Function. */
  @js.native
  trait IFunction extends StObject {
    
    /** Function filename */
    var filename: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
      ] = js.native
    
    /** Function id */
    var id: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
      ] = js.native
    
    /** Function name */
    var name: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
      ] = js.native
    
    /** Function startLine */
    var startLine: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
      ] = js.native
    
    /** Function systemName */
    var systemName: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
      ] = js.native
  }
  object IFunction {
    
    @scala.inline
    def apply(): IFunction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFunction]
    }
    
    @scala.inline
    implicit class IFunctionMutableBuilder[Self <: IFunction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilename(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
      ): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameNull: Self = StObject.set(x, "filename", null)
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setId(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
      ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdNull: Self = StObject.set(x, "id", null)
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setName(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameNull: Self = StObject.set(x, "name", null)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setStartLine(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
      ): Self = StObject.set(x, "startLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartLineNull: Self = StObject.set(x, "startLine", null)
      
      @scala.inline
      def setStartLineUndefined: Self = StObject.set(x, "startLine", js.undefined)
      
      @scala.inline
      def setSystemName(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
      ): Self = StObject.set(x, "systemName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSystemNameNull: Self = StObject.set(x, "systemName", null)
      
      @scala.inline
      def setSystemNameUndefined: Self = StObject.set(x, "systemName", js.undefined)
    }
  }
  
  /** Properties of a Label. */
  @js.native
  trait ILabel extends StObject {
    
    /** Label key */
    var key: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
      ] = js.native
    
    /** Label num */
    var num: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
      ] = js.native
    
    /** Label numUnit */
    var numUnit: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
      ] = js.native
    
    /** Label str */
    var str: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
      ] = js.native
  }
  object ILabel {
    
    @scala.inline
    def apply(): ILabel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILabel]
    }
    
    @scala.inline
    implicit class ILabelMutableBuilder[Self <: ILabel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
      ): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyNull: Self = StObject.set(x, "key", null)
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setNum(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
      ): Self = StObject.set(x, "num", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumNull: Self = StObject.set(x, "num", null)
      
      @scala.inline
      def setNumUndefined: Self = StObject.set(x, "num", js.undefined)
      
      @scala.inline
      def setNumUnit(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
      ): Self = StObject.set(x, "numUnit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumUnitNull: Self = StObject.set(x, "numUnit", null)
      
      @scala.inline
      def setNumUnitUndefined: Self = StObject.set(x, "numUnit", js.undefined)
      
      @scala.inline
      def setStr(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
      ): Self = StObject.set(x, "str", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrNull: Self = StObject.set(x, "str", null)
      
      @scala.inline
      def setStrUndefined: Self = StObject.set(x, "str", js.undefined)
    }
  }
  
  /** Properties of a Line. */
  @js.native
  trait ILine extends StObject {
    
    /** Line functionId */
    var functionId: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
      ] = js.native
    
    /** Line line */
    var line: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
      ] = js.native
  }
  object ILine {
    
    @scala.inline
    def apply(): ILine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILine]
    }
    
    @scala.inline
    implicit class ILineMutableBuilder[Self <: ILine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFunctionId(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
      ): Self = StObject.set(x, "functionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionIdNull: Self = StObject.set(x, "functionId", null)
      
      @scala.inline
      def setFunctionIdUndefined: Self = StObject.set(x, "functionId", js.undefined)
      
      @scala.inline
      def setLine(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
      ): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineNull: Self = StObject.set(x, "line", null)
      
      @scala.inline
      def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    }
  }
  
  /** Properties of a Location. */
  @js.native
  trait ILocation extends StObject {
    
    /** Location address */
    var address: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
      ] = js.native
    
    /** Location id */
    var id: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
      ] = js.native
    
    /** Location isFolded */
    var isFolded: js.UndefOr[Boolean | Null] = js.native
    
    /** Location line */
    var line: js.UndefOr[js.Array[ILine] | Null] = js.native
    
    /** Location mappingId */
    var mappingId: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
      ] = js.native
  }
  object ILocation {
    
    @scala.inline
    def apply(): ILocation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILocation]
    }
    
    @scala.inline
    implicit class ILocationMutableBuilder[Self <: ILocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
      ): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressNull: Self = StObject.set(x, "address", null)
      
      @scala.inline
      def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      @scala.inline
      def setId(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
      ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdNull: Self = StObject.set(x, "id", null)
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIsFolded(value: Boolean): Self = StObject.set(x, "isFolded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFoldedNull: Self = StObject.set(x, "isFolded", null)
      
      @scala.inline
      def setIsFoldedUndefined: Self = StObject.set(x, "isFolded", js.undefined)
      
      @scala.inline
      def setLine(value: js.Array[ILine]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineNull: Self = StObject.set(x, "line", null)
      
      @scala.inline
      def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      @scala.inline
      def setLineVarargs(value: ILine*): Self = StObject.set(x, "line", js.Array(value :_*))
      
      @scala.inline
      def setMappingId(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
      ): Self = StObject.set(x, "mappingId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMappingIdNull: Self = StObject.set(x, "mappingId", null)
      
      @scala.inline
      def setMappingIdUndefined: Self = StObject.set(x, "mappingId", js.undefined)
    }
  }
  
  /** Properties of a Mapping. */
  @js.native
  trait IMapping extends StObject {
    
    /** Mapping buildId */
    var buildId: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
      ] = js.native
    
    /** Mapping fileOffset */
    var fileOffset: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
      ] = js.native
    
    /** Mapping filename */
    var filename: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
      ] = js.native
    
    /** Mapping hasFilenames */
    var hasFilenames: js.UndefOr[Boolean | Null] = js.native
    
    /** Mapping hasFunctions */
    var hasFunctions: js.UndefOr[Boolean | Null] = js.native
    
    /** Mapping hasInlineFrames */
    var hasInlineFrames: js.UndefOr[Boolean | Null] = js.native
    
    /** Mapping hasLineNumbers */
    var hasLineNumbers: js.UndefOr[Boolean | Null] = js.native
    
    /** Mapping id */
    var id: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
      ] = js.native
    
    /** Mapping memoryLimit */
    var memoryLimit: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
      ] = js.native
    
    /** Mapping memoryStart */
    var memoryStart: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
      ] = js.native
  }
  object IMapping {
    
    @scala.inline
    def apply(): IMapping = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMapping]
    }
    
    @scala.inline
    implicit class IMappingMutableBuilder[Self <: IMapping] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuildId(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
      ): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuildIdNull: Self = StObject.set(x, "buildId", null)
      
      @scala.inline
      def setBuildIdUndefined: Self = StObject.set(x, "buildId", js.undefined)
      
      @scala.inline
      def setFileOffset(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
      ): Self = StObject.set(x, "fileOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileOffsetNull: Self = StObject.set(x, "fileOffset", null)
      
      @scala.inline
      def setFileOffsetUndefined: Self = StObject.set(x, "fileOffset", js.undefined)
      
      @scala.inline
      def setFilename(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
      ): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameNull: Self = StObject.set(x, "filename", null)
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setHasFilenames(value: Boolean): Self = StObject.set(x, "hasFilenames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasFilenamesNull: Self = StObject.set(x, "hasFilenames", null)
      
      @scala.inline
      def setHasFilenamesUndefined: Self = StObject.set(x, "hasFilenames", js.undefined)
      
      @scala.inline
      def setHasFunctions(value: Boolean): Self = StObject.set(x, "hasFunctions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasFunctionsNull: Self = StObject.set(x, "hasFunctions", null)
      
      @scala.inline
      def setHasFunctionsUndefined: Self = StObject.set(x, "hasFunctions", js.undefined)
      
      @scala.inline
      def setHasInlineFrames(value: Boolean): Self = StObject.set(x, "hasInlineFrames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasInlineFramesNull: Self = StObject.set(x, "hasInlineFrames", null)
      
      @scala.inline
      def setHasInlineFramesUndefined: Self = StObject.set(x, "hasInlineFrames", js.undefined)
      
      @scala.inline
      def setHasLineNumbers(value: Boolean): Self = StObject.set(x, "hasLineNumbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasLineNumbersNull: Self = StObject.set(x, "hasLineNumbers", null)
      
      @scala.inline
      def setHasLineNumbersUndefined: Self = StObject.set(x, "hasLineNumbers", js.undefined)
      
      @scala.inline
      def setId(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
      ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdNull: Self = StObject.set(x, "id", null)
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMemoryLimit(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
      ): Self = StObject.set(x, "memoryLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemoryLimitNull: Self = StObject.set(x, "memoryLimit", null)
      
      @scala.inline
      def setMemoryLimitUndefined: Self = StObject.set(x, "memoryLimit", js.undefined)
      
      @scala.inline
      def setMemoryStart(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
      ): Self = StObject.set(x, "memoryStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemoryStartNull: Self = StObject.set(x, "memoryStart", null)
      
      @scala.inline
      def setMemoryStartUndefined: Self = StObject.set(x, "memoryStart", js.undefined)
    }
  }
  
  /** Properties of a Profile. */
  @js.native
  trait IProfile extends StObject {
    
    /** Profile comment */
    var comment: js.UndefOr[
        (js.Array[
          Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ _)
        ]) | Null
      ] = js.native
    
    /** Profile defaultSampleType */
    var defaultSampleType: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
      ] = js.native
    
    /** Profile dropFrames */
    var dropFrames: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
      ] = js.native
    
    /** Profile durationNanos */
    var durationNanos: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
      ] = js.native
    
    /** Profile function */
    var function: js.UndefOr[js.Array[IFunction] | Null] = js.native
    
    /** Profile keepFrames */
    var keepFrames: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
      ] = js.native
    
    /** Profile location */
    var location: js.UndefOr[js.Array[ILocation] | Null] = js.native
    
    /** Profile mapping */
    var mapping: js.UndefOr[js.Array[IMapping] | Null] = js.native
    
    /** Profile period */
    var period: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
      ] = js.native
    
    /** Profile periodType */
    var periodType: js.UndefOr[IValueType | Null] = js.native
    
    /** Profile sample */
    var sample: js.UndefOr[js.Array[ISample] | Null] = js.native
    
    /** Profile sampleType */
    var sampleType: js.UndefOr[js.Array[IValueType] | Null] = js.native
    
    /** Profile stringTable */
    var stringTable: js.UndefOr[js.Array[String] | Null] = js.native
    
    /** Profile timeNanos */
    var timeNanos: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
      ] = js.native
  }
  object IProfile {
    
    @scala.inline
    def apply(): IProfile = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IProfile]
    }
    
    @scala.inline
    implicit class IProfileMutableBuilder[Self <: IProfile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComment(
        value: js.Array[
              Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ _)
            ]
      ): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentNull: Self = StObject.set(x, "comment", null)
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setCommentVarargs(value: (Double | js.Any)*): Self = StObject.set(x, "comment", js.Array(value :_*))
      
      @scala.inline
      def setDefaultSampleType(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
      ): Self = StObject.set(x, "defaultSampleType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSampleTypeNull: Self = StObject.set(x, "defaultSampleType", null)
      
      @scala.inline
      def setDefaultSampleTypeUndefined: Self = StObject.set(x, "defaultSampleType", js.undefined)
      
      @scala.inline
      def setDropFrames(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
      ): Self = StObject.set(x, "dropFrames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropFramesNull: Self = StObject.set(x, "dropFrames", null)
      
      @scala.inline
      def setDropFramesUndefined: Self = StObject.set(x, "dropFrames", js.undefined)
      
      @scala.inline
      def setDurationNanos(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
      ): Self = StObject.set(x, "durationNanos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationNanosNull: Self = StObject.set(x, "durationNanos", null)
      
      @scala.inline
      def setDurationNanosUndefined: Self = StObject.set(x, "durationNanos", js.undefined)
      
      @scala.inline
      def setFunction(value: js.Array[IFunction]): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionNull: Self = StObject.set(x, "function", null)
      
      @scala.inline
      def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
      
      @scala.inline
      def setFunctionVarargs(value: IFunction*): Self = StObject.set(x, "function", js.Array(value :_*))
      
      @scala.inline
      def setKeepFrames(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
      ): Self = StObject.set(x, "keepFrames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepFramesNull: Self = StObject.set(x, "keepFrames", null)
      
      @scala.inline
      def setKeepFramesUndefined: Self = StObject.set(x, "keepFrames", js.undefined)
      
      @scala.inline
      def setLocation(value: js.Array[ILocation]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationNull: Self = StObject.set(x, "location", null)
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setLocationVarargs(value: ILocation*): Self = StObject.set(x, "location", js.Array(value :_*))
      
      @scala.inline
      def setMapping(value: js.Array[IMapping]): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMappingNull: Self = StObject.set(x, "mapping", null)
      
      @scala.inline
      def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
      
      @scala.inline
      def setMappingVarargs(value: IMapping*): Self = StObject.set(x, "mapping", js.Array(value :_*))
      
      @scala.inline
      def setPeriod(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
      ): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeriodNull: Self = StObject.set(x, "period", null)
      
      @scala.inline
      def setPeriodType(value: IValueType): Self = StObject.set(x, "periodType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeriodTypeNull: Self = StObject.set(x, "periodType", null)
      
      @scala.inline
      def setPeriodTypeUndefined: Self = StObject.set(x, "periodType", js.undefined)
      
      @scala.inline
      def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
      
      @scala.inline
      def setSample(value: js.Array[ISample]): Self = StObject.set(x, "sample", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSampleNull: Self = StObject.set(x, "sample", null)
      
      @scala.inline
      def setSampleType(value: js.Array[IValueType]): Self = StObject.set(x, "sampleType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSampleTypeNull: Self = StObject.set(x, "sampleType", null)
      
      @scala.inline
      def setSampleTypeUndefined: Self = StObject.set(x, "sampleType", js.undefined)
      
      @scala.inline
      def setSampleTypeVarargs(value: IValueType*): Self = StObject.set(x, "sampleType", js.Array(value :_*))
      
      @scala.inline
      def setSampleUndefined: Self = StObject.set(x, "sample", js.undefined)
      
      @scala.inline
      def setSampleVarargs(value: ISample*): Self = StObject.set(x, "sample", js.Array(value :_*))
      
      @scala.inline
      def setStringTable(value: js.Array[String]): Self = StObject.set(x, "stringTable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringTableNull: Self = StObject.set(x, "stringTable", null)
      
      @scala.inline
      def setStringTableUndefined: Self = StObject.set(x, "stringTable", js.undefined)
      
      @scala.inline
      def setStringTableVarargs(value: String*): Self = StObject.set(x, "stringTable", js.Array(value :_*))
      
      @scala.inline
      def setTimeNanos(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
      ): Self = StObject.set(x, "timeNanos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeNanosNull: Self = StObject.set(x, "timeNanos", null)
      
      @scala.inline
      def setTimeNanosUndefined: Self = StObject.set(x, "timeNanos", js.undefined)
    }
  }
  
  /** Properties of a Sample. */
  @js.native
  trait ISample extends StObject {
    
    /** Sample label */
    var label: js.UndefOr[js.Array[ILabel] | Null] = js.native
    
    /** Sample locationId */
    var locationId: js.UndefOr[
        (js.Array[
          Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ _)
        ]) | Null
      ] = js.native
    
    /** Sample value */
    var value: js.UndefOr[
        (js.Array[
          Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ _)
        ]) | Null
      ] = js.native
  }
  object ISample {
    
    @scala.inline
    def apply(): ISample = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISample]
    }
    
    @scala.inline
    implicit class ISampleMutableBuilder[Self <: ISample] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: js.Array[ILabel]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelNull: Self = StObject.set(x, "label", null)
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setLabelVarargs(value: ILabel*): Self = StObject.set(x, "label", js.Array(value :_*))
      
      @scala.inline
      def setLocationId(
        value: js.Array[
              Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ _)
            ]
      ): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationIdNull: Self = StObject.set(x, "locationId", null)
      
      @scala.inline
      def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
      
      @scala.inline
      def setLocationIdVarargs(value: (Double | js.Any)*): Self = StObject.set(x, "locationId", js.Array(value :_*))
      
      @scala.inline
      def setValue(
        value: js.Array[
              Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ _)
            ]
      ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: (Double | js.Any)*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  /** Properties of a ValueType. */
  @js.native
  trait IValueType extends StObject {
    
    /** ValueType type */
    var `type`: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
      ] = js.native
    
    /** ValueType unit */
    var unit: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
      ] = js.native
  }
  object IValueType {
    
    @scala.inline
    def apply(): IValueType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IValueType]
    }
    
    @scala.inline
    implicit class IValueTypeMutableBuilder[Self <: IValueType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeNull: Self = StObject.set(x, "type", null)
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUnit(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
      ): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitNull: Self = StObject.set(x, "unit", null)
      
      @scala.inline
      def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    }
  }
}
