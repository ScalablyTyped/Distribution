package typings.classifyPoetry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object haikuMod {
  
  @JSImport("classify-poetry/classifiers/haiku", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def haiku(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("haiku")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
