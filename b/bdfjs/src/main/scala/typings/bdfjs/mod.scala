package typings.bdfjs

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bdfjs", "draw")
  @js.native
  def draw(font: Font, text: String): js.UndefOr[Bitmap] = js.native
  @JSImport("bdfjs", "draw")
  @js.native
  def draw(font: Font, text: String, options: DrawOptions): js.UndefOr[Bitmap] = js.native
  
  @JSImport("bdfjs", "parse")
  @js.native
  def parse(text: String): Font = js.native
  @JSImport("bdfjs", "parse")
  @js.native
  def parse(text: String, options: ParseOptions): Font = js.native
  @JSImport("bdfjs", "parse")
  @js.native
  def parse(text: Buffer): Font = js.native
  @JSImport("bdfjs", "parse")
  @js.native
  def parse(text: Buffer, options: ParseOptions): Font = js.native
  
  @JSImport("bdfjs", "trim")
  @js.native
  def trim(bitmap: Bitmap): Bitmap = js.native
  
  @js.native
  trait Bitmap
    extends /* row */ NumberDictionary[js.Array[Double]] {
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object Bitmap {
    
    @scala.inline
    def apply(height: Double, width: Double): Bitmap = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bitmap]
    }
    
    @scala.inline
    implicit class BitmapMutableBuilder[Self <: Bitmap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BoundingBox extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object BoundingBox {
    
    @scala.inline
    def apply(height: Double, width: Double, x: Double, y: Double): BoundingBox = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoundingBox]
    }
    
    @scala.inline
    implicit class BoundingBoxMutableBuilder[Self <: BoundingBox] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DrawOptions extends StObject {
    
    var kerningBias: js.UndefOr[Double] = js.native
  }
  object DrawOptions {
    
    @scala.inline
    def apply(): DrawOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawOptions]
    }
    
    @scala.inline
    implicit class DrawOptionsMutableBuilder[Self <: DrawOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKerningBias(value: Double): Self = StObject.set(x, "kerningBias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKerningBiasUndefined: Self = StObject.set(x, "kerningBias", js.undefined)
    }
  }
  
  @js.native
  trait Font extends StObject {
    
    var glyphs: NumberDictionary[Glyph] = js.native
    
    var meta: Meta = js.native
  }
  object Font {
    
    @scala.inline
    def apply(glyphs: NumberDictionary[Glyph], meta: Meta): Font = {
      val __obj = js.Dynamic.literal(glyphs = glyphs.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[Font]
    }
    
    @scala.inline
    implicit class FontMutableBuilder[Self <: Font] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlyphs(value: NumberDictionary[Glyph]): Self = StObject.set(x, "glyphs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Glyph extends StObject {
    
    var bitmap: js.Array[js.Array[Double]] = js.native
    
    var boundingBox: BoundingBox = js.native
    
    var bytes: js.Array[Double] = js.native
    
    var char: String = js.native
    
    var code: Double = js.native
    
    var deviceWidthX: Double = js.native
    
    var deviceWidthY: Double = js.native
    
    var name: String = js.native
    
    var scalableWidthX: Double = js.native
    
    var scalableWidthY: Double = js.native
  }
  object Glyph {
    
    @scala.inline
    def apply(
      bitmap: js.Array[js.Array[Double]],
      boundingBox: BoundingBox,
      bytes: js.Array[Double],
      char: String,
      code: Double,
      deviceWidthX: Double,
      deviceWidthY: Double,
      name: String,
      scalableWidthX: Double,
      scalableWidthY: Double
    ): Glyph = {
      val __obj = js.Dynamic.literal(bitmap = bitmap.asInstanceOf[js.Any], boundingBox = boundingBox.asInstanceOf[js.Any], bytes = bytes.asInstanceOf[js.Any], char = char.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], deviceWidthX = deviceWidthX.asInstanceOf[js.Any], deviceWidthY = deviceWidthY.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scalableWidthX = scalableWidthX.asInstanceOf[js.Any], scalableWidthY = scalableWidthY.asInstanceOf[js.Any])
      __obj.asInstanceOf[Glyph]
    }
    
    @scala.inline
    implicit class GlyphMutableBuilder[Self <: Glyph] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBitmap(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "bitmap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBitmapVarargs(value: js.Array[Double]*): Self = StObject.set(x, "bitmap", js.Array(value :_*))
      
      @scala.inline
      def setBoundingBox(value: BoundingBox): Self = StObject.set(x, "boundingBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBytes(value: js.Array[Double]): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBytesVarargs(value: Double*): Self = StObject.set(x, "bytes", js.Array(value :_*))
      
      @scala.inline
      def setChar(value: String): Self = StObject.set(x, "char", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceWidthX(value: Double): Self = StObject.set(x, "deviceWidthX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceWidthY(value: Double): Self = StObject.set(x, "deviceWidthY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalableWidthX(value: Double): Self = StObject.set(x, "scalableWidthX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalableWidthY(value: Double): Self = StObject.set(x, "scalableWidthY", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Meta extends StObject {
    
    var boundingBox: BoundingBox = js.native
    
    var name: String = js.native
    
    // The spec says that `properties` is optional, but then goes on to point out
    // that without `defaultChar`, `fontAscent` and `fontDescent` it's not really
    // a valid font, so I chose to not mark them as a maybe.
    var properties: Properties = js.native
    
    var size: Size = js.native
    
    var totalChars: Double = js.native
    
    var version: String = js.native
  }
  object Meta {
    
    @scala.inline
    def apply(
      boundingBox: BoundingBox,
      name: String,
      properties: Properties,
      size: Size,
      totalChars: Double,
      version: String
    ): Meta = {
      val __obj = js.Dynamic.literal(boundingBox = boundingBox.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], totalChars = totalChars.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Meta]
    }
    
    @scala.inline
    implicit class MetaMutableBuilder[Self <: Meta] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoundingBox(value: BoundingBox): Self = StObject.set(x, "boundingBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperties(value: Properties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalChars(value: Double): Self = StObject.set(x, "totalChars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ParseOptions extends StObject {
    
    var allprops: js.UndefOr[Boolean] = js.native
    
    var onlymeta: js.UndefOr[Boolean] = js.native
  }
  object ParseOptions {
    
    @scala.inline
    def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    @scala.inline
    implicit class ParseOptionsMutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllprops(value: Boolean): Self = StObject.set(x, "allprops", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllpropsUndefined: Self = StObject.set(x, "allprops", js.undefined)
      
      @scala.inline
      def setOnlymeta(value: Boolean): Self = StObject.set(x, "onlymeta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlymetaUndefined: Self = StObject.set(x, "onlymeta", js.undefined)
    }
  }
  
  @js.native
  trait Properties
    extends /* key */ StringDictionary[js.UndefOr[String | Double]] {
    
    var addStyleName: js.UndefOr[String] = js.native
    
    var averageWidth: js.UndefOr[Double] = js.native
    
    var capHeight: js.UndefOr[Double] = js.native
    
    var charsetEncoding: js.UndefOr[String] = js.native
    
    var charsetRegistry: js.UndefOr[String] = js.native
    
    var copyright: js.UndefOr[String] = js.native
    
    var defaultChar: Double = js.native
    
    var faceName: js.UndefOr[String] = js.native
    
    var familyName: js.UndefOr[String] = js.native
    
    var font: js.UndefOr[String] = js.native
    
    var fontAscent: Double = js.native
    
    var fontDescent: Double = js.native
    
    var fontVersion: js.UndefOr[String] = js.native
    
    var fontnameRegistry: js.UndefOr[String] = js.native
    
    var foundry: js.UndefOr[String] = js.native
    
    var notice: js.UndefOr[String] = js.native
    
    var pixelSize: js.UndefOr[Double] = js.native
    
    var pointSize: js.UndefOr[Double] = js.native
    
    var resolutionX: js.UndefOr[Double] = js.native
    
    var resolutionY: js.UndefOr[Double] = js.native
    
    var setwidthName: js.UndefOr[String] = js.native
    
    var slant: js.UndefOr[String] = js.native
    
    var spacing: js.UndefOr[String] = js.native
    
    var weightName: js.UndefOr[String] = js.native
    
    var xHeight: js.UndefOr[Double] = js.native
  }
  object Properties {
    
    @scala.inline
    def apply(defaultChar: Double, fontAscent: Double, fontDescent: Double): Properties = {
      val __obj = js.Dynamic.literal(defaultChar = defaultChar.asInstanceOf[js.Any], fontAscent = fontAscent.asInstanceOf[js.Any], fontDescent = fontDescent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Properties]
    }
    
    @scala.inline
    implicit class PropertiesMutableBuilder[Self <: Properties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddStyleName(value: String): Self = StObject.set(x, "addStyleName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddStyleNameUndefined: Self = StObject.set(x, "addStyleName", js.undefined)
      
      @scala.inline
      def setAverageWidth(value: Double): Self = StObject.set(x, "averageWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAverageWidthUndefined: Self = StObject.set(x, "averageWidth", js.undefined)
      
      @scala.inline
      def setCapHeight(value: Double): Self = StObject.set(x, "capHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCapHeightUndefined: Self = StObject.set(x, "capHeight", js.undefined)
      
      @scala.inline
      def setCharsetEncoding(value: String): Self = StObject.set(x, "charsetEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharsetEncodingUndefined: Self = StObject.set(x, "charsetEncoding", js.undefined)
      
      @scala.inline
      def setCharsetRegistry(value: String): Self = StObject.set(x, "charsetRegistry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharsetRegistryUndefined: Self = StObject.set(x, "charsetRegistry", js.undefined)
      
      @scala.inline
      def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
      
      @scala.inline
      def setDefaultChar(value: Double): Self = StObject.set(x, "defaultChar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFaceName(value: String): Self = StObject.set(x, "faceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFaceNameUndefined: Self = StObject.set(x, "faceName", js.undefined)
      
      @scala.inline
      def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFamilyNameUndefined: Self = StObject.set(x, "familyName", js.undefined)
      
      @scala.inline
      def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontAscent(value: Double): Self = StObject.set(x, "fontAscent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontDescent(value: Double): Self = StObject.set(x, "fontDescent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setFontVersion(value: String): Self = StObject.set(x, "fontVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontVersionUndefined: Self = StObject.set(x, "fontVersion", js.undefined)
      
      @scala.inline
      def setFontnameRegistry(value: String): Self = StObject.set(x, "fontnameRegistry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontnameRegistryUndefined: Self = StObject.set(x, "fontnameRegistry", js.undefined)
      
      @scala.inline
      def setFoundry(value: String): Self = StObject.set(x, "foundry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFoundryUndefined: Self = StObject.set(x, "foundry", js.undefined)
      
      @scala.inline
      def setNotice(value: String): Self = StObject.set(x, "notice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoticeUndefined: Self = StObject.set(x, "notice", js.undefined)
      
      @scala.inline
      def setPixelSize(value: Double): Self = StObject.set(x, "pixelSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPixelSizeUndefined: Self = StObject.set(x, "pixelSize", js.undefined)
      
      @scala.inline
      def setPointSize(value: Double): Self = StObject.set(x, "pointSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointSizeUndefined: Self = StObject.set(x, "pointSize", js.undefined)
      
      @scala.inline
      def setResolutionX(value: Double): Self = StObject.set(x, "resolutionX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolutionXUndefined: Self = StObject.set(x, "resolutionX", js.undefined)
      
      @scala.inline
      def setResolutionY(value: Double): Self = StObject.set(x, "resolutionY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolutionYUndefined: Self = StObject.set(x, "resolutionY", js.undefined)
      
      @scala.inline
      def setSetwidthName(value: String): Self = StObject.set(x, "setwidthName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetwidthNameUndefined: Self = StObject.set(x, "setwidthName", js.undefined)
      
      @scala.inline
      def setSlant(value: String): Self = StObject.set(x, "slant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlantUndefined: Self = StObject.set(x, "slant", js.undefined)
      
      @scala.inline
      def setSpacing(value: String): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      @scala.inline
      def setWeightName(value: String): Self = StObject.set(x, "weightName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightNameUndefined: Self = StObject.set(x, "weightName", js.undefined)
      
      @scala.inline
      def setXHeight(value: Double): Self = StObject.set(x, "xHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXHeightUndefined: Self = StObject.set(x, "xHeight", js.undefined)
    }
  }
  
  @js.native
  trait Size extends StObject {
    
    var points: Double = js.native
    
    var resolutionX: Double = js.native
    
    var resolutionY: Double = js.native
  }
  object Size {
    
    @scala.inline
    def apply(points: Double, resolutionX: Double, resolutionY: Double): Size = {
      val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any], resolutionX = resolutionX.asInstanceOf[js.Any], resolutionY = resolutionY.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    @scala.inline
    implicit class SizeMutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPoints(value: Double): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolutionX(value: Double): Self = StObject.set(x, "resolutionX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolutionY(value: Double): Self = StObject.set(x, "resolutionY", value.asInstanceOf[js.Any])
    }
  }
}
