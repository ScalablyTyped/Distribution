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
    
    extension [Self <: `0`](x: Self) {
      
      inline def setChildren(value: js.Array[BaseNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: BaseNode*): Self = StObject.set(x, "children", js.Array(value :_*))
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
    
    extension [Self <: `1`](x: Self) {
      
      inline def setChild(value: BaseNode): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
      
      inline def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
    }
  }
  
  trait Category extends StObject {
    
    var category: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var properties: js.UndefOr[js.Any] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object Category {
    
    inline def apply(): Category = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Category]
    }
    
    extension [Self <: Category](x: Self) {
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait Child extends StObject {
    
    var child: js.UndefOr[BaseNode] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var properties: js.UndefOr[js.Any] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object Child {
    
    inline def apply(): Child = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Child]
    }
    
    extension [Self <: Child](x: Self) {
      
      inline def setChild(value: BaseNode): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
      
      inline def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
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
    
    extension [Self <: ChildMaxLoop](x: Self) {
      
      inline def setChild(value: BaseNode): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
      
      inline def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
      
      inline def setMaxLoop(value: Double): Self = StObject.set(x, "maxLoop", value.asInstanceOf[js.Any])
      
      inline def setMaxLoopUndefined: Self = StObject.set(x, "maxLoop", js.undefined)
    }
  }
  
  trait Children extends StObject {
    
    var children: js.UndefOr[js.Array[BaseNode]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var properties: js.UndefOr[js.Any] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object Children {
    
    inline def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(value: js.Array[BaseNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: BaseNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
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
    
    extension [Self <: MaxLoop](x: Self) {
      
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
    
    extension [Self <: MaxTime](x: Self) {
      
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
    
    extension [Self <: Milliseconds](x: Self) {
      
      inline def setMilliseconds(value: Double): Self = StObject.set(x, "milliseconds", value.asInstanceOf[js.Any])
      
      inline def setMillisecondsUndefined: Self = StObject.set(x, "milliseconds", js.undefined)
    }
  }
  
  trait Name extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var properties: js.UndefOr[js.Any] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object Name {
    
    inline def apply(): Name = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
