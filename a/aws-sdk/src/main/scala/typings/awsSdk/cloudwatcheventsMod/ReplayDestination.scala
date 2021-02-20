package typings.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplayDestination extends StObject {
  
  /**
    * The ARN of the event bus to replay event to. You can replay events only to the event bus specified to create the archive.
    */
  var Arn: typings.awsSdk.cloudwatcheventsMod.Arn = js.native
  
  /**
    * A list of ARNs for rules to replay events to.
    */
  var FilterArns: js.UndefOr[ReplayDestinationFilters] = js.native
}
object ReplayDestination {
  
  @scala.inline
  def apply(Arn: Arn): ReplayDestination = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplayDestination]
  }
  
  @scala.inline
  implicit class ReplayDestinationMutableBuilder[Self <: ReplayDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterArns(value: ReplayDestinationFilters): Self = StObject.set(x, "FilterArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterArnsUndefined: Self = StObject.set(x, "FilterArns", js.undefined)
    
    @scala.inline
    def setFilterArnsVarargs(value: Arn*): Self = StObject.set(x, "FilterArns", js.Array(value :_*))
  }
}
