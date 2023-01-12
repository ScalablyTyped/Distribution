package typings.byline

import typings.node.NodeJS.ReadableStream
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): LineStream = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[LineStream]
  inline def apply(stream: ReadableStream): LineStream = ^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[LineStream]
  inline def apply(stream: ReadableStream, options: LineStreamOptions): LineStream = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LineStream]
  
  @JSImport("byline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("byline", "LineStream")
  @js.native
  def LineStream: LineStreamCreatable = js.native
  type LineStream = Transform
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("byline", "LineStream")
  @js.native
  open class LineStreamCls () extends Transform {
    def this(options: LineStreamOptions) = this()
  }
  
  inline def LineStream_=(x: LineStreamCreatable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LineStream")(x.asInstanceOf[js.Any])
  
  inline def createStream(): LineStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createStream")().asInstanceOf[LineStream]
  inline def createStream(stream: ReadableStream): LineStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createStream")(stream.asInstanceOf[js.Any]).asInstanceOf[LineStream]
  inline def createStream(stream: ReadableStream, options: LineStreamOptions): LineStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createStream")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LineStream]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - js.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - org.scalablytyped.runtime.Instantiable1 because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.Instantiable0 because Inheritance from two classes. Inlined  */ @js.native
  trait LineStreamCreatable extends Transform
  
  trait LineStreamOptions
    extends StObject
       with TransformOptions {
    
    var keepEmptyLines: js.UndefOr[Boolean] = js.undefined
  }
  object LineStreamOptions {
    
    inline def apply(): LineStreamOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LineStreamOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LineStreamOptions] (val x: Self) extends AnyVal {
      
      inline def setKeepEmptyLines(value: Boolean): Self = StObject.set(x, "keepEmptyLines", value.asInstanceOf[js.Any])
      
      inline def setKeepEmptyLinesUndefined: Self = StObject.set(x, "keepEmptyLines", js.undefined)
    }
  }
}
