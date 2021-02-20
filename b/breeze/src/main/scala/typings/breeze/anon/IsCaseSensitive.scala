package typings.breeze.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsCaseSensitive extends StObject {
  
  var isCaseSensitive: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var usesSql92CompliantStringComparison: js.UndefOr[Boolean] = js.native
}
object IsCaseSensitive {
  
  @scala.inline
  def apply(): IsCaseSensitive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsCaseSensitive]
  }
  
  @scala.inline
  implicit class IsCaseSensitiveMutableBuilder[Self <: IsCaseSensitive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsCaseSensitive(value: Boolean): Self = StObject.set(x, "isCaseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCaseSensitiveUndefined: Self = StObject.set(x, "isCaseSensitive", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUsesSql92CompliantStringComparison(value: Boolean): Self = StObject.set(x, "usesSql92CompliantStringComparison", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsesSql92CompliantStringComparisonUndefined: Self = StObject.set(x, "usesSql92CompliantStringComparison", js.undefined)
  }
}
