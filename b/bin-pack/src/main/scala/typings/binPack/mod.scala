package typings.binPack

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bin-pack", JSImport.Namespace)
  @js.native
  def apply[T /* <: Bin */](bins: js.Array[T]): PackResult[T] = js.native
  @JSImport("bin-pack", JSImport.Namespace)
  @js.native
  def apply[T /* <: Bin */](bins: js.Array[T], options: Options): PackResult[T] = js.native
  
  /** Specifies the dimensions of a bin to pack. */
  @js.native
  trait Bin extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object Bin {
    
    @scala.inline
    def apply(height: Double, width: Double): Bin = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bin]
    }
    
    @scala.inline
    implicit class BinMutableBuilder[Self <: Bin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /** Packing options. */
  @js.native
  trait Options extends StObject {
    
    /** Use inPlace=true to add x,y fields to the bins argument. */
    var inPlace: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInPlace(value: Boolean): Self = StObject.set(x, "inPlace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInPlaceUndefined: Self = StObject.set(x, "inPlace", js.undefined)
    }
  }
  
  /** The return value from the pack function. */
  @js.native
  trait PackResult[T] extends StObject {
    
    /** Height of the bounding box around all bins. */
    var height: Double = js.native
    
    /** List of packed bins. */
    var items: js.Array[PackedItem[T]] = js.native
    
    /** Width of the bounding box around all bins. */
    var width: Double = js.native
  }
  object PackResult {
    
    @scala.inline
    def apply[T](height: Double, items: js.Array[PackedItem[T]], width: Double): PackResult[T] = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackResult[T]]
    }
    
    @scala.inline
    implicit class PackResultMutableBuilder[Self <: PackResult[_], T] (val x: Self with PackResult[T]) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItems(value: js.Array[PackedItem[T]]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: PackedItem[T]*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /** Describes the location of a packed bin. */
  @js.native
  trait PackedItem[T] extends StObject {
    
    /** Height of the bin. */
    var height: Double = js.native
    
    /** The original bin object. */
    var item: T = js.native
    
    /** Width of the bin. */
    var width: Double = js.native
    
    /** X coordinate of the packed bin. */
    var x: Double = js.native
    
    /** Y coordinate of the packed bin. */
    var y: Double = js.native
  }
  object PackedItem {
    
    @scala.inline
    def apply[T](height: Double, item: T, width: Double, x: Double, y: Double): PackedItem[T] = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackedItem[T]]
    }
    
    @scala.inline
    implicit class PackedItemMutableBuilder[Self <: PackedItem[_], T] (val x: Self with PackedItem[T]) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
