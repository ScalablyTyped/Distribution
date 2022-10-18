package typings.cardValidator

import typings.cardValidator.distTypesMod.Verification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCvvMod {
  
  @JSImport("card-validator/dist/cvv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cvv(value: String): Verification = ^.asInstanceOf[js.Dynamic].applyDynamic("cvv")(value.asInstanceOf[js.Any]).asInstanceOf[Verification]
  inline def cvv(value: String, maxLength: js.Array[Double]): Verification = (^.asInstanceOf[js.Dynamic].applyDynamic("cvv")(value.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Verification]
  inline def cvv(value: String, maxLength: Double): Verification = (^.asInstanceOf[js.Dynamic].applyDynamic("cvv")(value.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Verification]
  inline def cvv(value: Any): Verification = ^.asInstanceOf[js.Dynamic].applyDynamic("cvv")(value.asInstanceOf[js.Any]).asInstanceOf[Verification]
  inline def cvv(value: Any, maxLength: js.Array[Double]): Verification = (^.asInstanceOf[js.Dynamic].applyDynamic("cvv")(value.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Verification]
  inline def cvv(value: Any, maxLength: Double): Verification = (^.asInstanceOf[js.Dynamic].applyDynamic("cvv")(value.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Verification]
}
