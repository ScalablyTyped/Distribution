package typings.cardValidator

import typings.cardValidator.typesMod.Verification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cvvMod {
  
  @JSImport("card-validator/dist/cvv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def cvv(value: String): Verification = ^.asInstanceOf[js.Dynamic].applyDynamic("cvv")(value.asInstanceOf[js.Any]).asInstanceOf[Verification]
  @scala.inline
  def cvv(value: String, maxLength: js.Array[Double]): Verification = (^.asInstanceOf[js.Dynamic].applyDynamic("cvv")(value.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Verification]
  @scala.inline
  def cvv(value: String, maxLength: Double): Verification = (^.asInstanceOf[js.Dynamic].applyDynamic("cvv")(value.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Verification]
  @scala.inline
  def cvv(value: js.Any): Verification = ^.asInstanceOf[js.Dynamic].applyDynamic("cvv")(value.asInstanceOf[js.Any]).asInstanceOf[Verification]
  @scala.inline
  def cvv(value: js.Any, maxLength: js.Array[Double]): Verification = (^.asInstanceOf[js.Dynamic].applyDynamic("cvv")(value.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Verification]
  @scala.inline
  def cvv(value: js.Any, maxLength: Double): Verification = (^.asInstanceOf[js.Dynamic].applyDynamic("cvv")(value.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Verification]
}
