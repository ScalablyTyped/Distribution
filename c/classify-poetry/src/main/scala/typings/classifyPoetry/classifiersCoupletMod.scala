package typings.classifyPoetry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classifiersCoupletMod {
  
  @JSImport("classify-poetry/classifiers/couplet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def couplet(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("couplet")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
