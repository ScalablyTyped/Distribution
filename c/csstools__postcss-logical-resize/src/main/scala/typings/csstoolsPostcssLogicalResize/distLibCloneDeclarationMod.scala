package typings.csstoolsPostcssLogicalResize

import typings.postcss.mod.Declaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCloneDeclarationMod {
  
  @JSImport("@csstools/postcss-logical-resize/dist/lib/clone-declaration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cloneDeclaration(declaration: Declaration, value: String, prop: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneDeclaration")(declaration.asInstanceOf[js.Any], value.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
