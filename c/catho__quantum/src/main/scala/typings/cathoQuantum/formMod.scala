package typings.cathoQuantum

import org.scalablytyped.runtime.StringDictionary
import typings.cathoQuantum.anon.Valid
import typings.cathoQuantum.anon.`13`
import typings.react.mod.Component
import typings.react.mod.FormHTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLFormElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formMod {
  
  @JSImport("@catho/quantum/Form", "Form")
  @js.native
  open class Form protected ()
    extends Component[FormProps, js.Object, Any] {
    def this(props: FormProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FormProps, context: Any) = this()
  }
  
  object Validations {
    
    @JSImport("@catho/quantum/Form", "Validations")
    @js.native
    val ^ : js.Any = js.native
    
    inline def CEP(params: `13`): String = ^.asInstanceOf[js.Dynamic].applyDynamic("CEP")(params.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def CPF(params: `13`): String = ^.asInstanceOf[js.Dynamic].applyDynamic("CPF")(params.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def CPF(params: `13`, cpf: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("CPF")(params.asInstanceOf[js.Any], cpf.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def Date(params: `13`): String = ^.asInstanceOf[js.Dynamic].applyDynamic("Date")(params.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def Email(params: `13`): String = ^.asInstanceOf[js.Dynamic].applyDynamic("Email")(params.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def EmailBlockAccent(params: `13`): String = ^.asInstanceOf[js.Dynamic].applyDynamic("EmailBlockAccent")(params.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def MaxLength(params: typings.cathoQuantum.anon.MaxLength): String = ^.asInstanceOf[js.Dynamic].applyDynamic("MaxLength")(params.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def MinLength(params: typings.cathoQuantum.anon.MinLength): String = ^.asInstanceOf[js.Dynamic].applyDynamic("MinLength")(params.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def Required(params: `13`): String = ^.asInstanceOf[js.Dynamic].applyDynamic("Required")(params.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  trait FormProps
    extends StObject
       with FormHTMLAttributes[HTMLFormElement] {
    
    @JSName("children")
    var children_FormProps: js.Array[ReactNode] | ReactNode
    
    @JSName("onSubmit")
    var onSubmit_FormProps: js.UndefOr[js.Function1[/* hasValid */ js.UndefOr[Valid], Unit]] = js.undefined
    
    var onValidSubmit: js.UndefOr[
        js.Function1[/* values */ js.UndefOr[StringDictionary[js.UndefOr[String]]], Unit]
      ] = js.undefined
  }
  object FormProps {
    
    inline def apply(): FormProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormProps]
    }
    
    extension [Self <: FormProps](x: Self) {
      
      inline def setChildren(value: js.Array[ReactNode] | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setOnSubmit(value: /* hasValid */ js.UndefOr[Valid] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setOnValidSubmit(value: /* values */ js.UndefOr[StringDictionary[js.UndefOr[String]]] => Unit): Self = StObject.set(x, "onValidSubmit", js.Any.fromFunction1(value))
      
      inline def setOnValidSubmitUndefined: Self = StObject.set(x, "onValidSubmit", js.undefined)
    }
  }
}
