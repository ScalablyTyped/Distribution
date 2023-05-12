package typings.chartJs

import typings.chartJs.anon.Hi
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHelpersHelpersDotcollectionMod {
  
  @JSImport("chart.js/dist/helpers/helpers.collection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrayUnique[T](items: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("_arrayUnique")(items.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def filterBetween(values: js.Array[Double], min: Double, max: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("_filterBetween")(values.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def listenArrayEvents[T](array: js.Array[T], listener: ArrayListener[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("listenArrayEvents")(array.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def lookup(table: js.Array[Double], value: Double): Hi = (^.asInstanceOf[js.Dynamic].applyDynamic("_lookup")(table.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Hi]
  inline def lookup(table: js.Array[Double], value: Double, cmp: js.Function1[/* value */ Double, Boolean]): Hi = (^.asInstanceOf[js.Dynamic].applyDynamic("_lookup")(table.asInstanceOf[js.Any], value.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any])).asInstanceOf[Hi]
  
  inline def lookupByKey(table: js.Array[Record[String, Double]], key: String, value: Double): Hi = (^.asInstanceOf[js.Dynamic].applyDynamic("_lookupByKey")(table.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Hi]
  inline def lookupByKey(table: js.Array[Record[String, Double]], key: String, value: Double, last: Boolean): Hi = (^.asInstanceOf[js.Dynamic].applyDynamic("_lookupByKey")(table.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], last.asInstanceOf[js.Any])).asInstanceOf[Hi]
  
  inline def lookup_T[T](table: js.Array[T], value: Double, cmp: js.Function1[/* value */ Double, Boolean]): Hi = (^.asInstanceOf[js.Dynamic].applyDynamic("_lookup")(table.asInstanceOf[js.Any], value.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any])).asInstanceOf[Hi]
  
  inline def rlookupByKey(table: js.Array[Record[String, Double]], key: String, value: Double): Hi = (^.asInstanceOf[js.Dynamic].applyDynamic("_rlookupByKey")(table.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Hi]
  
  inline def unlistenArrayEvents[T](array: js.Array[T], listener: ArrayListener[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unlistenArrayEvents")(array.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait ArrayListener[T] extends StObject {
    
    var _onDataPop: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var _onDataPush: js.UndefOr[js.Function1[/* repeated */ T, Unit]] = js.undefined
    
    var _onDataShift: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var _onDataSplice: js.UndefOr[
        js.Function3[/* index */ Double, /* deleteCount */ Double, /* repeated */ T, Unit]
      ] = js.undefined
    
    var _onDataUnshift: js.UndefOr[js.Function1[/* repeated */ T, Unit]] = js.undefined
  }
  object ArrayListener {
    
    inline def apply[T](): ArrayListener[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrayListener[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArrayListener[?], T] (val x: Self & ArrayListener[T]) extends AnyVal {
      
      inline def set_onDataPop(value: () => Unit): Self = StObject.set(x, "_onDataPop", js.Any.fromFunction0(value))
      
      inline def set_onDataPopUndefined: Self = StObject.set(x, "_onDataPop", js.undefined)
      
      inline def set_onDataPush(value: /* repeated */ T => Unit): Self = StObject.set(x, "_onDataPush", js.Any.fromFunction1(value))
      
      inline def set_onDataPushUndefined: Self = StObject.set(x, "_onDataPush", js.undefined)
      
      inline def set_onDataShift(value: () => Unit): Self = StObject.set(x, "_onDataShift", js.Any.fromFunction0(value))
      
      inline def set_onDataShiftUndefined: Self = StObject.set(x, "_onDataShift", js.undefined)
      
      inline def set_onDataSplice(value: (/* index */ Double, /* deleteCount */ Double, /* repeated */ T) => Unit): Self = StObject.set(x, "_onDataSplice", js.Any.fromFunction3(value))
      
      inline def set_onDataSpliceUndefined: Self = StObject.set(x, "_onDataSplice", js.undefined)
      
      inline def set_onDataUnshift(value: /* repeated */ T => Unit): Self = StObject.set(x, "_onDataUnshift", js.Any.fromFunction1(value))
      
      inline def set_onDataUnshiftUndefined: Self = StObject.set(x, "_onDataUnshift", js.undefined)
    }
  }
}
