package typings.handlebarsPfdZsGKG

import org.scalablytyped.runtime.StringDictionary
import typings.handlebarsPfdZsGKG.Handlebars.HelperDeclareSpec
import typings.handlebarsPfdZsGKG.Handlebars.HelperDelegate
import typings.handlebarsPfdZsGKG.Handlebars.ParseOptions
import typings.handlebarsPfdZsGKG.Handlebars.ResolvePartialOptions
import typings.handlebarsPfdZsGKG.Handlebars.Template
import typings.handlebarsPfdZsGKG.anon.TypeofHandlebars
import typings.handlebarsPfdZsGKG.hbs.AST.Node
import typings.handlebarsPfdZsGKG.hbs.AST.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtimeMod {
  
  @JSImport("handlebars/runtime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object AST {
    
    @JSImport("handlebars/runtime", "AST.helpers")
    @js.native
    val helpers: typings.handlebarsPfdZsGKG.hbs.AST.helpers = js.native
  }
  
  @JSImport("handlebars/runtime", "Exception")
  @js.native
  open class Exception protected ()
    extends StObject
       with typings.handlebarsPfdZsGKG.Handlebars.Exception {
    def this(message: String) = this()
    def this(message: String, node: Node) = this()
    
    /* CompleteClass */
    var description: String = js.native
    
    /* CompleteClass */
    var fileName: String = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var number: Double = js.native
  }
  
  inline def K(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("K")().asInstanceOf[Unit]
  
  @JSImport("handlebars/runtime", "SafeString")
  @js.native
  open class SafeString protected ()
    extends StObject
       with typings.handlebarsPfdZsGKG.Handlebars.SafeString {
    def this(str: String) = this()
    
    /* CompleteClass */
    override def toHTML(): String = js.native
  }
  
  object Utils {
    
    @JSImport("handlebars/runtime", "Utils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def blockParams(obj: js.Array[Any], ids: js.Array[Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("blockParams")(obj.asInstanceOf[js.Any], ids.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    inline def createFrame(`object`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createFrame")(`object`.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def escapeExpression(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeExpression")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def extend(obj: Any, source: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(List(obj.asInstanceOf[js.Any]).`++`(source.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
    
    inline def isArray(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isEmpty(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isFunction(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def toString_(obj: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSImport("handlebars/runtime", "VERSION")
  @js.native
  val VERSION: String = js.native
  
  object VM {
    
    @JSImport("handlebars/runtime", "VM")
    @js.native
    val ^ : js.Any = js.native
    
    inline def resolvePartial[T](partial: Unit, context: Any, options: ResolvePartialOptions): HandlebarsTemplateDelegate[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolvePartial")(partial.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HandlebarsTemplateDelegate[T]]
    inline def resolvePartial[T](partial: HandlebarsTemplateDelegate[T], context: Any, options: ResolvePartialOptions): HandlebarsTemplateDelegate[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolvePartial")(partial.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HandlebarsTemplateDelegate[T]]
  }
  
  @JSImport("handlebars/runtime", "Visitor")
  @js.native
  open class Visitor ()
    extends StObject
       with typings.handlebarsPfdZsGKG.Handlebars.Visitor
  
  inline def blockParams(obj: js.Array[Any], ids: js.Array[Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("blockParams")(obj.asInstanceOf[js.Any], ids.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def compile[T](input: Any): HandlebarsTemplateDelegate[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(input.asInstanceOf[js.Any]).asInstanceOf[HandlebarsTemplateDelegate[T]]
  inline def compile[T](input: Any, options: CompileOptions): HandlebarsTemplateDelegate[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HandlebarsTemplateDelegate[T]]
  
  inline def create(): TypeofHandlebars = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TypeofHandlebars]
  
  inline def createFrame(`object`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createFrame")(`object`.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("handlebars/runtime", "escapeExpression")
  @js.native
  val escapeExpression: js.Function1[/* str */ String, String] = js.native
  
  inline def log(level: Double, obj: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(level.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("handlebars/runtime", "logger")
  @js.native
  val logger: Logger = js.native
  
  inline def noConflict(): TypeofHandlebars = ^.asInstanceOf[js.Dynamic].applyDynamic("noConflict")().asInstanceOf[TypeofHandlebars]
  
  inline def parse(input: String): Program = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[Program]
  inline def parse(input: String, options: ParseOptions): Program = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Program]
  
  inline def parseWithoutProcessing(input: String): Program = ^.asInstanceOf[js.Dynamic].applyDynamic("parseWithoutProcessing")(input.asInstanceOf[js.Any]).asInstanceOf[Program]
  inline def parseWithoutProcessing(input: String, options: ParseOptions): Program = (^.asInstanceOf[js.Dynamic].applyDynamic("parseWithoutProcessing")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Program]
  
  inline def precompile(input: Any): TemplateSpecification = ^.asInstanceOf[js.Dynamic].applyDynamic("precompile")(input.asInstanceOf[js.Any]).asInstanceOf[TemplateSpecification]
  inline def precompile(input: Any, options: PrecompileOptions): TemplateSpecification = (^.asInstanceOf[js.Dynamic].applyDynamic("precompile")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TemplateSpecification]
  
  inline def registerDecorator(name: String, fn: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDecorator")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerHelper(name: String, fn: HelperDelegate): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerHelper")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerHelper(name: HelperDeclareSpec): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerHelper")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def registerPartial(name: String, fn: Template[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPartial")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerPartial(spec: StringDictionary[HandlebarsTemplateDelegate[Any]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerPartial")(spec.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def template[T](precompilation: TemplateSpecification): HandlebarsTemplateDelegate[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("template")(precompilation.asInstanceOf[js.Any]).asInstanceOf[HandlebarsTemplateDelegate[T]]
  
  @JSImport("handlebars/runtime", "templates")
  @js.native
  val templates: HandlebarsTemplates = js.native
  
  inline def unregisterDecorator(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterDecorator")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def unregisterHelper(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterHelper")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def unregisterPartial(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterPartial")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
