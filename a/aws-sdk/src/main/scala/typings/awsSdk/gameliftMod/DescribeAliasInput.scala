package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAliasInput extends StObject {
  
  /**
    * The unique identifier for the fleet alias that you want to retrieve. You can use either the alias ID or ARN value. 
    */
  var AliasId: AliasIdOrArn = js.native
}
object DescribeAliasInput {
  
  @scala.inline
  def apply(AliasId: AliasIdOrArn): DescribeAliasInput = {
    val __obj = js.Dynamic.literal(AliasId = AliasId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAliasInput]
  }
  
  @scala.inline
  implicit class DescribeAliasInputMutableBuilder[Self <: DescribeAliasInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliasId(value: AliasIdOrArn): Self = StObject.set(x, "AliasId", value.asInstanceOf[js.Any])
  }
}
