package typings.classTransformer

import typings.classTransformer.typesInterfacesDecoratorOptionsTypeOptionsDotinterfaceMod.TypeOptions
import typings.classTransformer.typesInterfacesTypeHelpOptionsDotinterfaceMod.TypeHelpOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorsTypeDotdecoratorMod {
  
  @JSImport("class-transformer/types/decorators/type.decorator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Type(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Type")().asInstanceOf[PropertyDecorator]
  inline def Type(typeFunction: js.Function1[/* type */ js.UndefOr[TypeHelpOptions], js.Function]): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Type")(typeFunction.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def Type(
    typeFunction: js.Function1[/* type */ js.UndefOr[TypeHelpOptions], js.Function],
    options: TypeOptions
  ): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Type")(typeFunction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def Type(typeFunction: Unit, options: TypeOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Type")(typeFunction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
}
