package typings.devextremeB5DqTZzf.mod.DevExpress

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.devextremeB5DqTZzf.anon.Container
import typings.devextremeB5DqTZzf.anon.Then
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.orientationChanged
import typings.devextremeB5DqTZzf.mod.global.JQuery
import typings.devextremeB5DqTZzf.mod.global.JQueryEventObject
import typings.devextremeB5DqTZzf.mod.global.JQueryPromise
import typings.std.Element
import typings.std.Exclude
import typings.std.HTMLElement
import typings.std.Pick
import typings.std.Record
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object core {
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please describe your scenario in the following GitHub Issue, and we will suggest a public alternative: {@link https://github.com/DevExpress/DevExtreme/issues/17885|Internal Types}.
    */
  @js.native
  trait ComponentFactory[TComponent]
    extends StObject
       with Instantiable1[/* element */ UserDefinedElement[Element], TComponent]
       with Instantiable2[
          /* element */ UserDefinedElement[Element], 
          /* options */ Record[String, Any], 
          TComponent
        ] {
    
    def getInstance(element: UserDefinedElement[Element]): TComponent = js.native
  }
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please describe your scenario in the following GitHub Issue, and we will suggest a public alternative: {@link https://github.com/DevExpress/DevExtreme/issues/17885|Internal Types}.
    */
  type Condition = JQueryEventObject
  
  type DeepPartial[T] = T | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? .devextreme-b5DqTZzf..devextreme-b5DqTZzf.DevExpress.core.DeepPartial<T[P]>}
    */ typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.DeepPartial & TopLevel[T])
  
  trait DefaultOptionsRule[T] extends StObject {
    
    var device: js.UndefOr[Device | js.Array[Device] | (js.Function1[/* device */ Device, Boolean])] = js.undefined
    
    var options: DeepPartial[T]
  }
  object DefaultOptionsRule {
    
    inline def apply[T](options: DeepPartial[T]): DefaultOptionsRule[T] = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultOptionsRule[T]]
    }
    
    extension [Self <: DefaultOptionsRule[?], T](x: Self & DefaultOptionsRule[T]) {
      
      inline def setDevice(value: Device | js.Array[Device] | (js.Function1[/* device */ Device, Boolean])): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setDeviceFunction1(value: /* device */ Device => Boolean): Self = StObject.set(x, "device", js.Any.fromFunction1(value))
      
      inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
      
      inline def setDeviceVarargs(value: Device*): Self = StObject.set(x, "device", js.Array(value*))
      
      inline def setOptions(value: DeepPartial[T]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  type DxElement_[T /* <: Element */] = ElementWrapper[T] | T
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please describe your scenario in the following GitHub Issue, and we will suggest a public alternative: {@link https://github.com/DevExpress/DevExtreme/issues/17885|Internal Types}.
    */
  type ElementWrapper[T /* <: Element */] = JQuery[T]
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please describe your scenario in the following GitHub Issue, and we will suggest a public alternative: {@link https://github.com/DevExpress/DevExtreme/issues/17885|Internal Types}.
    */
  type ElementsArrayWrapper[T /* <: Element */] = JQuery[T]
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please describe your scenario in the following GitHub Issue, and we will suggest a public alternative: {@link https://github.com/DevExpress/DevExtreme/issues/17885|Internal Types}.
    */
  type EventName = orientationChanged
  
  trait FunctionTemplate extends StObject {
    
    def render(template: Container): DxElement_[HTMLElement]
  }
  object FunctionTemplate {
    
    inline def apply(render: Container => DxElement_[HTMLElement]): FunctionTemplate = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
      __obj.asInstanceOf[FunctionTemplate]
    }
    
    extension [Self <: FunctionTemplate](x: Self) {
      
      inline def setRender(value: Container => DxElement_[HTMLElement]): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please describe your scenario in the following GitHub Issue, and we will suggest a public alternative: {@link https://github.com/DevExpress/DevExtreme/issues/17885|Internal Types}.
    */
  type PromiseType[T] = JQueryPromise[T]
  
  type Skip[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  trait TemplateManager extends StObject {
    
    def addDefaultTemplates(templates: Record[String, Any]): Unit
    
    var anonymousTemplateName: String
  }
  object TemplateManager {
    
    inline def apply(addDefaultTemplates: Record[String, Any] => Unit, anonymousTemplateName: String): TemplateManager = {
      val __obj = js.Dynamic.literal(addDefaultTemplates = js.Any.fromFunction1(addDefaultTemplates), anonymousTemplateName = anonymousTemplateName.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateManager]
    }
    
    extension [Self <: TemplateManager](x: Self) {
      
      inline def setAddDefaultTemplates(value: Record[String, Any] => Unit): Self = StObject.set(x, "addDefaultTemplates", js.Any.fromFunction1(value))
      
      inline def setAnonymousTemplateName(value: String): Self = StObject.set(x, "anonymousTemplateName", value.asInstanceOf[js.Any])
    }
  }
  
  trait Template_ extends StObject
  
  type UserDefinedElement[T /* <: Element */] = ElementWrapper[T] | T
  
  type UserDefinedElementsArray = ElementsArrayWrapper[Element] | js.Array[Element]
  
  type dxElement = DxElement_[HTMLElement]
  
  type dxSVGElement = DxElement_[SVGElement]
  
  type dxTemplate = Template_
  
  trait dxTemplateOptions extends StObject {
    
    /**
      * Specifies the name of the template.
      */
    var name: js.UndefOr[String] = js.undefined
  }
  object dxTemplateOptions {
    
    inline def apply(): dxTemplateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[dxTemplateOptions]
    }
    
    extension [Self <: dxTemplateOptions](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  type template = String | js.Function | UserDefinedElement[Element]
  
  object utils {
    
    type DxExtendedPromise[T] = DxPromise[T] & Then[T]
    
    type DxPromise[T] = PromiseType[T] | js.Promise[T]
  }
}
