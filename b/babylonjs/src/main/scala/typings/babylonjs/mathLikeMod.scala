package typings.babylonjs

import typings.babylonjs.typesMod.DeepImmutable
import typings.babylonjs.typesMod.float
import typings.babylonjs.typesMod.int
import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mathLikeMod {
  
  @js.native
  trait IColor3Like extends StObject {
    
    var b: float = js.native
    
    var g: float = js.native
    
    var r: float = js.native
  }
  object IColor3Like {
    
    @scala.inline
    def apply(b: float, g: float, r: float): IColor3Like = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[IColor3Like]
    }
    
    @scala.inline
    implicit class IColor3LikeMutableBuilder[Self <: IColor3Like] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setB(value: float): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setG(value: float): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: float): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IColor4Like extends StObject {
    
    var a: float = js.native
    
    var b: float = js.native
    
    var g: float = js.native
    
    var r: float = js.native
  }
  object IColor4Like {
    
    @scala.inline
    def apply(a: float, b: float, g: float, r: float): IColor4Like = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[IColor4Like]
    }
    
    @scala.inline
    implicit class IColor4LikeMutableBuilder[Self <: IColor4Like] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: float): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setB(value: float): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setG(value: float): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: float): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IMatrixLike extends StObject {
    
    def toArray(): DeepImmutable[Float32Array | js.Array[Double]] = js.native
    
    var updateFlag: int = js.native
  }
  object IMatrixLike {
    
    @scala.inline
    def apply(toArray: () => DeepImmutable[Float32Array | js.Array[Double]], updateFlag: int): IMatrixLike = {
      val __obj = js.Dynamic.literal(toArray = js.Any.fromFunction0(toArray), updateFlag = updateFlag.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMatrixLike]
    }
    
    @scala.inline
    implicit class IMatrixLikeMutableBuilder[Self <: IMatrixLike] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToArray(value: () => DeepImmutable[Float32Array | js.Array[Double]]): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdateFlag(value: int): Self = StObject.set(x, "updateFlag", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IPlaneLike extends StObject {
    
    var d: float = js.native
    
    var normal: IVector3Like = js.native
    
    def normalize(): Unit = js.native
  }
  object IPlaneLike {
    
    @scala.inline
    def apply(d: float, normal: IVector3Like, normalize: () => Unit): IPlaneLike = {
      val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], normalize = js.Any.fromFunction0(normalize))
      __obj.asInstanceOf[IPlaneLike]
    }
    
    @scala.inline
    implicit class IPlaneLikeMutableBuilder[Self <: IPlaneLike] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setD(value: float): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormal(value: IVector3Like): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalize(value: () => Unit): Self = StObject.set(x, "normalize", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait IVector2Like extends StObject {
    
    var x: float = js.native
    
    var y: float = js.native
  }
  object IVector2Like {
    
    @scala.inline
    def apply(x: float, y: float): IVector2Like = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[IVector2Like]
    }
    
    @scala.inline
    implicit class IVector2LikeMutableBuilder[Self <: IVector2Like] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: float): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: float): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IVector3Like extends StObject {
    
    var x: float = js.native
    
    var y: float = js.native
    
    var z: float = js.native
  }
  object IVector3Like {
    
    @scala.inline
    def apply(x: float, y: float, z: float): IVector3Like = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[IVector3Like]
    }
    
    @scala.inline
    implicit class IVector3LikeMutableBuilder[Self <: IVector3Like] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: float): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: float): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZ(value: float): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IVector4Like extends StObject {
    
    var w: float = js.native
    
    var x: float = js.native
    
    var y: float = js.native
    
    var z: float = js.native
  }
  object IVector4Like {
    
    @scala.inline
    def apply(w: float, x: float, y: float, z: float): IVector4Like = {
      val __obj = js.Dynamic.literal(w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[IVector4Like]
    }
    
    @scala.inline
    implicit class IVector4LikeMutableBuilder[Self <: IVector4Like] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setW(value: float): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: float): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: float): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZ(value: float): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IViewportLike extends StObject {
    
    var height: float = js.native
    
    var width: float = js.native
    
    var x: float = js.native
    
    var y: float = js.native
  }
  object IViewportLike {
    
    @scala.inline
    def apply(height: float, width: float, x: float, y: float): IViewportLike = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[IViewportLike]
    }
    
    @scala.inline
    implicit class IViewportLikeMutableBuilder[Self <: IViewportLike] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: float): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: float): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: float): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: float): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
