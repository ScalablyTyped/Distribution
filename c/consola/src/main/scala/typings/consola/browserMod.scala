package typings.consola

import typings.consola.anon.PartialC
import typings.consola.distConsola3fef035aMod.ConsolaInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object browserMod {
  
  @JSImport("consola/browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("consola/browser", "consola")
  @js.native
  val consola: ConsolaInstance = js.native
  
  inline def createConsola(): ConsolaInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("createConsola")().asInstanceOf[ConsolaInstance]
  inline def createConsola(options: PartialC): ConsolaInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("createConsola")(options.asInstanceOf[js.Any]).asInstanceOf[ConsolaInstance]
}
