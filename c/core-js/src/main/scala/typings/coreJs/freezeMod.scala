package typings.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object freezeMod {
  
  /* was `typeof core.Object.freeze` */
  inline def apply[T](o: T): T = ^.asInstanceOf[js.Dynamic].apply(o.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @JSImport("core-js/fn/object/freeze", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
