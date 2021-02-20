package typings.cathoQuantum

import org.scalablytyped.runtime.StringDictionary
import typings.cathoQuantum.anon.Valid
import typings.cathoQuantum.anon.Value
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formMod {
  
  @JSImport("@catho/quantum/Form", "Form")
  @js.native
  class Form protected ()
    extends Component[FormProps, js.Object, js.Any] {
    def this(props: FormProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FormProps, context: js.Any) = this()
  }
  
  object Validations {
    
    @JSImport("@catho/quantum/Form", "Validations.CEP")
    @js.native
    def CEP(params: Value): String = js.native
    
    @JSImport("@catho/quantum/Form", "Validations.CPF")
    @js.native
    def CPF(params: Value): String = js.native
    @JSImport("@catho/quantum/Form", "Validations.CPF")
    @js.native
    def CPF(params: Value, cpf: String): String = js.native
    
    @JSImport("@catho/quantum/Form", "Validations.Date")
    @js.native
    def Date(params: Value): String = js.native
    
    @JSImport("@catho/quantum/Form", "Validations.Email")
    @js.native
    def Email(params: Value): String = js.native
    
    @JSImport("@catho/quantum/Form", "Validations.MaxLength")
    @js.native
    def MaxLength(params: typings.cathoQuantum.anon.MaxLength): String = js.native
    
    @JSImport("@catho/quantum/Form", "Validations.MinLength")
    @js.native
    def MinLength(params: typings.cathoQuantum.anon.MinLength): String = js.native
    
    @JSImport("@catho/quantum/Form", "Validations.Required")
    @js.native
    def Required(params: Value): String = js.native
  }
  
  @js.native
  trait FormProps extends StObject {
    
    var children: js.Array[ReactNode] | ReactNode = js.native
    
    var noValidate: js.UndefOr[Boolean] = js.native
    
    var onSubmit: js.UndefOr[js.Function1[/* hasValid */ js.UndefOr[Valid], Unit]] = js.native
    
    var onValidSubmit: js.UndefOr[
        js.Function1[/* values */ js.UndefOr[StringDictionary[js.UndefOr[String]]], Unit]
      ] = js.native
  }
  object FormProps {
    
    @scala.inline
    def apply(): FormProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormProps]
    }
    
    @scala.inline
    implicit class FormPropsMutableBuilder[Self <: FormProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ReactNode] | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setNoValidate(value: Boolean): Self = StObject.set(x, "noValidate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoValidateUndefined: Self = StObject.set(x, "noValidate", js.undefined)
      
      @scala.inline
      def setOnSubmit(value: /* hasValid */ js.UndefOr[Valid] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      @scala.inline
      def setOnValidSubmit(value: /* values */ js.UndefOr[StringDictionary[js.UndefOr[String]]] => Unit): Self = StObject.set(x, "onValidSubmit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnValidSubmitUndefined: Self = StObject.set(x, "onValidSubmit", js.undefined)
    }
  }
}
