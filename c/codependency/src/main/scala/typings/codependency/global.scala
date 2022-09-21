package typings.codependency

import typings.codependency.anon.Index
import typings.codependency.mod.RequirePeerFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object codependency {
    
    @JSGlobal("codependency")
    @js.native
    val ^ : js.Any = js.native
    
    inline def get(middlewareName: String): RequirePeerFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(middlewareName.asInstanceOf[js.Any]).asInstanceOf[RequirePeerFunction]
    
    inline def register(
      baseModule: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeModule */ Any
    ): RequirePeerFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(baseModule.asInstanceOf[js.Any]).asInstanceOf[RequirePeerFunction]
    inline def register(
      baseModule: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeModule */ Any,
      options: Index
    ): RequirePeerFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(baseModule.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequirePeerFunction]
  }
}
