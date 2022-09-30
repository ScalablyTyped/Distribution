package typings.coreDecorators

import typings.std.Console
import typings.std.MethodDecorator
import typings.std.PropertyDecorator
import typings.std.TypedPropertyDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("core-decorators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("core-decorators", "autobind")
  @js.native
  val autobind: js.Function = js.native
  
  inline def decorate(func: js.Function, args: Any*): MethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(scala.List(func.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[MethodDecorator]
  
  @JSImport("core-decorators", "deprecate")
  @js.native
  val deprecate: Deprecate_ = js.native
  
  @JSImport("core-decorators", "deprecated")
  @js.native
  val deprecated: Deprecate_ = js.native
  
  @JSImport("core-decorators", "lazyInitialize")
  @js.native
  val lazyInitialize: PropertyDecorator = js.native
  
  @JSImport("core-decorators", "memoize")
  @js.native
  val memoize: MethodDecorator = js.native
  
  @JSImport("core-decorators", "nonconfigurable")
  @js.native
  val nonconfigurable: PropertyOrMethodDecorator = js.native
  
  @JSImport("core-decorators", "nonenumerable")
  @js.native
  val nonenumerable: PropertyOrMethodDecorator = js.native
  
  @JSImport("core-decorators", "override")
  @js.native
  val `override`: MethodDecorator = js.native
  
  @JSImport("core-decorators", "readonly")
  @js.native
  val readonly: PropertyOrMethodDecorator = js.native
  
  @JSImport("core-decorators", "suppressWarnings")
  @js.native
  val suppressWarnings: MethodDecorator = js.native
  
  inline def time(label: String): MethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("time")(label.asInstanceOf[js.Any]).asInstanceOf[MethodDecorator]
  inline def time(label: String, console: Console): MethodDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("time")(label.asInstanceOf[js.Any], console.asInstanceOf[js.Any])).asInstanceOf[MethodDecorator]
  
  trait DeprecateOption extends StObject {
    
    var url: String
  }
  object DeprecateOption {
    
    inline def apply(url: String): DeprecateOption = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeprecateOption]
    }
    
    extension [Self <: DeprecateOption](x: Self) {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Deprecate_ extends MethodDecorator {
    
    def apply(): MethodDecorator = js.native
    def apply(message: String): MethodDecorator = js.native
    def apply(message: String, option: DeprecateOption): MethodDecorator = js.native
    def apply(message: Unit, option: DeprecateOption): MethodDecorator = js.native
  }
  
  @js.native
  trait PropertyOrMethodDecorator
    extends MethodDecorator
       with PropertyDecorator {
    
    def apply(target: js.Object, propertyKey: String): Unit = js.native
    def apply(target: js.Object, propertyKey: js.Symbol): Unit = js.native
    
    /* InferMemberOverrides */
    override def apply(arg1: /* target */ js.Object, arg2: /* propertyKey */ String | js.Symbol): Unit = js.native
    /* InferMemberOverrides */
    override def apply(
      arg1: /* target */ js.Object,
      arg2: /* propertyKey */ String | js.Symbol,
      arg3: /* descriptor */ TypedPropertyDescriptor[Any]
    ): TypedPropertyDescriptor[Any] | Unit = js.native
  }
}
