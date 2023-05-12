package typings.ckeditorCkeditor5Utils

import typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.delete
import typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.insert
import typings.ckeditorCkeditor5Utils.srcDiffMod.DiffResult
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcDifftochangesMod {
  
  @JSImport("@ckeditor/ckeditor5-utils/src/difftochanges", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](diff: js.Array[DiffResult], output: ArrayLike[T]): js.Array[Change[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(diff.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.Array[Change[T]]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ckeditorCkeditor5Utils.srcDifftochangesMod.InsertChange[T]
    - typings.ckeditorCkeditor5Utils.srcDifftochangesMod.DeleteChange
  */
  trait Change[T] extends StObject
  object Change {
    
    inline def DeleteChange(howMany: Double, index: Double): typings.ckeditorCkeditor5Utils.srcDifftochangesMod.DeleteChange = {
      val __obj = js.Dynamic.literal(howMany = howMany.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("delete")
      __obj.asInstanceOf[typings.ckeditorCkeditor5Utils.srcDifftochangesMod.DeleteChange]
    }
    
    inline def InsertChange[T](index: Double, values: js.Array[T]): typings.ckeditorCkeditor5Utils.srcDifftochangesMod.InsertChange[T] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("insert")
      __obj.asInstanceOf[typings.ckeditorCkeditor5Utils.srcDifftochangesMod.InsertChange[T]]
    }
  }
  
  trait DeleteChange
    extends StObject
       with Change[Any] {
    
    var howMany: Double
    
    var index: Double
    
    var `type`: delete
  }
  object DeleteChange {
    
    inline def apply(howMany: Double, index: Double): DeleteChange = {
      val __obj = js.Dynamic.literal(howMany = howMany.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("delete")
      __obj.asInstanceOf[DeleteChange]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeleteChange] (val x: Self) extends AnyVal {
      
      inline def setHowMany(value: Double): Self = StObject.set(x, "howMany", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setType(value: delete): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait InsertChange[T]
    extends StObject
       with Change[T] {
    
    var index: Double
    
    var `type`: insert
    
    var values: js.Array[T]
  }
  object InsertChange {
    
    inline def apply[T](index: Double, values: js.Array[T]): InsertChange[T] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("insert")
      __obj.asInstanceOf[InsertChange[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InsertChange[?], T] (val x: Self & InsertChange[T]) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setType(value: insert): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[T]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: T*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
}
