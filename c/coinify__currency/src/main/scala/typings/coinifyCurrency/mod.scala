package typings.coinifyCurrency

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@coinify/currency", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeRateBetweenSubunitAmounts(fromCurrency: String, fromAmount: Double, toCurrency: String, toAmount: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeRateBetweenSubunitAmounts")(fromCurrency.asInstanceOf[js.Any], fromAmount.asInstanceOf[js.Any], toCurrency.asInstanceOf[js.Any], toAmount.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def convertSubunitAmount(amountSubUnit: Double, rate: Double, fromCurrency: String, toCurrency: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("convertSubunitAmount")(amountSubUnit.asInstanceOf[js.Any], rate.asInstanceOf[js.Any], fromCurrency.asInstanceOf[js.Any], toCurrency.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def formatAmount(amount: Double, currency: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatAmount")(amount.asInstanceOf[js.Any], currency.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def fromSmallestSubunit(amount: Double, currency: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSmallestSubunit")(amount.asInstanceOf[js.Any], currency.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getDecimalsForCurrency(currency: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDecimalsForCurrency")(currency.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getName(code: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")(code.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isValidCryptoCurrency(code: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidCryptoCurrency")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidCurrency(code: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidCurrency")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidFiatCurrency(code: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidFiatCurrency")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def toSmallestSubunit(amount: Double, currency: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toSmallestSubunit")(amount.asInstanceOf[js.Any], currency.asInstanceOf[js.Any])).asInstanceOf[Double]
}
