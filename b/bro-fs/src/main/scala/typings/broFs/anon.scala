package typings.broFs

import typings.broFs.broFsStrings.ArrayBuffer
import typings.broFs.broFsStrings.Blob
import typings.broFs.broFsStrings.File
import typings.broFs.mod.TextType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var `type`: Blob
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("Blob")
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setType(value: Blob): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait `1` extends StObject {
    
    var `type`: File
  }
  object `1` {
    
    inline def apply(): `1` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("File")
      __obj.asInstanceOf[`1`]
    }
    
    extension [Self <: `1`](x: Self) {
      
      inline def setType(value: File): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait `2` extends StObject {
    
    var `type`: js.UndefOr[TextType] = js.undefined
  }
  object `2` {
    
    inline def apply(): `2` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`2`]
    }
    
    extension [Self <: `2`](x: Self) {
      
      inline def setType(value: TextType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Create extends StObject {
    
    var create: js.UndefOr[Boolean] = js.undefined
  }
  object Create {
    
    inline def apply(): Create = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Create]
    }
    
    extension [Self <: Create](x: Self) {
      
      inline def setCreate(value: Boolean): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    }
  }
  
  trait Deep extends StObject {
    
    var deep: js.UndefOr[Boolean] = js.undefined
  }
  object Deep {
    
    inline def apply(): Deep = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Deep]
    }
    
    extension [Self <: Deep](x: Self) {
      
      inline def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      inline def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
    }
  }
  
  trait Type extends StObject {
    
    var `type`: ArrayBuffer
  }
  object Type {
    
    inline def apply(): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("ArrayBuffer")
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(value: ArrayBuffer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
