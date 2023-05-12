package typings.cucumberCucumber

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libValueCheckerMod {
  
  @JSImport("@cucumber/cucumber/lib/value_checker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def doesHaveValue[T](value: T): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("doesHaveValue")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def doesNotHaveValue[T](value: T): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("doesNotHaveValue")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def valueOrDefault[T](value: T, defaultValue: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("valueOrDefault")(value.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[T]
}
