package typings.bdfjs

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bdfjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def draw(font: Font, text: String): js.UndefOr[Bitmap] = (^.asInstanceOf[js.Dynamic].applyDynamic("draw")(font.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Bitmap]]
  inline def draw(font: Font, text: String, options: DrawOptions): js.UndefOr[Bitmap] = (^.asInstanceOf[js.Dynamic].applyDynamic("draw")(font.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Bitmap]]
  
  inline def parse(text: String): Font = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[Font]
  inline def parse(text: String, options: ParseOptions): Font = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Font]
  inline def parse(text: Buffer): Font = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[Font]
  inline def parse(text: Buffer, options: ParseOptions): Font = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Font]
  
  inline def trim(bitmap: Bitmap): Bitmap = ^.asInstanceOf[js.Dynamic].applyDynamic("trim")(bitmap.asInstanceOf[js.Any]).asInstanceOf[Bitmap]
  
  trait Bitmap
    extends StObject
       with /* row */ NumberDictionary[js.Array[Double]] {
    
    var height: Double
    
    var width: Double
  }
  object Bitmap {
    
    inline def apply(height: Double, width: Double): Bitmap = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bitmap]
    }
    
    extension [Self <: Bitmap](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait BoundingBox extends StObject {
    
    var height: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object BoundingBox {
    
    inline def apply(height: Double, width: Double, x: Double, y: Double): BoundingBox = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoundingBox]
    }
    
    extension [Self <: BoundingBox](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait DrawOptions extends StObject {
    
    var kerningBias: js.UndefOr[Double] = js.undefined
  }
  object DrawOptions {
    
    inline def apply(): DrawOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawOptions]
    }
    
    extension [Self <: DrawOptions](x: Self) {
      
      inline def setKerningBias(value: Double): Self = StObject.set(x, "kerningBias", value.asInstanceOf[js.Any])
      
      inline def setKerningBiasUndefined: Self = StObject.set(x, "kerningBias", js.undefined)
    }
  }
  
  trait Font extends StObject {
    
    var glyphs: NumberDictionary[Glyph]
    
    var meta: Meta
  }
  object Font {
    
    inline def apply(glyphs: NumberDictionary[Glyph], meta: Meta): Font = {
      val __obj = js.Dynamic.literal(glyphs = glyphs.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[Font]
    }
    
    extension [Self <: Font](x: Self) {
      
      inline def setGlyphs(value: NumberDictionary[Glyph]): Self = StObject.set(x, "glyphs", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
  
  trait Glyph extends StObject {
    
    var bitmap: js.Array[js.Array[Double]]
    
    var boundingBox: BoundingBox
    
    var bytes: js.Array[Double]
    
    var char: String
    
    var code: Double
    
    var deviceWidthX: Double
    
    var deviceWidthY: Double
    
    var name: String
    
    var scalableWidthX: Double
    
    var scalableWidthY: Double
  }
  object Glyph {
    
    inline def apply(
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
    
    extension [Self <: Glyph](x: Self) {
      
      inline def setBitmap(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "bitmap", value.asInstanceOf[js.Any])
      
      inline def setBitmapVarargs(value: js.Array[Double]*): Self = StObject.set(x, "bitmap", js.Array(value*))
      
      inline def setBoundingBox(value: BoundingBox): Self = StObject.set(x, "boundingBox", value.asInstanceOf[js.Any])
      
      inline def setBytes(value: js.Array[Double]): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
      
      inline def setBytesVarargs(value: Double*): Self = StObject.set(x, "bytes", js.Array(value*))
      
      inline def setChar(value: String): Self = StObject.set(x, "char", value.asInstanceOf[js.Any])
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDeviceWidthX(value: Double): Self = StObject.set(x, "deviceWidthX", value.asInstanceOf[js.Any])
      
      inline def setDeviceWidthY(value: Double): Self = StObject.set(x, "deviceWidthY", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setScalableWidthX(value: Double): Self = StObject.set(x, "scalableWidthX", value.asInstanceOf[js.Any])
      
      inline def setScalableWidthY(value: Double): Self = StObject.set(x, "scalableWidthY", value.asInstanceOf[js.Any])
    }
  }
  
  trait Meta extends StObject {
    
    var boundingBox: BoundingBox
    
    var name: String
    
    // The spec says that `properties` is optional, but then goes on to point out
    // that without `defaultChar`, `fontAscent` and `fontDescent` it's not really
    // a valid font, so I chose to not mark them as a maybe.
    var properties: Properties
    
    var size: Size
    
    var totalChars: Double
    
    var version: String
  }
  object Meta {
    
    inline def apply(
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
    
    extension [Self <: Meta](x: Self) {
      
      inline def setBoundingBox(value: BoundingBox): Self = StObject.set(x, "boundingBox", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: Properties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setTotalChars(value: Double): Self = StObject.set(x, "totalChars", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParseOptions extends StObject {
    
    var allprops: js.UndefOr[Boolean] = js.undefined
    
    var onlymeta: js.UndefOr[Boolean] = js.undefined
  }
  object ParseOptions {
    
    inline def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    extension [Self <: ParseOptions](x: Self) {
      
      inline def setAllprops(value: Boolean): Self = StObject.set(x, "allprops", value.asInstanceOf[js.Any])
      
      inline def setAllpropsUndefined: Self = StObject.set(x, "allprops", js.undefined)
      
      inline def setOnlymeta(value: Boolean): Self = StObject.set(x, "onlymeta", value.asInstanceOf[js.Any])
      
      inline def setOnlymetaUndefined: Self = StObject.set(x, "onlymeta", js.undefined)
    }
  }
  
  trait Properties
    extends StObject
       with /* key */ StringDictionary[js.UndefOr[String | Double]] {
    
    var addStyleName: js.UndefOr[String] = js.undefined
    
    var averageWidth: js.UndefOr[Double] = js.undefined
    
    var capHeight: js.UndefOr[Double] = js.undefined
    
    var charsetEncoding: js.UndefOr[String] = js.undefined
    
    var charsetRegistry: js.UndefOr[String] = js.undefined
    
    var copyright: js.UndefOr[String] = js.undefined
    
    var defaultChar: Double
    
    var faceName: js.UndefOr[String] = js.undefined
    
    var familyName: js.UndefOr[String] = js.undefined
    
    var font: js.UndefOr[String] = js.undefined
    
    var fontAscent: Double
    
    var fontDescent: Double
    
    var fontVersion: js.UndefOr[String] = js.undefined
    
    var fontnameRegistry: js.UndefOr[String] = js.undefined
    
    var foundry: js.UndefOr[String] = js.undefined
    
    var notice: js.UndefOr[String] = js.undefined
    
    var pixelSize: js.UndefOr[Double] = js.undefined
    
    var pointSize: js.UndefOr[Double] = js.undefined
    
    var resolutionX: js.UndefOr[Double] = js.undefined
    
    var resolutionY: js.UndefOr[Double] = js.undefined
    
    var setwidthName: js.UndefOr[String] = js.undefined
    
    var slant: js.UndefOr[String] = js.undefined
    
    var spacing: js.UndefOr[String] = js.undefined
    
    var weightName: js.UndefOr[String] = js.undefined
    
    var xHeight: js.UndefOr[Double] = js.undefined
  }
  object Properties {
    
    inline def apply(defaultChar: Double, fontAscent: Double, fontDescent: Double): Properties = {
      val __obj = js.Dynamic.literal(defaultChar = defaultChar.asInstanceOf[js.Any], fontAscent = fontAscent.asInstanceOf[js.Any], fontDescent = fontDescent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Properties]
    }
    
    extension [Self <: Properties](x: Self) {
      
      inline def setAddStyleName(value: String): Self = StObject.set(x, "addStyleName", value.asInstanceOf[js.Any])
      
      inline def setAddStyleNameUndefined: Self = StObject.set(x, "addStyleName", js.undefined)
      
      inline def setAverageWidth(value: Double): Self = StObject.set(x, "averageWidth", value.asInstanceOf[js.Any])
      
      inline def setAverageWidthUndefined: Self = StObject.set(x, "averageWidth", js.undefined)
      
      inline def setCapHeight(value: Double): Self = StObject.set(x, "capHeight", value.asInstanceOf[js.Any])
      
      inline def setCapHeightUndefined: Self = StObject.set(x, "capHeight", js.undefined)
      
      inline def setCharsetEncoding(value: String): Self = StObject.set(x, "charsetEncoding", value.asInstanceOf[js.Any])
      
      inline def setCharsetEncodingUndefined: Self = StObject.set(x, "charsetEncoding", js.undefined)
      
      inline def setCharsetRegistry(value: String): Self = StObject.set(x, "charsetRegistry", value.asInstanceOf[js.Any])
      
      inline def setCharsetRegistryUndefined: Self = StObject.set(x, "charsetRegistry", js.undefined)
      
      inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
      
      inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
      
      inline def setDefaultChar(value: Double): Self = StObject.set(x, "defaultChar", value.asInstanceOf[js.Any])
      
      inline def setFaceName(value: String): Self = StObject.set(x, "faceName", value.asInstanceOf[js.Any])
      
      inline def setFaceNameUndefined: Self = StObject.set(x, "faceName", js.undefined)
      
      inline def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
      
      inline def setFamilyNameUndefined: Self = StObject.set(x, "familyName", js.undefined)
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontAscent(value: Double): Self = StObject.set(x, "fontAscent", value.asInstanceOf[js.Any])
      
      inline def setFontDescent(value: Double): Self = StObject.set(x, "fontDescent", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setFontVersion(value: String): Self = StObject.set(x, "fontVersion", value.asInstanceOf[js.Any])
      
      inline def setFontVersionUndefined: Self = StObject.set(x, "fontVersion", js.undefined)
      
      inline def setFontnameRegistry(value: String): Self = StObject.set(x, "fontnameRegistry", value.asInstanceOf[js.Any])
      
      inline def setFontnameRegistryUndefined: Self = StObject.set(x, "fontnameRegistry", js.undefined)
      
      inline def setFoundry(value: String): Self = StObject.set(x, "foundry", value.asInstanceOf[js.Any])
      
      inline def setFoundryUndefined: Self = StObject.set(x, "foundry", js.undefined)
      
      inline def setNotice(value: String): Self = StObject.set(x, "notice", value.asInstanceOf[js.Any])
      
      inline def setNoticeUndefined: Self = StObject.set(x, "notice", js.undefined)
      
      inline def setPixelSize(value: Double): Self = StObject.set(x, "pixelSize", value.asInstanceOf[js.Any])
      
      inline def setPixelSizeUndefined: Self = StObject.set(x, "pixelSize", js.undefined)
      
      inline def setPointSize(value: Double): Self = StObject.set(x, "pointSize", value.asInstanceOf[js.Any])
      
      inline def setPointSizeUndefined: Self = StObject.set(x, "pointSize", js.undefined)
      
      inline def setResolutionX(value: Double): Self = StObject.set(x, "resolutionX", value.asInstanceOf[js.Any])
      
      inline def setResolutionXUndefined: Self = StObject.set(x, "resolutionX", js.undefined)
      
      inline def setResolutionY(value: Double): Self = StObject.set(x, "resolutionY", value.asInstanceOf[js.Any])
      
      inline def setResolutionYUndefined: Self = StObject.set(x, "resolutionY", js.undefined)
      
      inline def setSetwidthName(value: String): Self = StObject.set(x, "setwidthName", value.asInstanceOf[js.Any])
      
      inline def setSetwidthNameUndefined: Self = StObject.set(x, "setwidthName", js.undefined)
      
      inline def setSlant(value: String): Self = StObject.set(x, "slant", value.asInstanceOf[js.Any])
      
      inline def setSlantUndefined: Self = StObject.set(x, "slant", js.undefined)
      
      inline def setSpacing(value: String): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      inline def setWeightName(value: String): Self = StObject.set(x, "weightName", value.asInstanceOf[js.Any])
      
      inline def setWeightNameUndefined: Self = StObject.set(x, "weightName", js.undefined)
      
      inline def setXHeight(value: Double): Self = StObject.set(x, "xHeight", value.asInstanceOf[js.Any])
      
      inline def setXHeightUndefined: Self = StObject.set(x, "xHeight", js.undefined)
    }
  }
  
  trait Size extends StObject {
    
    var points: Double
    
    var resolutionX: Double
    
    var resolutionY: Double
  }
  object Size {
    
    inline def apply(points: Double, resolutionX: Double, resolutionY: Double): Size = {
      val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any], resolutionX = resolutionX.asInstanceOf[js.Any], resolutionY = resolutionY.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    extension [Self <: Size](x: Self) {
      
      inline def setPoints(value: Double): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setResolutionX(value: Double): Self = StObject.set(x, "resolutionX", value.asInstanceOf[js.Any])
      
      inline def setResolutionY(value: Double): Self = StObject.set(x, "resolutionY", value.asInstanceOf[js.Any])
    }
  }
}
