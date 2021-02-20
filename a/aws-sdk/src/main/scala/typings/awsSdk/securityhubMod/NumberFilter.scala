package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberFilter extends StObject {
  
  /**
    * The equal-to condition to be applied to a single field when querying for findings.
    */
  var Eq: js.UndefOr[Double] = js.native
  
  /**
    * The greater-than-equal condition to be applied to a single field when querying for findings. 
    */
  var Gte: js.UndefOr[Double] = js.native
  
  /**
    * The less-than-equal condition to be applied to a single field when querying for findings. 
    */
  var Lte: js.UndefOr[Double] = js.native
}
object NumberFilter {
  
  @scala.inline
  def apply(): NumberFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberFilter]
  }
  
  @scala.inline
  implicit class NumberFilterMutableBuilder[Self <: NumberFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEq(value: Double): Self = StObject.set(x, "Eq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEqUndefined: Self = StObject.set(x, "Eq", js.undefined)
    
    @scala.inline
    def setGte(value: Double): Self = StObject.set(x, "Gte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGteUndefined: Self = StObject.set(x, "Gte", js.undefined)
    
    @scala.inline
    def setLte(value: Double): Self = StObject.set(x, "Lte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLteUndefined: Self = StObject.set(x, "Lte", js.undefined)
  }
}
