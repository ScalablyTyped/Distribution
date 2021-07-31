package typings.cypressCucumberPreprocessor

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepsMod {
  
  @JSImport("cypress-cucumber-preprocessor/steps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def After(optionsOrImplementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("After")(optionsOrImplementation.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def After(
    optionsOrImplementation: js.Function1[/* repeated */ js.Any, Unit],
    implementation: js.Function1[/* repeated */ js.Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("After")(optionsOrImplementation.asInstanceOf[js.Any], implementation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def After(optionsOrImplementation: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("After")(optionsOrImplementation.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def After(optionsOrImplementation: js.Object, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("After")(optionsOrImplementation.asInstanceOf[js.Any], implementation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def And(expression: String, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("And")(expression.asInstanceOf[js.Any], implementation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def And(expression: RegExp, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("And")(expression.asInstanceOf[js.Any], implementation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def Before(optionsOrImplementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Before")(optionsOrImplementation.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def Before(
    optionsOrImplementation: js.Function1[/* repeated */ js.Any, Unit],
    implementation: js.Function1[/* repeated */ js.Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Before")(optionsOrImplementation.asInstanceOf[js.Any], implementation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def Before(optionsOrImplementation: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Before")(optionsOrImplementation.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def Before(optionsOrImplementation: js.Object, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Before")(optionsOrImplementation.asInstanceOf[js.Any], implementation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def But(expression: String, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("But")(expression.asInstanceOf[js.Any], implementation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def But(expression: RegExp, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("But")(expression.asInstanceOf[js.Any], implementation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def Given(expression: String, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Given")(expression.asInstanceOf[js.Any], implementation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def Given(expression: RegExp, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Given")(expression.asInstanceOf[js.Any], implementation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def Then(expression: String, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Then")(expression.asInstanceOf[js.Any], implementation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def Then(expression: RegExp, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Then")(expression.asInstanceOf[js.Any], implementation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def When(expression: String, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("When")(expression.asInstanceOf[js.Any], implementation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def When(expression: RegExp, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("When")(expression.asInstanceOf[js.Any], implementation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def defineParameterType(parameterType: Transform): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("defineParameterType")(parameterType.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def defineStep(expression: String, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineStep")(expression.asInstanceOf[js.Any], implementation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def defineStep(expression: RegExp, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineStep")(expression.asInstanceOf[js.Any], implementation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Transform extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var preferForRegexpMatch: js.UndefOr[Boolean] = js.undefined
    
    var regexp: RegExp
    
    def transformer(arg: String*): js.Any
    
    var typeName: js.UndefOr[String] = js.undefined
    
    var useForSnippets: js.UndefOr[Boolean] = js.undefined
  }
  object Transform {
    
    @scala.inline
    def apply(regexp: RegExp, transformer: /* repeated */ String => js.Any): Transform = {
      val __obj = js.Dynamic.literal(regexp = regexp.asInstanceOf[js.Any], transformer = js.Any.fromFunction1(transformer))
      __obj.asInstanceOf[Transform]
    }
    
    @scala.inline
    implicit class TransformMutableBuilder[Self <: Transform] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPreferForRegexpMatch(value: Boolean): Self = StObject.set(x, "preferForRegexpMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferForRegexpMatchUndefined: Self = StObject.set(x, "preferForRegexpMatch", js.undefined)
      
      @scala.inline
      def setRegexp(value: RegExp): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformer(value: /* repeated */ String => js.Any): Self = StObject.set(x, "transformer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTypeName(value: String): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
      
      @scala.inline
      def setUseForSnippets(value: Boolean): Self = StObject.set(x, "useForSnippets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseForSnippetsUndefined: Self = StObject.set(x, "useForSnippets", js.undefined)
    }
  }
}
