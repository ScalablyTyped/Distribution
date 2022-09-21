package typings.barnard59ValidateShacl

import typings.barnard59ValidateShacl.validateMod.Options
import typings.node.streamMod.Duplex
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("barnard59-validate-shacl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def shacl(arg: Options): js.Promise[Duplex] = ^.asInstanceOf[js.Dynamic].applyDynamic("shacl")(arg.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Duplex]]
  inline def shacl(arg: Readable): js.Promise[Duplex] = ^.asInstanceOf[js.Dynamic].applyDynamic("shacl")(arg.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Duplex]]
}
