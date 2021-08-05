package typings.coreJs

import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reflectOwnKeysMod {
  
  /* was `typeof core.Reflect.ownKeys` */
  inline def apply(target: js.Any): Array[PropertyKey] = ^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any]).asInstanceOf[Array[PropertyKey]]
  
  @JSImport("core-js/library/fn/reflect/own-keys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
