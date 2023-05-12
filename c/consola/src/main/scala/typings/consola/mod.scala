package typings.consola

import typings.consola.anon.PartialCfancyboolean
import typings.consola.distConsola3fef035aMod.ConsolaInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("consola", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("consola", JSImport.Default)
  @js.native
  val default: ConsolaInstance = js.native
  
  @JSImport("consola", "consola")
  @js.native
  val consola: ConsolaInstance = js.native
  
  inline def createConsola(): ConsolaInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("createConsola")().asInstanceOf[ConsolaInstance]
  inline def createConsola(options: PartialCfancyboolean): ConsolaInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("createConsola")(options.asInstanceOf[js.Any]).asInstanceOf[ConsolaInstance]
}
