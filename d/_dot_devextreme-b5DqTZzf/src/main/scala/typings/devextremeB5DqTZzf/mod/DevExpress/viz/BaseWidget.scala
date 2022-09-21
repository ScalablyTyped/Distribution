package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.mod.DevExpress.DOMComponent
import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.events.Cancelable
import typings.std.Blob
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseWidget[TProperties]
  extends StObject
     with DOMComponent[TProperties] {
  
  /**
    * Exports the UI component.
    */
  def exportTo(fileName: String, format: String): Unit = js.native
  
  /**
    * Gets the current UI component size.
    */
  def getSize(): BaseWidgetSize = js.native
  
  /**
    * Hides the loading indicator.
    */
  def hideLoadingIndicator(): Unit = js.native
  
  /**
    * Opens the browser&apos;s print window.
    */
  def print(): Unit = js.native
  
  /**
    * Redraws the UI component.
    */
  def render(): Unit = js.native
  
  /**
    * Shows the loading indicator.
    */
  def showLoadingIndicator(): Unit = js.native
  
  /**
    * Gets the UI component&apos;s SVG markup.
    */
  def svg(): String = js.native
}
object BaseWidget {
  
  trait ExportInfo extends StObject {
    
    val fileName: String
    
    val format: String
  }
  object ExportInfo {
    
    inline def apply(fileName: String, format: String): ExportInfo = {
      val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportInfo]
    }
    
    extension [Self <: ExportInfo](x: Self) {
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileSavingEventInfo[T]
    extends StObject
       with Cancelable {
    
    val component: T
    
    val data: Blob
    
    val element: DxElement_[HTMLElement]
    
    val fileName: String
    
    val format: String
  }
  object FileSavingEventInfo {
    
    inline def apply[T](component: T, data: Blob, element: DxElement_[HTMLElement], fileName: String, format: String): FileSavingEventInfo[T] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileSavingEventInfo[T]]
    }
    
    extension [Self <: FileSavingEventInfo[?], T](x: Self & FileSavingEventInfo[T]) {
      
      inline def setComponent(value: T): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setData(value: Blob): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    }
  }
  
  trait IncidentInfo extends StObject {
    
    val target: Any
  }
  object IncidentInfo {
    
    inline def apply(target: Any): IncidentInfo = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncidentInfo]
    }
    
    extension [Self <: IncidentInfo](x: Self) {
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.ellipsis
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.hide
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.none
  */
  trait VizTextOverflowType extends StObject
  object VizTextOverflowType {
    
    inline def ellipsis: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.ellipsis = "ellipsis".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.ellipsis]
    
    inline def hide: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.hide = "hide".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.hide]
    
    inline def none: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.none = "none".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.none]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.normal
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.breakWord
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.none
  */
  trait WordWrapType extends StObject
  object WordWrapType {
    
    inline def breakWord: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.breakWord = "breakWord".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.breakWord]
    
    inline def none: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.none = "none".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.none]
    
    inline def normal: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.normal = "normal".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.normal]
  }
}
