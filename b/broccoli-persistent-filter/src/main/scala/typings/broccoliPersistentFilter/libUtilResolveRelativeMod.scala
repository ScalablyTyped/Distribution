package typings.broccoliPersistentFilter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilResolveRelativeMod {
  
  @JSImport("broccoli-persistent-filter/lib/util/resolveRelative", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(relativePath: String, otherPaths: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scala.List(relativePath.asInstanceOf[js.Any]).`++`(otherPaths.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
}
