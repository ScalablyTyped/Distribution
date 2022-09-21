package typings.classTransformer

import typings.classTransformer.classConstructorTypeMod.ClassConstructor
import typings.classTransformer.classTransformerOptionsInterfaceMod.ClassTransformOptions
import typings.classTransformer.excludeOptionsInterfaceMod.ExcludeOptions
import typings.classTransformer.exposeOptionsInterfaceMod.ExposeOptions
import typings.classTransformer.transformFnParamsInterfaceMod.TransformFnParams
import typings.classTransformer.transformOptionsInterfaceMod.TransformOptions
import typings.classTransformer.typeHelpOptionsInterfaceMod.TypeHelpOptions
import typings.classTransformer.typeOptionsInterfaceMod.TypeOptions
import typings.std.ClassDecorator
import typings.std.MethodDecorator
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decoratorsMod {
  
  @JSImport("class-transformer/types/decorators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Exclude(): PropertyDecorator & ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Exclude")().asInstanceOf[PropertyDecorator & ClassDecorator]
  inline def Exclude(options: ExcludeOptions): PropertyDecorator & ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Exclude")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator & ClassDecorator]
  
  inline def Expose(): PropertyDecorator & ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Expose")().asInstanceOf[PropertyDecorator & ClassDecorator]
  inline def Expose(options: ExposeOptions): PropertyDecorator & ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Expose")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator & ClassDecorator]
  
  inline def Transform(transformFn: js.Function1[/* params */ TransformFnParams, Any]): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Transform")(transformFn.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def Transform(transformFn: js.Function1[/* params */ TransformFnParams, Any], options: TransformOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Transform")(transformFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def TransformInstanceToInstance(): MethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("TransformInstanceToInstance")().asInstanceOf[MethodDecorator]
  inline def TransformInstanceToInstance(params: ClassTransformOptions): MethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("TransformInstanceToInstance")(params.asInstanceOf[js.Any]).asInstanceOf[MethodDecorator]
  
  inline def TransformInstanceToPlain(): MethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("TransformInstanceToPlain")().asInstanceOf[MethodDecorator]
  inline def TransformInstanceToPlain(params: ClassTransformOptions): MethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("TransformInstanceToPlain")(params.asInstanceOf[js.Any]).asInstanceOf[MethodDecorator]
  
  inline def TransformPlainToInstance(classType: ClassConstructor[Any]): MethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("TransformPlainToInstance")(classType.asInstanceOf[js.Any]).asInstanceOf[MethodDecorator]
  inline def TransformPlainToInstance(classType: ClassConstructor[Any], params: ClassTransformOptions): MethodDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformPlainToInstance")(classType.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[MethodDecorator]
  
  inline def Type(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Type")().asInstanceOf[PropertyDecorator]
  inline def Type(typeFunction: js.Function1[/* type */ js.UndefOr[TypeHelpOptions], js.Function]): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Type")(typeFunction.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def Type(
    typeFunction: js.Function1[/* type */ js.UndefOr[TypeHelpOptions], js.Function],
    options: TypeOptions
  ): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Type")(typeFunction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def Type(typeFunction: Unit, options: TypeOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Type")(typeFunction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
}
