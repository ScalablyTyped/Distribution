package typings.behavior3

import typings.behavior3.b3.BaseNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var children: js.UndefOr[js.Array[BaseNode]] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: js.Array[BaseNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: BaseNode*): Self = StObject.set(x, "children", js.Array(value*))
    }
  }
  
  trait `1` extends StObject {
    
    var child: js.UndefOr[BaseNode] = js.undefined
  }
  object `1` {
    
    inline def apply(): `1` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`1`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
      
      inline def setChild(value: BaseNode): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
      
      inline def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
    }
  }
  
  trait Category extends StObject {
    
    var category: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var properties: js.UndefOr[Any] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object Category {
    
    inline def apply(): Category = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Category]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Category] (val x: Self) extends AnyVal {
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait Child extends StObject {
    
    var child: js.UndefOr[BaseNode] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var properties: js.UndefOr[Any] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object Child {
    
    inline def apply(): Child = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Child]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Child] (val x: Self) extends AnyVal {
      
      inline def setChild(value: BaseNode): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
      
      inline def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait ChildMaxLoop extends StObject {
    
    var child: js.UndefOr[BaseNode] = js.undefined
    
    var maxLoop: js.UndefOr[Double] = js.undefined
  }
  object ChildMaxLoop {
    
    inline def apply(): ChildMaxLoop = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChildMaxLoop]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChildMaxLoop] (val x: Self) extends AnyVal {
      
      inline def setChild(value: BaseNode): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
      
      inline def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
      
      inline def setMaxLoop(value: Double): Self = StObject.set(x, "maxLoop", value.asInstanceOf[js.Any])
      
      inline def setMaxLoopUndefined: Self = StObject.set(x, "maxLoop", js.undefined)
    }
  }
  
  trait Children extends StObject {
    
    var children: js.UndefOr[js.Array[BaseNode]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var properties: js.UndefOr[Any] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object Children {
    
    inline def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: js.Array[BaseNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: BaseNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait MaxLoop extends StObject {
    
    var child: js.UndefOr[BaseNode] = js.undefined
    
    var maxLoop: js.UndefOr[Double] = js.undefined
  }
  object MaxLoop {
    
    inline def apply(): MaxLoop = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxLoop]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MaxLoop] (val x: Self) extends AnyVal {
      
      inline def setChild(value: BaseNode): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
      
      inline def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
      
      inline def setMaxLoop(value: Double): Self = StObject.set(x, "maxLoop", value.asInstanceOf[js.Any])
      
      inline def setMaxLoopUndefined: Self = StObject.set(x, "maxLoop", js.undefined)
    }
  }
  
  trait MaxTime extends StObject {
    
    var child: js.UndefOr[BaseNode] = js.undefined
    
    var maxTime: js.UndefOr[Double] = js.undefined
  }
  object MaxTime {
    
    inline def apply(): MaxTime = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxTime]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MaxTime] (val x: Self) extends AnyVal {
      
      inline def setChild(value: BaseNode): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
      
      inline def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
      
      inline def setMaxTime(value: Double): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
      
      inline def setMaxTimeUndefined: Self = StObject.set(x, "maxTime", js.undefined)
    }
  }
  
  trait Milliseconds extends StObject {
    
    var milliseconds: js.UndefOr[Double] = js.undefined
  }
  object Milliseconds {
    
    inline def apply(): Milliseconds = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Milliseconds]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Milliseconds] (val x: Self) extends AnyVal {
      
      inline def setMilliseconds(value: Double): Self = StObject.set(x, "milliseconds", value.asInstanceOf[js.Any])
      
      inline def setMillisecondsUndefined: Self = StObject.set(x, "milliseconds", js.undefined)
    }
  }
  
  trait Name extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var properties: js.UndefOr[Any] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object Name {
    
    inline def apply(): Name = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
