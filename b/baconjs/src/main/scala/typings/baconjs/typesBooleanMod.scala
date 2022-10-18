package typings.baconjs

import typings.baconjs.typesObservableMod.Property
import typings.baconjs.typesObservableMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBooleanMod {
  
  @JSImport("baconjs/types/boolean", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def and(left: Property[Any], right: Property[Any]): Property[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Property[Boolean]]
  
  inline def not(src: default[Any]): default[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(src.asInstanceOf[js.Any]).asInstanceOf[default[Boolean]]
  
  inline def or(left: Property[Any], right: Property[Any]): Property[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Property[Boolean]]
}
