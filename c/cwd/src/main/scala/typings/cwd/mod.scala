package typings.cwd

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(pathSegments: String*): String = ^.asInstanceOf[js.Dynamic].apply(pathSegments.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  inline def apply(pathSegments: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].apply(pathSegments.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("cwd", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
