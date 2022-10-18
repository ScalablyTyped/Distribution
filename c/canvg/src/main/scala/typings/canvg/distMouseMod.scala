package typings.canvg

import typings.canvg.distBoundingBoxMod.BoundingBox
import typings.canvg.distDocumentMod.Element
import typings.canvg.distScreenMod.Screen
import typings.canvg.distTypesMod.RenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMouseMod {
  
  @JSImport("canvg/dist/Mouse", "Mouse")
  @js.native
  open class Mouse protected () extends StObject {
    def this(screen: Screen) = this()
    
    def checkBoundingBox(element: Element): Unit = js.native
    def checkBoundingBox(element: Element, boundingBox: BoundingBox): Unit = js.native
    
    def checkPath(element: Element): Unit = js.native
    def checkPath(element: Element, ctx: RenderingContext2D): Unit = js.native
    
    /* private */ var eventElements: Any = js.native
    
    /* private */ var events: Any = js.native
    
    def hasEvents(): Boolean = js.native
    
    def isWorking(): Boolean = js.native
    
    /* private */ var mapXY: Any = js.native
    
    /* private */ var onClick: Any = js.native
    
    /* private */ var onMouseMove: Any = js.native
    
    def runEvents(): Unit = js.native
    
    /* private */ val screen: Any = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
    
    /* private */ var working: Any = js.native
  }
  
  trait IEvent extends StObject {
    
    def run(eventTarget: IEventTarget): Unit
    
    var `type`: String
    
    var x: Double
    
    var y: Double
  }
  object IEvent {
    
    inline def apply(run: IEventTarget => Unit, `type`: String, x: Double, y: Double): IEvent = {
      val __obj = js.Dynamic.literal(run = js.Any.fromFunction1(run), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IEvent]
    }
    
    extension [Self <: IEvent](x: Self) {
      
      inline def setRun(value: IEventTarget => Unit): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait IEventTarget extends StObject {
    
    var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onMouseMove: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object IEventTarget {
    
    inline def apply(): IEventTarget = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEventTarget]
    }
    
    extension [Self <: IEventTarget](x: Self) {
      
      inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseMove(value: () => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction0(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    }
  }
}
