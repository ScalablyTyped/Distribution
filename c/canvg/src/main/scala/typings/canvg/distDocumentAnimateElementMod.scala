package typings.canvg

import typings.canvg.distDocumentDocumentMod.Document
import typings.canvg.distDocumentElementMod.Element
import typings.canvg.distPropertyMod.Property
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDocumentAnimateElementMod {
  
  @JSImport("canvg/dist/Document/AnimateElement", "AnimateElement")
  @js.native
  open class AnimateElement protected () extends Element {
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
    
    /* protected */ val begin: Double = js.native
    
    def calcValue(): String = js.native
    
    /* protected */ var duration: Double = js.native
    
    /* protected */ val from: Property[Any] = js.native
    
    /* protected */ var frozen: Boolean = js.native
    
    def getProgress(): IProgress = js.native
    
    /* protected */ def getProperty(): Property[Any] = js.native
    
    /* protected */ var initialUnits: String = js.native
    
    /* protected */ var initialValue: js.UndefOr[String] = js.native
    
    /* protected */ val maxDuration: Double = js.native
    
    /* protected */ var removed: Boolean = js.native
    
    /* protected */ val to: Property[Any] = js.native
    
    def update(delta: Double): Boolean = js.native
    
    /* protected */ val values: Property[js.Array[String]] = js.native
  }
  
  trait IProgress extends StObject {
    
    var from: Property[Any]
    
    var progress: Double
    
    var to: Property[Any]
  }
  object IProgress {
    
    inline def apply(from: Property[Any], progress: Double, to: Property[Any]): IProgress = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[IProgress]
    }
    
    extension [Self <: IProgress](x: Self) {
      
      inline def setFrom(value: Property[Any]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setTo(value: Property[Any]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
}
