package typings.codependency

import typings.codependency.anon.Index
import typings.codependency.mod.RequirePeerFunction
import typings.node.NodeModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object codependency {
    
    @JSGlobal("codependency")
    @js.native
    val ^ : js.Any = js.native
    
    inline def get(middlewareName: String): RequirePeerFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(middlewareName.asInstanceOf[js.Any]).asInstanceOf[RequirePeerFunction]
    
    inline def register(baseModule: NodeModule): RequirePeerFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(baseModule.asInstanceOf[js.Any]).asInstanceOf[RequirePeerFunction]
    inline def register(baseModule: NodeModule, options: Index): RequirePeerFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(baseModule.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequirePeerFunction]
  }
}
