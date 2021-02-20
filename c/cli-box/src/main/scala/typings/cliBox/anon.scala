package typings.cliBox

import typings.cliBox.cliBoxBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Fullscreen extends StObject {
    
    var fullscreen: Boolean = js.native
    
    var height: Double = js.native
    
    var marks: typings.cliBox.mod.Marks = js.native
    
    var stringify: Boolean = js.native
    
    var width: Double = js.native
  }
  object Fullscreen {
    
    @scala.inline
    def apply(
      fullscreen: Boolean,
      height: Double,
      marks: typings.cliBox.mod.Marks,
      stringify: Boolean,
      width: Double
    ): Fullscreen = {
      val __obj = js.Dynamic.literal(fullscreen = fullscreen.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], marks = marks.asInstanceOf[js.Any], stringify = stringify.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fullscreen]
    }
    
    @scala.inline
    implicit class FullscreenMutableBuilder[Self <: Fullscreen] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarks(value: typings.cliBox.mod.Marks): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringify(value: Boolean): Self = StObject.set(x, "stringify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Height extends StObject {
    
    var height: Double = js.native
    
    var lines: js.Array[Offset] = js.native
    
    var marks: typings.cliBox.mod.Marks = js.native
    
    var width: Double = js.native
  }
  object Height {
    
    @scala.inline
    def apply(height: Double, lines: js.Array[Offset], marks: typings.cliBox.mod.Marks, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], marks = marks.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLines(value: js.Array[Offset]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinesVarargs(value: Offset*): Self = StObject.set(x, "lines", js.Array(value :_*))
      
      @scala.inline
      def setMarks(value: typings.cliBox.mod.Marks): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Marks extends StObject {
    
    var marks: typings.cliBox.mod.Marks = js.native
  }
  object Marks {
    
    @scala.inline
    def apply(marks: typings.cliBox.mod.Marks): Marks = {
      val __obj = js.Dynamic.literal(marks = marks.asInstanceOf[js.Any])
      __obj.asInstanceOf[Marks]
    }
    
    @scala.inline
    implicit class MarksMutableBuilder[Self <: Marks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMarks(value: typings.cliBox.mod.Marks): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Offset extends StObject {
    
    var offset: Y = js.native
    
    var text: String = js.native
  }
  object Offset {
    
    @scala.inline
    def apply(offset: Y, text: String): Offset = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Offset]
    }
    
    @scala.inline
    implicit class OffsetMutableBuilder[Self <: Offset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOffset(value: Y): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<cli-box.cli-box.Marks> */
  @js.native
  trait PartialMarks extends StObject {
    
    var b: js.UndefOr[String] = js.native
    
    var e: js.UndefOr[String] = js.native
    
    var n: js.UndefOr[String] = js.native
    
    @JSName("ne")
    var ne_FPartialMarks: js.UndefOr[String] = js.native
    
    var nw: js.UndefOr[String] = js.native
    
    var s: js.UndefOr[String] = js.native
    
    var se: js.UndefOr[String] = js.native
    
    var sw: js.UndefOr[String] = js.native
    
    var w: js.UndefOr[String] = js.native
  }
  object PartialMarks {
    
    @scala.inline
    def apply(): PartialMarks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMarks]
    }
    
    @scala.inline
    implicit class PartialMarksMutableBuilder[Self <: PartialMarks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setB(value: String): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBUndefined: Self = StObject.set(x, "b", js.undefined)
      
      @scala.inline
      def setE(value: String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEUndefined: Self = StObject.set(x, "e", js.undefined)
      
      @scala.inline
      def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNUndefined: Self = StObject.set(x, "n", js.undefined)
      
      @scala.inline
      def setNe_(value: String): Self = StObject.set(x, "ne", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNe_Undefined: Self = StObject.set(x, "ne", js.undefined)
      
      @scala.inline
      def setNw(value: String): Self = StObject.set(x, "nw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNwUndefined: Self = StObject.set(x, "nw", js.undefined)
      
      @scala.inline
      def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSUndefined: Self = StObject.set(x, "s", js.undefined)
      
      @scala.inline
      def setSe(value: String): Self = StObject.set(x, "se", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeUndefined: Self = StObject.set(x, "se", js.undefined)
      
      @scala.inline
      def setSw(value: String): Self = StObject.set(x, "sw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwUndefined: Self = StObject.set(x, "sw", js.undefined)
      
      @scala.inline
      def setW(value: String): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWUndefined: Self = StObject.set(x, "w", js.undefined)
    }
  }
  
  @js.native
  trait Stringify extends StObject {
    
    var stringify: `true` = js.native
  }
  object Stringify {
    
    @scala.inline
    def apply(stringify: `true`): Stringify = {
      val __obj = js.Dynamic.literal(stringify = stringify.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stringify]
    }
    
    @scala.inline
    implicit class StringifyMutableBuilder[Self <: Stringify] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStringify(value: `true`): Self = StObject.set(x, "stringify", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Y extends StObject {
    
    var y: Double = js.native
  }
  object Y {
    
    @scala.inline
    def apply(y: Double): Y = {
      val __obj = js.Dynamic.literal(y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Y]
    }
    
    @scala.inline
    implicit class YMutableBuilder[Self <: Y] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
