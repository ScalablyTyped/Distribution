package typings.badgen

import typings.badgen.mod.StyleOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgenStrings {
  
  @js.native
  sealed trait classic
    extends StObject
       with StyleOption
  inline def classic: classic = "classic".asInstanceOf[classic]
  
  @js.native
  sealed trait flat
    extends StObject
       with StyleOption
  inline def flat: flat = "flat".asInstanceOf[flat]
}
