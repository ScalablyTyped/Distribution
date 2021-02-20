package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sample extends StObject {
  
  /**
    * The number of rows in the sample.
    */
  var Size: js.UndefOr[SampleSize] = js.native
  
  /**
    * The way in which DataBrew obtains rows from a dataset.
    */
  var Type: SampleType = js.native
}
object Sample {
  
  @scala.inline
  def apply(Type: SampleType): Sample = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sample]
  }
  
  @scala.inline
  implicit class SampleMutableBuilder[Self <: Sample] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSize(value: SampleSize): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
    
    @scala.inline
    def setType(value: SampleType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
