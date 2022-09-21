package typings.commitlintConfigValidator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@commitlint/config-validator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validateConfig(source: String, config: Any): /* asserts config is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(commitlint,types), TsIdentModule(Some(commitlint),List(types, lib, load)), TsIdentSimple(UserConfig))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validateConfig")(source.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[/* asserts config is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(commitlint,types), TsIdentModule(Some(commitlint),List(types, lib, load)), TsIdentSimple(UserConfig))),IArray())*/ Boolean]
}
