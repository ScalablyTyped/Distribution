package typings.creditCardType

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matchesMod {
  
  @JSImport("credit-card-type/dist/lib/matches", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def matches(cardNumber: String, pattern: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matches")(cardNumber.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def matches(cardNumber: String, pattern: js.Array[Double | String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matches")(cardNumber.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def matches(cardNumber: String, pattern: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matches")(cardNumber.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
