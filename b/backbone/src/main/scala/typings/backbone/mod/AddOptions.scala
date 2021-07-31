package typings.backbone.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddOptions
  extends StObject
     with Silenceable {
  
  var at: js.UndefOr[Double] = js.undefined
  
  var merge: js.UndefOr[Boolean] = js.undefined
  
  var sort: js.UndefOr[Boolean] = js.undefined
}
object AddOptions {
  
  @scala.inline
  def apply(): AddOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddOptions]
  }
  
  @scala.inline
  implicit class AddOptionsMutableBuilder[Self <: AddOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAt(value: Double): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
    
    @scala.inline
    def setMerge(value: Boolean): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
    
    @scala.inline
    def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
