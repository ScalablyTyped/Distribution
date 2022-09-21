package typings.classifyPoetry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sonnetMod {
  
  @JSImport("classify-poetry/classifiers/sonnet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sonnet(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("sonnet")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
