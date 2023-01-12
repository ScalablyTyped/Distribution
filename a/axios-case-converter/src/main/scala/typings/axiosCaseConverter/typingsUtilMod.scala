package typings.axiosCaseConverter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsUtilMod {
  
  @JSImport("axios-case-converter/typings/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isAxiosHeaders(value: Any): /* is axios-case-converter.axios-case-converter/typings/util.AxiosHeaders */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAxiosHeaders")(value.asInstanceOf[js.Any]).asInstanceOf[/* is axios-case-converter.axios-case-converter/typings/util.AxiosHeaders */ Boolean]
  
  inline def isFormData(value: Any): /* is std.FormData */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFormData")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.FormData */ Boolean]
  
  inline def isPlainObject(value: Any): /* is axios-case-converter.axios-case-converter/typings/types.TransformableObject */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(value.asInstanceOf[js.Any]).asInstanceOf[/* is axios-case-converter.axios-case-converter/typings/types.TransformableObject */ Boolean]
  
  inline def isTransformable(value: Any): /* is axios-case-converter.axios-case-converter/typings/types.Transformable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTransformable")(value.asInstanceOf[js.Any]).asInstanceOf[/* is axios-case-converter.axios-case-converter/typings/types.Transformable */ Boolean]
  
  inline def isURLSearchParams(value: Any): /* is std.URLSearchParams */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isURLSearchParams")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.URLSearchParams */ Boolean]
  
  trait AxiosHeaders extends StObject {
    
    def delete(header: String): Boolean
    
    def set(headerName: String, value: String, rewrite: Boolean): Any
  }
  object AxiosHeaders {
    
    inline def apply(delete: String => Boolean, set: (String, String, Boolean) => Any): AxiosHeaders = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), set = js.Any.fromFunction3(set))
      __obj.asInstanceOf[AxiosHeaders]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AxiosHeaders] (val x: Self) extends AnyVal {
      
      inline def setDelete(value: String => Boolean): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
      
      inline def setSet(value: (String, String, Boolean) => Any): Self = StObject.set(x, "set", js.Any.fromFunction3(value))
    }
  }
}
