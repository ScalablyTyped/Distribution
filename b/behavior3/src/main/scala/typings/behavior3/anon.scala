package typings.behavior3

import typings.behavior3.b3.BaseNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends StObject {
    
    var children: js.UndefOr[js.Array[BaseNode]] = js.native
  }
  object `0` {
    
    @scala.inline
    def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[BaseNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: BaseNode*): Self = StObject.set(x, "children", js.Array(value :_*))
    }
  }
  
  @js.native
  trait `1` extends StObject {
    
    var child: js.UndefOr[BaseNode] = js.native
  }
  object `1` {
    
    @scala.inline
    def apply(): `1` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`1`]
    }
    
    @scala.inline
    implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChild(value: BaseNode): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
    }
  }
  
  @js.native
  trait Category extends StObject {
    
    var category: js.UndefOr[String] = js.native
    
    var description: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var properties: js.UndefOr[js.Any] = js.native
    
    var title: js.UndefOr[String] = js.native
  }
  object Category {
    
    @scala.inline
    def apply(): Category = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Category]
    }
    
    @scala.inline
    implicit class CategoryMutableBuilder[Self <: Category] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait Child extends StObject {
    
    var child: js.UndefOr[BaseNode] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var properties: js.UndefOr[js.Any] = js.native
    
    var title: js.UndefOr[String] = js.native
  }
  object Child {
    
    @scala.inline
    def apply(): Child = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Child]
    }
    
    @scala.inline
    implicit class ChildMutableBuilder[Self <: Child] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChild(value: BaseNode): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait ChildMaxLoop extends StObject {
    
    var child: js.UndefOr[BaseNode] = js.native
    
    var maxLoop: js.UndefOr[Double] = js.native
  }
  object ChildMaxLoop {
    
    @scala.inline
    def apply(): ChildMaxLoop = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChildMaxLoop]
    }
    
    @scala.inline
    implicit class ChildMaxLoopMutableBuilder[Self <: ChildMaxLoop] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChild(value: BaseNode): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
      
      @scala.inline
      def setMaxLoop(value: Double): Self = StObject.set(x, "maxLoop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLoopUndefined: Self = StObject.set(x, "maxLoop", js.undefined)
    }
  }
  
  @js.native
  trait Children extends StObject {
    
    var children: js.UndefOr[js.Array[BaseNode]] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var properties: js.UndefOr[js.Any] = js.native
    
    var title: js.UndefOr[String] = js.native
  }
  object Children {
    
    @scala.inline
    def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[BaseNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: BaseNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait MaxLoop extends StObject {
    
    var child: js.UndefOr[BaseNode] = js.native
    
    var maxLoop: js.UndefOr[Double] = js.native
  }
  object MaxLoop {
    
    @scala.inline
    def apply(): MaxLoop = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxLoop]
    }
    
    @scala.inline
    implicit class MaxLoopMutableBuilder[Self <: MaxLoop] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChild(value: BaseNode): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
      
      @scala.inline
      def setMaxLoop(value: Double): Self = StObject.set(x, "maxLoop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLoopUndefined: Self = StObject.set(x, "maxLoop", js.undefined)
    }
  }
  
  @js.native
  trait MaxTime extends StObject {
    
    var child: js.UndefOr[BaseNode] = js.native
    
    var maxTime: js.UndefOr[Double] = js.native
  }
  object MaxTime {
    
    @scala.inline
    def apply(): MaxTime = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxTime]
    }
    
    @scala.inline
    implicit class MaxTimeMutableBuilder[Self <: MaxTime] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChild(value: BaseNode): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
      
      @scala.inline
      def setMaxTime(value: Double): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTimeUndefined: Self = StObject.set(x, "maxTime", js.undefined)
    }
  }
  
  @js.native
  trait Milliseconds extends StObject {
    
    var milliseconds: js.UndefOr[Double] = js.native
  }
  object Milliseconds {
    
    @scala.inline
    def apply(): Milliseconds = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Milliseconds]
    }
    
    @scala.inline
    implicit class MillisecondsMutableBuilder[Self <: Milliseconds] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMilliseconds(value: Double): Self = StObject.set(x, "milliseconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMillisecondsUndefined: Self = StObject.set(x, "milliseconds", js.undefined)
    }
  }
  
  @js.native
  trait Name extends StObject {
    
    var name: js.UndefOr[String] = js.native
    
    var properties: js.UndefOr[js.Any] = js.native
    
    var title: js.UndefOr[String] = js.native
  }
  object Name {
    
    @scala.inline
    def apply(): Name = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
