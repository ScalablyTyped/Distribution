package typings.classifyPoetry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classifiersLimerickMod {
  
  @JSImport("classify-poetry/classifiers/limerick", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def limerick(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("limerick")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
