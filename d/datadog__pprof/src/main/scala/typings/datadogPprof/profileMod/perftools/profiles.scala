package typings.datadogPprof.profileMod.perftools

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Namespace profiles. */
object profiles {
  
  /** Represents a Function. */
  @JSImport("@datadog/pprof/proto/profile", "perftools.profiles.Function")
  @js.native
  /**
    * Constructs a new Function.
    * @param [properties] Properties to set
    */
  open class Function () extends StObject {
    def this(properties: IFunction) = this()
    
    /** Function filename. */
    var filename: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any) = js.native
    
    /** Function id. */
    var id: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any) = js.native
    
    /** Function name. */
    var name: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any) = js.native
    
    /** Function startLine. */
    var startLine: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any) = js.native
    
    /** Function systemName. */
    var systemName: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any) = js.native
    
    /**
      * Converts this Function to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object Function {
    
    @JSImport("@datadog/pprof/proto/profile", "perftools.profiles.Function")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Function instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Function instance
      */
    /* static member */
    inline def create(): Function = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Function]
    inline def create(properties: IFunction): Function = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Function]
    
    inline def decode(reader: js.typedarray.Uint8Array): Function = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Function]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): Function = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Function]
    /**
      * Decodes a Function message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Function
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): Function = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Function]
    inline def decode(reader: Reader, length: Double): Function = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Function]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): Function = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Function]
    /**
      * Decodes a Function message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Function
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): Function = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Function]
    
    /**
      * Encodes the specified Function message. Does not implicitly {@link perftools.profiles.Function.verify|verify} messages.
      * @param message Function message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IFunction): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IFunction, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Function message, length delimited. Does not implicitly {@link perftools.profiles.Function.verify|verify} messages.
      * @param message Function message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IFunction): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IFunction, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a Function message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Function
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): Function = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Function]
    
    /**
      * Creates a plain object from a Function message. Also converts values to other types if specified.
      * @param message Function
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: Function): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: Function, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a Function message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a Label. */
  @JSImport("@datadog/pprof/proto/profile", "perftools.profiles.Label")
  @js.native
  /**
    * Constructs a new Label.
    * @param [properties] Properties to set
    */
  open class Label () extends StObject {
    def this(properties: ILabel) = this()
    
    /** Label key. */
    var key: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any) = js.native
    
    /** Label num. */
    var num: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any) = js.native
    
    /** Label numUnit. */
    var numUnit: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any) = js.native
    
    /** Label str. */
    var str: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any) = js.native
    
    /**
      * Converts this Label to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object Label {
    
    @JSImport("@datadog/pprof/proto/profile", "perftools.profiles.Label")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Label instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Label instance
      */
    /* static member */
    inline def create(): Label = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Label]
    inline def create(properties: ILabel): Label = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Label]
    
    inline def decode(reader: js.typedarray.Uint8Array): Label = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Label]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): Label = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Label]
    /**
      * Decodes a Label message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Label
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): Label = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Label]
    inline def decode(reader: Reader, length: Double): Label = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Label]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): Label = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Label]
    /**
      * Decodes a Label message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Label
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): Label = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Label]
    
    /**
      * Encodes the specified Label message. Does not implicitly {@link perftools.profiles.Label.verify|verify} messages.
      * @param message Label message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: ILabel): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: ILabel, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Label message, length delimited. Does not implicitly {@link perftools.profiles.Label.verify|verify} messages.
      * @param message Label message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: ILabel): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: ILabel, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a Label message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Label
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): Label = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Label]
    
    /**
      * Creates a plain object from a Label message. Also converts values to other types if specified.
      * @param message Label
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: Label): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: Label, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a Label message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a Line. */
  @JSImport("@datadog/pprof/proto/profile", "perftools.profiles.Line")
  @js.native
  /**
    * Constructs a new Line.
    * @param [properties] Properties to set
    */
  open class Line () extends StObject {
    def this(properties: ILine) = this()
    
    /** Line functionId. */
    var functionId: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any) = js.native
    
    /** Line line. */
    var line: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any) = js.native
    
    /**
      * Converts this Line to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object Line {
    
    @JSImport("@datadog/pprof/proto/profile", "perftools.profiles.Line")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Line instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Line instance
      */
    /* static member */
    inline def create(): Line = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Line]
    inline def create(properties: ILine): Line = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Line]
    
    inline def decode(reader: js.typedarray.Uint8Array): Line = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Line]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): Line = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Line]
    /**
      * Decodes a Line message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Line
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): Line = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Line]
    inline def decode(reader: Reader, length: Double): Line = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Line]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): Line = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Line]
    /**
      * Decodes a Line message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Line
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): Line = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Line]
    
    /**
      * Encodes the specified Line message. Does not implicitly {@link perftools.profiles.Line.verify|verify} messages.
      * @param message Line message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: ILine): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: ILine, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Line message, length delimited. Does not implicitly {@link perftools.profiles.Line.verify|verify} messages.
      * @param message Line message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: ILine): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: ILine, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a Line message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Line
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): Line = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Line]
    
    /**
      * Creates a plain object from a Line message. Also converts values to other types if specified.
      * @param message Line
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: Line): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: Line, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a Line message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a Location. */
  @JSImport("@datadog/pprof/proto/profile", "perftools.profiles.Location")
  @js.native
  /**
    * Constructs a new Location.
    * @param [properties] Properties to set
    */
  open class Location () extends StObject {
    def this(properties: ILocation) = this()
    
    /** Location address. */
    var address: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any) = js.native
    
    /** Location id. */
    var id: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any) = js.native
    
    /** Location line. */
    var line: js.Array[ILine] = js.native
    
    /** Location mappingId. */
    var mappingId: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any) = js.native
    
    /**
      * Converts this Location to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object Location {
    
    @JSImport("@datadog/pprof/proto/profile", "perftools.profiles.Location")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Location instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Location instance
      */
    /* static member */
    inline def create(): Location = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Location]
    inline def create(properties: ILocation): Location = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Location]
    
    inline def decode(reader: js.typedarray.Uint8Array): Location = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Location]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): Location = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Location]
    /**
      * Decodes a Location message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Location
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): Location = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Location]
    inline def decode(reader: Reader, length: Double): Location = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Location]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): Location = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Location]
    /**
      * Decodes a Location message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Location
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): Location = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Location]
    
    /**
      * Encodes the specified Location message. Does not implicitly {@link perftools.profiles.Location.verify|verify} messages.
      * @param message Location message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: ILocation): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: ILocation, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Location message, length delimited. Does not implicitly {@link perftools.profiles.Location.verify|verify} messages.
      * @param message Location message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: ILocation): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: ILocation, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a Location message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Location
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): Location = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Location]
    
    /**
      * Creates a plain object from a Location message. Also converts values to other types if specified.
      * @param message Location
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: Location): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: Location, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a Location message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a Mapping. */
  @JSImport("@datadog/pprof/proto/profile", "perftools.profiles.Mapping")
  @js.native
  /**
    * Constructs a new Mapping.
    * @param [properties] Properties to set
    */
  open class Mapping () extends StObject {
    def this(properties: IMapping) = this()
    
    /** Mapping buildId. */
    var buildId: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any) = js.native
    
    /** Mapping fileOffset. */
    var fileOffset: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any) = js.native
    
    /** Mapping filename. */
    var filename: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any) = js.native
    
    /** Mapping hasFilenames. */
    var hasFilenames: Boolean = js.native
    
    /** Mapping hasFunctions. */
    var hasFunctions: Boolean = js.native
    
    /** Mapping hasInlineFrames. */
    var hasInlineFrames: Boolean = js.native
    
    /** Mapping hasLineNumbers. */
    var hasLineNumbers: Boolean = js.native
    
    /** Mapping id. */
    var id: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any) = js.native
    
    /** Mapping memoryLimit. */
    var memoryLimit: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any) = js.native
    
    /** Mapping memoryStart. */
    var memoryStart: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any) = js.native
    
    /**
      * Converts this Mapping to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object Mapping {
    
    @JSImport("@datadog/pprof/proto/profile", "perftools.profiles.Mapping")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Mapping instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Mapping instance
      */
    /* static member */
    inline def create(): Mapping = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Mapping]
    inline def create(properties: IMapping): Mapping = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Mapping]
    
    inline def decode(reader: js.typedarray.Uint8Array): Mapping = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Mapping]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): Mapping = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Mapping]
    /**
      * Decodes a Mapping message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Mapping
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): Mapping = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Mapping]
    inline def decode(reader: Reader, length: Double): Mapping = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Mapping]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): Mapping = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Mapping]
    /**
      * Decodes a Mapping message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Mapping
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): Mapping = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Mapping]
    
    /**
      * Encodes the specified Mapping message. Does not implicitly {@link perftools.profiles.Mapping.verify|verify} messages.
      * @param message Mapping message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IMapping): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IMapping, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Mapping message, length delimited. Does not implicitly {@link perftools.profiles.Mapping.verify|verify} messages.
      * @param message Mapping message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IMapping): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IMapping, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a Mapping message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Mapping
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): Mapping = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Mapping]
    
    /**
      * Creates a plain object from a Mapping message. Also converts values to other types if specified.
      * @param message Mapping
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: Mapping): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: Mapping, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a Mapping message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a Profile. */
  @JSImport("@datadog/pprof/proto/profile", "perftools.profiles.Profile")
  @js.native
  /**
    * Constructs a new Profile.
    * @param [properties] Properties to set
    */
  open class Profile () extends StObject {
    def this(properties: IProfile) = this()
    
    /** Profile comment. */
    var comment: js.Array[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ] = js.native
    
    /** Profile defaultSampleType. */
    var defaultSampleType: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any) = js.native
    
    /** Profile dropFrames. */
    var dropFrames: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any) = js.native
    
    /** Profile durationNanos. */
    var durationNanos: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any) = js.native
    
    /** Profile function. */
    var function_ : js.Array[IFunction] = js.native
    
    /** Profile keepFrames. */
    var keepFrames: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any) = js.native
    
    /** Profile location. */
    var location: js.Array[ILocation] = js.native
    
    /** Profile mapping. */
    var mapping: js.Array[IMapping] = js.native
    
    /** Profile period. */
    var period: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any) = js.native
    
    /** Profile periodType. */
    var periodType: js.UndefOr[IValueType | Null] = js.native
    
    /** Profile sample. */
    var sample: js.Array[ISample] = js.native
    
    /** Profile sampleType. */
    var sampleType: js.Array[IValueType] = js.native
    
    /** Profile stringTable. */
    var stringTable: js.Array[String] = js.native
    
    /** Profile timeNanos. */
    var timeNanos: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any) = js.native
    
    /**
      * Converts this Profile to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object Profile {
    
    @JSImport("@datadog/pprof/proto/profile", "perftools.profiles.Profile")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Profile instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Profile instance
      */
    /* static member */
    inline def create(): Profile = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Profile]
    inline def create(properties: IProfile): Profile = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Profile]
    
    inline def decode(reader: js.typedarray.Uint8Array): Profile = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Profile]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): Profile = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Profile]
    /**
      * Decodes a Profile message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Profile
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): Profile = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Profile]
    inline def decode(reader: Reader, length: Double): Profile = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Profile]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): Profile = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Profile]
    /**
      * Decodes a Profile message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Profile
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): Profile = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Profile]
    
    /**
      * Encodes the specified Profile message. Does not implicitly {@link perftools.profiles.Profile.verify|verify} messages.
      * @param message Profile message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IProfile): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IProfile, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Profile message, length delimited. Does not implicitly {@link perftools.profiles.Profile.verify|verify} messages.
      * @param message Profile message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IProfile): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IProfile, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a Profile message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Profile
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): Profile = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Profile]
    
    /**
      * Creates a plain object from a Profile message. Also converts values to other types if specified.
      * @param message Profile
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: Profile): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: Profile, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a Profile message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a Sample. */
  @JSImport("@datadog/pprof/proto/profile", "perftools.profiles.Sample")
  @js.native
  /**
    * Constructs a new Sample.
    * @param [properties] Properties to set
    */
  open class Sample () extends StObject {
    def this(properties: ISample) = this()
    
    /** Sample label. */
    var label: js.Array[ILabel] = js.native
    
    /** Sample locationId. */
    var locationId: js.Array[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ] = js.native
    
    /**
      * Converts this Sample to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
    
    /** Sample value. */
    var value: js.Array[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ] = js.native
  }
  object Sample {
    
    @JSImport("@datadog/pprof/proto/profile", "perftools.profiles.Sample")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Sample instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Sample instance
      */
    /* static member */
    inline def create(): Sample = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Sample]
    inline def create(properties: ISample): Sample = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Sample]
    
    inline def decode(reader: js.typedarray.Uint8Array): Sample = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Sample]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): Sample = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Sample]
    /**
      * Decodes a Sample message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Sample
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): Sample = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Sample]
    inline def decode(reader: Reader, length: Double): Sample = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Sample]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): Sample = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Sample]
    /**
      * Decodes a Sample message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Sample
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): Sample = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Sample]
    
    /**
      * Encodes the specified Sample message. Does not implicitly {@link perftools.profiles.Sample.verify|verify} messages.
      * @param message Sample message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: ISample): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: ISample, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Sample message, length delimited. Does not implicitly {@link perftools.profiles.Sample.verify|verify} messages.
      * @param message Sample message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: ISample): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: ISample, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a Sample message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Sample
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): Sample = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Sample]
    
    /**
      * Creates a plain object from a Sample message. Also converts values to other types if specified.
      * @param message Sample
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: Sample): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: Sample, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a Sample message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a ValueType. */
  @JSImport("@datadog/pprof/proto/profile", "perftools.profiles.ValueType")
  @js.native
  /**
    * Constructs a new ValueType.
    * @param [properties] Properties to set
    */
  open class ValueType () extends StObject {
    def this(properties: IValueType) = this()
    
    /**
      * Converts this ValueType to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
    
    /** ValueType type. */
    var `type`: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any) = js.native
    
    /** ValueType unit. */
    var unit: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any) = js.native
  }
  object ValueType {
    
    @JSImport("@datadog/pprof/proto/profile", "perftools.profiles.ValueType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ValueType instance using the specified properties.
      * @param [properties] Properties to set
      * @returns ValueType instance
      */
    /* static member */
    inline def create(): ValueType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ValueType]
    inline def create(properties: IValueType): ValueType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ValueType]
    
    inline def decode(reader: js.typedarray.Uint8Array): ValueType = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ValueType]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): ValueType = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ValueType]
    /**
      * Decodes a ValueType message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns ValueType
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): ValueType = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ValueType]
    inline def decode(reader: Reader, length: Double): ValueType = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ValueType]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): ValueType = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ValueType]
    /**
      * Decodes a ValueType message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns ValueType
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): ValueType = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ValueType]
    
    /**
      * Encodes the specified ValueType message. Does not implicitly {@link perftools.profiles.ValueType.verify|verify} messages.
      * @param message ValueType message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IValueType): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IValueType, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified ValueType message, length delimited. Does not implicitly {@link perftools.profiles.ValueType.verify|verify} messages.
      * @param message ValueType message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IValueType): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IValueType, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a ValueType message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns ValueType
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): ValueType = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ValueType]
    
    /**
      * Creates a plain object from a ValueType message. Also converts values to other types if specified.
      * @param message ValueType
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: ValueType): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: ValueType, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a ValueType message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Properties of a Function. */
  trait IFunction extends StObject {
    
    /** Function filename */
    var filename: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ] = js.undefined
    
    /** Function id */
    var id: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ] = js.undefined
    
    /** Function name */
    var name: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ] = js.undefined
    
    /** Function startLine */
    var startLine: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ] = js.undefined
    
    /** Function systemName */
    var systemName: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ] = js.undefined
  }
  object IFunction {
    
    inline def apply(): IFunction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFunction]
    }
    
    extension [Self <: IFunction](x: Self) {
      
      inline def setFilename(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setId(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setName(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setStartLine(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ): Self = StObject.set(x, "startLine", value.asInstanceOf[js.Any])
      
      inline def setStartLineUndefined: Self = StObject.set(x, "startLine", js.undefined)
      
      inline def setSystemName(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ): Self = StObject.set(x, "systemName", value.asInstanceOf[js.Any])
      
      inline def setSystemNameUndefined: Self = StObject.set(x, "systemName", js.undefined)
    }
  }
  
  /** Properties of a Label. */
  trait ILabel extends StObject {
    
    /** Label key */
    var key: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ] = js.undefined
    
    /** Label num */
    var num: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ] = js.undefined
    
    /** Label numUnit */
    var numUnit: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ] = js.undefined
    
    /** Label str */
    var str: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ] = js.undefined
  }
  object ILabel {
    
    inline def apply(): ILabel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILabel]
    }
    
    extension [Self <: ILabel](x: Self) {
      
      inline def setKey(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setNum(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ): Self = StObject.set(x, "num", value.asInstanceOf[js.Any])
      
      inline def setNumUndefined: Self = StObject.set(x, "num", js.undefined)
      
      inline def setNumUnit(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ): Self = StObject.set(x, "numUnit", value.asInstanceOf[js.Any])
      
      inline def setNumUnitUndefined: Self = StObject.set(x, "numUnit", js.undefined)
      
      inline def setStr(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ): Self = StObject.set(x, "str", value.asInstanceOf[js.Any])
      
      inline def setStrUndefined: Self = StObject.set(x, "str", js.undefined)
    }
  }
  
  /** Properties of a Line. */
  trait ILine extends StObject {
    
    /** Line functionId */
    var functionId: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ] = js.undefined
    
    /** Line line */
    var line: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ] = js.undefined
  }
  object ILine {
    
    inline def apply(): ILine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILine]
    }
    
    extension [Self <: ILine](x: Self) {
      
      inline def setFunctionId(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ): Self = StObject.set(x, "functionId", value.asInstanceOf[js.Any])
      
      inline def setFunctionIdUndefined: Self = StObject.set(x, "functionId", js.undefined)
      
      inline def setLine(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    }
  }
  
  /** Properties of a Location. */
  trait ILocation extends StObject {
    
    /** Location address */
    var address: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ] = js.undefined
    
    /** Location id */
    var id: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ] = js.undefined
    
    /** Location line */
    var line: js.UndefOr[js.Array[ILine]] = js.undefined
    
    /** Location mappingId */
    var mappingId: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ] = js.undefined
  }
  object ILocation {
    
    inline def apply(): ILocation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILocation]
    }
    
    extension [Self <: ILocation](x: Self) {
      
      inline def setAddress(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      inline def setId(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLine(value: js.Array[ILine]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      inline def setLineVarargs(value: ILine*): Self = StObject.set(x, "line", js.Array(value*))
      
      inline def setMappingId(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ): Self = StObject.set(x, "mappingId", value.asInstanceOf[js.Any])
      
      inline def setMappingIdUndefined: Self = StObject.set(x, "mappingId", js.undefined)
    }
  }
  
  /** Properties of a Mapping. */
  trait IMapping extends StObject {
    
    /** Mapping buildId */
    var buildId: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ] = js.undefined
    
    /** Mapping fileOffset */
    var fileOffset: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ] = js.undefined
    
    /** Mapping filename */
    var filename: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ] = js.undefined
    
    /** Mapping hasFilenames */
    var hasFilenames: js.UndefOr[Boolean] = js.undefined
    
    /** Mapping hasFunctions */
    var hasFunctions: js.UndefOr[Boolean] = js.undefined
    
    /** Mapping hasInlineFrames */
    var hasInlineFrames: js.UndefOr[Boolean] = js.undefined
    
    /** Mapping hasLineNumbers */
    var hasLineNumbers: js.UndefOr[Boolean] = js.undefined
    
    /** Mapping id */
    var id: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ] = js.undefined
    
    /** Mapping memoryLimit */
    var memoryLimit: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ] = js.undefined
    
    /** Mapping memoryStart */
    var memoryStart: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ] = js.undefined
  }
  object IMapping {
    
    inline def apply(): IMapping = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMapping]
    }
    
    extension [Self <: IMapping](x: Self) {
      
      inline def setBuildId(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
      
      inline def setBuildIdUndefined: Self = StObject.set(x, "buildId", js.undefined)
      
      inline def setFileOffset(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ): Self = StObject.set(x, "fileOffset", value.asInstanceOf[js.Any])
      
      inline def setFileOffsetUndefined: Self = StObject.set(x, "fileOffset", js.undefined)
      
      inline def setFilename(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setHasFilenames(value: Boolean): Self = StObject.set(x, "hasFilenames", value.asInstanceOf[js.Any])
      
      inline def setHasFilenamesUndefined: Self = StObject.set(x, "hasFilenames", js.undefined)
      
      inline def setHasFunctions(value: Boolean): Self = StObject.set(x, "hasFunctions", value.asInstanceOf[js.Any])
      
      inline def setHasFunctionsUndefined: Self = StObject.set(x, "hasFunctions", js.undefined)
      
      inline def setHasInlineFrames(value: Boolean): Self = StObject.set(x, "hasInlineFrames", value.asInstanceOf[js.Any])
      
      inline def setHasInlineFramesUndefined: Self = StObject.set(x, "hasInlineFrames", js.undefined)
      
      inline def setHasLineNumbers(value: Boolean): Self = StObject.set(x, "hasLineNumbers", value.asInstanceOf[js.Any])
      
      inline def setHasLineNumbersUndefined: Self = StObject.set(x, "hasLineNumbers", js.undefined)
      
      inline def setId(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMemoryLimit(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ): Self = StObject.set(x, "memoryLimit", value.asInstanceOf[js.Any])
      
      inline def setMemoryLimitUndefined: Self = StObject.set(x, "memoryLimit", js.undefined)
      
      inline def setMemoryStart(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ): Self = StObject.set(x, "memoryStart", value.asInstanceOf[js.Any])
      
      inline def setMemoryStartUndefined: Self = StObject.set(x, "memoryStart", js.undefined)
    }
  }
  
  /** Properties of a Profile. */
  trait IProfile extends StObject {
    
    /** Profile comment */
    var comment: js.UndefOr[
        js.Array[
          Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
        ]
      ] = js.undefined
    
    /** Profile defaultSampleType */
    var defaultSampleType: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ] = js.undefined
    
    /** Profile dropFrames */
    var dropFrames: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ] = js.undefined
    
    /** Profile durationNanos */
    var durationNanos: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ] = js.undefined
    
    /** Profile function */
    var function: js.UndefOr[js.Array[IFunction]] = js.undefined
    
    /** Profile keepFrames */
    var keepFrames: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ] = js.undefined
    
    /** Profile location */
    var location: js.UndefOr[js.Array[ILocation]] = js.undefined
    
    /** Profile mapping */
    var mapping: js.UndefOr[js.Array[IMapping]] = js.undefined
    
    /** Profile period */
    var period: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ] = js.undefined
    
    /** Profile periodType */
    var periodType: js.UndefOr[IValueType] = js.undefined
    
    /** Profile sample */
    var sample: js.UndefOr[js.Array[ISample]] = js.undefined
    
    /** Profile sampleType */
    var sampleType: js.UndefOr[js.Array[IValueType]] = js.undefined
    
    /** Profile stringTable */
    var stringTable: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Profile timeNanos */
    var timeNanos: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ] = js.undefined
  }
  object IProfile {
    
    inline def apply(): IProfile = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IProfile]
    }
    
    extension [Self <: IProfile](x: Self) {
      
      inline def setComment(
        value: js.Array[
              Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
            ]
      ): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setCommentVarargs(
        value: (Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any))*
      ): Self = StObject.set(x, "comment", js.Array(value*))
      
      inline def setDefaultSampleType(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ): Self = StObject.set(x, "defaultSampleType", value.asInstanceOf[js.Any])
      
      inline def setDefaultSampleTypeUndefined: Self = StObject.set(x, "defaultSampleType", js.undefined)
      
      inline def setDropFrames(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ): Self = StObject.set(x, "dropFrames", value.asInstanceOf[js.Any])
      
      inline def setDropFramesUndefined: Self = StObject.set(x, "dropFrames", js.undefined)
      
      inline def setDurationNanos(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ): Self = StObject.set(x, "durationNanos", value.asInstanceOf[js.Any])
      
      inline def setDurationNanosUndefined: Self = StObject.set(x, "durationNanos", js.undefined)
      
      inline def setFunction(value: js.Array[IFunction]): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
      
      inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
      
      inline def setFunctionVarargs(value: IFunction*): Self = StObject.set(x, "function", js.Array(value*))
      
      inline def setKeepFrames(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ): Self = StObject.set(x, "keepFrames", value.asInstanceOf[js.Any])
      
      inline def setKeepFramesUndefined: Self = StObject.set(x, "keepFrames", js.undefined)
      
      inline def setLocation(value: js.Array[ILocation]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setLocationVarargs(value: ILocation*): Self = StObject.set(x, "location", js.Array(value*))
      
      inline def setMapping(value: js.Array[IMapping]): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
      
      inline def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
      
      inline def setMappingVarargs(value: IMapping*): Self = StObject.set(x, "mapping", js.Array(value*))
      
      inline def setPeriod(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
      
      inline def setPeriodType(value: IValueType): Self = StObject.set(x, "periodType", value.asInstanceOf[js.Any])
      
      inline def setPeriodTypeUndefined: Self = StObject.set(x, "periodType", js.undefined)
      
      inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
      
      inline def setSample(value: js.Array[ISample]): Self = StObject.set(x, "sample", value.asInstanceOf[js.Any])
      
      inline def setSampleType(value: js.Array[IValueType]): Self = StObject.set(x, "sampleType", value.asInstanceOf[js.Any])
      
      inline def setSampleTypeUndefined: Self = StObject.set(x, "sampleType", js.undefined)
      
      inline def setSampleTypeVarargs(value: IValueType*): Self = StObject.set(x, "sampleType", js.Array(value*))
      
      inline def setSampleUndefined: Self = StObject.set(x, "sample", js.undefined)
      
      inline def setSampleVarargs(value: ISample*): Self = StObject.set(x, "sample", js.Array(value*))
      
      inline def setStringTable(value: js.Array[String]): Self = StObject.set(x, "stringTable", value.asInstanceOf[js.Any])
      
      inline def setStringTableUndefined: Self = StObject.set(x, "stringTable", js.undefined)
      
      inline def setStringTableVarargs(value: String*): Self = StObject.set(x, "stringTable", js.Array(value*))
      
      inline def setTimeNanos(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ): Self = StObject.set(x, "timeNanos", value.asInstanceOf[js.Any])
      
      inline def setTimeNanosUndefined: Self = StObject.set(x, "timeNanos", js.undefined)
    }
  }
  
  /** Properties of a Sample. */
  trait ISample extends StObject {
    
    /** Sample label */
    var label: js.UndefOr[js.Array[ILabel]] = js.undefined
    
    /** Sample locationId */
    var locationId: js.UndefOr[
        js.Array[
          Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
        ]
      ] = js.undefined
    
    /** Sample value */
    var value: js.UndefOr[
        js.Array[
          Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
        ]
      ] = js.undefined
  }
  object ISample {
    
    inline def apply(): ISample = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISample]
    }
    
    extension [Self <: ISample](x: Self) {
      
      inline def setLabel(value: js.Array[ILabel]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLabelVarargs(value: ILabel*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLocationId(
        value: js.Array[
              Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
            ]
      ): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
      
      inline def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
      
      inline def setLocationIdVarargs(
        value: (Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any))*
      ): Self = StObject.set(x, "locationId", js.Array(value*))
      
      inline def setValue(
        value: js.Array[
              Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
            ]
      ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(
        value: (Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any))*
      ): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  /** Properties of a ValueType. */
  trait IValueType extends StObject {
    
    /** ValueType type */
    var `type`: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ] = js.undefined
    
    /** ValueType unit */
    var unit: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ] = js.undefined
  }
  object IValueType {
    
    inline def apply(): IValueType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IValueType]
    }
    
    extension [Self <: IValueType](x: Self) {
      
      inline def setType(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUnit(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    }
  }
}
