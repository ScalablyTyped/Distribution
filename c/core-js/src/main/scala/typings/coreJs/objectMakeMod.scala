package typings.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectMakeMod {
  
  /* was `typeof core.Object.make` */
  inline def apply[T](proto: T): T = ^.asInstanceOf[js.Dynamic].apply(proto.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def apply[T](proto: T, mixin: js.Any): T = (^.asInstanceOf[js.Dynamic].apply(proto.asInstanceOf[js.Any], mixin.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("core-js/library/fn/object/make", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
