package typings.baconjs

import typings.baconjs.observableMod.Property
import typings.baconjs.observableMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object booleanMod {
  
  @JSImport("baconjs/types/boolean", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def and(left: Property[js.Any], right: Property[js.Any]): Property[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Property[Boolean]]
  
  @scala.inline
  def not(src: default[js.Any]): default[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(src.asInstanceOf[js.Any]).asInstanceOf[default[Boolean]]
  
  @scala.inline
  def or(left: Property[js.Any], right: Property[js.Any]): Property[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Property[Boolean]]
}
