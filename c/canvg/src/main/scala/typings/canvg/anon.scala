package typings.canvg

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.canvg.canvgInts.`0`
import typings.canvg.canvgInts.`1`
import typings.canvg.documentDocumentMod.Document
import typings.canvg.filterElementMod.FilterElement
import typings.canvg.glyphElementMod.GlyphElement
import typings.canvg.maskElementMod.MaskElement
import typings.canvg.nodeMod.Fetch
import typings.canvg.pathElementMod.PathElement
import typings.canvg.pathParserMod.PathParser
import typings.canvg.styleElementMod.StyleElement
import typings.canvg.textPathElementMod.ICachedPoint
import typings.canvg.typesMod.DOMParser
import typings.offscreencanvas.OffscreenCanvas
import typings.std.HTMLElement
import typings.std.ImageBitmap
import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.Response
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait A1 extends StObject {
    
    var a1: Double
    
    var ad: Double
    
    var centp: typings.canvg.pointMod.Point
    
    var currentPoint: typings.canvg.pointMod.Point
    
    var rX: Double
    
    var rY: Double
    
    var sweepFlag: `0` | `1`
    
    var xAxisRotation: Double
  }
  object A1 {
    
    inline def apply(
      a1: Double,
      ad: Double,
      centp: typings.canvg.pointMod.Point,
      currentPoint: typings.canvg.pointMod.Point,
      rX: Double,
      rY: Double,
      sweepFlag: `0` | `1`,
      xAxisRotation: Double
    ): A1 = {
      val __obj = js.Dynamic.literal(a1 = a1.asInstanceOf[js.Any], ad = ad.asInstanceOf[js.Any], centp = centp.asInstanceOf[js.Any], currentPoint = currentPoint.asInstanceOf[js.Any], rX = rX.asInstanceOf[js.Any], rY = rY.asInstanceOf[js.Any], sweepFlag = sweepFlag.asInstanceOf[js.Any], xAxisRotation = xAxisRotation.asInstanceOf[js.Any])
      __obj.asInstanceOf[A1]
    }
    
    extension [Self <: A1](x: Self) {
      
      inline def setA1(value: Double): Self = StObject.set(x, "a1", value.asInstanceOf[js.Any])
      
      inline def setAd(value: Double): Self = StObject.set(x, "ad", value.asInstanceOf[js.Any])
      
      inline def setCentp(value: typings.canvg.pointMod.Point): Self = StObject.set(x, "centp", value.asInstanceOf[js.Any])
      
      inline def setCurrentPoint(value: typings.canvg.pointMod.Point): Self = StObject.set(x, "currentPoint", value.asInstanceOf[js.Any])
      
      inline def setRX(value: Double): Self = StObject.set(x, "rX", value.asInstanceOf[js.Any])
      
      inline def setRY(value: Double): Self = StObject.set(x, "rY", value.asInstanceOf[js.Any])
      
      inline def setSweepFlag(value: `0` | `1`): Self = StObject.set(x, "sweepFlag", value.asInstanceOf[js.Any])
      
      inline def setXAxisRotation(value: Double): Self = StObject.set(x, "xAxisRotation", value.asInstanceOf[js.Any])
    }
  }
  
  trait ControlPoint extends StObject {
    
    var controlPoint: typings.canvg.pointMod.Point
    
    var current: typings.canvg.pointMod.Point
    
    var currentPoint: typings.canvg.pointMod.Point
    
    var point: typings.canvg.pointMod.Point
  }
  object ControlPoint {
    
    inline def apply(
      controlPoint: typings.canvg.pointMod.Point,
      current: typings.canvg.pointMod.Point,
      currentPoint: typings.canvg.pointMod.Point,
      point: typings.canvg.pointMod.Point
    ): ControlPoint = {
      val __obj = js.Dynamic.literal(controlPoint = controlPoint.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], currentPoint = currentPoint.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
      __obj.asInstanceOf[ControlPoint]
    }
    
    extension [Self <: ControlPoint](x: Self) {
      
      inline def setControlPoint(value: typings.canvg.pointMod.Point): Self = StObject.set(x, "controlPoint", value.asInstanceOf[js.Any])
      
      inline def setCurrent(value: typings.canvg.pointMod.Point): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentPoint(value: typings.canvg.pointMod.Point): Self = StObject.set(x, "currentPoint", value.asInstanceOf[js.Any])
      
      inline def setPoint(value: typings.canvg.pointMod.Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    }
  }
  
  trait CreateCanvas extends StObject {
    
    var DOMParser: typings.canvg.typesMod.DOMParser
    
    def createCanvas(width: Double, height: Double): OffscreenCanvas
    
    def createImage(url: String): js.Promise[ImageBitmap]
    
    var ignoreAnimation: Boolean
    
    var ignoreMouse: Boolean
    
    var window: Any
  }
  object CreateCanvas {
    
    inline def apply(
      DOMParser: DOMParser,
      createCanvas: (Double, Double) => OffscreenCanvas,
      createImage: String => js.Promise[ImageBitmap],
      ignoreAnimation: Boolean,
      ignoreMouse: Boolean,
      window: Any
    ): CreateCanvas = {
      val __obj = js.Dynamic.literal(DOMParser = DOMParser.asInstanceOf[js.Any], createCanvas = js.Any.fromFunction2(createCanvas), createImage = js.Any.fromFunction1(createImage), ignoreAnimation = ignoreAnimation.asInstanceOf[js.Any], ignoreMouse = ignoreMouse.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateCanvas]
    }
    
    extension [Self <: CreateCanvas](x: Self) {
      
      inline def setCreateCanvas(value: (Double, Double) => OffscreenCanvas): Self = StObject.set(x, "createCanvas", js.Any.fromFunction2(value))
      
      inline def setCreateImage(value: String => js.Promise[ImageBitmap]): Self = StObject.set(x, "createImage", js.Any.fromFunction1(value))
      
      inline def setDOMParser(value: DOMParser): Self = StObject.set(x, "DOMParser", value.asInstanceOf[js.Any])
      
      inline def setIgnoreAnimation(value: Boolean): Self = StObject.set(x, "ignoreAnimation", value.asInstanceOf[js.Any])
      
      inline def setIgnoreMouse(value: Boolean): Self = StObject.set(x, "ignoreMouse", value.asInstanceOf[js.Any])
      
      inline def setWindow(value: Any): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    }
  }
  
  trait CreateImage extends StObject {
    
    var DOMParser: typings.canvg.typesMod.DOMParser
    
    def createCanvas(width: Double, height: Double): Any
    
    def createImage(src: String): js.Promise[Any]
    
    def fetch(input: Any): js.Promise[Any]
    def fetch(input: Any, config: Any): js.Promise[Any]
    @JSName("fetch")
    var fetch_Original: Fetch
    
    var ignoreAnimation: Boolean
    
    var ignoreMouse: Boolean
    
    var window: Any
  }
  object CreateImage {
    
    inline def apply(
      DOMParser: DOMParser,
      createCanvas: (Double, Double) => Any,
      createImage: String => js.Promise[Any],
      fetch: (/* input */ Any, /* config */ js.UndefOr[Any]) => js.Promise[Any],
      ignoreAnimation: Boolean,
      ignoreMouse: Boolean,
      window: Any
    ): CreateImage = {
      val __obj = js.Dynamic.literal(DOMParser = DOMParser.asInstanceOf[js.Any], createCanvas = js.Any.fromFunction2(createCanvas), createImage = js.Any.fromFunction1(createImage), fetch = js.Any.fromFunction2(fetch), ignoreAnimation = ignoreAnimation.asInstanceOf[js.Any], ignoreMouse = ignoreMouse.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateImage]
    }
    
    extension [Self <: CreateImage](x: Self) {
      
      inline def setCreateCanvas(value: (Double, Double) => Any): Self = StObject.set(x, "createCanvas", js.Any.fromFunction2(value))
      
      inline def setCreateImage(value: String => js.Promise[Any]): Self = StObject.set(x, "createImage", js.Any.fromFunction1(value))
      
      inline def setDOMParser(value: DOMParser): Self = StObject.set(x, "DOMParser", value.asInstanceOf[js.Any])
      
      inline def setFetch(value: (/* input */ Any, /* config */ js.UndefOr[Any]) => js.Promise[Any]): Self = StObject.set(x, "fetch", js.Any.fromFunction2(value))
      
      inline def setIgnoreAnimation(value: Boolean): Self = StObject.set(x, "ignoreAnimation", value.asInstanceOf[js.Any])
      
      inline def setIgnoreMouse(value: Boolean): Self = StObject.set(x, "ignoreMouse", value.asInstanceOf[js.Any])
      
      inline def setWindow(value: Any): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    }
  }
  
  trait Current extends StObject {
    
    var current: typings.canvg.pointMod.Point
    
    var point: typings.canvg.pointMod.Point
  }
  object Current {
    
    inline def apply(current: typings.canvg.pointMod.Point, point: typings.canvg.pointMod.Point): Current = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
      __obj.asInstanceOf[Current]
    }
    
    extension [Self <: Current](x: Self) {
      
      inline def setCurrent(value: typings.canvg.pointMod.Point): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setPoint(value: typings.canvg.pointMod.Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    }
  }
  
  trait CurrentPoint extends StObject {
    
    var controlPoint: typings.canvg.pointMod.Point
    
    var current: typings.canvg.pointMod.Point
    
    var currentPoint: typings.canvg.pointMod.Point
  }
  object CurrentPoint {
    
    inline def apply(
      controlPoint: typings.canvg.pointMod.Point,
      current: typings.canvg.pointMod.Point,
      currentPoint: typings.canvg.pointMod.Point
    ): CurrentPoint = {
      val __obj = js.Dynamic.literal(controlPoint = controlPoint.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], currentPoint = currentPoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrentPoint]
    }
    
    extension [Self <: CurrentPoint](x: Self) {
      
      inline def setControlPoint(value: typings.canvg.pointMod.Point): Self = StObject.set(x, "controlPoint", value.asInstanceOf[js.Any])
      
      inline def setCurrent(value: typings.canvg.pointMod.Point): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentPoint(value: typings.canvg.pointMod.Point): Self = StObject.set(x, "currentPoint", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(input: RequestInfo): js.Promise[Response] = js.native
    def apply(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
    def apply(input: URL): js.Promise[Response] = js.native
    def apply(input: URL, init: RequestInit): js.Promise[Response] = js.native
  }
  
  trait Offset extends StObject {
    
    var offset: Double
    
    var rotation: Double
    
    var segment: P0
  }
  object Offset {
    
    inline def apply(offset: Double, rotation: Double, segment: P0): Offset = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], segment = segment.asInstanceOf[js.Any])
      __obj.asInstanceOf[Offset]
    }
    
    extension [Self <: Offset](x: Self) {
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setSegment(value: P0): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    }
  }
  
  trait P0 extends StObject {
    
    var p0: ICachedPoint
    
    var p1: ICachedPoint
  }
  object P0 {
    
    inline def apply(p0: ICachedPoint, p1: ICachedPoint): P0 = {
      val __obj = js.Dynamic.literal(p0 = p0.asInstanceOf[js.Any], p1 = p1.asInstanceOf[js.Any])
      __obj.asInstanceOf[P0]
    }
    
    extension [Self <: P0](x: Self) {
      
      inline def setP0(value: ICachedPoint): Self = StObject.set(x, "p0", value.asInstanceOf[js.Any])
      
      inline def setP1(value: ICachedPoint): Self = StObject.set(x, "p1", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<std.Record<canvg.canvg/dist/Document/GlyphElement.ArabicForm, canvg.canvg/dist/Document/GlyphElement.GlyphElement>> */
  trait PartialRecordArabicFormGl extends StObject {
    
    var initial: js.UndefOr[GlyphElement] = js.undefined
    
    var isolated: js.UndefOr[GlyphElement] = js.undefined
    
    var medial: js.UndefOr[GlyphElement] = js.undefined
    
    var terminal: js.UndefOr[GlyphElement] = js.undefined
  }
  object PartialRecordArabicFormGl {
    
    inline def apply(): PartialRecordArabicFormGl = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRecordArabicFormGl]
    }
    
    extension [Self <: PartialRecordArabicFormGl](x: Self) {
      
      inline def setInitial(value: GlyphElement): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
      
      inline def setIsolated(value: GlyphElement): Self = StObject.set(x, "isolated", value.asInstanceOf[js.Any])
      
      inline def setIsolatedUndefined: Self = StObject.set(x, "isolated", js.undefined)
      
      inline def setMedial(value: GlyphElement): Self = StObject.set(x, "medial", value.asInstanceOf[js.Any])
      
      inline def setMedialUndefined: Self = StObject.set(x, "medial", js.undefined)
      
      inline def setTerminal(value: GlyphElement): Self = StObject.set(x, "terminal", value.asInstanceOf[js.Any])
      
      inline def setTerminalUndefined: Self = StObject.set(x, "terminal", js.undefined)
    }
  }
  
  trait Point extends StObject {
    
    var point: typings.canvg.pointMod.Point
  }
  object Point {
    
    inline def apply(point: typings.canvg.pointMod.Point): Point = {
      val __obj = js.Dynamic.literal(point = point.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    extension [Self <: Point](x: Self) {
      
      inline def setPoint(value: typings.canvg.pointMod.Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofFilterElement
    extends StObject
       with Instantiable0[FilterElement] {
    
    var ignoreStyles: js.Array[String] = js.native
  }
  
  @js.native
  trait TypeofMaskElement
    extends StObject
       with Instantiable0[MaskElement] {
    
    var ignoreStyles: js.Array[String] = js.native
  }
  
  @js.native
  trait TypeofPathElement
    extends StObject
       with Instantiable1[/* document */ Document, PathElement]
       with Instantiable2[/* document */ Document, /* node */ HTMLElement, PathElement]
       with Instantiable3[
          /* document */ Document, 
          (/* node */ HTMLElement) | (/* node */ Unit), 
          /* captureTextNodes */ Boolean, 
          PathElement
        ] {
    
    def pathA(pathParser: PathParser): A1 = js.native
    
    def pathC(pathParser: PathParser): ControlPoint = js.native
    
    def pathH(pathParser: PathParser): Current = js.native
    
    def pathL(pathParser: PathParser): Current = js.native
    
    def pathM(pathParser: PathParser): Point = js.native
    
    def pathQ(pathParser: PathParser): CurrentPoint = js.native
    
    def pathS(pathParser: PathParser): ControlPoint = js.native
    
    def pathT(pathParser: PathParser): CurrentPoint = js.native
    
    def pathV(pathParser: PathParser): Current = js.native
    
    def pathZ(pathParser: PathParser): Unit = js.native
  }
  
  @js.native
  trait TypeofStyleElement
    extends StObject
       with Instantiable2[/* document */ Document, /* node */ HTMLElement, StyleElement]
       with Instantiable3[
          /* document */ Document, 
          /* node */ HTMLElement, 
          /* captureTextNodes */ Boolean, 
          StyleElement
        ]
}
