package typings.classTransformer

import typings.classTransformer.typesInterfacesDecoratorOptionsTransformOptionsDotinterfaceMod.TransformOptions
import typings.classTransformer.typesInterfacesMetadataTransformFnParamsDotinterfaceMod.TransformFnParams
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorsTransformDotdecoratorMod {
  
  @JSImport("class-transformer/types/decorators/transform.decorator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Transform(transformFn: js.Function1[/* params */ TransformFnParams, Any]): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Transform")(transformFn.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def Transform(transformFn: js.Function1[/* params */ TransformFnParams, Any], options: TransformOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Transform")(transformFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
}
