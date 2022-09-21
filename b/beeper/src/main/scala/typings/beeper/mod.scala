package typings.beeper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("beeper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[Unit]]
  inline def default(count: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(count.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def default(melody: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(melody.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
