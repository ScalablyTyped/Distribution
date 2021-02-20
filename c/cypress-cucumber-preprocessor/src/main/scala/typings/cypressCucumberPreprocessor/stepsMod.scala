package typings.cypressCucumberPreprocessor

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepsMod {
  
  @JSImport("cypress-cucumber-preprocessor/steps", "After")
  @js.native
  def After(optionsOrImplementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  @JSImport("cypress-cucumber-preprocessor/steps", "After")
  @js.native
  def After(
    optionsOrImplementation: js.Function1[/* repeated */ js.Any, Unit],
    implementation: js.Function1[/* repeated */ js.Any, Unit]
  ): Unit = js.native
  @JSImport("cypress-cucumber-preprocessor/steps", "After")
  @js.native
  def After(optionsOrImplementation: js.Object): Unit = js.native
  @JSImport("cypress-cucumber-preprocessor/steps", "After")
  @js.native
  def After(optionsOrImplementation: js.Object, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  
  @JSImport("cypress-cucumber-preprocessor/steps", "And")
  @js.native
  def And(expression: String, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  @JSImport("cypress-cucumber-preprocessor/steps", "And")
  @js.native
  def And(expression: RegExp, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  
  @JSImport("cypress-cucumber-preprocessor/steps", "Before")
  @js.native
  def Before(optionsOrImplementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  @JSImport("cypress-cucumber-preprocessor/steps", "Before")
  @js.native
  def Before(
    optionsOrImplementation: js.Function1[/* repeated */ js.Any, Unit],
    implementation: js.Function1[/* repeated */ js.Any, Unit]
  ): Unit = js.native
  @JSImport("cypress-cucumber-preprocessor/steps", "Before")
  @js.native
  def Before(optionsOrImplementation: js.Object): Unit = js.native
  @JSImport("cypress-cucumber-preprocessor/steps", "Before")
  @js.native
  def Before(optionsOrImplementation: js.Object, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  
  @JSImport("cypress-cucumber-preprocessor/steps", "But")
  @js.native
  def But(expression: String, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  @JSImport("cypress-cucumber-preprocessor/steps", "But")
  @js.native
  def But(expression: RegExp, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  
  @JSImport("cypress-cucumber-preprocessor/steps", "Given")
  @js.native
  def Given(expression: String, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  @JSImport("cypress-cucumber-preprocessor/steps", "Given")
  @js.native
  def Given(expression: RegExp, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  
  @JSImport("cypress-cucumber-preprocessor/steps", "Then")
  @js.native
  def Then(expression: String, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  @JSImport("cypress-cucumber-preprocessor/steps", "Then")
  @js.native
  def Then(expression: RegExp, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  
  @JSImport("cypress-cucumber-preprocessor/steps", "When")
  @js.native
  def When(expression: String, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  @JSImport("cypress-cucumber-preprocessor/steps", "When")
  @js.native
  def When(expression: RegExp, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  
  @JSImport("cypress-cucumber-preprocessor/steps", "defineParameterType")
  @js.native
  def defineParameterType(parameterType: Transform): Unit = js.native
  
  @JSImport("cypress-cucumber-preprocessor/steps", "defineStep")
  @js.native
  def defineStep(expression: String, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  @JSImport("cypress-cucumber-preprocessor/steps", "defineStep")
  @js.native
  def defineStep(expression: RegExp, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  
  @js.native
  trait Transform extends StObject {
    
    var name: js.UndefOr[String] = js.native
    
    var preferForRegexpMatch: js.UndefOr[Boolean] = js.native
    
    var regexp: RegExp = js.native
    
    def transformer(arg: String*): js.Any = js.native
    
    var typeName: js.UndefOr[String] = js.native
    
    var useForSnippets: js.UndefOr[Boolean] = js.native
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
