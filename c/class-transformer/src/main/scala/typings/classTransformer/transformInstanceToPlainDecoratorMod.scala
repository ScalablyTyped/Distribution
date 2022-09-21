package typings.classTransformer

import typings.classTransformer.classTransformerOptionsInterfaceMod.ClassTransformOptions
import typings.std.MethodDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformInstanceToPlainDecoratorMod {
  
  @JSImport("class-transformer/types/decorators/transform-instance-to-plain.decorator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def TransformInstanceToPlain(): MethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("TransformInstanceToPlain")().asInstanceOf[MethodDecorator]
  inline def TransformInstanceToPlain(params: ClassTransformOptions): MethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("TransformInstanceToPlain")(params.asInstanceOf[js.Any]).asInstanceOf[MethodDecorator]
}
