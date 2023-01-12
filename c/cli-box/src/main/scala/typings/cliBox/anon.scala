package typings.cliBox

import typings.cliBox.cliBoxBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Fullscreen extends StObject {
    
    var fullscreen: Boolean
    
    var height: Double
    
    var marks: typings.cliBox.mod.Marks
    
    var stringify: Boolean
    
    var width: Double
  }
  object Fullscreen {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: Fullscreen] (val x: Self) extends AnyVal {
      
      inline def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setMarks(value: typings.cliBox.mod.Marks): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
      
      inline def setStringify(value: Boolean): Self = StObject.set(x, "stringify", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var lines: js.Array[Offset]
    
    var marks: typings.cliBox.mod.Marks
    
    var width: Double
  }
  object Height {
    
    inline def apply(height: Double, lines: js.Array[Offset], marks: typings.cliBox.mod.Marks, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], marks = marks.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLines(value: js.Array[Offset]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setLinesVarargs(value: Offset*): Self = StObject.set(x, "lines", js.Array(value*))
      
      inline def setMarks(value: typings.cliBox.mod.Marks): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Marks extends StObject {
    
    var marks: typings.cliBox.mod.Marks
  }
  object Marks {
    
    inline def apply(marks: typings.cliBox.mod.Marks): Marks = {
      val __obj = js.Dynamic.literal(marks = marks.asInstanceOf[js.Any])
      __obj.asInstanceOf[Marks]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Marks] (val x: Self) extends AnyVal {
      
      inline def setMarks(value: typings.cliBox.mod.Marks): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
    }
  }
  
  trait Offset extends StObject {
    
    var offset: Y
    
    var text: String
  }
  object Offset {
    
    inline def apply(offset: Y, text: String): Offset = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Offset]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Offset] (val x: Self) extends AnyVal {
      
      inline def setOffset(value: Y): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<cli-box.cli-box.Marks> */
  trait PartialMarks extends StObject {
    
    var b: js.UndefOr[String] = js.undefined
    
    var e: js.UndefOr[String] = js.undefined
    
    var n: js.UndefOr[String] = js.undefined
    
    @JSName("ne")
    var ne_FPartialMarks: js.UndefOr[String] = js.undefined
    
    var nw: js.UndefOr[String] = js.undefined
    
    var s: js.UndefOr[String] = js.undefined
    
    var se: js.UndefOr[String] = js.undefined
    
    var sw: js.UndefOr[String] = js.undefined
    
    var w: js.UndefOr[String] = js.undefined
  }
  object PartialMarks {
    
    inline def apply(): PartialMarks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMarks]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialMarks] (val x: Self) extends AnyVal {
      
      inline def setB(value: String): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setBUndefined: Self = StObject.set(x, "b", js.undefined)
      
      inline def setE(value: String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setEUndefined: Self = StObject.set(x, "e", js.undefined)
      
      inline def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      inline def setNUndefined: Self = StObject.set(x, "n", js.undefined)
      
      inline def setNe_(value: String): Self = StObject.set(x, "ne", value.asInstanceOf[js.Any])
      
      inline def setNe_Undefined: Self = StObject.set(x, "ne", js.undefined)
      
      inline def setNw(value: String): Self = StObject.set(x, "nw", value.asInstanceOf[js.Any])
      
      inline def setNwUndefined: Self = StObject.set(x, "nw", js.undefined)
      
      inline def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
      
      inline def setSe(value: String): Self = StObject.set(x, "se", value.asInstanceOf[js.Any])
      
      inline def setSeUndefined: Self = StObject.set(x, "se", js.undefined)
      
      inline def setSw(value: String): Self = StObject.set(x, "sw", value.asInstanceOf[js.Any])
      
      inline def setSwUndefined: Self = StObject.set(x, "sw", js.undefined)
      
      inline def setW(value: String): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      inline def setWUndefined: Self = StObject.set(x, "w", js.undefined)
    }
  }
  
  trait Stringify extends StObject {
    
    var stringify: `true`
  }
  object Stringify {
    
    inline def apply(): Stringify = {
      val __obj = js.Dynamic.literal(stringify = true)
      __obj.asInstanceOf[Stringify]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Stringify] (val x: Self) extends AnyVal {
      
      inline def setStringify(value: `true`): Self = StObject.set(x, "stringify", value.asInstanceOf[js.Any])
    }
  }
  
  trait Y extends StObject {
    
    var y: Double
  }
  object Y {
    
    inline def apply(y: Double): Y = {
      val __obj = js.Dynamic.literal(y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Y]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Y] (val x: Self) extends AnyVal {
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
