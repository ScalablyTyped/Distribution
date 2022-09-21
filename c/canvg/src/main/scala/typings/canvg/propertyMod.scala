package typings.canvg

import typings.canvg.documentMod.Document
import typings.canvg.documentMod.Element
import typings.canvg.documentMod.PathElement
import typings.canvg.viewPortMod.Axis
import typings.std.CanvasGradient
import typings.std.CanvasPattern
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propertyMod {
  
  @JSImport("canvg/dist/Property", "Property")
  @js.native
  open class Property[T] protected () extends StObject {
    def this(document: Document, name: String, value: T) = this()
    
    def addOpacity(opacity: Property[Any]): Property[String] = js.native
    
    /* private */ val document: Any = js.native
    
    def getColor(): String = js.native
    def getColor(`def`: T): String = js.native
    
    def getDefinition[T /* <: Element */](): T = js.native
    
    def getDpi(): Double = js.native
    
    def getEm(): Double = js.native
    
    def getFillStyleDefinition(element: Element, opacity: Property[Any]): String | CanvasGradient | CanvasPattern = js.native
    def getFillStyleDefinition(element: PathElement, opacity: Property[Any]): String | CanvasGradient | CanvasPattern = js.native
    
    def getMilliseconds(): Double = js.native
    
    def getNumber(): Double = js.native
    def getNumber(`def`: T): Double = js.native
    
    def getPixels(): Double = js.native
    def getPixels(axis: Unit, processPercent: Boolean): Double = js.native
    def getPixels(axis: Axis): Double = js.native
    def getPixels(axis: Axis, processPercent: Boolean): Double = js.native
    def getPixels(isFontSize: Boolean): Double = js.native
    
    def getRadians(): Double = js.native
    
    def getRem(): Double = js.native
    
    def getString(): String = js.native
    def getString(`def`: T): String = js.native
    
    def getTextBaseline(): String = js.native
    
    def getUnits(): String = js.native
    
    def getValue(): T = js.native
    def getValue(`def`: T): T = js.native
    
    def hasValue(): Boolean = js.native
    def hasValue(zeroIsValue: Boolean): Boolean = js.native
    
    /* private */ var isNormalizedColor: Any = js.native
    
    def isPixels(): Boolean = js.native
    
    def isString(): Boolean = js.native
    def isString(regexp: js.RegExp): Boolean = js.native
    
    def isUrlDefinition(): Boolean = js.native
    
    /* private */ val name: Any = js.native
    
    def setValue(value: T): this.type = js.native
    
    def split(): js.Array[Property[String]] = js.native
    def split(separator: String): js.Array[Property[String]] = js.native
    
    /* private */ var value: Any = js.native
  }
  /* static members */
  object Property {
    
    @JSImport("canvg/dist/Property", "Property")
    @js.native
    val ^ : js.Any = js.native
    
    inline def empty(document: Document): Property[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")(document.asInstanceOf[js.Any]).asInstanceOf[Property[String]]
    
    @JSImport("canvg/dist/Property", "Property.textBaselineMapping")
    @js.native
    val textBaselineMapping: Record[String, String] = js.native
  }
}
