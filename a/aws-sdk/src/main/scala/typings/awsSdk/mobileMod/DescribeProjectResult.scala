package typings.awsSdk.mobileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeProjectResult extends StObject {
  
  var details: js.UndefOr[ProjectDetails] = js.native
}
object DescribeProjectResult {
  
  @scala.inline
  def apply(): DescribeProjectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProjectResult]
  }
  
  @scala.inline
  implicit class DescribeProjectResultMutableBuilder[Self <: DescribeProjectResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: ProjectDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
  }
}
