package typings.bizcharts

import typings.bizcharts.anon.TextVisible
import typings.bizcharts.anon.Visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMod {
  
  @JSImport("bizcharts/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cloneDeep(deepObject: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneDeep")(deepObject.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def fold(data: js.Array[Any], fields: js.Array[String], foldCate: String, foldValue: String): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fold")(data.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], foldCate.asInstanceOf[js.Any], foldValue.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def minifyNum(num: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("minifyNum")(num.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def minifyNum(num: Any, decimal: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("minifyNum")(num.asInstanceOf[js.Any], decimal.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def percentage(data: js.Array[js.Object], field: String, as: String): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("percentage")(data.asInstanceOf[js.Any], field.asInstanceOf[js.Any], as.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def percentage(data: js.Array[js.Object], field: String, as: String, groupBy: String): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("percentage")(data.asInstanceOf[js.Any], field.asInstanceOf[js.Any], as.asInstanceOf[js.Any], groupBy.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def percentage(data: js.Array[js.Object], field: String, as: String, groupBy: js.Array[String]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("percentage")(data.asInstanceOf[js.Any], field.asInstanceOf[js.Any], as.asInstanceOf[js.Any], groupBy.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def shallowEqual(objA: Any, objB: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowEqual")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def splitBySeparator(num: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("splitBySeparator")(num.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def splitBySeparator(num: Any, separator: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("splitBySeparator")(num.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def visibleHelper(cfg: Any): Visible | TextVisible = ^.asInstanceOf[js.Dynamic].applyDynamic("visibleHelper")(cfg.asInstanceOf[js.Any]).asInstanceOf[Visible | TextVisible]
  inline def visibleHelper(cfg: Any, defaultVisible: Boolean): Visible | TextVisible = (^.asInstanceOf[js.Dynamic].applyDynamic("visibleHelper")(cfg.asInstanceOf[js.Any], defaultVisible.asInstanceOf[js.Any])).asInstanceOf[Visible | TextVisible]
}
