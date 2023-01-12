package typings.concatStream

import typings.concatStream.concatStreamStrings.`object`
import typings.concatStream.concatStreamStrings.array
import typings.concatStream.concatStreamStrings.buffer
import typings.concatStream.concatStreamStrings.string
import typings.concatStream.concatStreamStrings.u8
import typings.concatStream.concatStreamStrings.uint8
import typings.concatStream.concatStreamStrings.uint8array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var encoding: uint8array | u8 | uint8
  }
  object `0` {
    
    inline def apply(encoding: uint8array | u8 | uint8): `0` = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def setEncoding(value: uint8array | u8 | uint8): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    }
  }
  
  trait `1` extends StObject {
    
    var encoding: array
  }
  object `1` {
    
    inline def apply(): `1` = {
      val __obj = js.Dynamic.literal(encoding = "array")
      __obj.asInstanceOf[`1`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
      
      inline def setEncoding(value: array): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    }
  }
  
  trait `2` extends StObject {
    
    var encoding: string
  }
  object `2` {
    
    inline def apply(): `2` = {
      val __obj = js.Dynamic.literal(encoding = "string")
      __obj.asInstanceOf[`2`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `2`] (val x: Self) extends AnyVal {
      
      inline def setEncoding(value: string): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    }
  }
  
  trait `3` extends StObject {
    
    var encoding: js.UndefOr[buffer] = js.undefined
  }
  object `3` {
    
    inline def apply(): `3` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`3`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `3`] (val x: Self) extends AnyVal {
      
      inline def setEncoding(value: buffer): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    }
  }
  
  trait Encoding extends StObject {
    
    var encoding: `object`
  }
  object Encoding {
    
    inline def apply(): Encoding = {
      val __obj = js.Dynamic.literal(encoding = "object")
      __obj.asInstanceOf[Encoding]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Encoding] (val x: Self) extends AnyVal {
      
      inline def setEncoding(value: `object`): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    }
  }
}
