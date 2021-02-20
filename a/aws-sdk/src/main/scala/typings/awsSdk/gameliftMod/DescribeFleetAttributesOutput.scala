package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeFleetAttributesOutput extends StObject {
  
  /**
    * A collection of objects containing attribute metadata for each requested fleet ID. Attribute objects are returned only for fleets that currently exist.
    */
  var FleetAttributes: js.UndefOr[FleetAttributesList] = js.native
  
  /**
    * Token that indicates where to resume retrieving results on the next call to this operation. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
}
object DescribeFleetAttributesOutput {
  
  @scala.inline
  def apply(): DescribeFleetAttributesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetAttributesOutput]
  }
  
  @scala.inline
  implicit class DescribeFleetAttributesOutputMutableBuilder[Self <: DescribeFleetAttributesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFleetAttributes(value: FleetAttributesList): Self = StObject.set(x, "FleetAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetAttributesUndefined: Self = StObject.set(x, "FleetAttributes", js.undefined)
    
    @scala.inline
    def setFleetAttributesVarargs(value: FleetAttributes*): Self = StObject.set(x, "FleetAttributes", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NonZeroAndMaxString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
