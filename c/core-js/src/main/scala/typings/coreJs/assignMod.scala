package typings.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assignMod {
  
  /* was `typeof core.Object.assign` */
  inline def apply(target: Any, sources: Any*): Any = ^.asInstanceOf[js.Dynamic].apply(List(target.asInstanceOf[js.Any]).`++`(sources.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  @JSImport("core-js/fn/object/assign", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
