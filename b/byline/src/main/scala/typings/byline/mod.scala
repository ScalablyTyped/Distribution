package typings.byline

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.anon.End
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("byline", JSImport.Namespace)
  @js.native
  def apply(): LineStream = js.native
  @JSImport("byline", JSImport.Namespace)
  @js.native
  def apply(stream: ReadableStream): LineStream = js.native
  @JSImport("byline", JSImport.Namespace)
  @js.native
  def apply(stream: ReadableStream, options: LineStreamOptions): LineStream = js.native
  
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
  class LineStreamCls () extends Transform {
    def this(options: LineStreamOptions) = this()
  }
  
  @scala.inline
  def LineStream_=(x: LineStreamCreatable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LineStream")(x.asInstanceOf[js.Any])
  
  @JSImport("byline", "createStream")
  @js.native
  def createStream(): LineStream = js.native
  @JSImport("byline", "createStream")
  @js.native
  def createStream(stream: ReadableStream): LineStream = js.native
  @JSImport("byline", "createStream")
  @js.native
  def createStream(stream: ReadableStream, options: LineStreamOptions): LineStream = js.native
  
  @js.native
  trait LineStreamCreatable
    extends Transform
       with Instantiable0[LineStream]
       with Instantiable1[/* options */ LineStreamOptions, LineStream] {
    
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T): T = js.native
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
  }
  
  @js.native
  trait LineStreamOptions extends TransformOptions {
    
    var keepEmptyLines: js.UndefOr[Boolean] = js.native
  }
  object LineStreamOptions {
    
    @scala.inline
    def apply(): LineStreamOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LineStreamOptions]
    }
    
    @scala.inline
    implicit class LineStreamOptionsMutableBuilder[Self <: LineStreamOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeepEmptyLines(value: Boolean): Self = StObject.set(x, "keepEmptyLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepEmptyLinesUndefined: Self = StObject.set(x, "keepEmptyLines", js.undefined)
    }
  }
}
