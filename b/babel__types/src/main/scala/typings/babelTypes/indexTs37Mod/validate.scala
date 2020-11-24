package typings.babelTypes.indexTs37Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@babel/types/lib/index-ts3.7", "validate")
@js.native
object validate extends js.Object {
  
  def apply(n: Node, key: String, value: js.Any): Unit = js.native
  def apply[T /* <: Node */, K /* <: /* keyof T */ String */](
    n: js.UndefOr[Node],
    key: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): /* asserts n is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  def apply[T /* <: Node */, K /* <: /* keyof T */ String */](
    n: Null,
    key: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): /* asserts n is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
}
