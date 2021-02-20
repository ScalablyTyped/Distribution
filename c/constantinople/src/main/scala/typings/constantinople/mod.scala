package typings.constantinople

import typings.babelParser.mod.ParserOptions
import typings.babelTypes.mod.Expression
import typings.constantinople.anon.Constant
import typings.constantinople.anon.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("constantinople", JSImport.Default)
  @js.native
  def default(src: String): Boolean = js.native
  @JSImport("constantinople", JSImport.Default)
  @js.native
  def default(src: String, constants: js.UndefOr[scala.Nothing], options: ParserOptions): Boolean = js.native
  @JSImport("constantinople", JSImport.Default)
  @js.native
  def default(src: String, constants: js.Any): Boolean = js.native
  @JSImport("constantinople", JSImport.Default)
  @js.native
  def default(src: String, constants: js.Any, options: ParserOptions): Boolean = js.native
  
  @JSImport("constantinople", "expressionToConstant")
  @js.native
  def expressionToConstant(expression: Expression): Constant | Result = js.native
  @JSImport("constantinople", "expressionToConstant")
  @js.native
  def expressionToConstant(expression: Expression, options: ExpressionToConstantOptions): Constant | Result = js.native
  
  @JSImport("constantinople", "isConstant")
  @js.native
  def isConstant(src: String): Boolean = js.native
  @JSImport("constantinople", "isConstant")
  @js.native
  def isConstant(src: String, constants: js.UndefOr[scala.Nothing], options: ParserOptions): Boolean = js.native
  @JSImport("constantinople", "isConstant")
  @js.native
  def isConstant(src: String, constants: js.Any): Boolean = js.native
  @JSImport("constantinople", "isConstant")
  @js.native
  def isConstant(src: String, constants: js.Any, options: ParserOptions): Boolean = js.native
  
  @JSImport("constantinople", "toConstant")
  @js.native
  def toConstant(src: String): js.Any = js.native
  @JSImport("constantinople", "toConstant")
  @js.native
  def toConstant(src: String, constants: js.UndefOr[scala.Nothing], options: ParserOptions): js.Any = js.native
  @JSImport("constantinople", "toConstant")
  @js.native
  def toConstant(src: String, constants: js.Any): js.Any = js.native
  @JSImport("constantinople", "toConstant")
  @js.native
  def toConstant(src: String, constants: js.Any, options: ParserOptions): js.Any = js.native
  
  @js.native
  trait ExpressionToConstantOptions extends StObject {
    
    var constants: js.UndefOr[js.Any] = js.native
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
  
  @js.native
  trait Options extends ExpressionToConstantOptions {
    
    var babylon: js.UndefOr[ParserOptions] = js.native
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
