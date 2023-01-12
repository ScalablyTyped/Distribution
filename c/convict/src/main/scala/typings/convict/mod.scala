package typings.convict

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.std.Number
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
    def default(): /* import warning: importer.ImportType#apply Failed type conversion: null extends null | undefined ? T : null extends convict.convict.Path<T> ? convict.convict.PathValue<T, null> : never */ js.Any = js.native
    def default[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T extends string ? T[keyof T] extends std.Record<string, any> ? T[keyof T] extends std.ArrayLike<any> ? keyof T | / * template literal string: ${K}.${PathImpl<T[K],Exclude<keyofT[K],keyofany[]>>} * / string : keyof T | / * template literal string: ${K}.${PathImpl<T[K],keyofT[K]>} * / string : keyof T : never */ js.Any */](name: K): /* import warning: importer.ImportType#apply Failed type conversion: K extends null | undefined ? T : K extends convict.convict.Path<T> ? convict.convict.PathValue<T, K> : never */ js.Any = js.native
    @JSName("default")
    def default_K[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T extends string ? T[keyof T] extends std.Record<string, any> ? T[keyof T] extends std.ArrayLike<any> ? keyof T | / * template literal string: ${K}.${PathImpl<T[K],Exclude<keyofT[K],keyofany[]>>} * / string : keyof T | / * template literal string: ${K}.${PathImpl<T[K],keyofT[K]>} * / string : keyof T : never */ js.Any */](): /* import warning: importer.ImportType#apply Failed type conversion: K extends null | undefined ? T : K extends convict.convict.Path<T> ? convict.convict.PathValue<T, K> : never */ js.Any = js.native
    
    /**
      * @returns the current value of the name property. name can use dot
      * notation to reference nested values
      */
    def get(): /* import warning: importer.ImportType#apply Failed type conversion: null extends null | undefined ? T : null extends convict.convict.Path<T> ? convict.convict.PathValue<T, null> : never */ js.Any = js.native
    def get[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T extends string ? T[keyof T] extends std.Record<string, any> ? T[keyof T] extends std.ArrayLike<any> ? keyof T | / * template literal string: ${K}.${PathImpl<T[K],Exclude<keyofT[K],keyofany[]>>} * / string : keyof T | / * template literal string: ${K}.${PathImpl<T[K],keyofT[K]>} * / string : keyof T : never */ js.Any */](name: K): /* import warning: importer.ImportType#apply Failed type conversion: K extends null | undefined ? T : K extends convict.convict.Path<T> ? convict.convict.PathValue<T, K> : never */ js.Any = js.native
    
    /**
      * Gets the array of process arguments, using the override passed to the
      * convict function or process.argv if no override was passed.
      */
    def getArgs(): js.Array[String] = js.native
    
    /**
      * Gets the environment variable map, using the override passed to the
      * convict function or process.env if no override was passed.
      */
    def getEnv(): js.Array[String] = js.native
    
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
    def get_K[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T extends string ? T[keyof T] extends std.Record<string, any> ? T[keyof T] extends std.ArrayLike<any> ? keyof T | / * template literal string: ${K}.${PathImpl<T[K],Exclude<keyofT[K],keyofany[]>>} * / string : keyof T | / * template literal string: ${K}.${PathImpl<T[K],keyofT[K]>} * / string : keyof T : never */ js.Any */](): /* import warning: importer.ImportType#apply Failed type conversion: K extends null | undefined ? T : K extends convict.convict.Path<T> ? convict.convict.PathValue<T, K> : never */ js.Any = js.native
    
    /**
      * @returns true if the property name is defined, or false otherwise
      */
    def has[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T extends string ? T[keyof T] extends std.Record<string, any> ? T[keyof T] extends std.ArrayLike<any> ? keyof T | / * template literal string: ${K}.${PathImpl<T[K],Exclude<keyofT[K],keyofany[]>>} * / string : keyof T | / * template literal string: ${K}.${PathImpl<T[K],keyofT[K]>} * / string : keyof T : never */ js.Any */](name: K): Boolean = js.native
    
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
      value: /* import warning: importer.ImportType#apply Failed type conversion: string extends convict.convict.Path<T> ? convict.convict.PathValue<T, string> : any */ js.Any
    ): Config[T] = js.native
    def set[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T extends string ? T[keyof T] extends std.Record<string, any> ? T[keyof T] extends std.ArrayLike<any> ? keyof T | / * template literal string: ${K}.${PathImpl<T[K],Exclude<keyofT[K],keyofany[]>>} * / string : keyof T | / * template literal string: ${K}.${PathImpl<T[K],keyofT[K]>} * / string : keyof T : never */ js.Any */](
      name: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: K extends convict.convict.Path<T> ? convict.convict.PathValue<T, K> : any */ js.Any
    ): Config[T] = js.native
    
    /**
      * Validates config against the schema used to initialize it
      */
    def validate(): Config[T] = js.native
    def validate(options: ValidateOptions): Config[T] = js.native
  }
  
  trait Format extends StObject {
    
    var coerce: js.UndefOr[js.Function1[/* val */ Any, Any]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var validate: js.UndefOr[js.Function2[/* val */ Any, /* schema */ SchemaObj[Any], Unit]] = js.undefined
  }
  object Format {
    
    inline def apply(): Format = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Format]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
      
      inline def setCoerce(value: /* val */ Any => Any): Self = StObject.set(x, "coerce", js.Any.fromFunction1(value))
      
      inline def setCoerceUndefined: Self = StObject.set(x, "coerce", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setValidate(value: (/* val */ Any, /* schema */ SchemaObj[Any]) => Unit): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  trait InternalSchema[T] extends StObject {
    
    var properties: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends object? convict.convict.InternalSchema<T[K]> : {  default :T[K]}} */ js.Any
  }
  object InternalSchema {
    
    inline def apply[T](
      properties: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends object? convict.convict.InternalSchema<T[K]> : {  default :T[K]}} */ js.Any
    ): InternalSchema[T] = {
      val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalSchema[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InternalSchema[?], T] (val x: Self & InternalSchema[T]) extends AnyVal {
      
      inline def setProperties(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends object? convict.convict.InternalSchema<T[K]> : {  default :T[K]}} */ js.Any
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    }
  }
  
  // Taken from https://github.com/Microsoft/TypeScript/issues/12215#issuecomment-307871458
  type Overwrite[T, U] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in std.Exclude<keyof T, keyof U> ]: T[P]} */ js.Any) & U
  
  trait Parser extends StObject {
    
    var `extension`: String | js.Array[String]
    
    def parse(content: String): Any
  }
  object Parser {
    
    inline def apply(`extension`: String | js.Array[String], parse: String => Any): Parser = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse))
      __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Parser]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Parser] (val x: Self) extends AnyVal {
      
      inline def setExtension(value: String | js.Array[String]): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setExtensionVarargs(value: String*): Self = StObject.set(x, "extension", js.Array(value*))
      
      inline def setParse(value: String => Any): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    }
  }
  
  type Path[T] = (PathImpl[T, /* keyof T */ String]) | (/* keyof T */ String)
  
  // Taken from https://twitter.com/diegohaz/status/1309489079378219009
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    K extends string ? T[K] extends std.Record<string, any> ? T[K] extends std.ArrayLike<any> ? K | / * template literal string: ${K}.${PathImpl<T[K],Exclude<keyofT[K],keyofany[]>>} * / string : K | / * template literal string: ${K}.${PathImpl<T[K],keyofT[K]>} * / string : K : never
    }}}
    */
  type PathImpl[T, K /* <: /* keyof T */ String */] = K
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    P extends / * template literal string: ${inferK}.${inferRest} * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify K * / any extends keyof T ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Rest * / any extends convict.convict.Path<T[/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify K * / any]> ? convict.convict.PathValue<T[/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify K * / any], / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Rest * / any> : never : never : P extends keyof T ? T[P] : never
    }}}
    */
  @js.native
  trait PathValue[T, P /* <: Path[T] */] extends StObject
  
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
    - js.RegExp
    - scala.Boolean
  */
  type PredefinedFormat = _PredefinedFormat | String | js.Object | Number | js.RegExp | Boolean
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]: convict.convict.Schema<T[P]> | convict.convict.SchemaObj<T[P]>}
    }}}
    */
  @js.native
  trait Schema[T] extends StObject
  
  trait SchemaObj[T]
    extends StObject
       with /* key */ StringDictionary[Any] {
    
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
    var format: js.UndefOr[
        PredefinedFormat | js.Array[Any] | (js.Function1[
          /* val */ Any, 
          (/* asserts val is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean) | Unit
        ])
      ] = js.undefined
    
    var nullable: js.UndefOr[Boolean] = js.undefined
    
    var sensitive: js.UndefOr[Boolean] = js.undefined
  }
  object SchemaObj {
    
    inline def apply[T](): SchemaObj[T] = {
      val __obj = js.Dynamic.literal(default = null)
      __obj.asInstanceOf[SchemaObj[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SchemaObj[?], T] (val x: Self & SchemaObj[T]) extends AnyVal {
      
      inline def setArg(value: String): Self = StObject.set(x, "arg", value.asInstanceOf[js.Any])
      
      inline def setArgUndefined: Self = StObject.set(x, "arg", js.undefined)
      
      inline def setDefault(value: T): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultNull: Self = StObject.set(x, "default", null)
      
      inline def setDoc(value: String): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
      
      inline def setDocUndefined: Self = StObject.set(x, "doc", js.undefined)
      
      inline def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setFormat(
        value: PredefinedFormat | js.Array[Any] | (js.Function1[
              /* val */ Any, 
              (/* asserts val is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean) | Unit
            ])
      ): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatFunction1(
        value: /* val */ Any => (/* asserts val is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean) | Unit
      ): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setFormatVarargs(value: Any*): Self = StObject.set(x, "format", js.Array(value*))
      
      inline def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
      
      inline def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
      
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
    
    /**
      * If specified, possible warnings will be passed to this function instead of being
      * outputted to console.log, which would be the default behaviour.
      */
    var output: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.undefined
    
    /** @deprecated use allowed instead */
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object ValidateOptions {
    
    inline def apply(): ValidateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValidateOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowed(value: ValidationMethod): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
      
      inline def setAllowedUndefined: Self = StObject.set(x, "allowed", js.undefined)
      
      inline def setOutput(value: /* message */ String => Unit): Self = StObject.set(x, "output", js.Any.fromFunction1(value))
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
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
