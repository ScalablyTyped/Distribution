package typings.classTransformer

import typings.classTransformer.classConstructorTypeMod.ClassConstructor
import typings.classTransformer.classTransformerOptionsInterfaceMod.ClassTransformOptions
import typings.std.MethodDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformPlainToInstanceDecoratorMod {
  
  @JSImport("class-transformer/types/decorators/transform-plain-to-instance.decorator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def TransformPlainToInstance(classType: ClassConstructor[Any]): MethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("TransformPlainToInstance")(classType.asInstanceOf[js.Any]).asInstanceOf[MethodDecorator]
  inline def TransformPlainToInstance(classType: ClassConstructor[Any], params: ClassTransformOptions): MethodDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformPlainToInstance")(classType.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[MethodDecorator]
}
