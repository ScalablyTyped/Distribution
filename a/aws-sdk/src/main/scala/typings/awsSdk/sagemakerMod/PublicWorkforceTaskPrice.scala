package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicWorkforceTaskPrice extends StObject {
  
  /**
    * Defines the amount of money paid to an Amazon Mechanical Turk worker in United States dollars.
    */
  var AmountInUsd: js.UndefOr[USD] = js.native
}
object PublicWorkforceTaskPrice {
  
  @scala.inline
  def apply(): PublicWorkforceTaskPrice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicWorkforceTaskPrice]
  }
  
  @scala.inline
  implicit class PublicWorkforceTaskPriceMutableBuilder[Self <: PublicWorkforceTaskPrice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmountInUsd(value: USD): Self = StObject.set(x, "AmountInUsd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountInUsdUndefined: Self = StObject.set(x, "AmountInUsd", js.undefined)
  }
}
