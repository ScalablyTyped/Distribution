package typings.convict

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.std.Number
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("convict", JSImport.Namespace)
  @js.native
  val ^ : typings.convict.mod.convict = js.native
  
  @js.native
  trait Config[T] extends StObject {
    
    /**
      * @returns the default value of the name property. name can use dot
      * notation to reference nested values
      */
    def default(): T | (/* import warning: importer.ImportType#apply Failed type conversion: T[string] */ js.Any) = js.native
    def default(name: String): T | (/* import warning: importer.ImportType#apply Failed type conversion: T[string] */ js.Any) = js.native
    def default[K /* <: /* keyof T */ String */](name: K): /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = js.native
    @JSName("default")
    def default_K_StringK2_AnyK3_Any[K /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][K2] */ js.Any */](name: K): /* import warning: importer.ImportType#apply Failed type conversion: T[K][K2][K3] */ js.Any = js.native
    @JSName("default")
    def default_K_StringK2_AnyK3_AnyK4_Any_Any[K /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][K2] */ js.Any */, K4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][K2][K3] */ js.Any */](name: String): /* import warning: importer.ImportType#apply Failed type conversion: T[K][K2][K3][K4] */ js.Any = js.native
    @JSName("default")
    def default_K_StringK2_Any_Any[K /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */](name: String): /* import warning: importer.ImportType#apply Failed type conversion: T[K][K2] */ js.Any = js.native
    @JSName("default")
    def default_K_String_Any[K /* <: /* keyof T */ String */](): /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = js.native
    
    /**
      * @returns the current value of the name property. name can use dot
      * notation to reference nested values
      */
    def get(): (/* import warning: importer.ImportType#apply Failed type conversion: T[string] */ js.Any) | T = js.native
    def get(name: String): (/* import warning: importer.ImportType#apply Failed type conversion: T[string] */ js.Any) | T = js.native
    def get[K /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][K2] */ js.Any */](name: K): /* import warning: importer.ImportType#apply Failed type conversion: T[K][K2][K3] */ js.Any = js.native
    
    /**
      * Exports all the properties (that is the keys and their current values) as a {JSON} {Object}
      * @returns A {JSON} compliant {Object}
      */
    def getProperties(): T = js.native
    
    /**
      * Exports the schema as a {JSON} {Object}
      * @returns A {JSON} compliant {Object}
      */
    def getSchema(): InternalSchema[T] = js.native
    
    /**
      * Exports the schema as a JSON string.
      * @returns A string representing the schema of this {Config}
      */
    def getSchemaString(): String = js.native
    
    @JSName("get")
    def get_K_StringK2_AnyK3_AnyK4_Any_Any[K /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][K2] */ js.Any */, K4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][K2][K3] */ js.Any */](name: String): /* import warning: importer.ImportType#apply Failed type conversion: T[K][K2][K3][K4] */ js.Any = js.native
    @JSName("get")
    def get_K_StringK2_Any_Any[K /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */](name: String): /* import warning: importer.ImportType#apply Failed type conversion: T[K][K2] */ js.Any = js.native
    
    /**
      * @returns true if the property name is defined, or false otherwise
      */
    def has(name: String): Boolean = js.native
    def has[K /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][K2] */ js.Any */](name: K): Boolean = js.native
    @JSName("has")
    def has_K_StringK2_Any[K /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */](name: String): Boolean = js.native
    @JSName("has")
    def has_K_StringK2_AnyK3_AnyK4_Any[K /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][K2] */ js.Any */, K4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][K2][K3] */ js.Any */](name: String): Boolean = js.native
    
    /**
      * Loads and merges a JavaScript object into config
      */
    def load[U](conf: U): Config[Overwrite[T, U]] = js.native
    
    /**
      * Loads and merges JSON configuration file(s) into config
      */
    def loadFile[U](files: String): Config[Overwrite[T, U]] = js.native
    def loadFile[U](files: js.Array[String]): Config[Overwrite[T, U]] = js.native
    
    /**
      * Sets the value of name to value. name can use dot notation to reference
      * nested values, e.g. "database.port". If objects in the chain don't yet
      * exist, they will be initialized to empty objects
      */
    def set(
      name: String,
      value: /* import warning: importer.ImportType#apply Failed type conversion: T[string] */ js.Any
    ): Config[T] = js.native
    def set[K /* <: /* keyof T */ String */, K2 /* <: (/* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any) | String */](
      name: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: T[K][K2] */ js.Any
    ): Config[T] = js.native
    @JSName("set")
    def set_K_StringK2_AnyK3_AnyK4_UnionAnyString[K /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][K2] */ js.Any */, K4 /* <: (/* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][K2][K3] */ js.Any) | String */](
      name: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: T[K][K2][K3][K4] */ js.Any
    ): Config[T] = js.native
    @JSName("set")
    def set_K_StringK2_AnyK3_UnionAnyString[K /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */, K3 /* <: (/* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][K2] */ js.Any) | String */](
      name: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: T[K][K2][K3] */ js.Any
    ): Config[T] = js.native
    
    /**
      * Validates config against the schema used to initialize it
      */
    def validate(): Config[T] = js.native
    def validate(options: ValidateOptions): Config[T] = js.native
  }
  
  trait Format extends StObject {
    
    var coerce: js.UndefOr[js.Function1[/* val */ js.Any, js.Any]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var validate: js.UndefOr[js.Function1[/* val */ js.Any, Unit]] = js.undefined
  }
  object Format {
    
    inline def apply(): Format = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Format]
    }
    
    extension [Self <: Format](x: Self) {
      
      inline def setCoerce(value: /* val */ js.Any => js.Any): Self = StObject.set(x, "coerce", js.Any.fromFunction1(value))
      
      inline def setCoerceUndefined: Self = StObject.set(x, "coerce", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setValidate(value: /* val */ js.Any => Unit): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  trait InternalSchema[T] extends StObject {
    
    var properties: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]: T[K] extends object? convict.convict.InternalSchema<T[K]> : {  default :T[K]}}
      */ typings.convict.convictStrings.InternalSchema & TopLevel[js.Any]
  }
  object InternalSchema {
    
    inline def apply[T](
      properties: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]: T[K] extends object? convict.convict.InternalSchema<T[K]> : {  default :T[K]}}
      */ typings.convict.convictStrings.InternalSchema & TopLevel[js.Any]
    ): InternalSchema[T] = {
      val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalSchema[T]]
    }
    
    extension [Self <: InternalSchema[?], T](x: Self & InternalSchema[T]) {
      
      inline def setProperties(
        value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ K in keyof T ]: T[K] extends object? convict.convict.InternalSchema<T[K]> : {  default :T[K]}}
        */ typings.convict.convictStrings.InternalSchema & TopLevel[js.Any]
      ): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var args: js.UndefOr[js.Array[String]] = js.undefined
    
    var env: js.UndefOr[ProcessEnv] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      inline def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    }
  }
  
  // Taken from https://github.com/Microsoft/TypeScript/issues/12215#issuecomment-307871458
  type Overwrite[T, U] = typings.convict.convictStrings.Overwrite & TopLevel[T] & U
  
  trait Parser extends StObject {
    
    var `extension`: String | js.Array[String]
    
    def parse(content: String): js.Any
  }
  object Parser {
    
    inline def apply(`extension`: String | js.Array[String], parse: String => js.Any): Parser = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse))
      __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Parser]
    }
    
    extension [Self <: Parser](x: Self) {
      
      inline def setExtension(value: String | js.Array[String]): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setExtensionVarargs(value: String*): Self = StObject.set(x, "extension", js.Array(value :_*))
      
      inline def setParse(value: String => js.Any): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.convict.convictStrings.Asterisk
    - typings.convict.convictStrings.int
    - typings.convict.convictStrings.port
    - typings.convict.convictStrings.windows_named_pipe
    - typings.convict.convictStrings.port_or_windows_named_pipe
    - typings.convict.convictStrings.url
    - typings.convict.convictStrings.email
    - typings.convict.convictStrings.ipaddress
    - typings.convict.convictStrings.duration
    - typings.convict.convictStrings.timestamp
    - typings.convict.convictStrings.nat
    - java.lang.String
    - js.Object
    - typings.std.Number
    - typings.std.RegExp
    - scala.Boolean
  */
  type PredefinedFormat = _PredefinedFormat | String | js.Object | Number | RegExp | Boolean
  
  type Schema[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias convict.convict.Schema<T[P]> * / object | convict.convict.SchemaObj<T[P]>}
    */ typings.convict.convictStrings.Schema & TopLevel[T]
  
  trait SchemaObj[T] extends StObject {
    
    /**
      * You can define a configuration property as "required" without providing a default value.
      * Set its default to null and if your format doesn't accept null it will throw an error.
      */
    var default: T | Null
    
    var arg: js.UndefOr[String] = js.undefined
    
    var doc: js.UndefOr[String] = js.undefined
    
    var env: js.UndefOr[String] = js.undefined
    
    /**
      * From the implementation:
      *
      *  format can be a:
      *   - predefined type, as seen below
      *   - an array of enumerated values, e.g. ["production", "development", "testing"]
      *   - built-in JavaScript type, i.e. Object, Array, String, Number, Boolean
      *   - function that performs validation and throws an Error on failure
      *
      * If omitted, format will be set to the value of Object.prototype.toString.call
      * for the default value
      */
    var format: js.UndefOr[PredefinedFormat | js.Array[js.Any] | (js.Function1[/* val */ js.Any, Unit])] = js.undefined
    
    var sensitive: js.UndefOr[Boolean] = js.undefined
  }
  object SchemaObj {
    
    inline def apply[T](): SchemaObj[T] = {
      val __obj = js.Dynamic.literal(default = null)
      __obj.asInstanceOf[SchemaObj[T]]
    }
    
    extension [Self <: SchemaObj[?], T](x: Self & SchemaObj[T]) {
      
      inline def setArg(value: String): Self = StObject.set(x, "arg", value.asInstanceOf[js.Any])
      
      inline def setArgUndefined: Self = StObject.set(x, "arg", js.undefined)
      
      inline def setDefault(value: T): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultNull: Self = StObject.set(x, "default", null)
      
      inline def setDoc(value: String): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
      
      inline def setDocUndefined: Self = StObject.set(x, "doc", js.undefined)
      
      inline def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setFormat(value: PredefinedFormat | js.Array[js.Any] | (js.Function1[/* val */ js.Any, Unit])): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatFunction1(value: /* val */ js.Any => Unit): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setFormatVarargs(value: js.Any*): Self = StObject.set(x, "format", js.Array(value :_*))
      
      inline def setSensitive(value: Boolean): Self = StObject.set(x, "sensitive", value.asInstanceOf[js.Any])
      
      inline def setSensitiveUndefined: Self = StObject.set(x, "sensitive", js.undefined)
    }
  }
  
  trait ValidateOptions extends StObject {
    
    /**
      * If set to warn, any properties specified in config files that are not declared in
      * the schema will print a warning. This is the default behavior. If set to strict,
      * any properties specified in config files that are not declared in the schema will
      * throw errors. This is to ensure that the schema and the config files are in sync.
      */
    var allowed: js.UndefOr[ValidationMethod] = js.undefined
    
    /** @deprecated use allowed instead */
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object ValidateOptions {
    
    inline def apply(): ValidateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidateOptions]
    }
    
    extension [Self <: ValidateOptions](x: Self) {
      
      inline def setAllowed(value: ValidationMethod): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
      
      inline def setAllowedUndefined: Self = StObject.set(x, "allowed", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.convict.convictStrings.strict
    - typings.convict.convictStrings.warn
  */
  trait ValidationMethod extends StObject
  object ValidationMethod {
    
    inline def strict: typings.convict.convictStrings.strict = "strict".asInstanceOf[typings.convict.convictStrings.strict]
    
    inline def warn: typings.convict.convictStrings.warn = "warn".asInstanceOf[typings.convict.convictStrings.warn]
  }
  
  trait _PredefinedFormat extends StObject
  
  type _To = typings.convict.mod.convict
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: typings.convict.mod.convict = ^
  
  @js.native
  trait convict extends StObject {
    
    def apply[T](config: String): Config[T] = js.native
    def apply[T](config: String, opts: Options): Config[T] = js.native
    def apply[T](config: Schema[T]): Config[T] = js.native
    def apply[T](config: Schema[T], opts: Options): Config[T] = js.native
    
    def addFormat(format: Format): Unit = js.native
    
    def addFormats(formats: StringDictionary[Format]): Unit = js.native
    
    def addParser(parsers: js.Array[Parser]): Unit = js.native
    def addParser(parsers: Parser): Unit = js.native
  }
}
