package typings.backbone.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionSetOptions
  extends StObject
     with Parseable
     with Silenceable {
  
  var add: js.UndefOr[Boolean] = js.undefined
  
  var at: js.UndefOr[Double] = js.undefined
  
  var merge: js.UndefOr[Boolean] = js.undefined
  
  var remove: js.UndefOr[Boolean] = js.undefined
  
  var sort: js.UndefOr[Boolean] = js.undefined
}
object CollectionSetOptions {
  
  @scala.inline
  def apply(): CollectionSetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionSetOptions]
  }
  
  @scala.inline
  implicit class CollectionSetOptionsMutableBuilder[Self <: CollectionSetOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: Boolean): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    @scala.inline
    def setAt(value: Double): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
    
    @scala.inline
    def setMerge(value: Boolean): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
    
    @scala.inline
    def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    @scala.inline
    def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
