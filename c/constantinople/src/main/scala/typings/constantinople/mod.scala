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
  
  @scala.inline
  def default(src: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def default(src: String, constants: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any], constants.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def default(src: String, constants: js.Any, options: ParserOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def default(src: String, constants: Unit, options: ParserOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def expressionToConstant(expression: Expression): Constant | Result = ^.asInstanceOf[js.Dynamic].applyDynamic("expressionToConstant")(expression.asInstanceOf[js.Any]).asInstanceOf[Constant | Result]
  @scala.inline
  def expressionToConstant(expression: Expression, options: ExpressionToConstantOptions): Constant | Result = (^.asInstanceOf[js.Dynamic].applyDynamic("expressionToConstant")(expression.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Constant | Result]
  
  @scala.inline
  def isConstant(src: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConstant")(src.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isConstant(src: String, constants: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isConstant")(src.asInstanceOf[js.Any], constants.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isConstant(src: String, constants: js.Any, options: ParserOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isConstant")(src.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isConstant(src: String, constants: Unit, options: ParserOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isConstant")(src.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def toConstant(src: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toConstant")(src.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def toConstant(src: String, constants: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toConstant")(src.asInstanceOf[js.Any], constants.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def toConstant(src: String, constants: js.Any, options: ParserOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toConstant")(src.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def toConstant(src: String, constants: Unit, options: ParserOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toConstant")(src.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  trait ExpressionToConstantOptions extends StObject {
    
    var constants: js.UndefOr[js.Any] = js.undefined
  }
  object ExpressionToConstantOptions {
    
    @scala.inline
    def apply(): ExpressionToConstantOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpressionToConstantOptions]
    }
    
    @scala.inline
    implicit class ExpressionToConstantOptionsMutableBuilder[Self <: ExpressionToConstantOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConstants(value: js.Any): Self = StObject.set(x, "constants", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstantsUndefined: Self = StObject.set(x, "constants", js.undefined)
    }
  }
  
  trait Options
    extends StObject
       with ExpressionToConstantOptions {
    
    var babylon: js.UndefOr[ParserOptions] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBabylon(value: ParserOptions): Self = StObject.set(x, "babylon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBabylonUndefined: Self = StObject.set(x, "babylon", js.undefined)
    }
  }
}
