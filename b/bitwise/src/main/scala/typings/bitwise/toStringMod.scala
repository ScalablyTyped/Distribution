package typings.bitwise

import typings.bitwise.bitwiseTypesMod.Bits
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toStringMod {
  
  @JSImport("bitwise/bits/to-string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(bits: Bits): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(bits.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(bits: Bits, spacing: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(bits.asInstanceOf[js.Any], spacing.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(bits: Bits, spacing: Double, spacer: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(bits.asInstanceOf[js.Any], spacing.asInstanceOf[js.Any], spacer.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(bits: Bits, spacing: Unit, spacer: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(bits.asInstanceOf[js.Any], spacing.asInstanceOf[js.Any], spacer.asInstanceOf[js.Any])).asInstanceOf[String]
}
