package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeFleetsResult extends StObject {
  
  /**
    * Information about the EC2 Fleets.
    */
  var Fleets: js.UndefOr[FleetSet] = js.native
  
  /**
    * The token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeFleetsResult {
  
  @scala.inline
  def apply(): DescribeFleetsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetsResult]
  }
  
  @scala.inline
  implicit class DescribeFleetsResultMutableBuilder[Self <: DescribeFleetsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFleets(value: FleetSet): Self = StObject.set(x, "Fleets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetsUndefined: Self = StObject.set(x, "Fleets", js.undefined)
    
    @scala.inline
    def setFleetsVarargs(value: FleetData*): Self = StObject.set(x, "Fleets", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
