package typings.awsSdk.mediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeContainerOutput extends StObject {
  
  /**
    * The name of the queried container.
    */
  var Container: js.UndefOr[typings.awsSdk.mediastoreMod.Container] = js.undefined
}
object DescribeContainerOutput {
  
  @scala.inline
  def apply(): DescribeContainerOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeContainerOutput]
  }
  
  @scala.inline
  implicit class DescribeContainerOutputMutableBuilder[Self <: DescribeContainerOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: Container): Self = StObject.set(x, "Container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "Container", js.undefined)
  }
}
