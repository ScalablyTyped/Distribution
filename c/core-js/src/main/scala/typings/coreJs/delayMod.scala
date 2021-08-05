package typings.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object delayMod {
  
  /* was `typeof core.delay` */
  inline def apply(msec: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply(msec.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("core-js/core/delay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
