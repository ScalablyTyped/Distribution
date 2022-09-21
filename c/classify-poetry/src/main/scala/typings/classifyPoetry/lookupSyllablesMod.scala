package typings.classifyPoetry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lookupSyllablesMod {
  
  @JSImport("classify-poetry/utils/lookupSyllables", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def lookupSyllables(lines: js.Array[String]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("lookupSyllables")(lines.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
}
