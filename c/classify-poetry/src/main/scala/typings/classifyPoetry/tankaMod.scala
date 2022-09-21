package typings.classifyPoetry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tankaMod {
  
  @JSImport("classify-poetry/classifiers/tanka", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tanka(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("tanka")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
