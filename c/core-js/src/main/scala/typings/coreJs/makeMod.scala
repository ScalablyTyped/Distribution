package typings.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object makeMod {
  
  /* was `typeof core.Object.make` */
  @scala.inline
  def apply[T](proto: T): T = ^.asInstanceOf[js.Dynamic].apply(proto.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def apply[T](proto: T, mixin: js.Any): T = (^.asInstanceOf[js.Dynamic].apply(proto.asInstanceOf[js.Any], mixin.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("core-js/fn/object/make", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
