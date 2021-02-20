package typings.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchArrayProperties extends StObject {
  
  /**
    * The size of the array, if this is an array batch job. Valid values are integers between 2 and 10,000.
    */
  var Size: js.UndefOr[Integer] = js.native
}
object BatchArrayProperties {
  
  @scala.inline
  def apply(): BatchArrayProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchArrayProperties]
  }
  
  @scala.inline
  implicit class BatchArrayPropertiesMutableBuilder[Self <: BatchArrayProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSize(value: Integer): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
  }
}
