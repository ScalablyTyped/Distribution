package typings.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hasMod {
  
  /* was `typeof core.Reflect.has` */
  @scala.inline
  def apply(target: js.Any, propertyKey: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def apply(target: js.Any, propertyKey: js.Symbol): Boolean = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("core-js/fn/reflect/has", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
