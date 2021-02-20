package typings.broFs

import typings.broFs.broFsStrings.ArrayBuffer
import typings.broFs.broFsStrings.Blob
import typings.broFs.broFsStrings.File
import typings.broFs.mod.TextType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends StObject {
    
    var `type`: Blob = js.native
  }
  object `0` {
    
    @scala.inline
    def apply(`type`: Blob): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: Blob): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait `1` extends StObject {
    
    var `type`: File = js.native
  }
  object `1` {
    
    @scala.inline
    def apply(`type`: File): `1` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[`1`]
    }
    
    @scala.inline
    implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: File): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait `2` extends StObject {
    
    var `type`: js.UndefOr[TextType] = js.native
  }
  object `2` {
    
    @scala.inline
    def apply(): `2` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`2`]
    }
    
    @scala.inline
    implicit class `2MutableBuilder`[Self <: `2`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: TextType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Create extends StObject {
    
    var create: js.UndefOr[Boolean] = js.native
  }
  object Create {
    
    @scala.inline
    def apply(): Create = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Create]
    }
    
    @scala.inline
    implicit class CreateMutableBuilder[Self <: Create] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: Boolean): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    }
  }
  
  @js.native
  trait Deep extends StObject {
    
    var deep: js.UndefOr[Boolean] = js.native
  }
  object Deep {
    
    @scala.inline
    def apply(): Deep = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Deep]
    }
    
    @scala.inline
    implicit class DeepMutableBuilder[Self <: Deep] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
    }
  }
  
  @js.native
  trait Type extends StObject {
    
    var `type`: ArrayBuffer = js.native
  }
  object Type {
    
    @scala.inline
    def apply(`type`: ArrayBuffer): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: ArrayBuffer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
