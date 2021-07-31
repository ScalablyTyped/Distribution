package typings.cliBox

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.cliBox.anon.Fullscreen
import typings.cliBox.anon.Height
import typings.cliBox.anon.PartialMarks
import typings.cliBox.anon.Stringify
import typings.cliBox.cliBoxStrings.bottom
import typings.cliBox.cliBoxStrings.center
import typings.cliBox.cliBoxStrings.left
import typings.cliBox.cliBoxStrings.middle
import typings.cliBox.cliBoxStrings.right
import typings.cliBox.cliBoxStrings.stringify
import typings.cliBox.cliBoxStrings.top
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("cli-box", JSImport.Namespace)
  @js.native
  val ^ : js.Object & BoxConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("cli-box", JSImport.Namespace)
  @js.native
  class Class protected ()
    extends StObject
       with Box {
    def this(options: String) = this()
    def this(options: Options) = this()
    def this(options: String, text: String) = this()
    def this(options: String, text: Text) = this()
    def this(options: Options, text: String) = this()
    def this(options: Options, text: Text) = this()
    
    /* CompleteClass */
    var options: Fullscreen = js.native
    
    /* CompleteClass */
    var settings: Height = js.native
    
    /* CompleteClass */
    override def stringify(): String = js.native
  }
  
  trait Box extends StObject {
    
    var options: Fullscreen
    
    var settings: Height
    
    def stringify(): String
  }
  object Box {
    
    @scala.inline
    def apply(options: Fullscreen, settings: Height, stringify: () => String): Box = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], stringify = js.Any.fromFunction0(stringify))
      __obj.asInstanceOf[Box]
    }
    
    @scala.inline
    implicit class BoxMutableBuilder[Self <: Box] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: Fullscreen): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettings(value: Height): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringify(value: () => String): Self = StObject.set(x, "stringify", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait BoxConstructor
    extends StObject
       with Instantiable1[(/* options */ Options) | (/* options */ String), Box]
       with Instantiable2[
          (/* options */ Options) | (/* options */ String), 
          (/* text */ String) | (/* text */ Text), 
          Box
        ] {
    
    def apply(options: (Exclude[Options, stringify]) & Stringify): String = js.native
    def apply(options: (Exclude[Options, stringify]) & Stringify, text: String): String = js.native
    def apply(options: (Exclude[Options, stringify]) & Stringify, text: Text): String = js.native
    def apply(options: String): Box = js.native
    def apply(options: String, text: String): Box = js.native
    def apply(options: String, text: Text): Box = js.native
    def apply(options: Options): Box = js.native
    def apply(options: Options, text: String): Box = js.native
    def apply(options: Options, text: Text): Box = js.native
    
    var defaults: typings.cliBox.anon.Marks = js.native
  }
  
  /* Inlined std.Record<cli-box.cli-box.MarksKeys, string> */
  trait Marks extends StObject {
    
    var b: String
    
    var e: String
    
    var n: String
    
    @JSName("ne")
    var ne_FMarks: String
    
    var nw: String
    
    var s: String
    
    var se: String
    
    var sw: String
    
    var w: String
  }
  object Marks {
    
    @scala.inline
    def apply(
      b: String,
      e: String,
      n: String,
      ne_ : String,
      nw: String,
      s: String,
      se: String,
      sw: String,
      w: String
    ): Marks = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], nw = nw.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], se = se.asInstanceOf[js.Any], sw = sw.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
      __obj.updateDynamic("ne")(ne_.asInstanceOf[js.Any])
      __obj.asInstanceOf[Marks]
    }
    
    @scala.inline
    implicit class MarksMutableBuilder[Self <: Marks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setB(value: String): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setE(value: String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNe_(value: String): Self = StObject.set(x, "ne", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNw(value: String): Self = StObject.set(x, "nw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSe(value: String): Self = StObject.set(x, "se", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSw(value: String): Self = StObject.set(x, "sw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setW(value: String): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cliBox.cliBoxStrings.nw
    - typings.cliBox.cliBoxStrings.n
    - typings.cliBox.cliBoxStrings.ne
    - typings.cliBox.cliBoxStrings.e
    - typings.cliBox.cliBoxStrings.se
    - typings.cliBox.cliBoxStrings.s
    - typings.cliBox.cliBoxStrings.sw
    - typings.cliBox.cliBoxStrings.w
    - typings.cliBox.cliBoxStrings.b
  */
  trait MarksKeys extends StObject
  object MarksKeys {
    
    @scala.inline
    def b: typings.cliBox.cliBoxStrings.b = "b".asInstanceOf[typings.cliBox.cliBoxStrings.b]
    
    @scala.inline
    def e: typings.cliBox.cliBoxStrings.e = "e".asInstanceOf[typings.cliBox.cliBoxStrings.e]
    
    @scala.inline
    def n: typings.cliBox.cliBoxStrings.n = "n".asInstanceOf[typings.cliBox.cliBoxStrings.n]
    
    @scala.inline
    def ne: typings.cliBox.cliBoxStrings.ne = "ne".asInstanceOf[typings.cliBox.cliBoxStrings.ne]
    
    @scala.inline
    def nw: typings.cliBox.cliBoxStrings.nw = "nw".asInstanceOf[typings.cliBox.cliBoxStrings.nw]
    
    @scala.inline
    def s: typings.cliBox.cliBoxStrings.s = "s".asInstanceOf[typings.cliBox.cliBoxStrings.s]
    
    @scala.inline
    def se: typings.cliBox.cliBoxStrings.se = "se".asInstanceOf[typings.cliBox.cliBoxStrings.se]
    
    @scala.inline
    def sw: typings.cliBox.cliBoxStrings.sw = "sw".asInstanceOf[typings.cliBox.cliBoxStrings.sw]
    
    @scala.inline
    def w: typings.cliBox.cliBoxStrings.w = "w".asInstanceOf[typings.cliBox.cliBoxStrings.w]
  }
  
  trait Options extends StObject {
    
    var fullscreen: js.UndefOr[Boolean] = js.undefined
    
    var h: js.UndefOr[Double] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var marks: js.UndefOr[PartialMarks] = js.undefined
    
    var stringify: js.UndefOr[Boolean] = js.undefined
    
    var w: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
      
      @scala.inline
      def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setMarks(value: PartialMarks): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
      
      @scala.inline
      def setStringify(value: Boolean): Self = StObject.set(x, "stringify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringifyUndefined: Self = StObject.set(x, "stringify", js.undefined)
      
      @scala.inline
      def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWUndefined: Self = StObject.set(x, "w", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait Text extends StObject {
    
    var autoEOL: js.UndefOr[Boolean] = js.undefined
    
    var hAlign: js.UndefOr[left | middle | right] = js.undefined
    
    var stretch: js.UndefOr[Boolean] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
    
    var vAlign: js.UndefOr[top | center | bottom] = js.undefined
  }
  object Text {
    
    @scala.inline
    def apply(): Text = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Text]
    }
    
    @scala.inline
    implicit class TextMutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoEOL(value: Boolean): Self = StObject.set(x, "autoEOL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoEOLUndefined: Self = StObject.set(x, "autoEOL", js.undefined)
      
      @scala.inline
      def setHAlign(value: left | middle | right): Self = StObject.set(x, "hAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHAlignUndefined: Self = StObject.set(x, "hAlign", js.undefined)
      
      @scala.inline
      def setStretch(value: Boolean): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStretchUndefined: Self = StObject.set(x, "stretch", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setVAlign(value: top | center | bottom): Self = StObject.set(x, "vAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVAlignUndefined: Self = StObject.set(x, "vAlign", js.undefined)
    }
  }
  
  type _To = js.Object & BoxConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & BoxConstructor = ^
}
