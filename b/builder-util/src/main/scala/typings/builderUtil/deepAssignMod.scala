package typings.builderUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deepAssignMod {
  
  @JSImport("builder-util/out/deepAssign", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deepAssign[T](target: T, objects: Any*): T = ^.asInstanceOf[js.Dynamic].applyDynamic("deepAssign")(scala.List(target.asInstanceOf[js.Any]).`++`(objects.asInstanceOf[Seq[js.Any]])*).asInstanceOf[T]
}
