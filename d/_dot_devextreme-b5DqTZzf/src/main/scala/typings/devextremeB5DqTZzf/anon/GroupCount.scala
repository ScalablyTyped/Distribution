package typings.devextremeB5DqTZzf.anon

import typings.devextremeB5DqTZzf.mod.DevExpress.data.CustomStore.GroupItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupCount[TItem] extends StObject {
  
  var data: js.Array[GroupItem[Any] | TItem]
  
  var groupCount: js.UndefOr[Double] = js.undefined
  
  var summary: js.UndefOr[js.Array[Any]] = js.undefined
  
  var totalCount: js.UndefOr[Double] = js.undefined
}
object GroupCount {
  
  inline def apply[TItem](data: js.Array[GroupItem[Any] | TItem]): GroupCount[TItem] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupCount[TItem]]
  }
  
  extension [Self <: GroupCount[?], TItem](x: Self & GroupCount[TItem]) {
    
    inline def setData(value: js.Array[GroupItem[Any] | TItem]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: (GroupItem[Any] | TItem)*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setGroupCount(value: Double): Self = StObject.set(x, "groupCount", value.asInstanceOf[js.Any])
    
    inline def setGroupCountUndefined: Self = StObject.set(x, "groupCount", js.undefined)
    
    inline def setSummary(value: js.Array[Any]): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    inline def setSummaryVarargs(value: Any*): Self = StObject.set(x, "summary", js.Array(value*))
    
    inline def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCountUndefined: Self = StObject.set(x, "totalCount", js.undefined)
  }
}
