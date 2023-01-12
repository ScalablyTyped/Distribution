package typings.bricksJs

import typings.bricksJs.bricksJsStrings.pack
import typings.bricksJs.bricksJsStrings.resize
import typings.bricksJs.bricksJsStrings.update
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: Options): Instance = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Instance]
  
  @JSImport("bricks.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Instance extends StObject {
    
    def off(event: pack | update): Instance = js.native
    def off(event: pack | update, listener: js.Function0[Any]): Instance = js.native
    @JSName("off")
    def off_resize(event: resize): Instance = js.native
    @JSName("off")
    def off_resize(event: resize, listener: js.Function1[/* sizeDetail */ SizeDetail, Any]): Instance = js.native
    
    def on(event: pack | update, listener: js.Function0[Any]): Instance = js.native
    @JSName("on")
    def on_resize(event: resize, listener: js.Function1[/* sizeDetail */ SizeDetail, Any]): Instance = js.native
    
    def once(event: pack | update, listener: js.Function0[Any]): Instance = js.native
    @JSName("once")
    def once_resize(event: resize, listener: js.Function1[/* sizeDetail */ SizeDetail, Any]): Instance = js.native
    
    def pack(): Instance = js.native
    
    def resize(): Instance = js.native
    def resize(flag: Boolean): Instance = js.native
    
    def update(): Instance = js.native
  }
  
  trait Options extends StObject {
    
    var container: Node | String
    
    var packed: String
    
    var position: js.UndefOr[Boolean] = js.undefined
    
    var sizes: js.Array[SizeDetail]
  }
  object Options {
    
    inline def apply(container: Node | String, packed: String, sizes: js.Array[SizeDetail]): Options = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], packed = packed.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setContainer(value: Node | String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setPacked(value: String): Self = StObject.set(x, "packed", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Boolean): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setSizes(value: js.Array[SizeDetail]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      inline def setSizesVarargs(value: SizeDetail*): Self = StObject.set(x, "sizes", js.Array(value*))
    }
  }
  
  trait SizeDetail extends StObject {
    
    var columns: Double
    
    var gutter: Double
    
    var mq: js.UndefOr[String] = js.undefined
  }
  object SizeDetail {
    
    inline def apply(columns: Double, gutter: Double): SizeDetail = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], gutter = gutter.asInstanceOf[js.Any])
      __obj.asInstanceOf[SizeDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SizeDetail] (val x: Self) extends AnyVal {
      
      inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setGutter(value: Double): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      inline def setMq(value: String): Self = StObject.set(x, "mq", value.asInstanceOf[js.Any])
      
      inline def setMqUndefined: Self = StObject.set(x, "mq", js.undefined)
    }
  }
}
