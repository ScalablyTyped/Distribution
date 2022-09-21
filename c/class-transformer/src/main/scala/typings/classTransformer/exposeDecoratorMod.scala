package typings.classTransformer

import typings.classTransformer.exposeOptionsInterfaceMod.ExposeOptions
import typings.std.ClassDecorator
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exposeDecoratorMod {
  
  @JSImport("class-transformer/types/decorators/expose.decorator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Expose(): PropertyDecorator & ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Expose")().asInstanceOf[PropertyDecorator & ClassDecorator]
  inline def Expose(options: ExposeOptions): PropertyDecorator & ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Expose")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator & ClassDecorator]
}
