package typings.classTransformer

import typings.classTransformer.classTransformOptionsMod.ClassTransformOptions
import typings.classTransformer.exposeExcludeOptionsMod.ExcludeOptions
import typings.classTransformer.exposeExcludeOptionsMod.ExposeOptions
import typings.classTransformer.exposeExcludeOptionsMod.TransformOptions
import typings.classTransformer.exposeExcludeOptionsMod.TypeHelpOptions
import typings.classTransformer.exposeExcludeOptionsMod.TypeOptions
import typings.classTransformer.transformationTypeEnumMod.TransformationType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decoratorsMod {
  
  @JSImport("class-transformer/decorators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def Exclude(): js.Function2[
    /* object */ (Record[String, js.Any]) | js.Function, 
    /* propertyName */ js.UndefOr[String], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("Exclude")().asInstanceOf[js.Function2[
    /* object */ (Record[String, js.Any]) | js.Function, 
    /* propertyName */ js.UndefOr[String], 
    Unit
  ]]
  @scala.inline
  def Exclude(options: ExcludeOptions): js.Function2[
    /* object */ (Record[String, js.Any]) | js.Function, 
    /* propertyName */ js.UndefOr[String], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("Exclude")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* object */ (Record[String, js.Any]) | js.Function, 
    /* propertyName */ js.UndefOr[String], 
    Unit
  ]]
  
  @scala.inline
  def Expose(): js.Function2[
    /* object */ (Record[String, js.Any]) | js.Function, 
    /* propertyName */ js.UndefOr[String], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("Expose")().asInstanceOf[js.Function2[
    /* object */ (Record[String, js.Any]) | js.Function, 
    /* propertyName */ js.UndefOr[String], 
    Unit
  ]]
  @scala.inline
  def Expose(options: ExposeOptions): js.Function2[
    /* object */ (Record[String, js.Any]) | js.Function, 
    /* propertyName */ js.UndefOr[String], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("Expose")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* object */ (Record[String, js.Any]) | js.Function, 
    /* propertyName */ js.UndefOr[String], 
    Unit
  ]]
  
  @scala.inline
  def Transform(
    transformFn: js.Function3[
      /* value */ js.Any, 
      /* obj */ js.Any, 
      /* transformationType */ TransformationType, 
      js.Any
    ]
  ): js.Function2[/* target */ js.Any, /* key */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Transform")(transformFn.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ js.Any, /* key */ String, Unit]]
  @scala.inline
  def Transform(
    transformFn: js.Function3[
      /* value */ js.Any, 
      /* obj */ js.Any, 
      /* transformationType */ TransformationType, 
      js.Any
    ],
    options: TransformOptions
  ): js.Function2[/* target */ js.Any, /* key */ String, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("Transform")(transformFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* target */ js.Any, /* key */ String, Unit]]
  
  @scala.inline
  def TransformClassToClass(): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("TransformClassToClass")().asInstanceOf[js.Function]
  @scala.inline
  def TransformClassToClass(params: ClassTransformOptions): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("TransformClassToClass")(params.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  @scala.inline
  def TransformClassToPlain(): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("TransformClassToPlain")().asInstanceOf[js.Function]
  @scala.inline
  def TransformClassToPlain(params: ClassTransformOptions): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("TransformClassToPlain")(params.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  @scala.inline
  def TransformPlainToClass(classType: js.Any): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("TransformPlainToClass")(classType.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  @scala.inline
  def TransformPlainToClass(classType: js.Any, params: ClassTransformOptions): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformPlainToClass")(classType.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  @scala.inline
  def Type(): js.Function2[/* target */ js.Any, /* key */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Type")().asInstanceOf[js.Function2[/* target */ js.Any, /* key */ String, Unit]]
  @scala.inline
  def Type(typeFunction: js.Function1[/* type */ js.UndefOr[TypeHelpOptions], js.Function]): js.Function2[/* target */ js.Any, /* key */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Type")(typeFunction.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ js.Any, /* key */ String, Unit]]
  @scala.inline
  def Type(
    typeFunction: js.Function1[/* type */ js.UndefOr[TypeHelpOptions], js.Function],
    options: TypeOptions
  ): js.Function2[/* target */ js.Any, /* key */ String, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("Type")(typeFunction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* target */ js.Any, /* key */ String, Unit]]
  @scala.inline
  def Type(typeFunction: Unit, options: TypeOptions): js.Function2[/* target */ js.Any, /* key */ String, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("Type")(typeFunction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* target */ js.Any, /* key */ String, Unit]]
}
