package typings.bindArgs

import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T /* <: js.Function1[/* args */ Any, Any] */](
    func: T,
    params: (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T>[number] */ js.Any)*
  ): js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T>[number] */ /* repeated */ js.Any, 
    ReturnType[T]
  ] = ^.asInstanceOf[js.Dynamic].apply(List(func.asInstanceOf[js.Any]).`++`(params.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T>[number] */ /* repeated */ js.Any, 
    ReturnType[T]
  ]]
  
  @JSImport("bind-args", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
