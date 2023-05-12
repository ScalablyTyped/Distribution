package typings.bufbuildProtobuf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPrivateAssertMod {
  
  @JSImport("@bufbuild/protobuf/dist/types/private/assert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assert(condition: Any): /* asserts condition */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("assert")(condition.asInstanceOf[js.Any]).asInstanceOf[/* asserts condition */ Boolean]
  inline def assert(condition: Any, msg: String): /* asserts condition */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(condition.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[/* asserts condition */ Boolean]
  
  inline def assertFloat32(arg: Any): /* asserts arg is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(number))),IArray())*/ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("assertFloat32")(arg.asInstanceOf[js.Any]).asInstanceOf[/* asserts arg is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(number))),IArray())*/ Boolean]
  
  inline def assertInt32(arg: Any): /* asserts arg is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(number))),IArray())*/ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("assertInt32")(arg.asInstanceOf[js.Any]).asInstanceOf[/* asserts arg is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(number))),IArray())*/ Boolean]
  
  inline def assertUInt32(arg: Any): /* asserts arg is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(number))),IArray())*/ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("assertUInt32")(arg.asInstanceOf[js.Any]).asInstanceOf[/* asserts arg is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(number))),IArray())*/ Boolean]
}
