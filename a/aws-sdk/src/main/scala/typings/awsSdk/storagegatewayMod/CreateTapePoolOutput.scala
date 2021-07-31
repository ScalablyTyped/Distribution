package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTapePoolOutput extends StObject {
  
  /**
    * The unique Amazon Resource Name (ARN) that represents the custom tape pool. Use the ListTapePools operation to return a list of tape pools for your account and AWS Region.
    */
  var PoolARN: js.UndefOr[typings.awsSdk.storagegatewayMod.PoolARN] = js.undefined
}
object CreateTapePoolOutput {
  
  @scala.inline
  def apply(): CreateTapePoolOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTapePoolOutput]
  }
  
  @scala.inline
  implicit class CreateTapePoolOutputMutableBuilder[Self <: CreateTapePoolOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPoolARN(value: PoolARN): Self = StObject.set(x, "PoolARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolARNUndefined: Self = StObject.set(x, "PoolARN", js.undefined)
  }
}
