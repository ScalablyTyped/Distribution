package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputGroupDetail extends StObject {
  
  /**
    * Details about the output
    */
  var OutputDetails: js.UndefOr[listOfOutputDetail] = js.native
}
object OutputGroupDetail {
  
  @scala.inline
  def apply(): OutputGroupDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputGroupDetail]
  }
  
  @scala.inline
  implicit class OutputGroupDetailMutableBuilder[Self <: OutputGroupDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutputDetails(value: listOfOutputDetail): Self = StObject.set(x, "OutputDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputDetailsUndefined: Self = StObject.set(x, "OutputDetails", js.undefined)
    
    @scala.inline
    def setOutputDetailsVarargs(value: OutputDetail*): Self = StObject.set(x, "OutputDetails", js.Array(value :_*))
  }
}
