package typings.awsSdk.mediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeChannelRequest extends StObject {
  
  /**
    * The ID of a Channel.
    */
  var Id: string
}
object DescribeChannelRequest {
  
  @scala.inline
  def apply(Id: string): DescribeChannelRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeChannelRequest]
  }
  
  @scala.inline
  implicit class DescribeChannelRequestMutableBuilder[Self <: DescribeChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
