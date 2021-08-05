package typings.cleanGitRef

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("clean-git-ref", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clean(ref: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("clean")(ref.asInstanceOf[js.Any]).asInstanceOf[String]
}
