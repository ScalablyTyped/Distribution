package typings.ckeditorCkeditor5Utils

import typings.std.HTMLElement
import typings.std.Range
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcDomRectMod {
  
  @JSImport("@ckeditor/ckeditor5-utils/src/dom/rect", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Rect {
    /**
      * Creates an instance of rect.
      *
      * ```ts
      * // Rect of an HTMLElement.
      * const rectA = new Rect( document.body );
      *
      * // Rect of a DOM Range.
      * const rectB = new Rect( document.getSelection().getRangeAt( 0 ) );
      *
      * // Rect of a window (web browser viewport).
      * const rectC = new Rect( window );
      *
      * // Rect out of an object.
      * const rectD = new Rect( { top: 0, right: 10, bottom: 10, left: 0, width: 10, height: 10 } );
      *
      * // Rect out of another Rect instance.
      * const rectE = new Rect( rectD );
      *
      * // Rect out of a ClientRect.
      * const rectF = new Rect( document.body.getClientRects().item( 0 ) );
      * ```
      *
      * **Note**: By default a rect of an HTML element includes its CSS borders and scrollbars (if any)
      * ant the rect of a `window` includes scrollbars too. Use {@link #excludeScrollbarsAndBorders}
      * to get the inner part of the rect.
      *
      * @param source A source object to create the rect.
      */
    def this(source: RectSource) = this()
    
    /**
      * The object this rect is for.
      *
      * @readonly
      */
    /* private */ /* CompleteClass */
    var _source: Any = js.native
    
    /**
      * The "bottom" value of the rect.
      *
      * @readonly
      */
    /* CompleteClass */
    var bottom: Double = js.native
    
    /**
      * Checks whether a rect fully contains another rect instance.
      *
      * @param anotherRect
      * @returns `true` if contains, `false` otherwise.
      */
    /* CompleteClass */
    override def contains(anotherRect: Rect): Boolean = js.native
    
    /**
      * Excludes scrollbars and CSS borders from the rect.
      *
      * * Borders are removed when {@link #_source} is an HTML element.
      * * Scrollbars are excluded from HTML elements and the `window`.
      *
      * @returns A rect which has been updated.
      */
    /* CompleteClass */
    override def excludeScrollbarsAndBorders(): this.type = js.native
    
    /**
      * Returns the area of the rect.
      */
    /* CompleteClass */
    override def getArea(): Double = js.native
    
    /**
      * Returns a new rect a a result of intersection with another rect.
      */
    /* CompleteClass */
    override def getIntersection(anotherRect: Rect): Rect | Null = js.native
    
    /**
      * Returns the area of intersection with another rect.
      *
      * @returns Area of intersection.
      */
    /* CompleteClass */
    override def getIntersectionArea(anotherRect: Rect): Double = js.native
    
    /**
      * Returns a new rect, a part of the original rect, which is actually visible to the user,
      * e.g. an original rect cropped by parent element rects which have `overflow` set in CSS
      * other than `"visible"`.
      *
      * If there's no such visible rect, which is when the rect is limited by one or many of
      * the ancestors, `null` is returned.
      *
      * @returns A visible rect instance or `null`, if there's none.
      */
    /* CompleteClass */
    override def getVisible(): Rect | Null = js.native
    
    /**
      * The "height" value of the rect.
      *
      * @readonly
      */
    /* CompleteClass */
    var height: Double = js.native
    
    /**
      * Checks if all property values ({@link #top}, {@link #left}, {@link #right},
      * {@link #bottom}, {@link #width} and {@link #height}) are the equal in both rect
      * instances.
      *
      * @param anotherRect A rect instance to compare with.
      * @returns `true` when Rects are equal. `false` otherwise.
      */
    /* CompleteClass */
    override def isEqual(anotherRect: Rect): Boolean = js.native
    
    /**
      * The "left" value of the rect.
      *
      * @readonly
      */
    /* CompleteClass */
    var left: Double = js.native
    
    /**
      * Moves the rect in–place by a dedicated offset.
      *
      * @param x A horizontal offset.
      * @param y A vertical offset
      * @returns A rect which has been moved.
      */
    /* CompleteClass */
    override def moveBy(x: Double, y: Double): this.type = js.native
    
    /**
      * Moves the rect so that its upper–left corner lands in desired `[ x, y ]` location.
      *
      * @param x Desired horizontal location.
      * @param y Desired vertical location.
      * @returns A rect which has been moved.
      */
    /* CompleteClass */
    override def moveTo(x: Double, y: Double): this.type = js.native
    
    /**
      * The "right" value of the rect.
      *
      * @readonly
      */
    /* CompleteClass */
    var right: Double = js.native
    
    /**
      * The "top" value of the rect.
      *
      * @readonly
      */
    /* CompleteClass */
    var top: Double = js.native
    
    /**
      * The "width" value of the rect.
      *
      * @readonly
      */
    /* CompleteClass */
    var width: Double = js.native
  }
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-utils/src/dom/rect", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a bounding rectangle that contains all the given `rects`.
      *
      * @param rects A list of rectangles that should be contained in the result rectangle.
      * @returns Bounding rectangle or `null` if no `rects` were given.
      */
    inline def getBoundingRect(rects: js.Iterable[Rect]): Rect | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getBoundingRect")(rects.asInstanceOf[js.Any]).asInstanceOf[Rect | Null]
    
    /**
      * Returns an array of rects of the given native DOM Range.
      *
      * @param range A native DOM range.
      * @returns DOM Range rects.
      */
    inline def getDomRangeRects(range: Range): js.Array[Rect] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDomRangeRects")(range.asInstanceOf[js.Any]).asInstanceOf[js.Array[Rect]]
  }
  
  trait Rect extends StObject {
    
    /**
      * The object this rect is for.
      *
      * @readonly
      */
    /* private */ var _source: Any
    
    /**
      * The "bottom" value of the rect.
      *
      * @readonly
      */
    var bottom: Double
    
    /**
      * Checks whether a rect fully contains another rect instance.
      *
      * @param anotherRect
      * @returns `true` if contains, `false` otherwise.
      */
    def contains(anotherRect: Rect): Boolean
    
    /**
      * Excludes scrollbars and CSS borders from the rect.
      *
      * * Borders are removed when {@link #_source} is an HTML element.
      * * Scrollbars are excluded from HTML elements and the `window`.
      *
      * @returns A rect which has been updated.
      */
    def excludeScrollbarsAndBorders(): this.type
    
    /**
      * Returns the area of the rect.
      */
    def getArea(): Double
    
    /**
      * Returns a new rect a a result of intersection with another rect.
      */
    def getIntersection(anotherRect: Rect): Rect | Null
    
    /**
      * Returns the area of intersection with another rect.
      *
      * @returns Area of intersection.
      */
    def getIntersectionArea(anotherRect: Rect): Double
    
    /**
      * Returns a new rect, a part of the original rect, which is actually visible to the user,
      * e.g. an original rect cropped by parent element rects which have `overflow` set in CSS
      * other than `"visible"`.
      *
      * If there's no such visible rect, which is when the rect is limited by one or many of
      * the ancestors, `null` is returned.
      *
      * @returns A visible rect instance or `null`, if there's none.
      */
    def getVisible(): Rect | Null
    
    /**
      * The "height" value of the rect.
      *
      * @readonly
      */
    var height: Double
    
    /**
      * Checks if all property values ({@link #top}, {@link #left}, {@link #right},
      * {@link #bottom}, {@link #width} and {@link #height}) are the equal in both rect
      * instances.
      *
      * @param anotherRect A rect instance to compare with.
      * @returns `true` when Rects are equal. `false` otherwise.
      */
    def isEqual(anotherRect: Rect): Boolean
    
    /**
      * The "left" value of the rect.
      *
      * @readonly
      */
    var left: Double
    
    /**
      * Moves the rect in–place by a dedicated offset.
      *
      * @param x A horizontal offset.
      * @param y A vertical offset
      * @returns A rect which has been moved.
      */
    def moveBy(x: Double, y: Double): this.type
    
    /**
      * Moves the rect so that its upper–left corner lands in desired `[ x, y ]` location.
      *
      * @param x Desired horizontal location.
      * @param y Desired vertical location.
      * @returns A rect which has been moved.
      */
    def moveTo(x: Double, y: Double): this.type
    
    /**
      * The "right" value of the rect.
      *
      * @readonly
      */
    var right: Double
    
    /**
      * The "top" value of the rect.
      *
      * @readonly
      */
    var top: Double
    
    /**
      * The "width" value of the rect.
      *
      * @readonly
      */
    var width: Double
  }
  object Rect {
    
    inline def apply(
      _source: Any,
      bottom: Double,
      contains: Rect => Boolean,
      excludeScrollbarsAndBorders: () => Rect,
      getArea: () => Double,
      getIntersection: Rect => Rect | Null,
      getIntersectionArea: Rect => Double,
      getVisible: () => Rect | Null,
      height: Double,
      isEqual: Rect => Boolean,
      left: Double,
      moveBy: (Double, Double) => Rect,
      moveTo: (Double, Double) => Rect,
      right: Double,
      top: Double,
      width: Double
    ): Rect = {
      val __obj = js.Dynamic.literal(_source = _source.asInstanceOf[js.Any], bottom = bottom.asInstanceOf[js.Any], contains = js.Any.fromFunction1(contains), excludeScrollbarsAndBorders = js.Any.fromFunction0(excludeScrollbarsAndBorders), getArea = js.Any.fromFunction0(getArea), getIntersection = js.Any.fromFunction1(getIntersection), getIntersectionArea = js.Any.fromFunction1(getIntersectionArea), getVisible = js.Any.fromFunction0(getVisible), height = height.asInstanceOf[js.Any], isEqual = js.Any.fromFunction1(isEqual), left = left.asInstanceOf[js.Any], moveBy = js.Any.fromFunction2(moveBy), moveTo = js.Any.fromFunction2(moveTo), right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rect]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Rect] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setContains(value: Rect => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
      
      inline def setExcludeScrollbarsAndBorders(value: () => Rect): Self = StObject.set(x, "excludeScrollbarsAndBorders", js.Any.fromFunction0(value))
      
      inline def setGetArea(value: () => Double): Self = StObject.set(x, "getArea", js.Any.fromFunction0(value))
      
      inline def setGetIntersection(value: Rect => Rect | Null): Self = StObject.set(x, "getIntersection", js.Any.fromFunction1(value))
      
      inline def setGetIntersectionArea(value: Rect => Double): Self = StObject.set(x, "getIntersectionArea", js.Any.fromFunction1(value))
      
      inline def setGetVisible(value: () => Rect | Null): Self = StObject.set(x, "getVisible", js.Any.fromFunction0(value))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setIsEqual(value: Rect => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setMoveBy(value: (Double, Double) => Rect): Self = StObject.set(x, "moveBy", js.Any.fromFunction2(value))
      
      inline def setMoveTo(value: (Double, Double) => Rect): Self = StObject.set(x, "moveTo", js.Any.fromFunction2(value))
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def set_source(value: Any): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
    }
  }
  
  trait RectLike extends StObject {
    
    val bottom: Double
    
    val height: Double
    
    val left: Double
    
    val right: Double
    
    val top: Double
    
    val width: Double
  }
  object RectLike {
    
    inline def apply(bottom: Double, height: Double, left: Double, right: Double, top: Double, width: Double): RectLike = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[RectLike]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RectLike] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type RectSource = HTMLElement | Range | Window | RectLike
}
