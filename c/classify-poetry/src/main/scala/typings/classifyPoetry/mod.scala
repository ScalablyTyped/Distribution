package typings.classifyPoetry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("classify-poetry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def abc(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("abc")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("classify-poetry", "all")
  @js.native
  val all: js.Array[js.Function1[/* str */ String, Boolean]] = js.native
  
  inline def classifyPoetry(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("classifyPoetry")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def couplet(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("couplet")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def haiku(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("haiku")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def limerick(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("limerick")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def quatrain(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("quatrain")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def sonnet(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("sonnet")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def tanka(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("tanka")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def terzaRima(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("terzaRima")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
