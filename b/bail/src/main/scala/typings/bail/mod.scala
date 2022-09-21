package typings.bail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bail", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bail(): js.UndefOr[
    /* asserts error is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(null))),IArray())*/ Boolean
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bail")().asInstanceOf[js.UndefOr[
    /* asserts error is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(null))),IArray())*/ Boolean
  ]]
  inline def bail(error: js.Error): js.UndefOr[
    /* asserts error is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(null))),IArray())*/ Boolean
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bail")(error.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[
    /* asserts error is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(null))),IArray())*/ Boolean
  ]]
}
