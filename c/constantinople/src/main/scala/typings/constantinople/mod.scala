package typings.constantinople

import typings.babelParser.mod.ParserOptions
import typings.babelTypes.mod.Expression
import typings.constantinople.anon.Constant
import typings.constantinople.anon.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("constantinople", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(src: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def default(src: String, constants: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any], constants.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(src: String, constants: Any, options: ParserOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(src: String, constants: Unit, options: ParserOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def expressionToConstant(expression: Expression): Constant | Result = ^.asInstanceOf[js.Dynamic].applyDynamic("expressionToConstant")(expression.asInstanceOf[js.Any]).asInstanceOf[Constant | Result]
  inline def expressionToConstant(expression: Expression, options: ExpressionToConstantOptions): Constant | Result = (^.asInstanceOf[js.Dynamic].applyDynamic("expressionToConstant")(expression.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Constant | Result]
  
  inline def isConstant(src: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConstant")(src.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isConstant(src: String, constants: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isConstant")(src.asInstanceOf[js.Any], constants.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isConstant(src: String, constants: Any, options: ParserOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isConstant")(src.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isConstant(src: String, constants: Unit, options: ParserOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isConstant")(src.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def toConstant(src: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toConstant")(src.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def toConstant(src: String, constants: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toConstant")(src.asInstanceOf[js.Any], constants.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toConstant(src: String, constants: Any, options: ParserOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toConstant")(src.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toConstant(src: String, constants: Unit, options: ParserOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toConstant")(src.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  trait ExpressionToConstantOptions extends StObject {
    
    var constants: js.UndefOr[Any] = js.undefined
  }
  object ExpressionToConstantOptions {
    
    inline def apply(): ExpressionToConstantOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpressionToConstantOptions]
    }
    
    extension [Self <: ExpressionToConstantOptions](x: Self) {
      
      inline def setConstants(value: Any): Self = StObject.set(x, "constants", value.asInstanceOf[js.Any])
      
      inline def setConstantsUndefined: Self = StObject.set(x, "constants", js.undefined)
    }
  }
  
  trait Options
    extends StObject
       with ExpressionToConstantOptions {
    
    var babylon: js.UndefOr[ParserOptions] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBabylon(value: ParserOptions): Self = StObject.set(x, "babylon", value.asInstanceOf[js.Any])
      
      inline def setBabylonUndefined: Self = StObject.set(x, "babylon", js.undefined)
    }
  }
}
