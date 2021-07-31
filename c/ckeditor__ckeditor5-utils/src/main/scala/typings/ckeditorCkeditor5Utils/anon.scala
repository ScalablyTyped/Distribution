package typings.ckeditorCkeditor5Utils

import org.scalablytyped.runtime.Instantiable1
import typings.ckeditorCkeditor5Utils.mod.PriorityString
import typings.std.HTMLElement
import typings.std.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var priority: PriorityString | Double
  }
  object `0` {
    
    @scala.inline
    def apply(priority: PriorityString | Double): `0` = {
      val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPriority(value: PriorityString | Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    }
  }
  
  trait Bottom extends StObject {
    
    var bottom: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
  }
  object Bottom {
    
    @scala.inline
    def apply(bottom: Double, left: Double, right: Double, top: Double): Bottom = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bottom]
    }
    
    @scala.inline
    implicit class BottomMutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Call extends StObject {
    
    def apply(): Unit = js.native
    
    var called: Boolean = js.native
  }
  
  trait IdProperty[T] extends StObject {
    
    var idProperty: js.UndefOr[/* keyof T */ String] = js.undefined
  }
  object IdProperty {
    
    @scala.inline
    def apply[T](): IdProperty[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IdProperty[T]]
    }
    
    @scala.inline
    implicit class IdPropertyMutableBuilder[Self <: IdProperty[?], T] (val x: Self & IdProperty[T]) extends AnyVal {
      
      @scala.inline
      def setIdProperty(value: /* keyof T */ String): Self = StObject.set(x, "idProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdPropertyUndefined: Self = StObject.set(x, "idProperty", js.undefined)
    }
  }
  
  @js.native
  trait Instantiable[T, K]
    extends StObject
       with Instantiable1[/* item */ T, K]
  
  @js.native
  trait InstantiableT[T]
    extends StObject
       with Instantiable1[/* p (repeated) */ js.Any, T]
  
  trait Priority extends StObject {
    
    var priority: js.UndefOr[PriorityString | Double] = js.undefined
  }
  object Priority {
    
    @scala.inline
    def apply(): Priority = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Priority]
    }
    
    @scala.inline
    implicit class PriorityMutableBuilder[Self <: Priority] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPriority(value: PriorityString | Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    }
  }
  
  trait Target extends StObject {
    
    var target: HTMLElement | Range
    
    var viewportOffset: js.UndefOr[Double] = js.undefined
  }
  object Target {
    
    @scala.inline
    def apply(target: HTMLElement | Range): Target = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Target]
    }
    
    @scala.inline
    implicit class TargetMutableBuilder[Self <: Target] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTarget(value: HTMLElement | Range): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewportOffset(value: Double): Self = StObject.set(x, "viewportOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewportOffsetUndefined: Self = StObject.set(x, "viewportOffset", js.undefined)
    }
  }
}
