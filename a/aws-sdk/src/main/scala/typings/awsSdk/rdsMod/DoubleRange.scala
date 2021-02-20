package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoubleRange extends StObject {
  
  /**
    * The minimum value in the range.
    */
  var From: js.UndefOr[Double] = js.native
  
  /**
    * The maximum value in the range.
    */
  var To: js.UndefOr[Double] = js.native
}
object DoubleRange {
  
  @scala.inline
  def apply(): DoubleRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoubleRange]
  }
  
  @scala.inline
  implicit class DoubleRangeMutableBuilder[Self <: DoubleRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: Double): Self = StObject.set(x, "From", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "From", js.undefined)
    
    @scala.inline
    def setTo(value: Double): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "To", js.undefined)
  }
}
