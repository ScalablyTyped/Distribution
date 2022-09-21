package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputGroupDetail extends StObject {
  
  /**
    * Details about the output
    */
  var OutputDetails: js.UndefOr[listOfOutputDetail] = js.undefined
}
object OutputGroupDetail {
  
  inline def apply(): OutputGroupDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputGroupDetail]
  }
  
  extension [Self <: OutputGroupDetail](x: Self) {
    
    inline def setOutputDetails(value: listOfOutputDetail): Self = StObject.set(x, "OutputDetails", value.asInstanceOf[js.Any])
    
    inline def setOutputDetailsUndefined: Self = StObject.set(x, "OutputDetails", js.undefined)
    
    inline def setOutputDetailsVarargs(value: OutputDetail*): Self = StObject.set(x, "OutputDetails", js.Array(value*))
  }
}
