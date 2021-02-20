package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeJobRequest extends StObject {
  
  /**
    * The name of the job to be described.
    */
  var Name: JobName = js.native
}
object DescribeJobRequest {
  
  @scala.inline
  def apply(Name: JobName): DescribeJobRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeJobRequest]
  }
  
  @scala.inline
  implicit class DescribeJobRequestMutableBuilder[Self <: DescribeJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: JobName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
