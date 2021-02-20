package typings.coreDecorators

import typings.std.Console
import typings.std.MethodDecorator
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("core-decorators", "autobind")
  @js.native
  val autobind: js.Function = js.native
  
  @JSImport("core-decorators", "decorate")
  @js.native
  def decorate(func: js.Function, args: js.Any*): MethodDecorator = js.native
  
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
  
  @JSImport("core-decorators", "readonly")
  @js.native
  val readonly: PropertyOrMethodDecorator = js.native
  
  @JSImport("core-decorators", "suppressWarnings")
  @js.native
  val suppressWarnings: MethodDecorator = js.native
  
  @JSImport("core-decorators", "time")
  @js.native
  def time(label: String): MethodDecorator = js.native
  @JSImport("core-decorators", "time")
  @js.native
  def time(label: String, console: Console): MethodDecorator = js.native
  
  @js.native
  trait DeprecateOption extends StObject {
    
    var url: String = js.native
  }
  object DeprecateOption {
    
    @scala.inline
    def apply(url: String): DeprecateOption = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeprecateOption]
    }
    
    @scala.inline
    implicit class DeprecateOptionMutableBuilder[Self <: DeprecateOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Deprecate_ extends MethodDecorator {
    
    def apply(): MethodDecorator = js.native
    def apply(message: js.UndefOr[scala.Nothing], option: DeprecateOption): MethodDecorator = js.native
    def apply(message: String): MethodDecorator = js.native
    def apply(message: String, option: DeprecateOption): MethodDecorator = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - js.Function because Already inherited
  - typings.std.PropertyDecorator because var conflicts: length. Inlined  */ @js.native
  trait PropertyOrMethodDecorator extends MethodDecorator {
    
    def apply(target: js.Object, propertyKey: String): Unit = js.native
    def apply(target: js.Object, propertyKey: js.Symbol): Unit = js.native
  }
  
  @JSImport("core-decorators", "override")
  @js.native
  val `override`: MethodDecorator = js.native
}
